package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.Livre;

public class GestionLivreImpl implements IGestionLivre {
	
	EntityManager em;


	public GestionLivreImpl() {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("test");
		this.em= factory.createEntityManager();
	}
	

	@Override
	public List<Livre> getAllLivres() {
		Query q= em.createQuery("SELECT l FROM Livre l");
		List<Livre> livrList= q.getResultList();
		return livrList;
	}

	@Override
	public Livre getLivreByNum(int num) {
		Livre l = em.find(Livre.class, num);
		return l;
	}

	@Override
	public void addLivre(Livre l) {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		
	}

	@Override
	public void modifyLivre(Livre l) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Livre l1= em.find(Livre.class, l.getNum());
		l1.setQuantité(l.getQuantité());
		em.merge(l1);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteLivre(int num) {
		em.getTransaction().begin();
		Livre l= em.find(Livre.class, num);
		em.remove(l);
		em.getTransaction().commit();
	}

}

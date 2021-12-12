package DAO;

import java.util.List;

import Model.Livre;

public interface IGestionLivre  {
	
	public List<Livre> getAllLivres(); 
	public Livre getLivreByNum(int num);  
	public void addLivre(Livre l);	
	public void modifyLivre(Livre l);	 
	public void deleteLivre(int num);	 


}

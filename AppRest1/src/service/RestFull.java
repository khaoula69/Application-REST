package service;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.GestionLivreImpl;
import DAO.IGestionLivre;
import Model.Livre;

@Path("/restFull")
public class RestFull {
	
	 IGestionLivre IGL;

	public RestFull() {
		this.IGL= new GestionLivreImpl();
	}
  
	
	@GET
	@Path("/getAllLivres")
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Livre> getAllLivres() {
		System.out.println(""+IGL.getAllLivres().size());
		return IGL.getAllLivres();
	}
	
	 @Path("/listbyid/{num}")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Livre listbyid(@PathParam("num")int num) {
	        return IGL.getLivreByNum(num);
	    }


	    @Path("/inserti")
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public String insert(Livre livre) {
	        System.out.println("hello wior");
	        IGL.addLivre(livre);
	        return "succed";

	    }
	    @Path("/delete/{num}")
	    @DELETE
	    public void delete(@PathParam("num")int num) {
	    	IGL.deleteLivre(num);
	    }
	    @Path("/update")
	    @PUT
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public void update(Livre livre) {
	    	IGL.modifyLivre(livre);

	    }
	
	
	
	
	
	

}

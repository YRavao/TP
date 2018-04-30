import java.util.*;

public class Categorie {
	private int idCat;
	private String nomCat;
	private List <Produit> produit=new ArrayList<Produit>();
	
	
	// Constructeur 
	public Categorie(){}
	public Categorie(int Numcat,String nom){
		idCat=Numcat;
		nomCat=nom;
		}
	
	
	//setters
	
	public void  setNomCat(String Ncat){
		nomCat=Ncat;
	}
	
	public void setIdCat(int id){
		idCat=id;
	}
	
	

	
	//getters
	
	public int getProduitparCat(){
		return idCat;
	}
	
	public String getNomCat(){
		return nomCat;
	}
	
	
	
	
}
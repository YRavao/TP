
public class Produit {

	private String Ref_Produit;
	private String Nom_Produit;
	private double prix;
	private double quantite;
	private Categorie categorie;
	
	public Produit(){}
	public Produit(String Ref,String NProduit,double p, double q,Categorie c){
		Ref_Produit=Ref;
		Nom_Produit=NProduit;
		prix=p;
		quantite=q;
		categorie=c;
		}
	
	public void setRefProduit(String r){
		Ref_Produit=r;
	}
	
	public void setNomProduit(String Nom){
		Nom_Produit=Nom;
	}
	
	public void setPrix(double price){
		prix=price;
	}
	
	public void setQuantite(double quant){
		quantite=quant;
	}
	
	public void setCategorie(Categorie Cat){
		 categorie=Cat;
	}
	
	public String getRefProduit(){
		return Ref_Produit;
		}
	
	public String getNomProduit(){
		return Nom_Produit;
		}
	
	public double getPrix(){
		return prix;
		}
	
	public double getQuantite(){
		return quantite;
		}
	
	public Categorie getCategorie(){
		return categorie;
	}
	

}

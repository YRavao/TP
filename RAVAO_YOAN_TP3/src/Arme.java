public class Arme {
	private String nom;
	private int degat; 
	
	public Arme(String n,int d){
		nom=n;
		degat=d;
	}
	
	public String getNom(){
		return nom;
	}
	
	public int getDegat(){
		return degat;
	}
	
	public void setNomArme(String n){
		nom=n;
	}
	
	public void setDegatArme(int d){
		degat=d;
	}
}

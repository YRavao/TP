
public class Option {

	private double prix;
	private String Libelle;
	private int Numero;
	
	public Option(int num,String Libel,int price){
		Numero=num;
		Libelle=Libel;
		prix=price;
		}
	
	public int getNumero(){
		return Numero;
	}
	
	public void setNumero(int n){
		Numero=n;
	}
	
	public double getPrix(){
		return prix;
	}
	
	public void setPrix(double p){
		prix=p;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
	public String toString(){
		return "Numero: "+this.getNumero() + "\tLibelle: "
		+this.getLibelle()+"\tPrix: "+ this.getPrix();
		}
	
}

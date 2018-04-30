public abstract class Voiture {
	private String immatriculation;
	protected double prix;
	
	public Voiture(String numero, double prix) {
		this.immatriculation = numero;
		this.prix = prix;
	}
	
	public String toString() {
		return immatriculation;
	}
	
	public abstract double getPrix();
}

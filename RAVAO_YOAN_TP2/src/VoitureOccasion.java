public class VoitureOccasion extends Voiture {
	private int NbKm;
	protected int Age;
	
	public VoitureOccasion(String numero, int nbKm, int age, double prix) {
		super(numero, prix);
		this.NbKm = nbKm;
		this.Age = age;
	}
	
	public int getAge() {
		return Age;
	}
	
	public int getNbKm() {
		return NbKm;
	}
	
	public double getPrix() {
		return Age * 0.05;
	}
	
	public String toString() {
		return super.toString() + "\tNombre de km: " + this.getNbKm() + "\tanciennete: " + this.getAge() + "\tPrix de vente: " + this.getPrix() + "\n";
	}
}
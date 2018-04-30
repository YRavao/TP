import java.util.ArrayList;

public class VoitureNeuve extends Voiture {
	private ArrayList<Option> op = new ArrayList<Option>();
	
	public VoitureNeuve(String numero, double prix) {
		super(numero, prix);
	}
	
	public void addOption(Option option) {
		op.add(option);
	}
	
	public double getPrix() {
		return prix;
	}
	
	public String toString() {
		return super.toString() + "\tPrix de vente:" + this.getPrix() + "\n";
	}
}
import java.util.ArrayList;

public class Garage {
	
	private  ArrayList<Voiture> Car = new ArrayList<Voiture>();
	private  ArrayList<Option> op = new ArrayList<Option>();
	
	public Garage(){
		
	}
	
	public void addVoiture(Voiture v) {
		Car.add(v);
	}
	
	public void addOption(Option o) {
		op.add(o);
	}
}
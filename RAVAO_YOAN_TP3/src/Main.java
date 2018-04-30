
public class Main {

	public static void main(String[] args) {
		Bot bot1= new Bot("T1000");
		bot1.setarmure(100);
		bot1.setniveau(3);
		
		System.out.println(bot1.toString());
		
		System.out.println("Il croise un joueur !");
		System.out.println("Il prend un coup !");
		bot1.baisserarmure(50);
		System.out.println(bot1.toString());
		System.out.println("Il prend un autre coup !");
		bot1.baissersante(20);
		System.out.println(bot1.toString());
		System.out.println("Il bat en retraite !");
		bot1.augmenterarmure(10);
		bot1.augmentersante(10);
		System.out.println("Il recupere de la santé et des points armure");
		System.out.println(bot1.toString());


	}

}

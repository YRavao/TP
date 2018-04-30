
public class Personne {
	private String nom;
	private int sante;
	private int armure;
	static int nbrJoueur=1;
	public Arme[] inventaire;
	
	public Personne(){
		String nom="Joueur"+nbrJoueur;
		int sante=100;
		int armure=0;
		nbrJoueur++;
		}
	
	
	public Personne(String n){
		nom=n;
		sante=100;
		armure=0;
		inventaire=creerPoche();
	}
	 
	public Arme[] creerPoche(){
		Arme[] poche=new Arme[8];
		poche[0]=new Arme("Gant",20);
		poche[1]=new Arme("Mitraillette",10);
		return poche;
	}
	
	public Arme MeilleurArme(){
		int degat= 0;
		int id=0;
		for(int i=0;i< inventaire.length;i++){
			if(inventaire[i].getDegat()>degat){
				degat=inventaire[i].getDegat();
				id=i;
			}
		}
	return inventaire[id];
	}
	
	
	
	public String getNom(){
		return nom;
	}
	
	public int getSante(){
		return sante;
	}
	
	public int getarmure(){
		return armure;
	}	
	
	   public void augmentersante(int s){
		   sante= sante + s;
		   if (s>100){
			   s=100;
		   };
	   }
	   
	     public void baissersante(int s){
	    	 sante= sante - s;
	    	 if (s<=0){
	    		 s=0;
	    		 System.out.println("Mort");
	    	 }
	     }
	     
	     public void augmenterarmure(int a){
	    	 armure=armure+a;
	     }
	     
	     public void baisserarmure(int a){
	    	 armure=armure-a;
	     }
	     
	     public void setarmure(int a){
	    	 armure=a;
	     }
	
	
	public String toString(){
		return this.getNom()+"a"+this.getSante()+"de santé et"+this.getarmure()+"d'armure.";
	}
	
}

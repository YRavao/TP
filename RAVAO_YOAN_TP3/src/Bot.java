public class Bot extends Personne{
     private int niveau;
    
     
     
     public Bot(String n) {
    	  super(n);
          this.niveau = 0;
          }
     
     public int getniveau(){
    	 return niveau;
     }
     
     public void setniveau(int n){
    	niveau=n;
     }
     
     public String toString(){
 		return this.getNom()+" a "+this.getSante()+" de santé et "+this.getarmure()+" d'armure ainsi qu'un niveau de "+this.getniveau();
 	}
}

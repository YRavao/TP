import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Categorie c:cats){
			System.out.println(c.getNomCat());
			System.out.println(c.ToString());
		}
		
		System.out.println("-------------------");
		List<Produit> prods2=metier.getproduitParMC("D");
		
		for(Produit p:prods2){
			System.out.println(p.getNomProduit());
			System.out.println(p.getPrix());
			System.out.println(p.getCategorie().getNomCat());
		}
	}

}

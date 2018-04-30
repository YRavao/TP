import java.util.*;

public interface Imetier {

	 public void addCategorie (Categorie c);
	 public void addProduit(Produit p, int idCat);
	 public List <Produit> getProduitparMC(String MC);
	 public List <Produit> getProduitparCat(int idCat);
	 public List <Produit> getAllCatgorie();
	 public Categorie getCategorie(int idCat);
}

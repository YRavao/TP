import java.util.*;
import java.sql.*;



public class MetierCategorie1 implements Imetier{
	@Override
	public void addCategorie(Categorie c) {
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Insert into Categorie(Nom_cat) values : (?)");
			ps.setString(1, c.getNomCat());
			ps.executeUpdate();
			ps.close();
		}catch (Exception e) { e.printStackTrace();}
		
	}
	
	@Override
	public List<Produit> getProduitparMC(String mc){
		List<Produit> prods = new ArrayList<Produit>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Produit where Nom_Produit like ?");
			ps.setString( 1, "%" + mc + "%" );
			
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				Produit p=new Produit();
				p.setRefProduit(rs.getString("Ref_Produit"));
				p.setNomProduit(rs.getString("Nom_Produit"));
				p.setPrix(rs.getDouble("Prix"));
				p.setQuantite(rs.getInt("Quantite"));
				
				int idCat = rs.getInt("iD_Cat");
				PreparedStatement ps2 = conn.prepareStatement("Select * from Categorie where ID_Cat:?");
				ps.setInt(1, idCat);
				ResultSet rs2 = ps2.executeQuery();
				if (rs2.next()) {
					Categorie cat = new Categorie();
					cat.setIdCat(rs2.getInt(1));
					cat.setNomCat(rs2.getString(2));
					p.setCategorie(cat);
					ps2.close();
				}
				prods.add(p);
			}
			ps.close();
		}catch (SQLException e) { e.printStackTrace(); return prods; }
	}
	
	public List <Produit> getProduitparCat (int idCat){
		List <Produit> prods = new Arraylist <Produit>();
		Connection conn =SingletonConnection.getConnection();
		
		try{
			PreparedStatement ps=Conn.prepareStatement("Select * from Produit where IdCat=?");
			ps.setInt(1,idCat);
			ResultSet rs =ps.executeQuery();
			
			while (rs.next()) {
				Produit p = new Produit();
				p.setRefProduit(rs.getString("Ref_Produit"));
				p.setNomProduit(rs.getString("Nom_Produit"));
				p.setPrix(rs.getDouble("Prix"));
				p.setQuantite(rs.getInt("Quantite"));
				PreparedStatement ps2= conn.prepareStatement("Select * from Produit where IdCat=?");
				ps2.setInt(1,idCat);
				ResultSet rs2 =ps2.executeQuery();
				if (rs2.next()){
					Categorie cat = new Categorie();
					cat.setIdCat(rs2.getInt("Id_Cat"));
					cat.setNomCat(rs2.getString("Nom_Cat"));
					p.setCategorie(cat);
					ps2.close();
					}
				prods.add(p);
				}
			}catch (SQLException e) { e.printStackTrace(); return prods; }
		}	
	}

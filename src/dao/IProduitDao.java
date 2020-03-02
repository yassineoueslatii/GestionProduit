package dao;

import model.Produit;

public interface IProduitDao {
	
	public int createProduit(Produit pr);
	public int supprimeProduit(int id);


}

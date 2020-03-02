package main;

import dao.IProduitDao;
import dao.ProduitDao;
import model.Produit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produit pr = new Produit("Ordinateur", "16 go de Ram 1To SSD");
		IProduitDao dao= new ProduitDao();
		dao.createProduit(pr);
		
		dao.supprimeProduit(1);

	}

}

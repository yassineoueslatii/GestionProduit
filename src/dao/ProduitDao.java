package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class ProduitDao implements IProduitDao{

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	@Override
	public int createProduit(Produit pr) {
		
		try {
			
		
		session.beginTransaction();
		session.saveOrUpdate(pr);
		session.getTransaction().commit();
		return 1;
		}
		catch(HibernateException e) 
		{
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int supprimeProduit(int id) {
		
		Produit pr = new Produit();
		pr.setIdProduit(id);
		try {
		session.beginTransaction();
		session.delete(pr);
		session.getTransaction().commit();
		return 1;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return 0;
		}
	}

}

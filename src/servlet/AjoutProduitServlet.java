package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IProduitDao;
import dao.ProduitDao;
import model.Produit;

/**
 * Servlet implementation class AjoutProduitServlet
 */
@WebServlet("/add")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit pr = new Produit();
		pr.setNomProduit(request.getParameter("name"));
		pr.setDescriptionP(request.getParameter("description"));
		IProduitDao dao = new ProduitDao();
		int i = dao.createProduit(pr);
		if(i==1) request.setAttribute("message", "this product was created successfully");
		else request.setAttribute("message", "this product has not been created. Erreur");
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/produits.jsp").forward(request, response);
		
		
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayerManager
 */
@WebServlet("/PlayerManager")
public class PlayerManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerManager() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("ADD PLAYER"))
		{
			response.sendRedirect("AddPlayer.jsp");
		}
		else if(action.equalsIgnoreCase("VIEW TEAM"))
		{
			response.sendRedirect("ViewTeam.jsp");
		}
		else if(action.equalsIgnoreCase("HOME"))
		{
			response.sendRedirect("index.html");
		}
	}

}

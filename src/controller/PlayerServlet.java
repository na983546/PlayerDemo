package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Player;

import service.PlayerService;

/**
 * Servlet implementation class PlayerServlet
 */
@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerServlet() {
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
		
		PlayerService playerService = new PlayerService();
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("ADD PLAYER"))
		{
			
			int id=Integer.parseInt(request.getParameter("playerId"));
			String name= request.getParameter("playerName").toUpperCase();
			int age =Integer.parseInt(request.getParameter("age"));
			String position= request.getParameter("position");
			String team = request.getParameter("team");
			int salary = Integer.parseInt(request.getParameter("salary"));
			int ratings = Integer.parseInt(request.getParameter("ratings"));
			
			Player player =new Player();
			player.setPlayerId(id);
			player.setPlayerName(name);
			player.setAge(age);
			player.setPosition(position);
			player.setTeam(team);
			player.setSalary(salary);
			player.setRating(ratings);
			
			int i=playerService.addPlayer(player);
			if(i > 0){
				request.setAttribute("msg","Player Added Succesfully");
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request,response);
			}
			else{
				request.setAttribute("msg","Player ID Already Exist!!!!!");
				RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
				rd.forward(request,response);
			}
		}
		else if(action.equalsIgnoreCase("VIEW TEAM"))
		{
			String team = request.getParameter("team");
			ArrayList<Player> list = new ArrayList<Player>();
			list = playerService.retrieveTeam(team);
			if(list.isEmpty())
			{
				request.setAttribute("msg", "Players Not Found!!!!");
				RequestDispatcher rd =request.getRequestDispatcher("Failure.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Team Found!!!!");
				request.setAttribute("ArrayList", list);
				RequestDispatcher rd =request.getRequestDispatcher("FoundTeam.jsp");
				rd.forward(request, response);
			}
		}
		
	}

}

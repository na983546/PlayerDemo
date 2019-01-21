package service;

import java.util.ArrayList;

import bean.Player;
import DAO.PlayerManagement;

public class PlayerService {
	
	PlayerManagement dao = new PlayerManagement();
	public int addPlayer(Player player)
	{
		System.out.println("Player Added------>!!!");
		int i = dao.addPlayer(player);
		return i;
 	}
	
	public ArrayList<Player>retrieveTeam(String team)
	{
		ArrayList<Player> list = new ArrayList<Player>();
		System.out.println("Employee Found--------->!!!");
		list = dao.retrieveTeam(team);
		return list;
	}

}

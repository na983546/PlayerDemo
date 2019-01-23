package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Player;
import util.DbTransaction;

public class PlayerManagement {
	
		
		PreparedStatement ps=null;
		
		public int addPlayer(Player player){
			int i=0;
			Connection con =null;
			
				try {
					con=DbTransaction.getConnection();
					String sql ="insert into Player_Tbl_1625922 (Player_Id,Player_Name,Age,Position,Team,Salary,Ratings) "+" values(?,?,?,?,?,?,?)";
					PreparedStatement ps =con.prepareStatement(sql);
					ps.setInt(1, player.getPlayerId());
					ps.setString(2, player.getPlayerName());
					ps.setInt(3, player.getAge());
					ps.setString(4, player.getPosition());
					ps.setString(5, player.getTeam());
					ps.setDouble(6, player.getSalary());
					ps.setInt(7, player.getRating());
					i=ps.executeUpdate();
					DbTransaction.closeConnection(con);
					} 
				catch (SQLException e) {
					e.printStackTrace();
				}
				return i;
		}
			
		public ArrayList<Player>retrieveTeam(String team){
			ArrayList<Player> list = new ArrayList<Player>();
			
			Connection con = null;
			ResultSet rs = null;
			try {
		        con = DbTransaction.getConnection();
		        String sql = "select * from Player_Tbl_1625922 where team = ? order by Player_Id";

		        ps = con.prepareStatement(sql);

		        ps.setString(1,team);
		        rs = ps.executeQuery();
		        while (rs.next()) {
		        	Player player =new Player();
		        	player.setPlayerId(rs.getInt(1));
					player.setPlayerName(rs.getString(2));
					player.setAge(rs.getInt(3));
					player.setPosition(rs.getString(4));
					player.setTeam(rs.getString(5));
					player.setSalary(rs.getInt(6));
					player.setRating(rs.getInt(7));
		        	
		        	list.add(player);
		        }
		        DbTransaction.closeConnection(con);
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
			return list;
		}

	}

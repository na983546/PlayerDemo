package bean;

public class Player {
	private int playerId;
	private String playerName;
	private int age;
	private String position;
	private String team;
	private int salary;
	private int rating;
	
	
	
	public Player() {
		super();
	}



	public Player(int playerId, String playerName, int age, String position,
			String team, int salary, int rating) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.position = position;
		this.team = team;
		this.salary = salary;
		this.rating = rating;
	}



	public int getPlayerId() {
		return playerId;
	}



	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", age=" + age + ", position=" + position + ", team=" + team
				+ ", salary=" + salary + ", rating=" + rating + "]";
	}
	
	
	
	
	
	

}

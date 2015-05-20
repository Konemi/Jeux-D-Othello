/**
 * Display the game
 * @author omelj
 *
 */
public class GameDisplay 
{
	/**
	 * Game's launcher
	 * @param args no use
	 */
	public static void main(String[] args) 
	{
		Player player1 = new Player("1", Disk.light);
		Player player2 = new Player("2", Disk.dark);;
		new OthelloGame(player1, player2).play();
		
	}
}


/**
 * The two players
 * @author quennevb
 *
 */
public class Player 
{
	/**
	 *  Name of the player
	 */
	public final String PLAYER_NAME;
	
	/**
	 *  Color of the player
	 */
	public final Disk PLAYER_COLOR;
	
	
	
	
	
	/**
	 *  used for two instance of the player (light, dark)
	 * @param playerName  Player's name
	 * @param playerColor  Player's color
	 */
	public Player(String playerName, Disk playerColor)
	{
		this.PLAYER_NAME = playerName;
		this.PLAYER_COLOR = playerColor;
	}
	
	
	
	/**
	 * @param line
	 * @param column
	 * @param board
	 */
	public void putDisk(Board board, Disk[][] boardArray)
	{
		board.getBoard = boardArray;
	}
	
	
	
	
	
	
	
}

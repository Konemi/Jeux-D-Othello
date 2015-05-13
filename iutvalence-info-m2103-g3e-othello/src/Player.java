
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
	 * Put a disk on the board
	 * @param board 
	 * @param line line of the array
	 * @param column column of the array
	 */
	public void putDisk(Board board, int line, int column)
	{
		board.setArray(this.PLAYER_COLOR,line, column);
		//TODO modification of the other disks already on the board
	}
	
	
	
	
	
	
	
}

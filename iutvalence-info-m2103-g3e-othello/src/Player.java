
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
	 * @param board the game's board
	 * @param position the position of the disk to put
	 */
	public void putDisk(Board board, Position position)
	{
		board.setDisk(this.PLAYER_COLOR, position);
		//TODO modification of the other disks already on the board
	}
	
	
	
	
	
	
	
}

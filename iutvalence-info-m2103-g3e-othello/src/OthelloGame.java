/**
 * The progress of the game.
 * @author omelj
 *
 */
public class OthelloGame
{	
	/**
	 *  Game's board
	 */
	private Board board;
	/**
	 *  Player 1
	 */
	private Player player1;
	/**
	 *  Player 2
	 */
	private Player player2;
	private final int <Position> listPosition = {{1,-1},{1,0},{1,1},{0,1},{-1,1},{0,-1},{-1,-1},{-1,0}};
	
	
	/**
	 * initialization of the Game's board
	 */
	public OthelloGame(Player player1, Player player2)
	{
		this.board = new Board();
		this.player1 = player1;
		this.player2 = player2;
	}
	
	/**
	 * Play the round while endOfGame is false
	 */
	public void play()
	{
		while (!this.isEndOfGame())
		{
			
		}
	}
	
	/**
	 * Determine if it is the end of the game
	 * @return false if the game isn't over
	 */
	private boolean isEndOfGame()
	{
		if (this.board.hasNoEmptyCell()) return true;
		if (this.getPossibleMoveCount() == 0) return true;
		return false;
		
	}
	
	/**
	 * @return Number of possible movement
	 */
	private int getPossibleMoveCount()
	{
		// TODO à remplir
		return 0;
	}
	
	/**
	 * 
	 * @param line line of the array
	 * @param column line of the array
	 *  @return true if the movement is possible
	 */
	private boolean isMovePossible(Position position)
	{
		if (this.board.getDisk(this.board, position) != Disk.none)
				{
					return false;
				}
		return true;
	}
	
}

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
	 * initialization of the Game's board
	 */
	public OthelloGame()
	{
		this.board = new Board();
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
	private boolean getPossibleMove(int line, int column)
	{
		//TODO à finir
	}
	
}

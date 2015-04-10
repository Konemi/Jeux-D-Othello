/**
 * The progress of the game.
 * @author omelj
 *
 */
public class OthelloGame
{	
	private Board board;
	
	
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
			playTheRound();
		}
	}
	private boolean isEndOfGame() {
		if (this.board.hasNoEmptyCell()) return true;
		if (this.getPossibleMoveCount() == 0) return true;
		return false;
		
	}
	private int getPossibleMoveCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Game round's process
	 */
	private void playTheRound() 
	{
		int lineCounter,columnCounter;
		for (lineCounter=0 ; lineCounter < Board.NB_SQUARE ; lineCounter++)
		{
			for (columnCounter=0 ; columnCounter < Board.NB_SQUARE ; columnCounter++)
			{
				if (Board.board[lineCounter][columnCounter] == none)
				{
					this.endOfGame = 
				}
				
			}
		}
		
	}
}

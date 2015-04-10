
/**
 * The othello board which contains 8*8 identical squares and disks.
 * @author omelj
 *
 *
 */
public class Board {

	/**
	 * Number of line.
	 */
	public static final int NB_LINE = 8;
	/**
	 * Number of column.
	 */
	public static final int NB_COLUMN = 8;	
	/**
	 * Number of square.
	 */
	public static final int NB_SQUARE = NB_LINE*NB_COLUMN;	
	
	/**
	 * The board data structure that will contain disks
	 */
	private int [][] board;

	/**
	 * Creates a new board, with default size and containing the four initial disks
	 */
	public Board()
	{
		// ...
	}

	/**
	 * serching for one or more empty cells
	 * @return false if at least one cell is empty
	 */
	public boolean hasNoEmptyCell() {
		int lineCounter,columnCounter;
		for (lineCounter=0 ; lineCounter < Board.NB_SQUARE ; lineCounter++)
		{
			for (columnCounter=0 ; columnCounter < Board.NB_SQUARE ; columnCounter++)
			{
				if (this.board[lineCounter][columnCounter] == none)
				{
					return false;
				}				
			}
		}
		return true;
	}
	
	
}

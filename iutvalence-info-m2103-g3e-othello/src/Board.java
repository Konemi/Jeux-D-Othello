
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
	private Disk [][] board;

	/**
	 * Creates a new board, with default size and containing the four initial disks
	 */
	public Board()
	{
		this.board = new Disk [NB_LINE][NB_COLUMN];
		for (int lineCounter = 0 ; lineCounter < this.NB_SQUARE ; lineCounter++)
		{
			for (int columnCounter = 0 ; columnCounter < this.NB_SQUARE ; columnCounter++)
			{
				this.board[lineCounter][columnCounter] = Disk.none;			
			}
		}
	}

	/**
	 * serching for one or more empty cells
	 * @return false if at least one cell is empty
	 */
	public boolean hasNoEmptyCell() {
		int lineCounter,columnCounter;
		for (lineCounter=0 ; lineCounter < this.NB_SQUARE ; lineCounter++)
		{
			for (columnCounter=0 ; columnCounter < this.NB_SQUARE ; columnCounter++)
			{
				if (this.board[lineCounter][columnCounter] == Disk.none)
				{
					return false;
				}				
			}
		}
		return true;
	}
	
	
}

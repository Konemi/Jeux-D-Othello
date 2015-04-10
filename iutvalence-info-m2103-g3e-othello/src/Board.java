
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

	public boolean hasNoEmptyCell() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

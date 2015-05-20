import java.util.ArrayList;
import java.util.List;

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
	/**
	 * la coordonnée de la liste des positions
	 */
	private int position;
	
	/**
	 * List of all position around the square
	 */
	private final int[][] listPosition = {{this.position,-this.position},{this.position,0},{this.position,this.position},{0,this.position},{-this.position,this.position},{0,-this.position},{-this.position,-this.position},{-this.position,0}};
	
	
	/**
	 * initialization of the Game's board
	 * @param player1 the player 1
	 * @param player2 the player 2
	 */
	public OthelloGame(Player player1, Player player2)
	{
		this.board = new Board();
		this.player1 = player1;
		this.player2 = player2;
		this.position = 1;
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
 * Determine if we can put a disk at the position
 * @param position position of the tested square
 * @param color color of the current player/ disk we want to put
 * @return A list of every position until which we will have to switch disks or <tt>null<tt> if the square isn't available
 */
	private List<Position> isMovePossible(Position position, Disk color)
	{
		List<Position> possibleMovement = new ArrayList<Position>();
		int i,j;
		Position caseATester;
		if (this.board.getDisk(this.board, position) != Disk.none)
		{
			return null;
		}
		for(int[] direction: this.listPosition)
		{
			i = position.obtenirNumeroDeLigne() + direction[0];
			j = position.obtenirNumeroDeColonne() + direction[1];
			caseATester = new Position(i,j);
			if(this.board.getDisk(this.board, caseATester) == color || this.board.getDisk(this.board, caseATester) == Disk.none)
			{
				continue;
			}
			for(this.position=1;this.position<8;this.position++)
			{
				i = position.obtenirNumeroDeLigne() + direction[0];
				j = position.obtenirNumeroDeColonne() + direction[1];
				if (this.board.getDisk(this.board, caseATester) == color)
				{
                    possibleMovement.add(caseATester);
					break;
				}
				if(this.board.getDisk(this.board, caseATester) == Disk.none)
				{
					break;
				}
			}
		}
		return possibleMovement;
	}
	
	/**
	 * flip every disks from the initial position to the final position
	 * @param player the current player
	 * @param initialPosition initial position
	 * @param finalPositions a list of position used to delimited which disks to flip
	 */
	public void flippingDisks(Player player, Position initialPosition, List<Position> finalPositions)
	{
		for(Position position: finalPositions)
		{
			//implementable with a hashmap instead of a list for finalPositions
			player.putDisk(this.board, position);
		}
	}
}

package ca.ciccc.java.model;

/**
*
* This class represents Queen.<br>
* It has attributes below.
* <ul>
* <li>value</li>
* </ul>

* @since 2018-04-05
* @author shouhei
*
*/

public class Queen extends ChessPiece {

	private final String QUEENNAME = "QUEEN";

	/**
	 *  Default constructor.
	 */
	public Queen() {
		super();
	}

	/**
	 * Constructs a new Queen object by setting initial values in specified values.<br>
	 * @param value value of Queen's importance
	 */
	public Queen(int value) {
		super(value);
		this.setName(QUEENNAME);
	}

	/**
	 * Queen moves.
	 */
	@Override
	public void move() {
		System.out.println("like a bishop or a rook");
	}

}

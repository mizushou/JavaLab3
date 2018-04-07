package ca.ciccc.java.model;

/**
*
* This class represents Knight.<br>
* It has attributes below.
* <ul>
* <li>value</li>
* </ul>

* @since 2018-04-05
* @author shouhei
*
*/

public class Knight extends ChessPiece {

	private final String KNIGHTNAME = "KNIGH";

	/**
	 *  Default constructor.
	 */
	public Knight() {
		super();
	}

	/**
	 * Constructs a new Knight object by setting initial values in specified values.<br>
	 * @param value value of Knight's importance
	 */
	public Knight(int value) {
		super(value);
		this.setName(KNIGHTNAME);
	}

	/**
	 * Knight moves.
	 */
	@Override
	public void move() {
		System.out.println("like an L");
	}

}

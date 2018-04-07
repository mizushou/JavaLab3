package ca.ciccc.java.model;

/**
*
* This class represents Bishop.<br>
* It has attributes below.
* <ul>
* <li>value</li>
* </ul>

* @since 2018-04-05
* @author shouhei
*
*/

public class Bishop extends ChessPiece {

	/**
	 *  Default constructor.
	 */
	public Bishop() {
		super();
	}

	/**
	 * Constructs a new Bishop object by setting initial values in specified values.<br>
	 * @param value value of Bishop's importance
	 */
	public Bishop(int value) {
		super(value);
	}

	/**
	 * Bishop moves.
	 */
	@Override
	public void move() {
		System.out.println("diagonally");
	}

}

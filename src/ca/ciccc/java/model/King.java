package ca.ciccc.java.model;

/**
*
* This class represents King.<br>
* It has attributes below.
* <ul>
* <li>value</li>
* </ul>

* @since 2018-04-05
* @author shouhei
*
*/

public class King extends ChessPiece {

	/**
	 *  Default constructor.
	 */
	public King() {
		super();
	}


	/**
	 * Constructs a new King object by setting initial values in specified values.<br>
	 * @param value value of King's importance
	 */
	public King(int value) {
		super(value);
	}

	/**
	 * King moves.
	 */
	@Override
	public void move() {
		System.out.println("one square");
	}

}

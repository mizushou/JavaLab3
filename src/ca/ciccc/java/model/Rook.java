package ca.ciccc.java.model;

/**
*
* This class represents Rook.<br>
* It has attributes below.
* <ul>
* <li>value</li>
* </ul>

* @since 2018-04-05
* @author shouhei
*
*/

public class Rook extends ChessPiece {

	private final String ROOKNAME = "ROOK";

	/**
	 *  Default constructor.
	 */
	public Rook() {
		super();
	}

	/**
	 * Constructs a new Rook object by setting initial values in specified values.<br>
	 * @param value value of Rook's importance
	 */
	public Rook(int value) {
		super(value);
		this.setName(ROOKNAME);
	}

	/**
	 * Rook moves.
	 */
	@Override
	public void move() {
		System.out.println("horizontally or vertically");
	}

}

package ca.ciccc.java.model;

/**
 *
 * ChessPiece is a abstract class. This is a superclass of Pawn, Knight, Bishop, Rook, Queen, King.<br>
 * It has attributes below.
 * <ul>
 * <li>value</li>
 * </ul>
 *
 * @since 2018-04-05
 * @author shouhei
 *
 */

public abstract class ChessPiece {

	int value;

	/**
	 * Default constructor.
	 */
	public ChessPiece() {}

	/**
	 * Constructs a new ChessPiece object by setting initial values in specified values.<br>
	 * @param value value of ChessPiece's importance
	 */
	public ChessPiece(int value) {
		this.value = value;
	}

	/**
	 * Chess piece move
	 */
	abstract void move();

	/**
	 * Display class and value.
	 */
	@Override
	public String toString() {
		return this.getClass() + "class : " + this.value;
	}

	/**
	 * True if the given object has same value, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof ChessPiece))
			return false;
		ChessPiece objC = (ChessPiece)obj;
		if(this.value == objC.value)
			return true;
		return false;
	}

	/**
	 *
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	/**
	 * Getter of value.
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Setter of value.
	 * @param value value of ChessPiece's importance
	 */
	public void setValue(int value) {
		this.value = value;
	}
}

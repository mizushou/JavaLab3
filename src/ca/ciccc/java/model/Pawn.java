package ca.ciccc.java.model;

/**
 *
 * This class represents Pawn.<br>
 * It has attributes below.
 * <ul>
 * <li>value</li>
 * <li>hasBeenPromoted</li>
 * <li>newPiece</li>
 * </ul>

 * @since 2018-04-05
 * @author shouhei
 *
 */
public class Pawn extends ChessPiece {

	boolean hasBeenPromoted;
	ChessPiece newPiece;

	/**
	 *  Default constructor.
	 */
	public Pawn() {
		super();
	}

	/**
	 * Constructs a new Pawn object by setting initial values in specified values.<br>
	 * @param value value of Pawn's importance
	 */
	public Pawn(int value) {
		super(value);
	}

	/**
	 * Pawn moves.
	 */
	@Override
	public void move() {
		System.out.println("forward 1");
	}

	/**
	 * Compare by value. Further compare by whether Pawn has been promoted and what ChessPiece Pawn has promoted to.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean flag = super.equals(obj);
		if(!(obj instanceof Pawn))
			return flag;
		Pawn objP = (Pawn) obj;
		//1. [Not promoted vs Not promoted]
		if(this.hasBeenPromoted == false && objP.hasBeenPromoted ==false)
			return flag;
		//2-3. [promoted vs Not promoted] or [Not promoted vs promoted]
		if((this.hasBeenPromoted == true && objP.hasBeenPromoted == false)
				|| (this.hasBeenPromoted == false && objP.hasBeenPromoted == true)) {
			return flag = false;
		}
		//4. [promoted vs promoted]
		if(!this.newPiece.equals(objP.newPiece))
			return flag = false;
		return flag;
	}

	/**
	 * Pawn promotes to given ChessPiece.
	 * @param newPiece ChessPiece that Pawn promote to
	 */
	public void promote(ChessPiece newPiece) {
		if(this.hasBeenPromoted == false) {
			if(newPiece.value == 2 || newPiece.value == 3 || newPiece.value == 5 || newPiece.value == 9) {
				this.newPiece = newPiece;
				this.hasBeenPromoted = true;
			}
		}
	}

	/**
	 * Getter of hasBeenPromoted
	 * @return hasBeenPromoted
	 */
	public boolean isHasBeenPromoted() {
		return hasBeenPromoted;
	}

	/**
	 * Getter of NewPiece
	 * @return NewPiece
	 */
	public ChessPiece getNewPiece() {
		return newPiece;
	}

}

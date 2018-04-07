package ca.ciccc.java.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ca.ciccc.java.model.Bishop;
import ca.ciccc.java.model.King;
import ca.ciccc.java.model.Knight;
import ca.ciccc.java.model.Pawn;
import ca.ciccc.java.model.Queen;
import ca.ciccc.java.model.Rook;

public class ChessPiecesTest {

	private Pawn[] pawnWArry;
	private Rook[] rookWArry;
	private Knight[] knightWArry;
	private Bishop[] BishopWArry;
	private Queen queen;
	private King king;

	private final int PAWNSNUMBER = 8;
	private final int KNIGHTNUMBER = 2;
	private final int BISHOPNUMBER = 2;
	private final int ROOKNUMBER = 2;

	private final int PAWNSVALUE = 1;
	private final int KNIGHTVALUE = 2;
	private final int BISHOPVALUE = 3;
	private final int ROOKVALUE = 5;
	private final int QUEENVALUE = 9;
	private final int KINGVALUE = 1000;

	@Before
	public void setUp() throws Exception {
		pawnWArry = new Pawn[PAWNSNUMBER];
		for(int i=0; i<8; i++){
			pawnWArry[i] = new Pawn(PAWNSVALUE);
		};
		knightWArry = new Knight[KNIGHTNUMBER];
		for(int i=0; i<2; i++){
			knightWArry[i] = new Knight(KNIGHTVALUE);
		};
		BishopWArry = new Bishop[BISHOPNUMBER];
		for(int i=0; i<2; i++){
			BishopWArry[i] = new Bishop(BISHOPVALUE);
		};
		rookWArry = new Rook[ROOKNUMBER];
		for(int i=0; i<2; i++){
			rookWArry[i] = new Rook(ROOKVALUE);
		};
		queen = new Queen(QUEENVALUE);
		king = new King(KINGVALUE);
	}


	@Test
	public void testPromotion() {

		//Test#3 promotion method.
		assertNull("not null", pawnWArry[0].getNewPiece());
		pawnWArry[0].promote(new Queen(9));
		assertEquals(true, pawnWArry[0].isHasBeenPromoted());
		assertNotNull(pawnWArry[0].getNewPiece());
		assertEquals(queen, pawnWArry[0].getNewPiece());

		// promote again
		pawnWArry[0].promote(new Rook(5));
		assertNotEquals(rookWArry[0], pawnWArry[0].getNewPiece());
		assertEquals(queen, pawnWArry[0].getNewPiece());
		assertEquals(true, pawnWArry[0].isHasBeenPromoted());
	}

	@Test
	public void testEquals() {

		//Test#4 equals method.

		//#1 same pieces - same obj
		assertEquals(true, knightWArry[0].equals(knightWArry[0]));

		//#2 same pieces - not same obj
		assertEquals(true, knightWArry[0].equals(knightWArry[1]));

		//#3 not same pieces
		assertEquals(false, knightWArry[0].equals(BishopWArry[1]));

		//#4 not promoted pawn vs not promoted pawn
		assertEquals(true, pawnWArry[6].equals(pawnWArry[7]));

		//#5 not promoted pawn vs promoted pawn
		pawnWArry[0].promote(new Queen(9));
		assertEquals(false, pawnWArry[1].equals(pawnWArry[0]));

		//#6 promoted pawn vs not promoted pawn
		assertEquals(false, pawnWArry[0].equals(pawnWArry[1]));

		//#7 promoted pawn vs promoted pawn - same newPiece(Queen - Queen)
		pawnWArry[2].promote(new Queen(9));
		assertEquals(true, pawnWArry[0].equals(pawnWArry[2]));

		//#8 promoted pawn vs promoted pawn - not same newPiece(Queen - Rook)
		pawnWArry[4].promote(new Rook(5));
		assertEquals(false, pawnWArry[0].equals(pawnWArry[4]));

	}



}

package ca.ciccc.java.main;


import ca.ciccc.java.model.Bishop;
import ca.ciccc.java.model.King;
import ca.ciccc.java.model.Knight;
import ca.ciccc.java.model.Pawn;
import ca.ciccc.java.model.Queen;
import ca.ciccc.java.model.Rook;

public class Driver {

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


	public static void main(String[] args) {

		Driver d = new Driver();
		d.initilize();

		//Test#1 test move methods.
		System.out.println("=========Test#1 test move methods.=========");
		d.getPawnWArry()[0].move();
		d.getKnightWArry()[0].move();
		d.getBishopWArry()[0].move();
		d.getRookWArry()[0].move();
		d.getKing().move();
		d.getQueen().move();

		System.out.println();

		//Test#2 test toString method.
		System.out.println("=========Test#2 test toString method.=========");
		System.out.println(d.getPawnWArry()[0].toString());
		System.out.println(d.getKnightWArry()[0].toString());
		System.out.println(d.getBishopWArry()[0].toString());
		System.out.println(d.getRookWArry()[0].toString());
		System.out.println(d.getQueen().toString());
		System.out.println(d.getKing().toString());

		System.out.println();

		//Test#3 promotion method.
		System.out.println("=========Test#3 promotion method.=========");
		System.out.println("[Before promotion]");
		System.out.println(d.getPawnWArry()[0].isHasBeenPromoted());
		System.out.println("[After promotion]");
		d.getPawnWArry()[0].promote(new Queen(9));
		System.out.println(d.getPawnWArry()[0].isHasBeenPromoted());
		System.out.println(d.getPawnWArry()[0].getNewPiece().toString());

		System.out.println();

		//Test#4 equals method.
		System.out.println("=========Test#4 equals method.=========");

		//#1 same piece - same obj
		System.out.println("[#1 same piece - same obj]");
		System.out.println(d.getKnightWArry()[0].equals(d.getKnightWArry()[0])); // true

		//#2 same piece - not same obj
		System.out.println("[#2 same piece - not same obj]");
		System.out.println(d.getKnightWArry()[0].equals(d.getKnightWArry()[1])); // true

		//#3 not same piece
		System.out.println("[#3 not same piece]");
		System.out.println(d.getKnightWArry()[0].equals(d.getBishopWArry()[0])); // false

		//#4 not promoted pawn vs not promoted pawn
		System.out.println("[#4 not promoted pawn vs not promoted pawn]");
		System.out.println(d.getPawnWArry()[6].equals(d.getPawnWArry()[7])); // true

		//#5 not promoted pawn vs promoted pawn
		System.out.println("[#5 not promoted pawn vs promoted pawn]");
		System.out.println(d.getPawnWArry()[1].equals(d.getPawnWArry()[0])); // false

		//#6 promoted pawn vs not promoted pawn
		System.out.println("[#6 promoted pawn vs not promoted pawn]");
		System.out.println(d.getPawnWArry()[1].equals(d.getPawnWArry()[0])); // false

		//#7 promoted pawn vs promoted pawn - same newPiece(Queen - Queen)
		System.out.println("[#7 promoted pawn vs promoted pawn - same newPiece(Queen - Queen)]");
		d.getPawnWArry()[2].promote(new Queen(9));
		System.out.println(d.getPawnWArry()[0].equals(d.getPawnWArry()[2])); // true

		//#8 promoted pawn vs promoted pawn - not same newPiece(Queen - Rook)
		System.out.println("[#8 promoted pawn vs promoted pawn - not same newPiece(Queen - Rook)]");
		d.getPawnWArry()[4].promote(new Rook(5));
		System.out.println(d.getPawnWArry()[0].equals(d.getPawnWArry()[4])); // false

		System.out.println();

		//Test#5 hashcode method
		System.out.println("=========Test#5 hashcode method.=========");
		System.out.println("#Pawn");
		for(int i=0; i<d.getPawnWArry().length; i++){
			System.out.println(d.getPawnWArry()[i].hashCode());
		};

		System.out.println("#Knight");
		for(int i=0; i<d.getKnightWArry().length; i++){
			System.out.println(d.getKnightWArry()[i].hashCode());
		};

		System.out.println("#Bishop");
		for(int i=0; i<d.getBishopWArry().length; i++){
			System.out.println(d.getBishopWArry()[i].hashCode());
		};

		System.out.println("#Rook");
		for(int i=0; i<d.getRookWArry().length; i++){
			System.out.println(d.getRookWArry()[i].hashCode());
		};

		System.out.println("#Queen");
		System.out.println(d.getQueen().hashCode());
		System.out.println("#King");
		System.out.println(d.getKing().hashCode());
	}

	public void initilize() {
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

	public Pawn[] getPawnWArry() {
		return pawnWArry;
	}

	public Rook[] getRookWArry() {
		return rookWArry;
	}

	public Knight[] getKnightWArry() {
		return knightWArry;
	}

	public Bishop[] getBishopWArry() {
		return BishopWArry;
	}

	public Queen getQueen() {
		return queen;
	}

	public King getKing() {
		return king;
	}
}

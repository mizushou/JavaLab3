package ca.ciccc.java.comparator;

import java.util.Comparator;

import ca.ciccc.java.model.ChessPiece;

public class ChessPieceSortByNameCompatator implements Comparator<ChessPiece>{

	@Override
	public int compare(ChessPiece o1, ChessPiece o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Só GET pois cor da peça não pode ser modificada, só acessada
	public Color getColor() {
		return color;
	}
	
}

package chess;

import boardgame.Board;

public class ChessMatch {
	
	//Partida de Xadrez tem que ter tabuleiro
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//Retornar uma matriz de peças de xadrez correspondentes a partida
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][ board.getColumns()];
		for(int i=0; i < board.getRows() ;i++) {
			for(int j=0; j < board.getColumns(); j++) {
				//DownCasting p/ChessPiece
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
}

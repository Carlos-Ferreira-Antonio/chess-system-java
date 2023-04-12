package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	//Partida de Xadrez tem que ter tabuleiro
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece){
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b',6, new Rook(board, Color.WHITE));
		placeNewPiece('e',8, new King(board, Color.BLACK));
		placeNewPiece('e',1, new King(board, Color.WHITE));
	}
	
}

package application;

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//Func p/ imprimir peças da partida:
		UI.printBoard(chessMatch.getPieces());
		
	}

}

package boardgame;

public class Piece {

	protected Position position;

	// Peça está associada com tabuleiro
	private Board board;

	// CONSTRUCT
	// Passando apenas tabuleiro
	// Posição de peça recem criada vai ser nulla!
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// GET apenas pois tabuleiro não é permitido ter alteração
	// Somente classes dentro do mesmo pacote e subclasses que podem acessar
	// o tabuleiro de uma peça
	protected Board getBoard() {
		return board;
	}
	
	

}

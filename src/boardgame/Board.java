package boardgame;

public class Board {
	private int rows;
	private int columns;
	
	//tabuleiro tem matriz de peças
	private Piece[][] pieces;

	//CONSTRUCT
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//Matriz de peças será instanciada com quantidade de linhas e colunas
		pieces = new Piece[rows][columns];
	}

	//GET SET
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}

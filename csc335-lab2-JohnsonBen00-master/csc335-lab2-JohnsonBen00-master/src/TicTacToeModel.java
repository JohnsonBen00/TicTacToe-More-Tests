/**
 * Constructs the Tic Tac Toe Board, has methods to interact with said board
 * @author Benhur
 *
 */
public class TicTacToeModel {
	public static int BLANK = 0;
	public static int X = 1;
	public static int O = 2;
	
	public static int BOARD_DIMENSION = 3;
	
	int[][] board;
	
	
	/**
	 * Constructs the Tic Tac Toe Board
	 */
	public TicTacToeModel() {
		board = new int[BOARD_DIMENSION][BOARD_DIMENSION];
	}
	/**
	 * Places 'X' in the desired location
	 * @param row - the row where you want to place the 'X'
	 * @param col - the column where you want to place the 'X'
	 */
	public void placeX(int row, int col) {
		board[row][col] = X;
	}
	/**
	 * Places 'O' in the desired location
	 * @param row - the row where you want to place the 'O'
	 * @param col - the column where you want to place the 'O'
	 */
	public void placeO(int row, int col) {
		board[row][col] = O;
	}
	/**
	 * Returns the sign in a specific location
	 * @param row - the row where you want to know the sign
	 * @param col - the column where you want to know the sign
	 * @return The sign in desired location
	 */
	public int getAtLocation(int row, int col) {
		return board[row][col];
	}
	
}

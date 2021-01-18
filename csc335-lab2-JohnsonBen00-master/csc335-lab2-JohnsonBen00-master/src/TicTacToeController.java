/**
 * The TicTacToeController Class is an implementation of a Tic Tac Toe game
 * @author Benhur Tadiparti
 * 
 */
public class TicTacToeController {

	private TicTacToeModel model;
	/**
	 * Creates a new model object with the given name (param).
	 * @param model Represents the Tic Tac Toe model (board).
	 */
	public TicTacToeController(TicTacToeModel model) {
		this.model = model;
	}
	/**
	 * Simulates a Tic Tac Toe game.
	 * @return True if the board is full or if either X or O won
	 */
	public boolean isGameOver() {
		boolean emptySpace = false;
		
		// Board is full, maybe a win, maybe a tie
		for(int i=0; i<TicTacToeModel.BOARD_DIMENSION; i++) {
			for(int j=0; j<TicTacToeModel.BOARD_DIMENSION; j++) {
				if(model.getAtLocation(i, j) == TicTacToeModel.BLANK) {
					emptySpace = true;
				}
			}
		}
		
		if(!emptySpace) {
			return true;
		}
		return didXWin() || didOWin();
	}
	/**
	 * Checks to see if the 'X' player won the Tic Tac Toe game.
	 * @return True if 'X' player won the Tic Tac Toe game.
	 */
	public boolean didXWin() {
		
		// Row wins
		for(int i=0; i<TicTacToeModel.BOARD_DIMENSION; i++) {
			if(model.getAtLocation(i, 0) != TicTacToeModel.BLANK && 
					model.getAtLocation(i, 0) == 1 &&
					model.getAtLocation(i, 1) == 1 &&
					model.getAtLocation(i, 2) == 1) {
				return true;
			}
		}
		
		// Column wins
		for(int i=0; i<TicTacToeModel.BOARD_DIMENSION; i++) {
			if(model.getAtLocation(0, i) != TicTacToeModel.BLANK && 
					model.getAtLocation(0, i) == 1 &&
					model.getAtLocation(1, i) == 1 &&
					model.getAtLocation(2, i) == 1) {
				return true;
			}
		}
		
		// Diagonally
		if(model.getAtLocation(0, 0) != TicTacToeModel.BLANK && 
				model.getAtLocation(0, 0) == 1 &&
				model.getAtLocation(1, 1) == 1 &&
				model.getAtLocation(2, 2) == 1) {
			return true;
		}
		
		// Diagonally the other way
		if(model.getAtLocation(0, 2) != TicTacToeModel.BLANK && 
				model.getAtLocation(0, 2) == 1 &&
				model.getAtLocation(1, 1) == 1 &&
				model.getAtLocation(2, 0) == 1) {
			return true;
		}
		
		return false;
		
	}
	/**
	 * Checks to see if the 'O' player won the Tic Tac Toe game.
	 * @return True if 'O' player won the Tic Tac Toe game.
	 */
	public boolean didOWin() {
		
		// Row wins
		for(int i=0; i<TicTacToeModel.BOARD_DIMENSION; i++) {
			if(model.getAtLocation(i, 0) != TicTacToeModel.BLANK && 
					model.getAtLocation(i, 0) == 2 &&
					model.getAtLocation(i, 1) == 2 &&
					model.getAtLocation(i, 2) == 2) {
				return true;
			}
		}
		
		// Column wins
		for(int i=0; i<TicTacToeModel.BOARD_DIMENSION; i++) {
			if(model.getAtLocation(0, i) != TicTacToeModel.BLANK && 
					model.getAtLocation(0, i) == 2 &&
					model.getAtLocation(1, i) == 2 &&
					model.getAtLocation(2, i) == 2) {
				return true;
			}
		}
		
		// Diagonally
		if(model.getAtLocation(0, 0) != TicTacToeModel.BLANK && 
				model.getAtLocation(0, 0) == 2 &&
				model.getAtLocation(1, 1) == 2 &&
				model.getAtLocation(2, 2) == 2) {
			return true;
		}
		
		// Diagonally the other way
		if(model.getAtLocation(0, 2) != TicTacToeModel.BLANK && 
				model.getAtLocation(0, 2) == 2 &&
				model.getAtLocation(1, 1) == 2 &&
				model.getAtLocation(2, 0) == 2) {
			return true;
		}
		
		return false;
		
	}

}

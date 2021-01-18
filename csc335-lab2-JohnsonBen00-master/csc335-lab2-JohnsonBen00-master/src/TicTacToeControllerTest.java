import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * The TicTacToeControllerTest Class checks if there is 100% test coverage
 * @author Benhur Tadiparti
 * 
 */
class TicTacToeControllerTest {
	/**
	 * Empty board test
	 */
	@Test
	void testIsGameOver() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		assertFalse(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}
	/**
	 * Full board/tie test
	 */
	@Test
	void testIsGameOver2() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 1;
		assertTrue(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}
	/**
	 * Column Test for Player 'O'
	 */
	@Test
	void testIsGameOver3() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(0, 1);
		board.placeO(0, 2);
		assertTrue(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertTrue(ticTacToe.didOWin());
	}
	/**
	 * Row Test for Player 'O'
	 */
	@Test
	void testIsGameOver4() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(1, 0);
		board.placeO(2, 0);
		assertTrue(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertTrue(ticTacToe.didOWin());
	}
	/**
	 * Diagonally Test for Player 'O'
	 */
	@Test
	void testIsGameOver5() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(1, 1);
		board.placeO(2, 2);
		assertTrue(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertTrue(ticTacToe.didOWin());
	}
	/**
	 * Reverse Diagonal Test for Player 'O'
	 */
	@Test
	void testIsGameOver6() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 2);
		board.placeO(1, 1);
		board.placeO(2, 0);
		assertTrue(ticTacToe.isGameOver());
		assertFalse(ticTacToe.didXWin());
		assertTrue(ticTacToe.didOWin());
	}
	/**
	 * Column Test for Player 'X'
	 */
	@Test
	void testIsGameOver7() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(0, 1);
		board.placeX(0, 2);
		assertTrue(ticTacToe.isGameOver());
		assertTrue(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}
	/**
	 * Row Test for Player 'X'
	 */
	@Test
	void testIsGameOver8() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(1, 0);
		board.placeX(2, 0);
		assertTrue(ticTacToe.isGameOver());
		assertTrue(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}
	/**
	 * Diagonal Test for Player 'X'
	 */
	@Test
	void testIsGameOver9() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(1, 1);
		board.placeX(2, 2);
		assertTrue(ticTacToe.isGameOver());
		assertTrue(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}
	/**
	 * Reverse Diagonal Test for Player 'X'
	 */
	@Test
	void testIsGameOver10() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 2);
		board.placeX(1, 1);
		board.placeX(2, 0);
		assertTrue(ticTacToe.isGameOver());
		assertTrue(ticTacToe.didXWin());
		assertFalse(ticTacToe.didOWin());
	}

}

package task2;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}
	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
// kiểm tra dòng
	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			// Check each row
			if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}
// kiểm tra cột
	public boolean checkColumns() {
		for (int i = 0; i < board[0].length; i++) {
			// Check each row
			if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				return true;
			}
		}
		return false;
	}
	// kiểm tra đường chéo
	public boolean checkDiagonals() {
		 // Check the main diagonal
	    if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
	        return true;
	    }

	    // Check the other diagonal
	    if (board[board.length - 1][0] != EMPTY && board[board.length - 1][0] == board[1][1] && board[board.length - 1][0] == board[0][2]) {
	        return true;
	    }

	    return false;
	}
	
	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'O' },
				           { ' ', 'O', 'O' }, 
				           { 'X', 'X', 'O' } };
// kiểm tra dòng
		TicTacToe ticTacToe1 = new TicTacToe(board);
		boolean result1 = ticTacToe1.checkRows();
		System.out.println("Is there a win in any row? " + result1);

		// kiểm tra cột
		TicTacToe ticTacToe2 = new TicTacToe(board);
		boolean result2 = ticTacToe2.checkColumns();
		System.out.println("Is there a win in any row? " + result2);
		
		// kiểm tra đường chéo
				TicTacToe ticTacToe3 = new TicTacToe(board);
				boolean result3 = ticTacToe3.checkDiagonals();
				System.out.println("Is there a win in any row? " + result3);
	}

}

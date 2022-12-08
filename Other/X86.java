package Other;
import java.util.Scanner;
import java.util.Random;

public class X86 {

	public static final char CROSS = 'X';
	public static final char CIRCLE = 'O';
	public static int overallScore = 0; 

	public static void main(String[] args) { 
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe!");
		boolean playingthegame = true;
		while (playingthegame) {
			realGame(console);
			System.out.println("Do you want to play again?");
			String answer2 = console.next();
			if (!answer2.equalsIgnoreCase("Yes"))
				playingthegame = false;
		}
		System.out.println("Your final score while playing with the computer was " + overallScore);
		System.out.println("Thank you for playing The Tic-Tac-Toe Game!");
	}

	public static void realGame(Scanner console) {
		char usersymbol = ' ';
		char computersymbol = ' ';
		char[][] board = {{' ', ' ', ' '},
				  {' ', ' ', ' '},
				  {' ', ' ', ' '}};
		char player = ' '; 
		System.out.println("Would you like to go first? (Enter yes or no)");
		String answer = console.next();
		boolean first = !(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"));
		if (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
			while (first == true) {
				System.out.println("Please enter a correct response");
				answer = console.next();
			}
		}
		
//		boolean userplay = false;
		char[][] board = {{' ', ' ', ' '},
						  {' ', ' ', ' '},
						  {' ', ' ', ' '}};
		resetBoard(board);
		
		
		if (answer.equalsIgnoreCase("Yes")) {
			userplay = true;
			usersymbol = CROSS;
			computersymbol = CIRCLE;
		} else {
			userplay = false;
			usersymbol = CIRCLE;
			computersymbol = CROSS;
		}
		System.out.println("Then you will become " + usersymbol + " and the computer will become " + computersymbol);
		while (!isGameDone(board, usersymbol, computersymbol)) {
			if (userplay) {
				userMove(board, console, usersymbol);

			} else {
				computerMove(board, computersymbol);
			}
			printBoard(board);
			userplay = !userplay;
		}
		printBoard(board);
	}

	public static void resetBoard(char[][] board) {
		for (int rows = 0; rows < 3; rows++) {
			for (int columns = 0; columns < 3; columns++) {
				board[rows][columns] = ' ';
			}
		}
		printBoard(board);
	}

	public static void printBoard(char[][] board) {
		System.out.println("Updated Board");
		for (int rows = 0; rows < board.length - 1; rows++) {
			for (int columns = 0; columns < board[rows].length - 1; columns++) {
				System.out.print(" " + board[rows][columns] + " |");
			}
			System.out.print(" " + board[rows][board[rows].length - 1]);
			System.out.println("\n-----------");
		}
		for (int columns = 0; columns < board[board.length - 1].length - 1; columns++) {
			System.out.print(" " + board[board.length - 1][columns] + " |");
		}
		System.out.print(" " + board[board.length - 1][board[board.length - 1].length - 1]);
		System.out.println();
	}

	public static void userMove(char[][] board, Scanner console, char usersymbol) {
		if (checkForAllSpotsFilled(board))
			return;
		System.out.println("Enter the rows [1 - 3] and columns [1 - 3] for placing your symbol");
		int rows = console.nextInt() - 1;
		int columns = console.nextInt() - 1;
		while ( !((rows <=  2 && rows >= 0) || (columns <= 2 && columns >= 0)) || board[rows][columns] != ' ') {
			System.out.println("Please enter a correct position ");
			rows = console.nextInt() - 1;
			columns = console.nextInt() - 1;
		}
		board[rows][columns] = usersymbol;
	}

	public static void computerMove(char[][] board, char computersymbol) {
		if (checkForAllSpotsFilled(board))
			return;
		Random r = new Random();
		int randomrows = r.nextInt(board.length);
		int randomcolumns = r.nextInt(board.length);
		while (board[randomrows][randomcolumns] != ' ') {
			randomrows = r.nextInt(board.length);
			randomcolumns = r.nextInt(board.length);
		}
		board[randomrows][randomcolumns] = computersymbol;
	}

	public static boolean isGameDone(char[][] board, char usersymbol, char computersymbol) {
		char winsymbol = checkWinner(board);
		boolean filled = checkForAllSpotsFilled(board);
		if (filled) {
			if (winsymbol != ' ') {
				if (winsymbol == usersymbol) {
					System.out.println("Congratulations! You have won");
					overallScore+=10;
					return true;
				} else if (winsymbol == computersymbol) {
					System.out.println("Computer has won :(:(:(");
					return true;
				}
				return true;

			} else {
				System.out.println("Tie!");
				return true;
			}
		} else if (winsymbol != ' ') {
			if (winsymbol == usersymbol) {
				System.out.println("Congratulations! You have won");
				overallScore+=10;
				return true;
			} else if (winsymbol == computersymbol) {
				System.out.println("Computer has won :(:(:(");
				return true;
			}
			return true;

		}
		return false;
	}

	public static boolean checkForAllSpotsFilled(char[][] board) {
		for (int rows = 0; rows < board.length; rows++) {
			for (int columns = 0; columns < board[rows].length; columns++) {
				if (board[rows][columns] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static char checkWinner(char[][] board) {
		boolean win = false;
		char symbol = ' ';
		// Check for rows
		for (int rows = 0; rows < board.length; rows++) {
			symbol = board[rows][0];
			win = true;
			if (symbol == ' ') {
				win = false;
				continue;
			}
			for (int columns = 0; columns < board[rows].length; columns++) {
				if (board[rows][columns] != symbol) {
					win = false;
					break;
				}
			}
			if (win) {
				return symbol;
			}
		}
		// Check for columns
		for (int rows = 0; rows < board.length; rows++) {
			symbol = board[rows][0];
			win = true;
			if (symbol == ' ') {
				win = false;
				continue;
			}
			for (int columns = 0; columns < board[rows].length; columns++) {
				if (board[columns][rows] != symbol) {
					win = false;
					break;
				}
			}
			if (win) {
				return symbol;
			}
		}
		// Check for diagonal
		symbol = board[0][0];
		win = true;
		for (int rows = 0; rows < board.length; rows++) {
			if (symbol == ' ') {
				win = false;
				break;
			}
			if (board[rows][rows] != symbol) {
				win = false;
				break;
			}
		}
		if (win) {
			return symbol;
		}
		// Check for opposite diagonal
		symbol = board[board.length - 1][0];
		win = true;
		for (int rows = board.length - 1; rows >= 0; rows--) {
			if (symbol == ' ') {
				win = false;
				break;
			}
			if (board[board.length - 1 - rows][rows] != symbol) {
				win = false;
				break;
			}
		}
		if (win) {
			return symbol;
		}
		return ' ';
	}

}

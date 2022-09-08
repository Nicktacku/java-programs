import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		Board board = new Board();
		
		boolean gameEnd = false;
		
		char mode = ' ';
		char difficulty = ' ';
		
		System.out.println("\nModes:\na) 2 Player\nb) Computer\n");
		System.out.print("Enter preffered mode: ");
		mode = sc.next().toLowerCase().charAt(0);
		
		if (mode == 'b') {
			System.out.println("\nDifficulty:\na) easy\nb) medium\nc) hard");
			System.out.print("Enter difficulty: ");
			difficulty = sc.next().toLowerCase().charAt(0);
		}
		
		board.showBoard();
		
		
		int place = 0;
		while(!gameEnd) {
			if(mode == 'a') {
				// player 1
				System.out.print("Player 1 turn: ");
				place = sc.nextInt();
				if(game.isAvailableMove(String.valueOf(place).charAt(0))) {
					game.playMove('x', place - 1);
					board.updateBoard('x', place - 1);
				}
				
				if(game.isWin('x')) {
					System.out.println("player 1 wins");
					gameEnd = true;
					break;
				} else if(game.isTie()) {
					System.out.println("It's a tie");
					gameEnd = true;
					break;
				}
				
				// player 2
				System.out.print("Player 2 turn: ");
				place = sc.nextInt();
				if(game.isAvailableMove(String.valueOf(place).charAt(0))) {
					game.playMove('o', place - 1);
					board.updateBoard('o', place - 1);
				}
				
				if(game.isWin('o')) {
					System.out.println("player 2 wins");
					gameEnd = true;
					break;
				}
					
				
				
			} else if (mode == 'b'){
				if(difficulty == 'a') {
					
				} else if(difficulty == 'b') {
					
				} else if(difficulty == 'c') {
					
				}
			}
		}
	} // main class

}

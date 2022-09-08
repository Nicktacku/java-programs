
public class Board {
	private char[] items = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	Board(){
		
	}
	
	public void showBoard() {
		System.out.println();
		System.out.println("     |     |     ");
		System.out.println("  " + items[0] + "  |  " + items[1] + "  |  " + items[2]);
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + items[3] + "  |  " + items[4] + "  |  " + items[5]);
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + items[6] + "  |  " + items[7] + "  |  " + items[8]);
		System.out.println("     |     |     ");
	}
	
	public void updateBoard(char move, int place) {
		items[place] = move;
		showBoard();
	}
}


public class Game {
	private char[] items = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	Game(){
		
	}
	
	public boolean isAvailableMove(char move) {
		return new String(items).contains(Character.toString(move));
	}
	
	public void playMove(char move, int place) {
		items[place] = move;
	}
	
	public boolean isWin(char player) {
		// horizontal x win
		if(items[0] == player && items[1] == player && items[2] == player) {
			return true;
		} else if(items[3] == player && items[4] == player && items[5] == player) {
			return true;
		} else if(items[6] == player && items[7] == player && items[8] == player) {
			return true;
		}
		
		// vertical win
		if(items[0] == player && items[3] == player && items[6] == player) {
			return true;
		} else if(items[1] == player && items[4] == player && items[7] == player) {
			return true;
		} else if(items[2] == player && items[5] == player && items[8] == player) {
			return true;
		}
		
		// diagonal win
		if(items[0] == player && items[4] == player && items[8] == player) {
			return true;
		} else if(items[2] == player && items[4] == player && items[6] == player) {
			return true;
		}
		
		return false;
	}
	
	public boolean isTie() {
		String sItems = new String(items);
		
		for(int i = 1; i < 10; i++) {
			if(sItems.contains(String.valueOf(i))) {
				return false;
			}
		}
		
		return true;
	}
}

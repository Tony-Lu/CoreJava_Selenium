package timJava;

public class StatementAndMethod {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score =800;
		int levelCompleted =5;
		int bonus =100;
		
		int highScore = calculateScore(true, 10000, levelCompleted, bonus);
		System.out.println(highScore);
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Bob", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Percy", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Gilber", highScorePosition);

	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
				
		if(gameOver) {
			int finalScore=score +(levelCompleted * bonus);
			finalScore +=1000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
//		else {
			return -1;	// one way | or outside of if statement
//		}
		
			
		
	}
	
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName +  " managed to get into position "
				+ highScorePosition + " on the high score table ");
		
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
//		if(playerScore>=1000) {
//			return 1;
//		}else if(playerScore>=500) {
//			return 2;
//		}else if(playerScore >= 100 ) {
//			return 3;			
//		}else {
//			return 4;
//		}
		
		int position =4;
		if(playerScore>=1000) {
			position=1;
		}else if(playerScore>=500) {
			position=2;
		}else if(playerScore>=100) {
			position=3;
		}
		return position;
	}

}

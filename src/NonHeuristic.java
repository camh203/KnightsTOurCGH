import java.util.Random;


public class NonHeuristic {
	
	public static int moveCount;
	private static int[][] chessboard = new int[8][8];
	private static int xMove;
	private static int yMove;
	private static int x;
	private static int y;
	private static int randX;
	private static int randY;
	public static int xStart;
	public static int yStart;
	public static int xEnd;
	public static int yEnd;
	
	
	public static boolean boundCheck() {
		if((randX + x) <= 7 && (randX + x) >= 0) 
			if((randY + y) <= 7 && (randY + y) >= 0) {
				return true;
			}
			else {
				return false;
			}
		else {
			return false;
		}
	}//close boundCheck

	public static void moveGenerator() {
		Random rand = new Random();
		int z = 0;
		
		while(z == 0){
		randX = rand.nextInt(5) - 2;
			if(randX % 2 == 0 && randX != 0) {
				randY = rand.nextInt(3) - 1;
					if(randY != 0 && boundCheck() && newMoveCheck()) {
						xMove = randX;
						yMove = randY;
						z = 1;
					}//close nested if
			}//close if 
			else if(randX % 2 != 0 && randX != 0) {
				randY = rand.nextInt(5) - 2;
					if(randY != 0 && Math.abs(randY) > 1 && boundCheck() && newMoveCheck()) {
						xMove = randX;
						yMove = randY;
						z = 1;
					}//close nested if
			}//close if loop
		}//close while loop	
	}//close moveGenerator

	
	public static void startPoint() {
		Random start = new Random();
		xStart = start.nextInt(8);
		x = xStart;
		
		yStart = start.nextInt(8);
		y = yStart;
	//System.out.println(xStart + " " + yStart);
	}//close startPoint
	
	public static boolean newMoveCheck() {
		if(chessboard[randX + x][randY + y] == 0)
			return true;
		else
			return false;
	}//close newmoveCheck
	
	public static void firstMove(){
		moveCount = 0;
		startPoint();
		chessboard[x][y] = moveCount;
		moveCount ++;
	}//close firstMove
	public static void move() {

		for(int i = 1; i <= 64; i++) {
			moveGenerator();
			chessboard[x + xMove][y + yMove] = moveCount;
			moveCount ++;
			x = x + xMove;
			y = y + yMove;
		}
		xEnd = x;
		yEnd = y;
		
		
	}//close move

	
	}
	


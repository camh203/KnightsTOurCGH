
public class Heuristic {
	
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
	private static int[][] access = new int[8][8];
	
		
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
		
		public static boolean newMoveCheck() {
			if(chessboard[randX + x][randY + y] == 0)
				return true;
			else
				return false;
		}//close newmoveCheck
	
		public static void Access() {
			int access[][] = {{2, 3, 4, 4, 4, 4, 3, 2},
							{3, 4, 6, 6, 6, 6, 4, 3},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{3, 4, 6, 6, 6, 6, 4, 3},
							{2, 3, 4, 4, 4, 4, 3, 2}};
						
			}
		}
	


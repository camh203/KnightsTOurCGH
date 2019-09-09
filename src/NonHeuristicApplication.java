

public class NonHeuristicApplication extends NonHeuristic {
	
	public static void main(String[] args) {
		
		for(int j = 1; j < 10; j++) {
			firstMove();
			move();	
			
			System.out.print("[" + xStart + "," + yStart + "]," + moveCount + ",[" + xEnd + "," + yEnd + "]");
		
		}
	}
	
}//close class



package level_0;

public class SaftyZone {

	public class Main {
	    public static void main(String[] args) {

	        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

	        int[][] direct = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

	        int length = board.length;
	        boolean[][] checkBoard = new boolean[length][length];
	        for (int i = 0; i < length; i++) {
	            for (int j = 0; j < length; j++) {
	                if (board[i][j] == 1) {
	                    for (int[] k : direct) {
	                        int nearX = i + k[0];
	                        int nearY = j + k[1];
	                        if (nearX >= 0 && nearX < length && nearY >= 0 && nearY < length) {
	                            checkBoard[nearX][nearY] = true;
	                        }
	                    }
	                }
	            }
	        }

	        int dangerZoneCount = 0;
	        for (int i = 0; i < length; i++) {
	            for (int j = 0; j < length; j++) {
	                if (checkBoard[i][j]) {
	                    dangerZoneCount++;
	                }
	            }
	        }
	        System.out.println(length * length - dangerZoneCount);
	    }
	}

}

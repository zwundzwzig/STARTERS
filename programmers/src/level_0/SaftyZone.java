package level_0;

public class SaftyZone {

	public class Main {
		public static void main(String[] args) {

			int[][] param = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
					{ 0, 0, 0, 0, 0 } };
			int safeZone = 0;
			
			// 위험지역 Set
			for (int i = 0; i < param.length; i++) {
				for (int j = 0; j < param.length; j++) {
					if (param[i][j] == 1)
						setArea(param, i, j);
				}
			}

			// 안전지역 Count
			for (int i = 0; i < param.length; i++) {
				for (int j = 0; j < param.length; j++) {
					if (param[i][j] == 0)
						safeZone++;
				}
			}

			System.out.println(safeZone);
		}

		static void setArea(int[][] param, int x, int y) {
			for (int i = -1; i < 2; i++) {
				for (int j = -1; j < 2; j++) {
					try {
						if (param[x + i][y + j] == 0)
							param[x + i][y + j] = 2;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

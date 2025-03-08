import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static int N, Result;
	static int[] Map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Map = new int[N];
		backTracking(0);
		System.out.println(Result);
	}

	static void backTracking(int row) {
		if (row == N) {
			Result++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (isPossible(row, i)) {
				Map[row] = i;
				backTracking(row+1);
				Map[row] = 0;
				
			}
		}
	}
	
	static boolean isPossible(int row, int col) {
		for (int i = 0; i < row; i++) {
			/*
			if (row == i) {
				return false;
			}
			*/
			if (Map[i] == col) {
				return false;
			}
			
			if (Math.abs(row - i) == Math.abs(Map[i] - col)) {
				return false;
			}
		}
		return true;
	}
}
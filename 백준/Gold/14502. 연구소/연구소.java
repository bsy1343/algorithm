import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int x, y;
		Node (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, m, total, sum, result;
	static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	static int[][] map, visit, check;
	static ArrayList<Node> al = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		check = new int[n][m];
		map = new int[n][m];
		
		for (int i = 0 ; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0) {
					total++;
				} else if (map[i][j] == 2) {
					al.add(new Node(i, j));
				}
			}
		}
		
		dfs(0, 0, 0);
		System.out.println(result);
	}
	
	static void dfs (int row, int col, int index) {
		if (index == 3) {
			sum = total - 3;
			visit = new int[n][m];
			for (Node now : al) {
				int sx = now.x;
				int sy = now.y;
				calc(sx, sy);
			}
			result = Math.max(result, sum);
			return;
		}
		
		if (col == m) {
			col = 0;
			row++;
		}
		
		if (row == n) {
			return;
		}
		
		if (check[row][col] == 0 && map[row][col] == 0) {
			check[row][col] = 1;
			map[row][col] = 1;
			dfs(row, col + 1, index + 1);
			check[row][col] = 0;
			map[row][col] = 0;
		}
		dfs(row, col + 1, index);
	}
	
	static void calc (int x, int y) {
		for (int i = 0; i < direction.length; i++) {
			int sx = x + direction[i][0];
			int sy = y + direction[i][1];
			
			if (sx > -1 && sx < n && sy > -1 && sy < m && visit[sx][sy] == 0 && map[sx][sy] == 0) {
				sum--;
				visit[sx][sy] = 1;
				calc(sx, sy);
			}
		}
	}
}
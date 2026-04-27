import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	static int N, M, H, Total, Result;
	static int[][][] Map;
	static int[][] Direction = {{0, 0, 1}, {0, 1, 0}, {0, 0, -1}, {0, -1, 0}, {-1, 0, 0}, {1, 0, 0}};
	static boolean[][][] Visited;
	static Queue<Node> q = new LinkedList<>();
	static class Node{
		int h, x, y;
		Node(int h, int x, int y) {
			this.h = h;
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		Map = new int[H][N][M];
		Visited = new boolean[H][N][M];
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					Map[k][i][j] = Integer.parseInt(st.nextToken()); 
					if (Map[k][i][j] == 0) {
						Total++;
					} else if (Map[k][i][j] == 1) {
						
						q.add(new Node(k, i, j));
					}
				}
			}
		}
		while(!q.isEmpty()) {
			Result++;
			int size = q.size();
			for (int k = 0; k < size; k++) {
				Node node = q.poll();
				for (int i = 0; i < Direction.length; i++) {
					int sh = node.h + Direction[i][0];
					int sx = node.x + Direction[i][1];
					int sy = node.y + Direction[i][2];
					if (sh > -1 && sh < H && sx > -1 && sx < N && sy > -1 && sy < M && !Visited[sh][sx][sy] && Map[sh][sx][sy] == 0) {
						Total--;
						Visited[sh][sx][sy] = true;
						q.add(new Node(sh, sx, sy));
					}
				}
			}
		}
		System.out.println(Total != 0 ? -1 : Result-1);
	}
}
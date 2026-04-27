import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	static int K, N, StartX, StartY, EndX, EndY;
	static int[][] Map;
	static boolean[][] Visited;
	static int[][] Direction = {{-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}};
	static class Node{
		int x, y, z;
		Node(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		for (int t = 0; t < K; t++) {
			N = Integer.parseInt(br.readLine());
			Map = new int[N][N];
			Visited = new boolean[N][N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringTokenizer et = new StringTokenizer(br.readLine());
			StartX = Integer.parseInt(st.nextToken());
			StartY = Integer.parseInt(st.nextToken());
			EndX = Integer.parseInt(et.nextToken());
			EndY = Integer.parseInt(et.nextToken());
			
			bfs(new Node(StartX, StartY, 0));
		}
	}
	
	static void bfs(Node node) {
		Queue<Node> q = new LinkedList<>();
		Visited[node.x][node.y] = true;
		q.add(node);
		
		while (!q.isEmpty()) {
			node = q.poll();
			
			if (node.x == EndX && node.y == EndY) {
				System.out.println(node.z);
				return;
			}
			
			for (int i = 0; i < Direction.length; i++) {
				int sx = node.x + Direction[i][0];
				int sy = node.y + Direction[i][1];
				
				if (sx > -1 && sx < N && sy > -1 && sy < N && !Visited[sx][sy]) {
					Visited[sx][sy] = true;
					q.add(new Node(sx, sy, node.z+1));
				}
			}
		}
	}
}
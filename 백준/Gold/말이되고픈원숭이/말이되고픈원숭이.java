package 백준.Gold.말이되고픈원숭이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 말이되고픈원숭이 {
	static int K, W, H;
	static int Count = Integer.MAX_VALUE;
	static int[][] Map;
	static int[][] Horse = {{1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}};
	static int[][] Monkey = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
	static boolean[][][] Visited;
	
	static class Node {
		int x, y, z, s;
		Node (int x, int y, int z, int s) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.s = s;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		Map = new int[H][W];
		Visited = new boolean[K+1][H][W];
		
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				Map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs(new Node(0, 0, 0, 0));
		System.out.println(Count == Integer.MAX_VALUE ? -1 : Count);
	}
	
	static void bfs(Node node) {
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		Visited[node.z][node.x][node.y] = true;
		
		while(!q.isEmpty()) {
			node = q.poll();
			
			if (node.x == H-1 && node.y == W-1) {
				Count = Math.min(Count, node.s);
				break;
			}
			
			for (int i = 0; i < Monkey.length; i++) {
				int sx = node.x + Monkey[i][0];
				int sy = node.y + Monkey[i][1];
				int sz = node.z;
				
				if (sx > -1 && sx < H && sy > -1 && sy < W && !Visited[sz][sx][sy] && Map[sx][sy] == 0) {
					Visited[sz][sx][sy] = true;
					q.add(new Node(sx, sy, sz, node.s + 1));
				}
			}
			
			if (node.z == K) { continue; }
			
			for (int i = 0; i < Horse.length; i++) {
				int sx = node.x + Horse[i][0];
				int sy = node.y + Horse[i][1];
				int sz = node.z + 1;
				
				if (sx > -1 && sx < H && sy > -1 && sy < W && !Visited[sz][sx][sy] && Map[sx][sy] == 0) {
					Visited[sz][sx][sy] = true;
					q.add(new Node(sx, sy, sz, node.s + 1));
				}
			}
		}
	}
}
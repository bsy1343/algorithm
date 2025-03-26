import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int v, e, k;
	static int inf = Integer.MAX_VALUE;
	static int[] dist;
	static boolean[] visit;
	static ArrayList<Edge>[] al;
	
	
	static class Edge /**implements Comparable<Edge>**/{
		int dest;
		int weight;
		Edge (int dest, int weight) {
			this.dest = dest;
			this.weight = weight;
		}
		/**
		@Override
		public int compareTo(Edge e) {
			return this.weight - e.weight;
		}
		**/
		
	}
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		
		dist = new int[v + 1];
		visit = new boolean[v + 1];
		
		al = new ArrayList[v + 1];
		for (int i = 1; i <= v; i++) {
			dist[i] = inf;
			al[i] = new ArrayList<Edge>();
		}
		
		dist[k] = 0;
		
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			al[u].add(new Edge(v, w));
		}
		
		dijktra(k);
		
		for (int i = 1; i <= v; i++) {
			if (dist[i] == inf) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
	}
	
	static void dijktra (int k) {
		PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
		pq.add(new Edge(k, 0));
		
		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			
			if (visit[e.dest] == true) {
				continue;
			}
			
			visit[e.dest] = true;
			
			for (Edge edge: al[e.dest]) {
				if (visit[edge.dest] == false) {
					dist[edge.dest] = Math.min(dist[edge.dest], dist[e.dest] + edge.weight);
					pq.add(new Edge(edge.dest, dist[edge.dest]));
				}
			}
		}
	}
}
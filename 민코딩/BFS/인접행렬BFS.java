package 민코딩.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 인접행렬BFS {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int de;
    static int N ;
    static int adj_mat[][];
    static ArrayList<Integer> adj_lst[];
    static void input() throws IOException
    {
        N = Integer.parseInt(br.readLine());
        adj_lst = new ArrayList[N];
        for(int node = 0; node < N; node ++)adj_lst[node] = new ArrayList<Integer>();
        adj_mat = new int[N][N];
        for(int row = 0 ; row < N; row ++)
        {
            st = new StringTokenizer(br.readLine());
            for(int col = 0 ; col < N; col ++)
            {
                adj_mat[row][col] = Integer.parseInt(st.nextToken());
                if(adj_mat[row][col] == 1) {
                    adj_lst[row].add(col);
                }
            }
        }
    }
    public static void main(String args[]) throws IOException
    {
        input();
        de = -1;
        int visited[] = new int[N];
        int start = 0;
        Queue<Integer> qu = new LinkedList<>();
        visited[start] = 1;
        qu.add(start);

        while(!qu.isEmpty())
        {
            int now = qu.poll();
            //search
            System.out.print(now + " ");

            for(Integer next : adj_lst[now])
            {
                if(visited[next] == 1)continue;
                visited[next] =1 ;
                qu.add(next);
            }
//			// 인접행렬 탐색
//			for(int next = 0 ; next < N; next ++)
//			{
//				if(adj_mat[now][next] == 0)continue;
//				if(visited[next] == 1)continue; // 이전에 등록된적?
//				visited[next] = 1;
//				qu.add(next);
//			}
        }


    }

}
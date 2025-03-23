import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] parent;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new ArrayList[n+1];
        parent = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList();
        }

        // 인접리스트 구성하기, 노드의 개수는 n개, 간선은 n-1개
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x].add(y);
            arr[y].add(x);
        }

        // 부모는 1이고, -1은 부모가 없다라는 뜻 (루트라는 의미)
        dfs(1, -1);

        // 정답 추출, 2번 노드부터 순서대로 출력
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }

    }

    // dfs(x, par): 정점 x의 부모가 par 였고, x의 children들을 찾아주는 함수
    static void dfs(int x, int par) {
        for (int y : arr[x]) {
            // 부모와 연결되어 있는건 무시
            if (y == par) continue;
            parent[y] = x;
            dfs(y, x);
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {

    // 노드 수, 루트 노드 번호, 쿼리 수
    static int n, r, q;

    // 각 노드의 서브트리 크기를 저장할 배열
    static int[] leaf;

    // 트리를 저장할 인접 리스트
    static ArrayList<Integer>[] al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n: 노드 수, r: 루트 노드 번호, q: 쿼리 수
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        leaf = new int[n + 1]; // 1번부터 시작하므로 n+1 크기로
        al = new ArrayList[n + 1];

        // 인접 리스트 초기화
        for (int i = 1; i <= n; i++) {
            al[i] = new ArrayList<>();
        }

        // 간선 정보 입력 (양방향)
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            al[x].add(y);
            al[y].add(x);
        }

        // 루트 노드부터 DFS 시작 (부모는 -1로 설정)
        dfs(r, -1);

        // 쿼리 처리: leaf[x]는 x를 루트로 하는 서브트리 크기
        for (int i = 0; i < q; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(leaf[x]);
        }
    }

    // DFS를 통해 각 노드의 서브트리 크기 계산
    static void dfs(int x, int par) {
        leaf[x] = 1; // 자기 자신을 포함해서 시작

        for (int y : al[x]) {
            if (y == par) continue; // 부모 노드는 무시
            dfs(y, x);              // 자식 노드로 재귀 호출
            leaf[x] += leaf[y];     // 자식 서브트리의 크기 누적
        }
    }
}
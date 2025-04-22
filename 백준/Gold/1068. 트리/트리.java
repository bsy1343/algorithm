import java.io.*;
import java.util.*;

public class Main {

    static int n, root, eraser;
    static int[] leaf; // 각 노드의 리프 노드 수를 저장
    static ArrayList<Integer>[] al; // 자식 노드들을 저장할 인접 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        leaf = new int[n];
        al = new ArrayList[n];

        // 각 노드에 대한 자식 리스트 초기화
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<>();
        }

        // 부모 정보를 받아 트리 구조 생성
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int par = Integer.parseInt(st.nextToken());
            if (par == -1) {
                root = i; // 루트 노드 저장
                continue;
            }
            al[par].add(i); // 부모-자식 연결
        }

        // 지울 노드 입력
        eraser = Integer.parseInt(br.readLine());

        // 각 노드의 자식 리스트에서 지울 노드 제거
        for (int i = 0; i < n; i++) {
            al[i].remove(Integer.valueOf(eraser));
        }

        // 루트가 지워지지 않은 경우에만 DFS 수행
        if (root != eraser) dfs(root, -1);

        // 루트 기준으로 리프 노드 수 출력
        System.out.println(leaf[root]);
    }

    // DFS 탐색: 각 노드에 대해 리프 노드 개수 계산
    static void dfs(int x, int par) {
        if (al[x].isEmpty()) {
            leaf[x] = 1; // 자식이 없으면 리프 노드
        }

        for (int y : al[x]) {
            if (y == par) continue; // 부모 방향으로는 탐색하지 않음
            dfs(y, x);              // 자식 노드로 DFS
            leaf[x] += leaf[y];     // 자식들의 리프 노드 수 누적
        }
    }
}
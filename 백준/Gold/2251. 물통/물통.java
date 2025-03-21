import java.io.*;
import java.util.*;

public class Main {

    // 물통의 현재 상태와 물을 붓는 행위를 관리하는 구조체
    static class State {
        int[] x;
        State(int[] x) {
            this.x = new int[3];
            for (int i = 0; i < 3; i++) {
                this.x[i] = x[i];
            }
        }
        State move(int from, int to, int[] limit) {
            // from 물통에서 to 물통으로 물을 옮긴다.
            int[] nx = new int[]{x[0], x[1], x[2]};
            if (nx[from] + nx[to] >= limit[to]) {
                // to가 먼저 꽉찰때
                nx[from] -= limit[to] - nx[to];
                nx[to] = limit[to];
            } else {
                // from이 먼저 비어질떄
                nx[to] += nx[from];
                nx[from] = 0;
            }

            return new State(nx);
        }
    }
    static boolean[] possible;
    static boolean[][][] visited;
    static int[] limit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        limit = new int[3];
        possible = new boolean[201];
        visited = new boolean[201][201][201];

        for (int i = 0; i < 3; i++) {
            limit[i] = sc.nextInt();
        }

        bfs(0, 0, limit[2]);

        for (int i = 0; i <= limit[2]; i++) {
            if (possible[i]) sb.append(i).append(" ");
        }
        System.out.print(sb);
    }

    static void bfs(int x1, int x2, int x3) {
        Queue<State> q = new LinkedList();
        visited[x1][x2][x3] = true;
        q.add(new State(new int[]{x1, x2, x3}));

        while(!q.isEmpty()) {
            State st = q.poll();
            if (st.x[0] == 0) possible[st.x[2]] = true;
            for (int from = 0; from < 3; from++) {
                for (int to = 0; to < 3; to++) {
                    // 같은 물통끼리는 옮길 수 없다.
                    if (from == to) continue;
                    State nxt = st.move(from, to, limit);

                    if (!visited[nxt.x[0]][nxt.x[1]][nxt.x[2]]) {
                        visited[nxt.x[0]][nxt.x[1]][nxt.x[2]] = true;
                        q.add(nxt);
                    }
                }
            }
        }
    }
}
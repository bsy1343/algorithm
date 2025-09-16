import java.util.*;
import java.io.*;

public class Main{

    static class Pair {
        int x, y;
        Pair (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Node {
        int x, y, s;
        Node(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }

    static int r, c, answer;
    static char[][] map;
    static int[][] visited, water;
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static ArrayList<Pair> arrWater = new ArrayList();
    static ArrayList<Pair> arrStart = new ArrayList();

    public static void main(String[] args) throws IOException {
        // 고슴도치 S
        // 비버 D
        // 비어 있는 곳'.', 물이 차 있는 지역 '*', 돌은 'X'
        // 물은 매 분마다 확장한다.
        // 고슴도치는 물과 돌을 통과 할 수 없다.
        // 물은 돌과 비버 소굴을 이동 할 수 없다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        visited = new int[r][c];
        water = new int[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                water[i][j] = -1;
                map[i][j] = str.charAt(j);
                if (map[i][j] == '*') arrWater.add(new Pair(i, j));
                if (map[i][j] == 'S') arrStart.add(new Pair(i, j));
            }
        }

        bfsWater();

        answer = Integer.MIN_VALUE;
        bfsStart(arrStart.get(0).x, arrStart.get(0).y);

        if (answer == Integer.MIN_VALUE) {
            System.out.println("KAKTUS");
        } else {
            System.out.println(answer);
        }
    }

    static void bfsWater() {
        Queue<Node> q = new LinkedList();

        for (Pair pair : arrWater) {
            q.add(new Node(pair.x, pair.y, 0));
            water[pair.x][pair.y] = 0;
        }

        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < directions.length; i++) {
                int dx = node.x + directions[i][0];
                int dy = node.y + directions[i][1];

                if (dx < 0 || dy < 0 || dx >= r || dy >= c) continue;
                if (water[dx][dy] != -1) continue;
                if (map[dx][dy] != '.') continue;

                water[dx][dy] = node.s + 1;
                q.add(new Node(dx, dy, node.s + 1));
            }
        }
    }

    static void bfsStart(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.add(new Node(x, y, 0));
        visited[x][y] = 1;

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (map[node.x][node.y] == 'D') {
                answer = node.s;
                break;
            }

            for (int i = 0; i < directions.length; i++) {
                int dx = node.x + directions[i][0];
                int dy = node.y + directions[i][1];

                if (dx < 0 || dy < 0 || dx >= r || dy >= c) continue;
                if (visited[dx][dy] != 0) continue;
                // 물이 도착하는 칸이라면 물보다 고슴도치가 먼저 도착해야한다. (도슴도치가 물보다 거리가 적어야 갈 수 있음.)
                if (node.s + 1 >= water[dx][dy] && water[dx][dy] != -1) continue;
                if (map[dx][dy] != '.' && map[dx][dy] != 'D') continue;

                visited[dx][dy] = 1;
                q.add(new Node(dx, dy, node.s + 1));
            }
        }
    }
}
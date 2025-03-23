import java.io.*;
import java.util.*;

public class Main {
    static class Pair{
        int x, y;
        Pair(int x, int y) {
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
    static int[][] water;
    static ArrayList<Pair> boom = new ArrayList();
    static ArrayList<Pair> start = new ArrayList();
    static boolean[][] visited;
    static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        water = new int[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                // 모두 초기화 (나중에 물이 차오르는 길이를 체크)
                water[i][j] = -1;

                map[i][j] = str.charAt(j);
                if (map[i][j] == '*') {
                    boom.add(new Pair(i, j));
                }
                if (map[i][j] == 'S') {
                    start.add(new Pair(i, j));
                }
            }
        }
        answer = -1;

        bfsWater();

        bfs();

        System.out.print(answer == -1 ? "KAKTUS" : answer);
    }

    static void bfsWater() {
        Queue<Node> q = new LinkedList();

        for (Pair p : boom) {
            q.add(new Node(p.x, p.y, 0));
            water[p.x][p.y] = 0;
            visited[p.x][p.y] = true;
        }

        while(!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                if (map[nx][ny] != '.') continue;
                if (visited[nx][ny]) continue;

                water[nx][ny] = node.s + 1;
                visited[nx][ny] = true;
                q.add(new Node(nx, ny, node.s + 1));
            }
        }
    }

    static void bfs() {
        // 초기화
        visited = new boolean[r][c];

        Queue<Node> q = new LinkedList();
        visited[start.get(0).x][start.get(0).y] = true;
        q.add(new Node(start.get(0).x, start.get(0).y, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();

            if (map[node.x][node.y] == 'D') {
                answer = node.s;
                return;
            }

            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];
                int ny = node.y + direction[i][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                if (map[nx][ny] != '.' && map[nx][ny] != 'D') continue;
                // -1은 물이여서 안되고, 물이 동시에 혹은 먼저 도착하면 안됨
                if (water[nx][ny] != -1 && water[nx][ny] <= node.s + 1) continue;
                if (visited[nx][ny]) continue;

                visited[nx][ny] = true;
                q.add(new Node(nx, ny, node.s + 1));
            }
        }
    }
}
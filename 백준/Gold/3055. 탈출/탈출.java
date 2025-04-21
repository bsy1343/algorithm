import java.io.*;
import java.util.*;
/**
 * 고슴도치 탈출 문제 해결 클래스
 * - 고슴도치(S)가 비버의 굴(D)로 이동하는 최소 시간을 계산
 * - 물(*)은 매 분마다 사방으로 확장되며 고슴도치는 물이 찰 예정인 칸으로 이동할 수 없음
 */
public class Main {
    // 좌표를 저장하기 위한 Pair 클래스
    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // BFS 탐색에 사용할 Node 클래스 (위치와 시간 정보 포함)
    static class Node{
        int x, y, s; // x, y: 좌표, s: 시간
        Node(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }
    
    // 전역 변수 선언
    static int r, c;                          // 행, 열 크기
    static int answer = Integer.MAX_VALUE;    // 최종 답안 (도달 불가능한 경우 초기값 유지)
    static char[][] map;                      // 지도 정보
    static int[][] water;                     // 각 칸에 물이 차는 시간 정보
    static boolean[][] visited;               // 방문 여부 체크
    static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 상하좌우 이동 방향
    static ArrayList<Pair> arrS = new ArrayList();  // 고슴도치 시작 위치
    static ArrayList<Pair> arrW = new ArrayList();  // 물 시작 위치들

    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행, 열 크기 입력
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // 배열 초기화
        map = new char[r][c];    // 지도 정보
        water = new int[r][c];   // 물 확산 시간 정보
        visited = new boolean[r][c]; // 방문 체크 배열

        // 지도 정보 입력 및 처리
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                water[i][j] = -1;        // 물이 닿지 않는 곳은 -1로 초기화
                map[i][j] = str.charAt(j);
                
                // 고슴도치 시작 위치 저장
                if (map[i][j] == 'S') {
                    arrS.add(new Pair(i, j));
                }
                
                // 물 시작 위치 저장
                if (map[i][j] == '*') {
                    arrW.add(new Pair(i, j));
                }
            }
        }

        // 물 확산 BFS 실행
        bfsW();

        // 고슴도치 이동을 위한 방문 배열 초기화
        visited = new boolean[r][c];

        // 고슴도치 이동 BFS 실행
        bfsS();

        // 결과 출력
        if (answer == Integer.MAX_VALUE) {
            System.out.println("KAKTUS"); // 도달 불가능한 경우
        } else {
            System.out.println(answer);   // 최소 시간 출력
        }
    }

    /**
     * 물 확산 시간을 계산하는 BFS 함수
     * 각 칸에 물이 도달하는 시간을 water 배열에 저장
     */
    static void bfsW() {
        Queue<Node> q = new LinkedList();
        
        // 물 시작 위치 큐에 추가
        for (Pair pair : arrW) {
            q.add(new Node(pair.x, pair.y, 0)); // 시작 시간은 0
            water[pair.x][pair.y] = 0;          // 물이 시작부터 있는 위치
            visited[pair.x][pair.y] = true;     // 방문 처리
        }

        // BFS 시작
        while(!q.isEmpty()) {
            Node node = q.poll();

            // 4방향 탐색
            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];  // 새로운 x 좌표
                int ny = node.y + direction[i][1];  // 새로운 y 좌표

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                // 이미 방문한 칸 체크
                if (visited[nx][ny]) continue;
                // 빈 칸('.')만 물이 확산 가능
                if (map[nx][ny] != '.') continue;
                
                // 물 확산 시간 기록
                water[nx][ny] = node.s + 1;
                visited[nx][ny] = true;
                // 다음 위치 큐에 추가
                q.add(new Node(nx, ny, node.s + 1));
            }
        }
    }

    /**
     * 고슴도치 이동 경로를 찾는 BFS 함수
     * 비버의 굴(D)에 도달하는 최소 시간 계산
     */
    static void bfsS() {
        Queue<Node> q = new LinkedList();
        
        // 고슴도치 시작 위치 큐에 추가
        for (Pair pair : arrS) {
            q.add(new Node(pair.x, pair.y, 0)); // 시작 시간은 0
            visited[pair.x][pair.y] = true;     // 방문 처리
        }

        // BFS 시작
        while(!q.isEmpty()) {
            Node node = q.poll();

            // 비버의 굴에 도착한 경우
            if (map[node.x][node.y] == 'D') {
                answer = node.s;  // 최소 시간 저장
                return;           // 함수 종료
            }

            // 4방향 탐색
            for (int i = 0; i < direction.length; i++) {
                int nx = node.x + direction[i][0];  // 새로운 x 좌표
                int ny = node.y + direction[i][1];  // 새로운 y 좌표

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                // 이미 방문한 칸 체크
                if (visited[nx][ny]) continue;
                // 빈 칸('.') 또는 비버의 굴('D')로만 이동 가능
                if (map[nx][ny] != '.' && map[nx][ny] != 'D') continue;
                // 물이 이미 차 있거나(-1이 아님), 다음 시간에 물이 찰 예정인 칸은 이동 불가
                if (water[nx][ny] != -1 && water[nx][ny] <= node.s + 1) continue;
                
                visited[nx][ny] = true;
                // 다음 위치 큐에 추가
                q.add(new Node(nx, ny, node.s + 1));
            }
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        // 1 <= n <= 100000
        int[] visited = new int[100001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        for (int l = 0, r = -1; l < n; l++) {
            // r을 옮길 수 있는 만큼 옮긴다.
            while (r + 1 < n && visited[arr[r+1]] == 0) {
                r++;
                visited[arr[r]]++;
            }

            // 정답을 갱신한다.
            answer += r - l + 1;

            // l을 옮겨주면서 arr[l]의 개수를 감소시킨다.
            visited[arr[l]]--;
        }
        System.out.println(answer);
    }
}
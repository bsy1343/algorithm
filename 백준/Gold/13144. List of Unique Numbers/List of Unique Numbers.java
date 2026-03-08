import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] arr, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new int[100001];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int l = 0;
        long answer = 0;
        for (int r = 0; r < n; r++) {
            while (visited[arr[r]] != 0) {
                visited[arr[l]]--;
                l++;
            }
            visited[arr[r]]++;
            answer += r - l + 1;
        }

        System.out.println(answer);
    }
}
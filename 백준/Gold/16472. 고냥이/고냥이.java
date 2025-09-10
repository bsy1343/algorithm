import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] visited;
    static char[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = br.readLine().toCharArray();
        visited = new int[26];

        int r = -1, answer = 0, kind = 0;
        for (int l = 0; l < arr.length; l++) {
            if (l > 0) {
                int left = arr[l - 1] - 'a';
                visited[left]--;
                if (visited[left] == 0) {
                    kind--;
                }
            }

            while(r + 1 < arr.length) {
                r++;
                int right = arr[r] - 'a';
                visited[right]++;
                if (visited[right] == 1) {
                    kind++;
                }

                if (kind > n) {
                    visited[right]--;
                    if (visited[right] == 0) {
                        kind--;
                    }
                    r--;
                    break;
                }
            }

            answer = Math.max(answer, r - l + 1);
        }
        System.out.println(answer);
    }
}
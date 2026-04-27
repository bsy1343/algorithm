import java.io.*;
import java.util.*;

public class Main {
    static int n, kind, answer;
    static char[] arr;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        // 알파벳 26개;
        visited = new int[26];
        arr = br.readLine().toCharArray();

        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            add(arr[r]);

            // 불가능하면, 가능할때까지 l을 이동 (kind 줄이기)
            while (kind > n) {
                eraser(arr[l++]);
            }

            // l ~ r 범위까지는 +1 해줘야함
            answer = Math.max(answer, r - l + 1);
        }
        System.out.println(answer);
    }

    static void add(int x) {
        visited[x - 'a']++;
        // 새롭게 나타난 알파벳이라는 뜻
        if (visited[x - 'a'] == 1) kind++;
    }

    static void eraser(int x) {
        visited[x - 'a']--;
        // 인식해야하는 알파벳에서 빠지는 순간
        if (visited[x - 'a'] == 0) kind--;
    }
}

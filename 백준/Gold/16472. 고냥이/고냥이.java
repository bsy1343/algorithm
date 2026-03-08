import java.io.*;
import java.util.*;

public class Main {

    static int n, answer, kind;
    static char[] arr;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = sc.next().toCharArray();
        visited = new int[26];

        int l = 0;
        int answer = Integer.MIN_VALUE;

        for (int r = 0; r < arr.length; r++) {
            add(arr[r]);

            while(kind > n) {
                remove(arr[l]);
                l++;
            }
            answer = Math.max(answer, r - l + 1);
        }

        System.out.println(answer);
    }

    static void add(int val) {
        visited[val-'a']++;
        if (visited[val-'a'] == 1) kind++;
    }

    static void remove(int val) {
        visited[val-'a']--;
        if (visited[val-'a'] == 0) kind--;
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static int n, kind, answer;
    static int[] visited;
    static char[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new int[26];

        String str = sc.next();
        arr = str.toCharArray();

        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            add(arr[r]);

            while(kind > n) {
                remove(arr[l++]);
            }

            answer = Math.max(answer, r - l + 1);
        }

        System.out.println(answer);
    }

    static void add(int x) {
        visited[x - 'a']++;
        if (visited[x - 'a'] == 1) kind++;
    }

    static void remove(int x) {
        visited[x - 'a']--;
        if (visited[x - 'a'] == 0) kind--;
    }
}
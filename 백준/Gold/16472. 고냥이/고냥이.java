import java.io.*;
import java.util.*;

public class Main {

    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        visited = new int[26];
        String str = sc.next();
        char[] arr = str.toCharArray();

        int len = arr.length, kind, answer = 0;
        for (int l = 0, r = 0; r < len; r++) {
            // r번째 문자를 오른쪽에 추가
            add(arr[r]);

            // 불가능하면, 가능할때까지 l을 이동
            while(true) {
                kind = 0;
                for (int i = 0; i < 26; i++) {
                    if (visited[i] != 0) kind++;
                }
                if (kind <= n) break;
                erase(arr[l]);
                l++;
            }

            // 정답갱신
            answer = Math.max(answer, r - l + 1);
        }

        System.out.println(answer);
    }

    // x라는 알파벳 추가
    static void add(char x) {
        visited[x-'a']++;
    }

    // x라는 알파벳 제거
    static void erase(char x) {
        visited[x-'a']--;
    }
}
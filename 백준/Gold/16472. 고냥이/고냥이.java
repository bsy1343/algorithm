import java.io.*;
import java.util.*;

public class Main {

    static int n, kind;
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        kind = 0;
        visited = new int[26];
        String str = sc.next();
        char[] arr = str.toCharArray();

        int len = arr.length, answer = 0;
        for (int l = 0, r = 0; r < len; r++) {
            // r번째 문자를 오른쪽에 추가
            add(arr[r]);

            // 불가능하면, 가능할때까지 l을 이동
            while(kind > n) {
                erase(arr[l++]);
            }

            // 정답갱신
            answer = Math.max(answer, r - l + 1);
        }

        System.out.println(answer);
    }

    // x라는 알파벳 추가
    static void add(char x) {
        visited[x-'a']++;

        // 새롭게 나타난 알파벳이라는 뜻
        if (visited[x-'a'] == 1) {
            kind++;
        }
    }

    // x라는 알파벳 제거
    static void erase(char x) {
        visited[x-'a']--;

        // 인식해야 하는 알파벳에서 빠지는 순간
        if (visited[x-'a'] == 0) {
            kind--;
        }
    }
}
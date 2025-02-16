package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://softeer.ai/practice/9498
public class Yeah_But_How {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();
        StringBuilder sb = new StringBuilder();

        // 첫 문자0은 무조건 추가
        sb.append(S.charAt(0));

        // 1부터 시작
        for (int i = 1; i < S.length(); i++) {
            char prev = S.charAt(i-1);
            char curr = S.charAt(i);

            if (prev == '(' && curr == ')') {
                sb.append("1");
            } else if (prev == ')' && curr == '(') {
                sb.append("+");
            }
            // 현재 문자만 한 번 추가
            sb.append(curr);
        }
        System.out.println(sb);
    }
}

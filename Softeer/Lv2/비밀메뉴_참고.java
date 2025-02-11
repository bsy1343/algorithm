package Softeer.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://softeer.ai/practice/6269
public class 비밀메뉴_참고 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 비밀 메뉴 조작법 입력 (공백 없이 문자열로 만들기)
        st = new StringTokenizer(br.readLine());
        StringBuilder hidden = new StringBuilder();
        while (st.hasMoreTokens()) {
            hidden.append(st.nextToken());
        }

        // 사용자의 버튼 입력 (공백 없이 문자열로 만들기)
        st = new StringTokenizer(br.readLine());
        StringBuilder menu = new StringBuilder();
        while (st.hasMoreTokens()) {
            menu.append(st.nextToken());
        }

        // 비밀 메뉴 조작법이 사용자 버튼 입력에 포함되어 있는지 확인
        if (menu.toString().contains(hidden.toString())) {
            System.out.println("secret");
        } else {
            System.out.println("normal");
        }

        /**
        if (menu.toString().indexOf(hidden.toString()) > -1) {
            System.out.println("secret");
        } else {
            System.out.println("normal");
        }
        **/
    }
}
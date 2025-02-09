package src.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://softeer.ai/practice/6283
public class 팔단변속기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String result = "mixed";

        /**
         * == 연산자는 객체의 참조(reference)를 비교
         * equals() 메소드는 문자열의 내용을 비교
         **/
        if (br.readLine().equals("1 2 3 4 5 6 7 8")) {
            result = "ascending";
        } else if (br.readLine().equals("8 7 6 5 4 3 2 1")) {
            result = "descending";
        }

        System.out.println(result);
    }
}
import java.io.*;
import java.util.*;

public class Main {

    static int m, set;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        m = Integer.parseInt(br.readLine());
        set = 0;

        // 비트마스킹: x번 원소를 set의 x번째 비트로 표현
        // bit ON > 집합에 포함, OFF > 미포함
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            if (op.equals("all")) {
                // 1~20 모두 켜기
                set = (1 << 21) - 1;
            } else if (op.equals("empty")) {
                set = 0;
            } else {
                int x = Integer.parseInt(st.nextToken());
                int bit = 1 << x;

                if (op.equals("add")) {
                    set |= bit;
                } else if (op.equals("remove")) {
                    set &= ~bit;
                } else if (op.equals("check")) {
                    sb.append((set & bit) != 0 ? 1 : 0).append("\n");
                } else if (op.equals("toggle")) {
                    set ^= bit;
                }
            }
        }

        System.out.println(sb);
    }
}

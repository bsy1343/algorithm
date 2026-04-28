import java.io.*;
import java.util.*;

public class Main {
    static final long MOD = 1_000_000_009L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        //  Dy[i][j] = 합이 i이고 마지막 숫자가 j(1,2,3)인 경우의 수
        long[][] Dy = new long[100_001][4];
        Dy[1][1] = 1;
        Dy[2][2] = 1;
        Dy[3][1] = 1;
        Dy[3][2] = 1;
        Dy[3][3] = 1;

        for (int i = 4; i <= 100_000; i++) {
            Dy[i][1] = (Dy[i-1][2] + Dy[i-1][3]) % MOD;
            Dy[i][2] = (Dy[i-2][1] + Dy[i-2][3]) % MOD;
            Dy[i][3] = (Dy[i-3][1] + Dy[i-3][2]) % MOD;
        }

        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long ans = (Dy[n][1] + Dy[n][2] + Dy[n][3]) % MOD;
            sb.append(ans).append('\n');
        }
        
        System.out.print(sb);
    }
}
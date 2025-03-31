import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dy = new int[n+1][2];
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // dy[i][0] i-1번째 계단을 밟지 않고, i번째 계단에 도착하며 얻는 최대 점수
        // dy[i][1] i-1번째 계단을 밟고서, i번째 계단에 도착하며 얻는 최대 점수
        dy[1][0] = 0;
        dy[1][1] = arr[1];

        if (n >= 2) {
            dy[2][0] = arr[2];
            dy[2][1] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dy[i][0] = Math.max(dy[i-2][0] + arr[i], dy[i-2][1] + arr[i]);
            dy[i][1] = dy[i-1][0] + arr[i];
        }

        System.out.println(Math.max(dy[n][0], dy[n][1]));
    }
}
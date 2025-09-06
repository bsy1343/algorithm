import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dy;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dy = new int[1001];

        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 3;

        for (int i = 4; i <= n; i++) {
            dy[i] = (dy[i - 1] + dy[i - 2]) % 10007;
        }

        System.out.println(dy[n]);
    }
}
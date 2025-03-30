import java.io.*;
import java.util.*;

public class Main {

    static int t, n;
    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        // n은 양수이며 11보다 작다
        dy = new int[11];
        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 4;
        for (int i = 4; i < 11; i++) {
            dy[i] = dy[i-1] + dy[i-2] + dy[i-3];
        }

        for (int test_case = 0; test_case < t; test_case++) {
            n = sc.nextInt();
            System.out.println(dy[n]);
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int x = 0;
        int y = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int left = lower_bound(arr,  i, n-1, -arr[i]);

            // lower_bound시 left에서 찾고자 하는 값이 없으면 인덱스 값을 넘어 갈 수 있음
            // i 와 left이 같으면 안됨 (중복)
            if (left < n && i != left && result > Math.abs((arr[i] + arr[left]))) {
                x = arr[i];
                y = arr[left];
                result = Math.abs((arr[i] + arr[left]));
            }

            // lower_bound시 left-1 이 0이하가 될 수도 있음
            // i 와 left-1이 같으면 안됨 (중복)
            if (left-1 > -1 && i != left-1 && result > Math.abs((arr[i] + arr[left-1]))) {
                x = arr[i];
                y = arr[left-1];
                result = Math.abs((arr[i] + arr[left-1]));
            }
        }

        if (x > y) {
            System.out.println(y + " " + x);
        } else {
            System.out.println(x + " " + y);
        }

    }

    static int lower_bound(int[] arr, int l, int r, int result) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < result) {
                l = mid +1;
            } else {
                r = mid -1;
            }
        }
        return l;
    }

    static int upper_bound(int[] arr, int l, int r, int result) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= result) {
                l = mid +1;
            } else {
                r = mid -1;
            }
        }
        return l;
    }
}
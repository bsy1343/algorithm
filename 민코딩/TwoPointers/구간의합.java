package 민코딩.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간의합 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int de;
    static int arr[] ;
    static int target;
    static int n ;
    static void input() throws IOException
    {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0 ; i < n; i ++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        input();
        // O(N)
        int cnt = 0;
        // a : sum 에서 제거하는 역할
        // b : sum 에 더해주는 역할
        int b = 0 ;
        int sum = 0;
        for(int a = 0; a < n; a ++)
        {
            while(b < n && (sum + arr[b] < target))
            {
                sum += arr[b];
                b ++ ;
            }
            // arr[b] + sum >= target
            // [a,b]  target 과 sum 값이 일치?
            if(b < n && (sum + arr[b]) == target)
            {
                cnt ++ ;
            }
            sum -= arr[a];
        }
        System.out.println(cnt);
    }

}
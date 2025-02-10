package 민코딩.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Root계산기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int de;

    static long func(int par)
    {
        return (long)par * (long)par ;
    }
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        // 조건 : (par * par) <= n
        // 찾고자하는거 : 조건을 만족하는 par 의 최대값
        int answer = -1;

        int s = 1;
        int e = n ;
        while(s <= e)
        {
            int mid = ( s + e ) / 2;
            if(func(mid) <= (long)n)
            {
                answer = Integer.max(mid, answer ); // 무조건 mid 이 저장됩니다.
                s = mid + 1;
            }
            else {
                e = mid - 1 ;
            }
        }
        System.out.println(answer);
    }

}
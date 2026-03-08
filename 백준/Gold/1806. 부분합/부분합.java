import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    static int[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int l = 0, sum = 0, answer = Integer.MAX_VALUE;
        for (int r = 0; r < n; r++) {
            sum += arr[r];  // r 위치 원소 추가
            
            while (sum >= s) {  // 조건을 만족하는 동안
                answer = Math.min(answer, r - l + 1);  // 답 갱신
                sum -= arr[l];  // l 위치 원소 제거
                l++;  // l 증가
            }
        }
        
        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}
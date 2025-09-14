import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] routes) {
        // 1단계: 진출 지점 기준으로 오름차순 정렬
        // Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));
        
        int cameras = 0;
        int lastCamera = Integer.MIN_VALUE; // 마지막 카메라 위치
        
        for (int[] route : routes) {
            int start = route[0]; // 진입 지점
            int end = route[1];   // 진출 지점
            
            // 2단계: 현재 차량이 마지막 카메라에 안 걸리면 새 카메라 설치
            if (lastCamera < start) {
                cameras++;
                lastCamera = end; // 진출 지점에 카메라 설치
            }
        }
        
        return cameras;
    }
}
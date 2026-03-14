import java.io.*;
import java.util.*;

class Solution {
//     static class Node implements Comparable<Node> {
//         String value;

//         Node(int num) {
//             this.value = String.valueOf(num);
//         }

//         @Override
//         public int compareTo(Node other) {
//             // this가 앞에 올지, other가 앞에 올지 → 이어붙였을 때 큰 쪽이 먼저
//             String s1 = this.value + other.value;
//             String s2 = other.value + this.value;
//             return s2.compareTo(s1); // 내림차순
//         }
//     }

    public String solution(int[] numbers) {
        String answer = "";

        // 1단계: int[] → String[] 변환
        // 숫자를 이어붙이는 비교를 해야 하므로 String으로 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 2단계: 사전순으로 역순 정렬 후 합쳐서 큰쪽으로 내림차순
        // ex) 3, 30이 주어질때 3|30="330", 30|3="303" → "330"이 크므로 "3"이 앞
        // (o2+o1).compareTo(o1+o2) → 이어붙인 결과가 큰 쪽을 앞으로 (내림차순)
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        // 3단계: 결과 조합
        // 예외: 정렬 후 첫 번째가 "0"이면 전부 0 → "0" 반환
        // ex) [0, 0, 0] → ["0","0","0"] → arr[0]="0" → "000" 대신 "0" 반환
        // 정상: 정렬된 배열 그대로 이어붙임
        answer = arr[0].equals("0") ? "0" : String.join("", arr);

        return answer;
    }
}
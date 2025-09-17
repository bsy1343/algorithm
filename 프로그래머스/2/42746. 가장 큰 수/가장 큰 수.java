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
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        // answer = arr[0].equals("0") ? "0" : String.join("", arr);
        answer = arr[0].equals("0") ? "0" : String.join("", arr);
        
        return answer;
    }
}
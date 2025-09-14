import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int l = 0;
        int r = people.length - 1;
        
        // 가장 무거운 사람은 무조건 태워야 함
        // 혼자 타거나, 가장 가벼운 사람과 같이 타거나 2가지뿐
        // 둘이 못 타면 무거운 사람 혼자, 둘이 타면 둘 다
        while(l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;
            answer++;
        }
        
        return answer;
    }
}
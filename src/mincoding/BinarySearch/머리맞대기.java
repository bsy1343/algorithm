package src.mincoding.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 머리맞대기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // n : 사람의 수, t : 만들어야 하는 팀의 수
    static int n, t;
    static int[] members;
    static int minabil = -1;
    static int maxabil;

    // 주어진 abil로 최소 몇개의 팀을 만들 수 있는가?
    static int maketeam(int abil) {
        int teamcnt = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int sum = 0; // 하나의 팀의 능력치의 합
            int cnt = 1; // 현재까지 만들어진 팀의 개수
            // i : 시작 위치의 학생
            // 무조건 n명의 학생을 다 둘러봐야 함
            for(int j = i; j < i + n; j++) {
                // 계속해서 하나의 학생을 abil 내에 현재 팀에 포함시킬수 있으면 넣어봄
                if(sum + members[j % n] <= abil)
                    sum += members[j % n];
                    // 만약 이 학생을 넣었을때 우리의 limit (abil)을 초과
                    // 새로운 팀이 편성
                else {
                    // 이 학생이 새로운 팀의 첫번째 멤버
                    sum = members[j%n];
                    // 한개의 팀을 더 만들었다!
                    cnt++;
                }
            }
            // 최소의 팀의개수 갱신
            if(cnt < teamcnt)
                teamcnt = cnt;
        }
        // 모든 순서에 맞는 조합을 둘러봤을때, 최소 몇개의 팀을 만들수 있었는가?
        return teamcnt;
    }


    static int psearch() {
        //1. 구간 구성
        int left = minabil;
        int right = maxabil;
        int ans = 0;

        // search
        while(left <= right) {
            int mid = (left + right) / 2;
            // 이 점수로 t개의 팀을 만들 수 있는가?
            // mid를 기준으로 팀을 만들어봄
            // teamcnt : mid의 점수로 만들수 있는 최소한의 팀 개수
            int teamcnt = maketeam(mid);

            // 방향성/가능성 설정
            // 너무 많은 팀이 만들어졌다!
            // -> 기준 점수가 너무 낮다 -> 기준 점수를 높여봄
            // teamcnt == t ? 어느 방향으로 가야 하는가?
            if(teamcnt > t) {
                left = mid + 1;
            }
            // 너무 적은 팀이 만들어졌다! --> 여기서 가능성을 확인
            // -> 기준 점수가 너무 높다 -> 기준 점수를 낮춰봄
            //
            else {
                right = mid - 1;
                // 여기서에서 가능성 확인 -> 정답을 갱신
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        // init
        members = new int[n];
        // input
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            members[i] = Integer.parseInt(st.nextToken());
            // 최대값 = T의 개수가 1개 (모두가 한팀)
            maxabil += members[i];
            // 최소값 = T개의 개수가 N개 (각각 한팀)
            if(members[i] > minabil)
                minabil = members[i];
        }
        // parametric search 답을 찾을것
        int ans = psearch();
        System.out.println(ans);
    }
}
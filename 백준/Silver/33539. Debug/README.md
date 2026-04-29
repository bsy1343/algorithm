# [Silver IV] Debug - 33539

[문제 링크](https://www.acmicpc.net/problem/33539)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 49, 정답: 39, 맞힌 사람: 32, 정답 비율: 78.049%

### 분류

소수 판정, 수학, 정수론

### 문제 설명

<p>You just joined a new team to participate in the FPC, because the previous member left the team frustrated. Frustrated that he could not beat a time limit<sup>1</sup> of a certain problem of an earlier FPC. To show you indeed posses the skills to solve problems during a FPC, you decide to solve the problem the other member could not. Unfortunately, he never told anyone which problem he was actually trying to solve. Luckily, you still got his code!</p>

<p>Your task is to debug the problem his code is solving and speed it up. You may assume that in its current state, it is correct but too slow. The (Java) code is given below.</p>

<pre>import java.util.Scanner;

class D {
    public static int n(int n) {
        int p = 1;
        if (n == 1 || n == 0) p = 0;
        for (int i = 1; i &lt; n; i++) {
            if (i == 1) continue;
            if (n % i == 0) p = 0;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (n(sc.nextInt()) == 1) System.out.println("yes");
        else System.out.println("no");
    }
}
</pre>

<hr>
<p><sup>1</sup>This was based on the text "Correct but TIME LIMIT! AARGH!" being scratched in the wall.</p>

### 입력

<p>As can be seen in the provided code. The only input is an integer $0 \leq n \leq 10^9$.</p>

### 출력

<p>Keep the same output as provided in the code. You only need to speed up things.</p>
# [Platinum II] Distribute the Bars - 23106

[문제 링크](https://www.acmicpc.net/problem/23106)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 33, 맞힌 사람: 30, 정답 비율: 46.875%

### 분류

수학, 정수론, 해 구성하기, 소수 판정

### 문제 설명

<p>There are $N$ metal bars. The weight of $i$-th metal bar is $2i - 1$.</p>

<p>Your task is to distribute those metal bars into two or more groups such that the sum of weights of metal bars in each group will be the same, or determine that it is impossible. Note that each metal bar must go to exactly one group, and that it is not allowed to cut the metal bars.</p>

### 입력

<p>The input contains one integer $N$ ($2 \le N \le 10^5$).</p>

### 출력

<p>If there is no way to distribute the metal bars into two or more equally weighted groups, print one line containing the integer $-1$.</p>

<p>Otherwise, on the first line, print the number of groups $G$ ($2 \le G \le N$). Then print $G$ lines, one for each group. The $i$-th of these lines must start with the the integer $K_i$, the number of metal bars in the $i$-th group. Then print $K_i$ integers: the weights of the metal bars in the group. Each metal bar must be assigned to exactly one group, and the sums of weights of the metal bars in all groups must be the same.</p>

<p>If there is more than one solution, print any one of them.</p>
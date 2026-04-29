# [Platinum I] Bessie's Function - 33729

[문제 링크](https://www.acmicpc.net/problem/33729)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

그래프 이론, 다이나믹 프로그래밍, 방향 비순환 그래프, 위상 정렬, 트리, 트리에서의 다이나믹 프로그래밍, 함수형 그래프

### 문제 설명

<p>Bessie has a special function $f(x)$ that takes as input an integer in $[1, N]$ and returns an integer in $[1, N]$ ($1 \le N \le 2 \cdot 10^5$). Her function $f(x)$ is defined by $N$ integers $a_1 \ldots a_N$ where $f(x) = a_x$ ($1 \le a_i \le N$).</p>

<p>Bessie wants this function to be idempotent. In other words, it should satisfy $f(f(x)) = f(x)$ for all integers $x \in [1, N]$.</p>

<p>For a cost of $c_i$, Bessie can change the value of $a_i$ to any integer in $[1, N]$ ($1 \le c_i \le 10^9$). Determine the minimum total cost Bessie needs to make $f(x)$ idempotent.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $N$ space-separated integers $a_1,a_2,\dots,a_N$.</p>

<p>The third line contains $N$ space-separated integers $c_1,c_2,\dots,c_N$.</p>

### 출력

<p>Output the minimum total cost Bessie needs to make $f(x)$ idempotent.</p>
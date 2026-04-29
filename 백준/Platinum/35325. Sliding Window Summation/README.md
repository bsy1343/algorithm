# [Platinum V] Sliding Window Summation - 35325

[문제 링크](https://www.acmicpc.net/problem/35325)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 27, 맞힌 사람: 26, 정답 비율: 83.871%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 수학, 슬라이딩 윈도우, 애드 혹, 해 구성하기

### 문제 설명

<p>Bessie has a hidden binary string $b_1b_2\dots b_N$ ($1\le N\le 2\cdot 10^5$). The only information about $b$ you are given is a binary string $r_1r_2\dots r_{N-K+1}$ ($1 \le K \le N$), where $r_i$ is the remainder when the number of ones in the length-$K$ window of $b$ with leftmost index $i$ is divided by two.</p>

<p>Output the minimum and maximum possible numbers of ones in Bessie's hidden binary string.</p>

### 입력

<p>There are $T$ ($1\le T\le 10^3$) independent test cases to be solved. Each test is specified by the following:</p>

<p>The first line contains $N$ and $K$.</p>

<p>The second line contains the binary string $r_1\dots r_{N-K+1}$, where $r_i=\sum_{j=i}^{j+K-1}b_j\pmod{2}$.</p>

<p>It is guaranteed that the sum of $N$ over all tests does not exceed $10^6$.</p>

### 출력

<p>For each test case, output the minimum and maximum possible numbers of ones in Bessie's hidden binary string, separated by a single space.</p>
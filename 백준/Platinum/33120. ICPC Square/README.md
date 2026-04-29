# [Platinum V] ICPC Square - 33120

[문제 링크](https://www.acmicpc.net/problem/33120)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 138, 정답: 59, 맞힌 사람: 50, 정답 비율: 50.000%

### 분류

수학, 정수론

### 문제 설명

<p>ICPC Square is a hotel provided by the ICPC Committee for the accommodation of the participants. It consists of $N$ floors (numbered from $1$ to $N$). This hotel has a very unique elevator. If a person is currently at floor $x$, by riding the elevator once, they can go to floor $y$ if and only if $y$ is a multiple of $x$ and $y - x ≤ D$.</p>

<p>You are currently at floor $S$. You want to go to the highest possible floor by riding the elevator zero or more times. Determine the highest floor you can reach.</p>

### 입력

<p>A single line consisting of three integers $N$ $D$ $S$ ($2 ≤ N ≤ 10^{12}$; $1 ≤ D ≤ N - 1$; $1 ≤ S ≤ N$).</p>

### 출력

<p>Output a single integer representing the highest floor you can reach by riding the elevator zero or more times.</p>
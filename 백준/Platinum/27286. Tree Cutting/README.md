# [Platinum II] Tree Cutting - 27286

[문제 링크](https://www.acmicpc.net/problem/27286)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 19, 맞힌 사람: 18, 정답 비율: 58.065%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>A country has $N$ cities numbered from $1$ to $N$ and $N - 1$ bidirectional highways. It is possible to travel from any city to any other city using only the highways.</p>

<p>The distance between two cities $x$ and $y$ is defined as the number of highways required to travel from $x$ to $y$.</p>

<p>The governor has decided to demolish a highway and build another highway such that the largest distance between any two cities is maximized.</p>

<p>Find this maximum largest distance.</p>

### 입력

<p>Your Program must read from standard input.</p>

<p>The first line contains an integer, $N$, the number of cities.</p>

<p>In the next $N - 1$ lines, each line contains $2$ distinct integers $u$ and $v$, representing a highway connecting cities $u$ and $v$.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain a single integer on a single line, the new largest distance between any two cities.</p>

### 제한

<ul>
	<li>$3 &le; N &le; 300\,000$</li>
	<li>$1 &le; u, v &le; N$</li>
</ul>
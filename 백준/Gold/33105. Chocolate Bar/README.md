# [Gold IV] Chocolate Bar - 33105

[문제 링크](https://www.acmicpc.net/problem/33105)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 29, 정답: 12, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

많은 조건 분기

### 문제 설명

<p>You have a bar of chocolate which can be represented as a rectangle. Originally, the chocolate bar has a width of $N$ and a height of $M$. For this problem, denote $(n \times m)$ as a chocolate bar with a width of $n$ and a height of $m$.</p>

<p>You want to eat the chocolate with a total area of exactly $K$. However, you always eat a chocolate bar as a whole; that is, if you eat a chocolate bar $(n \times m)$, then you will eat all the chocolate with area $n \cdot m$.</p>

<p>To be able to eat exactly $K$ total area, you are allowed to perform any of the following operations any number of times (possibly zero).</p>

<ul>
	<li>Pick one bar of chocolate $(n \times m)$ then split it into two bars: $(n \times i)$ and $(n \times (m - i))$ such that $i$ is an integer that satisfies $1 ≤ i &lt; m$.</li>
	<li>Pick one bar of chocolate $(n \times m)$ then split it into two bars: $(i \times m)$ and $((n - i) \times m)$ such that $i$ is an integer that satisfies $1 ≤ i &lt; n$.</li>
</ul>

<p>Determine the minimum number of operations such that it is possible to eat some chocolate bars with a total area of $K$.</p>

### 입력

<p>Input consists of three integers $N$ $M$ $K$ ($1 ≤ N, M ≤ 10^6$; $1 ≤ K ≤ N \cdot M$).</p>

### 출력

<p>Output a single integer representing the minimum number of operations such that it is possible to eat some chocolate bars with a total area of $K$.</p>
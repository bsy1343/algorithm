# [Gold IV] TOO EASY Cookie Run - 25116

[문제 링크](https://www.acmicpc.net/problem/25116)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 181, 정답: 93, 맞힌 사람: 87, 정답 비율: 63.504%

### 분류

이분 탐색, 매개 변수 탐색, 두 포인터

### 문제 설명

<p>Cookie Run game is a popular game in which the cookie character runs through a map consisting of N stages to score points.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3723c0f5-232d-4636-bce9-750670a33e98/-/preview/" style="width: 600px; height: 338px;" /></p>

<p>Soo Young, the map designer for Cookie Run, was preparing a new map patch for Children&#39;s Day. After working hard to create an attractive map and testing it for the last time the day before the patch, she suddenly realized that the map was designed to be <strong>too easy</strong>!</p>

<p>The map design of the cookie run game consists of the following rules.&nbsp;</p>

<ul>
	<li>Each stage is given a difficulty level of $A_0, A_1, A_2, ..., A_{N-1}$, and the higher the difficulty is, the more difficult it is to pass the corresponding stage.</li>
	<li>If the sum of the difficulty levels of consecutive stages is greater than or equal to $M$, we call this section as&nbsp;<strong>interesting section</strong>. That is, if $A_i + A_{i+1} + ... + A_j \geq M$, section $(i, j)$ is an interesting section.</li>
	<li>Maps should always have at least $K$ interesting section.</li>
</ul>

<p>In other words, the following conditions should be satisfied:</p>

<ul>
	<li>Let $T$ be the number of pairs $(i, j)$ satisfying the following conditions:
	<ul>
		<li>$0 \le i \le j \le N-1$</li>
		<li>$A_{i} + A_{i+1} + ... + A_{j} \ge M$.</li>
	</ul>
	</li>
	<li>Then, $T \ge K$ for the given integer $K$.</li>
</ul>

<p>To solve this problem, Soo Young requested help from KAIST RUN Spring Contest participants.</p>

<p>Since there is not much time left until the patch release, all Soo Young can do is <strong>add difficulty $X$ to all stages at once</strong>&nbsp;to make it more difficult.&nbsp;</p>

<p>Your job is to find the smallest non-negative integer $X$ that satisfies these conditions.</p>

### 입력

<p>The first line contains three space-separated integers, $N$, $M$, and $K$.</p>

<p>The second line contains $N$ space-separated integers $A_{0}, A_{1}, \cdots, A_{N-1}$.</p>

### 출력

<p>Print a single non-negative integer denoting the smallest possible $X$.</p>

<p>You can assume that at least one non-negative integer $X$ exists, satisfying the given conditions.</p>

### 제한

<ul>
	<li>$1 \le N \le 100\,000$</li>
	<li>$1 \le M\le 10^{18}$</li>
	<li>$1 \le K \le \frac{N (N+1)}{2}$</li>
	<li>$0 \le A_{i} \le 10^9$ $(0 \le i \le N-1)$</li>
</ul>
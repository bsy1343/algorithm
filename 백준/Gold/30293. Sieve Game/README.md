# [Gold V] Sieve Game - 30293

[문제 링크](https://www.acmicpc.net/problem/30293)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 315, 정답: 168, 맞힌 사람: 153, 정답 비율: 55.839%

### 분류

수학, 그리디 알고리즘, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Alice, after mastering the sieve of Eratosthenes, excitedly created a puzzle game that made use of it.</p>

<p>The rules of the puzzle game are as follows:</p>

<ul>
	<li>An array $p_1,p_2,\ldots ,p_N$ is given where all $p_i$ is initially $0$.</li>
	<li>A target array $t_1,t_2,\ldots ,t_N$ is given. Her goal is to make $p_i=t_i$ for all $1\le i\le N$.</li>
	<li>Each time, she can perform one of the following two operations:
	<ul>
		<li>Choose $i$ and increase $p_j$ by $1$ for every $1\le j\le N$ that is a multiple of $i$.</li>
		<li>Choose $i$ and decrease $p_j$ by $1$ for every $1\le j\le N$ that is a multiple of $i$.</li>
	</ul>
	</li>
	<li>She can repeat this process as much as she wants.</li>
</ul>

<p>Alice aims to solve the puzzle using the fewest operations, showcasing her puzzle-solving skill. Please help Alice find the minimum number of operations to solve the puzzle.</p>

### 입력

<p>The first line contains one integer, $N$.</p>

<p>The second line contains space-separated $N$ integers &mdash; elements of the array $t$.</p>

### 출력

<p>Print out the minimum number of operations to solve the puzzle. If the puzzle is unsolvable, print <span style="color:#e74c3c;"><code>-1</code></span>.</p>

### 제한

<ul>
	<li>$1\le N\le 200\, 000$</li>
	<li>$-10^9\le t_i\le 10^9\ (1\le i\le N)$</li>
	<li>All values in the input are integers.</li>
</ul>
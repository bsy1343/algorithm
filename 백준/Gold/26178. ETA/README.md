# [Gold I] ETA - 26178

[문제 링크](https://www.acmicpc.net/problem/26178)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 74, 맞힌 사람: 67, 정답 비율: 54.918%

### 분류

그래프 이론, 해 구성하기

### 문제 설명

<p>You want to design a level for a computer game. The level can be described as a connected undirected graph with vertices numbered from $1$ to $n$. In the game, the player&#39;s character is dropped at one of the $n$ vertices uniformly at random and their goal is to reach the exit located at vertex $1$ as quickly as possible. Traversing an edge takes exactly $1$ second.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26178.%E2%80%85ETA/5285e70e.png" data-original-src="https://upload.acmicpc.net/ed6b50b0-e22f-4e39-8590-8f155aafeed3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 213px;" /></p>

<p style="text-align: center;">Figure E.1: Illustration of Sample Output 3, a level where the average optimal time to reach vertex $1$ is $\frac{7}{4}$.</p>

<p>The difficulty of the level is determined by the average optimal time to reach the exit. Given a target value for this average optimal time, construct a level so that this target value is reached. See Figure E.1 for an example.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two coprime integers $a$ and $b$ ($1 \le a,b \le 1000$) separated by a &#39;<code>/</code>&#39;, giving the desired average optimal time to reach the exit as the fraction $\frac{a}{b}$.</li>
</ul>

### 출력

<p>If no connected graph with the average optimal time $\frac{a}{b}$ to reach vertex $1$ exists, output &quot;<code>impossible</code>&quot;. Otherwise, output one such graph in the following format:</p>

<ul>
	<li>Two integers $n$ and $m$ ($1 \le n, m \le 10^6$), the number of vertices and the number of edges.</li>
	<li>$m$ pairs of integers $u$ and $v$ ($1 \le u,v \le n$), indicating an edge between vertices $u$ and $v$.</li>
</ul>

<p>The graph may include self loops and parallel edges. You are given that if there exists a valid graph, then there also exists one with $1 \le n, m \le 10^6$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>
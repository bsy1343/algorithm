# [Gold III] Sewing Graph - 20032

[문제 링크](https://www.acmicpc.net/problem/20032)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 123, 정답: 82, 맞힌 사람: 79, 정답 비율: 68.103%

### 분류

정렬, 기하학, 해 구성하기

### 문제 설명

<p>Donghyun recently bought a square-shaped tablecloth. There are $N$ dots on the cloth, and the dots can be seen from both sides of the cloth. Donghyun thought that the tablecloth can be made more beautiful, so he decided to decorate the cloth with sewing.</p>

<p>For convenience, let&#39;s assume that each dot is a point on the $xy$-plane and the dots are numbered from $1$ to $N$. Dot $i$ ($1 \le i \le N$) is placed at coordinate $(x_i, y_i)$. No two dots have the same coordinates. A <strong>sewing sequence</strong> is an integer sequence $\{ s_i \}$ of length $k \geq 2$ satisfying $1 \le s_i \le N$ ($1 \le i \le k$) and $s_i \neq s_{i+1}$ ($1 \le i \le k-1$).<br />
The sequence draws edges on the cloth per the following rules:</p>

<ul>
	<li>Draw an edge connecting dot $s_{2i-1}$ and dot $s_{2i}$ on the front side of the cloth for all $1 \le i \le \left \lfloor \frac{k}{2} \right \rfloor$.</li>
	<li>Draw an edge connecting dot $s_{2j}$ and dot $s_{2j+1}$ on the back side of the cloth for all $1 \le j \le \left \lfloor \frac{k-1}{2} \right\rfloor$.</li>
</ul>

<p>Donghyun wants to make a \textbf{beautiful pattern} on the tablecloth, which is defined as the following:</p>

<ul>
	<li>For both sides of the cloth, all $N$ dots are connected by the edges on that side.</li>
	<li>Two edges on the same side of the cloth can intersect only at a common endpoint.</li>
</ul>

<p>Donghyun is very busy, so he wants to finish his sewing job as quickly as possible. In other words, over all sewing sequences that produces a beautiful pattern, Donghyun decides to choose the shortest such sequence. Your job is to find such a sequence.</p>

<p>Note that Donghyun wants to minimize the length of the sewing sequence itself, not the sum of the lengths of the edges he draws.</p>

### 입력

<p>On the first line, a single integer $N$ is given. ($2 \le N \le 1\,000$)</p>

<p>For each of the next $N$ lines, two integers $x_i$ and $y_i$ are given, which means dot $i$ is placed at coordinate $(x_i, y_i)$. ($1 \le x_i, y_i \le 10^9$)</p>

<p>No two dots are at the same coordinates.</p>

### 출력

<p>On the first line, output a positive integer $k$, the length of the shortest sewing sequence that produces a beautiful pattern.</p>

<p>On the next line, output $s_1$, $s_2$, $\cdots$, $s_k$, the actual sewing sequence.</p>

<p>It can be proven that, for every possible input, there exists a sewing sequence that produces a beautiful pattern.</p>
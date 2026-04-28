# [Platinum II] Tree Infection - 31204

[문제 링크](https://www.acmicpc.net/problem/31204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 7, 맞힌 사람: 6, 정답 비율: 10.345%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 자료 구조, 그래프 탐색, 트리, 세그먼트 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 희소 배열, 오일러 경로 테크닉

### 문제 설명

<p>You are given a rooted tree consisting of $N$ vertices, along with integers $R$ and $M$. The vertices are numbered from $1$ to $N$, with vertex $1$ as a root. Each of the other vertices has a single parent in the tree.</p>

<p>If a vertex s is chosen, it becomes infected along with all its descendants (i.e. vertices that can be reached by following edges downward from s) <strong>at a distance of $R$ or less</strong>, where distance is calculated as the number of edges between vertices. A vertex $u$ is considered reachable from vertex $v$ if and only if neither of them is infected, and the number of infected vertices on the path between them <strong>does not exceed</strong> $M$.</p>

<p>For each possible chosen vertex $s$ ($1 &le; s &le; N$), you must calculate the number of vertex pairs $(u, v)$ such that $1 &le; u &lt; v &le; N$ and $u$ is reachable from $v$ (and vice versa).</p>

### 입력

<p>The first line contains three integers: $N$, $R$ and $M$.</p>

<p>The second line contains $N - 1$ integers: $p[2]$, $p[3]$, $\dots$, $p[N]$, the parents of the vertices $2$, $3$, $\dots$,$N$, respectively.</p>

### 출력

<p>Print $N$ lines with single integer each: $s$-th line should contain required number of pairs when the chosen vertex is $s$.</p>

<p>It&#39;s not recommended to use <code>std::endl</code> for outputting newline symbols. Instead, consider using <code>&#39;\n&#39;</code> for better performance.</p>

### 제한

<ul>
	<li>$2 &le; N &le; 500\,000$</li>
	<li>$1 &le; p[i] &lt; i$ (for each $2 &le; i &le; N$)</li>
	<li>$0 &le; R &le; N - 1$</li>
	<li>$0 &le; M &le; 2 \times R + 1$</li>
</ul>
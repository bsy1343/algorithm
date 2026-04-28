# [Platinum I] Italian Data Centers - 27602

[문제 링크](https://www.acmicpc.net/problem/27602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 37, 맞힌 사람: 34, 정답 비율: 72.340%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 비트마스킹, 플로이드–워셜

### 문제 설명

<p>An <em>Italian data center</em> consists of a set of servers, each colored green, white, or red, and a set of wires connecting them. Each wire connects two distinct servers and two servers are connected by at most one wire. Additionally, the data center is connected, i.e. there is a way to transmit information between any two servers through a sequence of wires.</p>

<p>To judge all of the contestant submissions, SWERC has an Italian data center. Since every year the number of contestants doubles, the data center needs to grow to adapt to the extra load. To address this, SWERC builds a new data center based on the previous year&rsquo;s one by following these steps:</p>

<ul>
	<li>For each server $s$ in the old data center, the new data center contains two servers $s_1$ and $s_2$ of the same color as $s$. A wire is placed connecting the two servers $s_1$ and $s_2$.</li>
	<li>For each wire connecting servers $s$ and $t$ in the old data center: if $s$ and $t$ have the same color, then a wire is placed in the new data center connecting $s_1$ and $t_1$ and another wire connecting $s_2$ and $t_2$; otherwise, a wire is placed in the new data center connecting $s_1$ and $t_2$ and another one connecting $s_2$ and $t_1$.</li>
</ul>

<p>One can show that if the old data center is connected than the new data center is also connected.</p>

<p>You are given the Italian data center that SWERC currently has, which contains $n$ servers (indexed by $1, 2, \dots , n$) and $m$ wires connecting them. The organization wants to know how good their data center will be after $k$ years, so you should determine the <em>diameter</em> of the data center SWERC will have in $k$ years. The diameter of the data center is the largest distance between any two servers, i.e. the shortest number of wires that have to be used to transmit something between the two servers.</p>

### 입력

<p>The first line contains three integers $n$, $m$ and $k$ ($2 &le; n &le; 100$, $n-1 &le; m &le; n(n-1)/2$, $0 &le; k &le; 100$) &mdash; the number of servers, the number of wires, and the number of years to consider.</p>

<p>The second line contains $n$ integers $c_1, c_2, \dots , c_n$ ($1 &le; c_i &le; 3$) &mdash; $c_i$ is the color of server $i$ (where $1$ stands for <em>green</em>, $2$ for <em>white</em> and $3$ for <em>red</em>).</p>

<p>Each of the next $m$ lines contains two integers $s_i$ and $t_i$ ($1 &le; s_i , t_i &le; n$) &mdash; the two servers the $i$-th wire connects.</p>

<p>It is guaranteed that the data center is connected, the endpoints of each wire are distinct, and that there are no repeated wires.</p>

### 출력

<p>Print the diameter of SWERC&rsquo;s data center after $k$ years.</p>
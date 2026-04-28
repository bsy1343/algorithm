# [Gold II] Brothers in Arms - 26172

[문제 링크](https://www.acmicpc.net/problem/26172)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>In medieval times, keeping track of the relationships between cities was extremely difficult, since most cities did not have access to the internet<sup>[citation needed]</sup>. However, it was possible to determine whether two cities were friendly with each other by examining their coats of arms. In those days, every coat of arms showed two symbols: one at the top, and one at the bottom. If two cities have an equal symbol at the top or they have an equal symbol at the bottom, they are friendly.</p>

<p>Following the saying &quot;the friends of my friends are my friends&quot;, two cities $c_0$ and $c_f$ can be indirectly friendly if there exist cities $c_1, \ldots, c_{f-1}$ such that $c_k$ is friendly with $c_{k+1}$ for $0\leq k &lt; f$. If $c_0$ and $c_f$ are different and indirectly friendly, then we say that the friendship degree of these cities is the smallest possible $f$ following this definition. See Figure B.1 for an example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26172.%E2%80%85Brothers%E2%80%85in%E2%80%85Arms/3b8e2dea.png" data-original-src="https://upload.acmicpc.net/45107bc1-86b9-44c7-8684-08d60906e63f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 188px;" /></p>

<p style="text-align: center;">Parts of these coats of arms are CC BY-SA 4.0 on Wikimedia Commons.</p>

<p style="text-align: center;">Figure B.1: Illustration of Sample Input 1. Cities $1$ and $2$ are directly friendly, as well as cities $2$ and $3$. Cities $1$ and $3$ have a friendship degree of $2$, because they are indirectly friendly via city $2$. City $4$ is not (indirectly) friendly with any other city.</p>

<p>You are given a list of coats of arms and a list of queries. For every query, determine the friendship degree of the two given cities.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $s$ ($2\leq n\leq 90\,000$, $2\leq s\leq 300$), the number of cities and the number of symbols that may appear on the coat of arms of some city.</li>
	<li>$n$ lines, the $i$th of which consists of two integers $t_i$ and $b_i$ ($1\leq t_i, b_i\leq s$). $t_i$ is the symbol on the top side of the coat of arms of the $i$th city, and $b_i$ is the symbol on the bottom side of the coat of arms of the $i$th city. If $i\neq j$, then $t_i\neq t_j$ or $b_i\neq b_j$.</li>
	<li>One line with an integer $q$ ($1\leq q\leq 10^5$), the number of queries.</li>
	<li>$q$ lines, the $i$th of which contains two integers $c$ and $d$ ($1\leq c, d\leq n$, $c\neq d$), two cities for which you should calculate the friendship degree.</li>
</ul>

### 출력

<p>For every query, output an integer stating the friendship degree of the two cities, or $-1$ if the two cities are not (indirectly) friendly.</p>
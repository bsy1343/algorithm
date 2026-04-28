# [Platinum I] Two Pointers (hard version) - 29821

[문제 링크](https://www.acmicpc.net/problem/29821)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 14, 맞힌 사람: 14, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>Alice and Bob are driving on a very long road that stretches from points $-10^9$ to $10^9$. Alice starts at point $A$ while Bob starts at point $B$. There are $n$ events to visit, where event $i$ is at position $t_i$. Either Alice or Bob must visit each event, but they must be visited <strong>in order</strong> (they must visit event $1$, then event $2$, then event $3$, \dots then event $n$).</p>

<p>Find the minimum <strong>total</strong> distance Alice and Bob can drive to visit all events.</p>

### 입력

<p>The first line contains a single integer $n$ ($1\le n\le3\cdot10^5$) --- the number of events.</p>

<p>The second line contains two integers $A$ and $B$ ($-10^9\le A,B\le10^9$) --- Alice and Bob&#39;s starting points.</p>

<p>The third line contains $n$ integers $t_1,t_2,\dots,t_n$ ($-10^9\le t_i\le10^9$) --- the locations of events either Alice or Bob must get to.</p>

### 출력

<p>Output an integer --- the minimum total distance Alice and Bob drive.</p>

### 힌트

<p>In the first example:</p>

<ul>
	<li>Bob moves from position $3$ to position $5$ to attend event $1$, driving $2$ units.</li>
	<li>Alice moves from position $2$ to position $1$ to attend event $2$, driving $1$ unit.</li>
	<li>Bob moves from position $5$ to position $4$ for event $3$, driving $1$ unit.</li>
	<li>Bob stays at position $4$, attending event $4$, driving $0$ units.</li>
	<li>Bob moves from position $4$ to position $7$ for event $5$, driving $3$ units.</li>
</ul>

<p>The total distance travelled is $2+1+1+0+3=7$.</p>

<p>In the second example, Alice visits all events.</p>
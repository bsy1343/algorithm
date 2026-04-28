# [Platinum V] Moo Route II - 27848

[문제 링크](https://www.acmicpc.net/problem/27848)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 240, 정답: 95, 맞힌 사람: 85, 정답 비율: 48.295%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 정렬, 너비 우선 탐색

### 문제 설명

<p>Bessie is on vacation! Due to some recent technological advances, Bessie will travel via technologically sophisticated flights, which can even time travel. Furthermore, there are no issues if two &quot;parallel&quot; versions of Bessie ever meet.</p>

<p>In the country there are $N$ airports numbered $1, 2, \ldots, N$ and $M$ time-traveling flights ($1\leq N, M \leq 200000$). Flight $j$ leaves airport $c_j$ at time $r_j$, and arrives in airport $d_j$ at time $s_j$ ($0 \leq r_j, s_j \leq 10^9$, $s_j &lt; r_j$ is possible). In addition, she must leave $a_i$ time for a layover at airport $i$ ($1\le a_i\le 10^9$). (That is to say, if Bessie takes a flight arriving in airport $i$ at time $s$, she can then transfer to a flight leaving the airport at time $r$ if $r \geq s + a_i$. The layovers do not affect when Bessie arrives at an airport.)</p>

<p>Bessie starts at city $1$ at time $0$. For each airport from $1$ to $N$, what is the earliest time when Bessie can get to at it?</p>

### 입력

<p>The first line of input contains $N$ and $M$.</p>

<p>The next $M$ lines describe flights. The $j$th of these lines contains $c_j$, $r_j$, $d_j$, $s_j$ in that order. ($1\leq c_j, d_j \leq N$, $0\leq r_j, s_j \leq 10^9$)</p>

<p>The next line describes airports. It contains $N$ space separated integers, $a_1, \ldots, a_N$.</p>

### 출력

<p>There are $N$ lines of output. Line $i$ contains the earliest time when Bessie can get to airport $i$, or -1 if it is not possible for Bessie to get to that airport.</p>
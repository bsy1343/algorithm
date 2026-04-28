# [Gold III] Love Letter - 29820

[문제 링크](https://www.acmicpc.net/problem/29820)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 50, 맞힌 사람: 43, 정답 비율: 65.152%

### 분류

데이크스트라, 그래프 이론, 최단 경로, 정렬

### 문제 설명

<p>There are $n$ dragons numbered from $1$ to $n$. Dragon $i$ has age $a_i$. <strong>The values of $a_i$ are distinct</strong>. Dragon $1$ is Evirir the dragon.</p>

<p>Evirir has a letter it wants to send to dragon $t$. To avoid awkwardness caused by age difference, Evirir can send the letter to another dragon (not necessarily dragon $t$). The dragon who received the letter can then send the letter to another dragon, and so on. The goal is to eventually send the letter to dragon $t$.</p>

<p>For all $i$ ($1 \le i \le n$), when dragon $i$ has the letter, it can send the letter to dragon $j$ in $|a_i - a_j|$ time$^1$. A dragon can &quot;send&quot; the letter to itself in $0$ time. However, there are $k$ pairs of dragons who are close friends. If dragons $i$ and $j$ are close friends, then it takes $0$ time instead for dragon $i$ to send a letter to dragon $j$ (and vice versa).</p>

<p>For each dragon $t$ ($1 \le t \le n$), answer the question (independently): What is the minimum total time needed for dragon $1$ to send a letter to dragon $t$?</p>

<p>$^1$Note: $|x|$ denotes the absolute value of $x$. For example, $|9| = 9$, $\lvert -6 \rvert = 6$, and $|0| = 0$. See \url{https://en.wikipedia.org/wiki/Absolute\_value} for more information.</p>

### 입력

<p>The first line contains two space-separated integers $n$ and $k$ ($1 \le n\le 2 \cdot 10^5$, $0 \le k \le 2 \cdot 10^5$) -- the number of dragons and the number of pairs of close friends.</p>

<p>The second line contains $n$ <strong>distinct</strong> space-separated integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 10^9$) -- the dragons&#39; ages.</p>

<p>Then, $k$ lines follow. Each of the $k$ lines contains two space-separated integers $u$ and $v$ ($1 \le u, v \le n$, $u \ne v$), which means that dragons $u$ and $v$ are close friends. It is guaranteed that the same pair of close friends will not appear twice (if $(u,v)$ appears, then $(u,v)$ and $(v,u)$ will not appear afterwards).</p>

### 출력

<p>Output $n$ space-separated integers $d_1, d_2, \ldots, d_n$, where $d_i$ is the minimum total time needed for dragon $1$ to send the letter to dragon $i$.</p>

### 힌트

<p>Explanation for the first sample:</p>

<p>When $t = 1$, it takes $0$ time because dragon $1$ already has the letter.</p>

<p>When $t = 3$, since dragon $1$ and $3$ are close friends, dragon $1$ can send the letter directly to dragon $3$ in $0$ time.</p>

<p>When $t = 2$, dragon $1$ can send the letter to dragon $3$ first in $0$ time (they are close friends), then dragon $3$ sends the letter to dragon $2$ in $|23 - 30| = 7$ time. The total time taken is $0 + 7 = 7$.</p>

<p>When $t = 8$, dragon $1$ can just send the letter directly to dragon $8$, taking $|50 - 47| = 3$ time.</p>

<p>Here is one optimal way each for the remaining $t$&#39;s ($i \xrightarrow{x} j$ means dragon $i$ sends the letter to dragon $j$ using $x$ time):</p>

<ul>
	<li>Dragon $4$: $1 \xrightarrow{0} 3 \xrightarrow{7} 2 \xrightarrow{0} 4$</li>
	<li>Dragon $5$: $1 \xrightarrow{0} 3 \xrightarrow{7} 2 \xrightarrow{0} 4 \xrightarrow{7} 5$</li>
	<li>Dragon $6$: $1 \xrightarrow{0} 3 \xrightarrow{0} 7 \xrightarrow{2} 6$</li>
	<li>Dragon $7$: $1 \xrightarrow{0} 7$</li>
</ul>
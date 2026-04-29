# [Platinum IV] The Elk - 35256

[문제 링크](https://www.acmicpc.net/problem/35256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그래프 이론, 단절점과 단절선, 이중 연결 요소, 트리

### 문제 설명

<p>You are in a forest. In this forest there is also a pair of elks - a cow (an adult female) and her calf (child). As most people know, it is dangerous to get between a cow and her calf, but it is not always clear how to avoid it.</p>

<p>We model our forest as consisting of $N$ locations, and $M$ direct connections between these locations. These connections can be travelled in either direction. The locations are numbered $0$ to $N-1$ and connections are numbered $0$ to $M-1$.</p>

<p>We define a path from the cow to the calf as a series of locations, $p_0, p_1, p_2, \ldots , p_k$ such that:</p>

<ol>
<li>$p_0$ is the location of the cow</li>
<li>$p_k$ is the location of the calf.</li>
<li>For each $i$ satisfying $0 \le i &lt; k$, there is a direct connection between the locations $p_i$ and $p_{i+1}$</li>
<li>None of the connections from point 3 are repeated within the path. Note that we <strong>do allow locations</strong> to be repeated within the path.</li>
</ol>

<p>Clearly, any location that is on any such path is a dangerous place to be, as the cow could consider you to be between her and the calf. Your task is to find all the safe locations - that is, the locations that are not on any such path.</p>

### 입력

<p>The first line contains four integers, $N, M, A, B$. $N$ and $M$ are the number of locations and direct connections respectively, while $A$ and $B$ are the current locations of the cow and the calf respectively.</p>

<p>The following $M$ lines, numbered from $0$ to $M-1$, each describe one of the $M$ connections. The $i$th of these line contains two integers $U_i$ and $V_i$, indicating that $i$th connection is between locations $U_i$ and $V_i$.</p>

### 출력

<p>The first line of output should contain a single integer $S$, the number of locations in the forest where it is safe to be.</p>

<p>The next $S$ lines of output should be a list of all the safe locations, one location per line, in increasing numerical order.</p>

### 제한

<ul>
<li>$2 \le N \le 5 \cdot 10^4$</li>
<li>$2 \le M \le 10^5$</li>
<li>$0 \le U_i, V_i &lt; N$ for all $i$.</li>
<li>$0 \leq A,B \leq N-1$</li>
<li>$U_i \neq V_i$ for all $i$.</li>
<li>There will be at most one direct connection between any pair of locations.</li>
<li>There will always be at least one path from the cow to the calf.</li>
</ul>
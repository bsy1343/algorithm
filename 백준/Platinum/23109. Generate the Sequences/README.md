# [Platinum I] Generate the Sequences - 23109

[문제 링크](https://www.acmicpc.net/problem/23109)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Consider $S$, the sequence of integer sequences. Initially, $S_0 = (1)$. After that, we construct $S_1, S_2, \ldots, S_n$ as follows.</p>

<p>Let $|S_i|$ be the length of the sequence $S_i$, and $s_{i,j}$ be the $j$-th element of $S_i$. Then $S_{i+1}$ will have length $|S_i|+1$ and can be obtained from $|S_i|$ using one of the following two operations:</p>

<ul>
	<li>Write $1$ or the given integer $m$ as the element with number $|S_i| + 1$ of the new sequence. &nbsp;</li>
	<li>Select an index $j$ ($1 \le j &lt; |S_i|$), choose integer $x$ such that $s_{i,j} &lt; x &lt; s_{i,j + 1}$ or $s_{i,j} &gt; x &gt; s_{i,j + 1}$, and place it between $s_{i,j}$ and $s_{i,j+1}$, shifting the right part&#39;s indices by $1$.</li>
</ul>

<p>Given $n$ and $m$, find the number of different ordered sets of sequences $S_1 \ldots S_n$. Two sets are considered different if, at least for one $i$ from $1$ to $n$, the sequences $S_i$ in those sets differ. As the answer may be too large, print it modulo $998\,244\,353$.</p>

### 입력

<p>The input consists of one line containing two integers $n$ and $m$ ($1 \le n \le 3000$, $2 \le m \le 10^8$).</p>

### 출력

<p>Print the number of different sequences $S$ modulo $998\,244\,353$.</p>

### 힌트

<p>Here are the possible sequences in the first example:</p>

<ul>
	<li>$S_1=(1,3)$ (first operation), then $S_2=(1,2,3)$ (second operation);</li>
	<li>$S_1=(1,1)$ (first operation), then $S_2=(1,1,3)$ (first operation);</li>
	<li>$S_1=(1,1)$ (first operation), then $S_2=(1,1,1)$ (first operation);</li>
	<li>$S_1=(1,3)$ (first operation), then $S_2=(1,3,3)$ (first operation);</li>
	<li>$S_1=(1,3)$ (first operation), then $S_2=(1,3,1)$ (first operation).</li>
</ul>

<p>Therefore, the answer is $5$.</p>
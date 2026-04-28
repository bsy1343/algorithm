# [Gold II] Zero AAMP Currents - 25892

[문제 링크](https://www.acmicpc.net/problem/25892)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 무작위화

### 문제 설명

<p>Thomas Edison stumbled upon an alien electrical device that appears to break known laws of physics! The device consists of $n$ batteries connected by $m$ unidirectional wires, which we will represent as vertices and edges that form a graph. The $i$-th wire is directed from battery $v_i$ to battery $u_i$, $v_i \ne u_i$. Let $(v_i &rarr; u_i)$ denote such a wire.</p>

<p>To make this device work, Thomas must assign a current strength to each wire such that this assignment results in a successful configuration. For a configuration to be successful, two conditions must be met:</p>

<ol>
	<li>All current strength values are non-zero integers in the range $[-1000, 1000]$ AAMP (Alien Amperes).</li>
	<li>For every cycle found in this device, the sum of AAMP values from all wires in it must be $0$. A cycle is a sequence of edges (wires) $(a_1 &rarr; a_2)$, $(a_2 &rarr; a_3)$, $\dots$,$(a_{k-1} &rarr; a_k)$, $(a_k &rarr; a_1)$. If edges $(x &rarr; y)$ and $(y &rarr; x)$ both exist, they also form a cycle &ndash; the wires are unidirectional.</li>
</ol>

<p>Help him with this task.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ &ndash; the number of batteries and the number of wires in the device, respectively. Next, $m$ lines contain two integers each $v_i$ and $u_i$, which mean that the $i$-th wire goes from battery $v_i$ to $u_i$.</p>

### 출력

<p>Print $m$ lines containing one number each: the $i$-th number should be the current strength of $i$-th wire (in AAMP). Each number should be non-zero and in the range of $[-1000, 1000]$. If multiple answers exist, you may print any one of them.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 10^5$</li>
	<li>$1 &le; m &le; 2 \cdot 10^5$</li>
	<li>$1 &le; v_i , u_i &le; n$, $v_i \ne u_i$</li>
</ul>

### 힌트

<p>Note that there can be multiple wires from battery $x$ to $y$. Also note that wire $(x &rarr; y)$ with strength $3$ AAMP is not the same as $(y &rarr; x)$ with strength $-3$. As mentioned before, wires are unidirectional and can have a negative current strength - that&rsquo;s one of the mysteries of this device ...</p>
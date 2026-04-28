# [Platinum I] Hiperkocka - 23689

[문제 링크](https://www.acmicpc.net/problem/23689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 7, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

애드 혹, 트리, 해 구성하기

### 문제 설명

<p style="text-align: center;"><em>...it&rsquo;s dark in the cube, it&rsquo;s dark in the cube...</em></p>

<p>Five in the morning. Daniel wakes up, he opens his eyes. His head hurts a bit. He can still hear the ringing in his ears.</p>

<p>He comes to realize that he has found himself at a playground, in a big metal box.</p>

<p style="text-align: center;"><em>...I was in the cube, I was in the cube...</em></p>

<p>He remembers a similar situation he found himself in, three years ago, COCI round 2, task Kocka.</p>

<p style="text-align: center;"><em>...I&rsquo;m in the cube again, I&rsquo;m in the cube again...</em></p>

<p>But this time, things are much more complicated... Daniel is in an $n$-dimensional hipercube $\mathcal{Q}_n$. $2^{n-1}$&nbsp;identical copies of a tree $\mathcal{T}$ with $n$ edges are scattered around him. It soon became clear to him that salvation lies in tiling the edges of the hipercube with the trees.</p>

<p>Formally, a <em>hipercube</em> $\mathcal{Q}_n$ is a graph with nodes $0$, $1$, $\dots$, $2^n-1$, in which nodes $x$ and $y$ are connected if and only if their bitwise <em>xor</em> is a power of two.</p>

<p>A tree can be <em>placed</em> on the hipercube so that:</p>

<ul>
	<li>each node of the tree corresponds to some node of the hipercube</li>
	<li>those nodes have to be distinct</li>
	<li>if there is an edge between two nodes in the tree, then there has to be an edge between the corresponding nodes in the hipercube.</li>
</ul>

<p>A <em>tiling</em> of the hipercube is done by placing several trees so that each edge of the hipercube belongs to at most one tree.</p>

<p>Your task is to tile the hipercube $\mathcal{Q}_n$ with as many copies of the given tree $\mathcal{T}$, which has $n$ edges.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 &le; n &le; 16$), the dimension of the hipercube.</p>

<p>Each of the following $n$ lines contains two integers $x$ and $y$ ($0 &le; x, y &le; n$, $x \ne y$) which denote that the nodes $x$ and $y$ are connected by an edge in tree $\mathcal{T}$.</p>

### 출력

<p>In the first line print the number of trees in your tiling.</p>

<p>Each of the following lines should describe a placement of a single copy of the tree $\mathcal{T}$.</p>

<p>In the $i$-th line print $n + 1$ numbers $a_0^{(i)}$, $a_1^{(i)}$, $\ldots$&nbsp;$a_n^{(i)}$. These numbers denote that the $i$-th tree is placed so that the hipercube node $a_j^{(i)}$&nbsp;corresponds to the tree node $j$, for all $j = 0, \dots , n$.</p>

### 힌트

<p>Clarification of the third example:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c97060fc-cf5e-400a-b766-8a608bba2e6f/-/preview/" style="width: 119px; height: 126px;" /></p>
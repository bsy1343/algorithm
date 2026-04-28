# [Platinum I] Subtree Activation - 27554

[문제 링크](https://www.acmicpc.net/problem/27554)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 24, 맞힌 사람: 23, 정답 비율: 46.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>For the New Year celebration, Bessie and her friends have constructed a giant tree with many glowing ornaments. Bessie has the ability to turn the ornaments on and off through remote control. Before the sun rises, she wants to toggle some of the ornaments in some order (possibly toggling an ornament more than once) such that the tree starts and ends with no ornaments on. Bessie thinks the tree looks cool if the set of activated ornaments is exactly a subtree rooted at some vertex. She wants the order of ornaments she toggles to satisfy the property that, for every subtree, at some point in time it was exactly the set of all turned on ornaments. Additionally, it takes energy to switch on and off ornaments, and Bessie does not want to waste energy, so she wants to find the minimum number of toggles she can perform.</p>

<p>Formally, you have a tree with vertices labeled $1\dots N$ ($2\le N\le 2\cdot 10^5$) rooted at $1$. Each vertex is initially inactive. In one operation, you can toggle the state of a single vertex from inactive to active or vice versa. Output the minimum possible length of a sequence of operations satisfying both of the following conditions:</p>

<ul>
	<li>Define the subtree rooted at a vertex $r$ to consist of all vertices $v$ such that $r$ lies on the path from $1$ to $v$ inclusive. For every one of the $N$ subtrees of the tree, there is a moment in time when the set of active vertices is precisely those in that subtree.</li>
	<li>Every vertex is inactive after the entire sequence of operations.</li>
</ul>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $p_2 \dots p_N$ ($1\le p_i&lt;i$), where $p_i$ denotes the parent of vertex $i$ in the tree.</p>

### 출력

<p>Output the minimum possible length.</p>

### 힌트

<p>There are three subtrees, corresponding to $\{1,2,3\}$, $\{2\}$, and $\{3\}$. Here is one sequence of operations of the minimum possible length:</p>

<pre>
activate 2
(activated vertices form the subtree rooted at 2)
activate 1
activate 3
(activated vertices form the subtree rooted at 1)
deactivate 1
deactivate 2
(activated vertices form the subtree rooted at 3)
deactivate 3
</pre>
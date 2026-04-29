# [Platinum I] Tree Decorations - 34524

[문제 링크](https://www.acmicpc.net/problem/34524)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>Mateo recently found the perfect decorations for his Christmas tree — more trees!</p>

<p>Specifically, his Christmas tree is a rooted tree $T$ initially with $M$ nodes, all painted green. He has another rooted tree $D$ that he uses as a reference for his decorations. Mateo uses the following process to put on all of his decorations:</p>

<ul>
	<li>For each node $i$ in $D$, he creates a <strong>copy</strong> of the subtree rooted at $i$. Let this copy be $C_i$. Then, he paints the nodes of $C_i$ red. Finally, he chooses some green node in $T$ to be the parent of the root of $C_i$ by connecting them with an edge.</li>
</ul>

<p>After applying all the decorations, $T$ ends up containing $N$ nodes. Unfortunately, he realized that he had forgotten to record what $D$ is! To make things worse, he accidentally spilled water on $T$, washing off all the colour from the nodes. After all that, he labels the root of $T$ as $1$, and then labels the rest of the nodes from $2$ to $N$.</p>

<p>The only information he currently has is the final state of $T$, as well as $M$. Help him find the number of possible $D$ that he could have started with, where two possibilities are considered different if they are structurally distinct.</p>

<p>Rooted trees $A$ and $B$ are said to be structurally identical if and only if they have the same number of nodes $S$, and there is a way to label $A$’s nodes from $1$ to $S$ and $B$’s nodes from $1$ to $S$ such that:</p>

<ul>
	<li>Their roots are labeled the same.</li>
	<li>Nodes labeled $x$ and $y$ in $A$ are connected by an edge if and only if nodes labeled $x$ and $y$ in $B$ are connected by an edge.</li>
</ul>

<p>Otherwise, $A$ and $B$ are considered structurally distinct.</p>

### 입력

<p>The first line of input contains two space-separated integers $N$ and $M$.</p>

<p>The next $N − 1$ lines each contain two space-separated integers $u_i$ and $v_i$ ($1 ≤ u_i , v_i ≤ N$, $u_i \ne v_i$), describing an edge in $T$ connecting nodes $u_i$ and $v_i$. <strong>Note that $T$ is rooted at node $1$.</strong></p>

### 출력

<p>Output the number of possible $D$ that he could have started with, where two possibilities are considered different if they are structurally distinct.</p>
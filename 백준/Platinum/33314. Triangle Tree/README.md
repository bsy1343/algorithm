# [Platinum II] Triangle Tree - 33314

[문제 링크](https://www.acmicpc.net/problem/33314)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 18, 맞힌 사람: 18, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 작은 집합에서 큰 집합으로 합치는 테크닉, 조합론, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><em><small>One day, a giant tree grew in the countryside. Little John, with his childhood eagle, decided to make it his home. Little John will build a structure on the tree with galvanized square steel. However, little did he know, he could not build what is physically impossible.</small></em></p>

<p>You are given a rooted tree<sup>1</sup> containing $n$ vertices rooted at vertex $1$. A pair of vertices $(u,v)$ is called a <em>good pair</em> if $u$ is not an ancestor<sup>2</sup> of $v$ and $v$ is not an ancestor of $u$. For any two vertices, $\text{dist}(u,v)$ is defined as the number of edges on the unique simple path from $u$ to $v$, and $\text{lca}(u,v)$ is defined as their <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor">lowest common ancestor</a>.</p>

<p>A function $f(u,v)$ is defined as follows.</p>

<ul>
	<li>If $(u,v)$ is a good pair, $f(u,v)$ is the number of distinct integer values $x$ such that there exists a <strong>non-degenerate triangle</strong><sup>3</sup> formed by side lengths $\text{dist}(u,\text{lca}(u,v))$, $\text{dist}(v,\text{lca}(u,v))$, and $x$.</li>
	<li>Otherwise, $f(u,v)$ is $0$.</li>
</ul>

<p>You need to find the following value:</p>

<p>$$\sum_{i = 1}^{n-1} \sum_{j = i+1}^n f(i,j).$$</p>

<hr>
<p><sup>1</sup>A tree is a connected graph without cycles. A rooted tree is a tree where one vertex is special and called the root.</p>

<p><sup>2</sup>An ancestor of vertex $v$ is any vertex on the simple path from $v$ to the root, including the root, but not including $v$. The root has no ancestors.</p>

<p><sup>3</sup>A triangle with side lengths $a$, $b$, $c$ is non-degenerate when $a+b &gt; c$, $a+c &gt; b$, $b+c &gt; a$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 3 \cdot 10^5$).</p>

<p>Each of the next $n-1$ lines contains two integers $u_i$ and $v_i$, denoting the two vertices connected by an edge ($1 \le u_i,v_i \le n$, $u_i \neq v_i$).</p>

<p>It is guaranteed that the given edges form a tree.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $3 \cdot 10^5$.</p>

### 출력

<p>For each test case, output the answer on a separate line.</p>

### 힌트

<p>On the first test case, the only good pair $(i,j)$ satisfying $i&lt;j$ is $(2,3)$. Here, $\text{lca}(2,3)$ is $1$, and the two distances are $1$ and $1$.</p>

<p>There is only one value of $x$ for two side lengths $1$ and $1$, which is $1$. Therefore, the answer for the first test case is $1$.</p>

<p>On the second test case, there is no good pair. Therefore, the answer for the second test case is $0$.</p>

<p>On the third test case, the good pairs $(i,j)$ satisfying $i&lt;j$ are as follows.</p>

<ul>
	<li>$(2,5)$: $\text{lca}(2,5)$ is $1$, distances are $1$ and $1$. There is only one possible value of $x$, which is $1$.</li>
	<li>$(3,4)$: $\text{lca}(3,4)$ is $2$, distances are $1$ and $1$. There is only one possible value of $x$, which is $1$.</li>
	<li>$(3,5)$: $\text{lca}(3,5)$ is $1$, distances are $2$ and $1$. There is only one possible value of $x$, which is $2$.</li>
	<li>$(4,5)$: $\text{lca}(4,5)$ is $1$, distances are $2$ and $1$. There is only one possible value of $x$, which is $2$.</li>
</ul>

<p>Therefore, the answer for the third test case is $1+1+1+1=4$.</p>
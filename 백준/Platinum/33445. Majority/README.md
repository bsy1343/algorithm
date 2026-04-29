# [Platinum II] Majority - 33445

[문제 링크](https://www.acmicpc.net/problem/33445)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

분할 정복, 애드 혹, 해 구성하기

### 문제 설명

<p>Little Cat learned Boolean circuits recently. Now he wants to construct a majority circuit.</p>

<p>A <em>circuit</em> over Boolean variables $x_1, \ldots, x_n$ is a directed acyclic graph where each node (logical gate) is either an input node labeled by a variable $x_i$, or an operation node labeled by a logical operation $\vee$ or $\wedge$. There are exactly $n$ input nodes, one for each of the input variables $x_1, \ldots, x_n$. Additionally, a single node is <strong>chosen</strong> as the output of the circuit.</p>

<p>Each node computes an output: the input nodes (labeled by a variable) output exactly the variable written on them, and nodes labeled by $\vee$ (respectively, $\wedge$) output the logical OR (respectively, AND) of all incoming nodes. Note that logical NOT nodes are <strong>forbidden</strong>. See the example and notes for better understanding.</p>

<p>The in-degree of an input node is $0$. The in-degree of an operation node is at least $1$, and can be arbitrarily large. The out-degrees are arbitrary (possibly $0$).</p>

<p>For convenience, there are two special constant nodes $T$ (true) and $F$ (false), which always output $1$ and $0$, respectively.</p>

<p>The majority circuit $\mathit{Maj}_n$ has $n$ inputs $x_1, \ldots, x_n$, and it outputs $1$ if at least half of inputs are $1$, and outputs $0$ otherwise. Formally, $\mathit{Maj}_n(x_1, \ldots, x_n) = \left[2 \sum_{i = 1}^n x_i \ge n\right]$.</p>

<p>Define the <em>depth</em> of a circuit as the length of the longest (directed) path in the circuit, that is, the number of edges of the longest path.</p>

<p>Could you help Little Cat to construct a majority circuit over $n$ inputs with depth at most $14$?</p>

### 입력

<p>The input contains one line with an integer $n$ ($2 \le n \le 64$) indicating the number of input nodes.</p>

### 출력

<p>The first line must contain an integer $m$ ($1 \le m \le 5 \cdot 10^4$) representing the number of nodes labeled by $\vee$ or $\wedge$, so there are $n + m + 2$ nodes in the circuit in total. The input nodes $x_1, \ldots, x_n$ are numbered by $1, \ldots, n$. The constant true node $T$ is numbered by $-1$, and the constant false node $F$ is numbered by $-2$.</p>

<p>A total of $m$ lines must follow. The $i$-th line must describe node $(n + i)$ in one of the following formats.</p>

<ul>
	<li>"<code>OR</code> $k_i$ $a_1$ $a_2$ $\ldots$ $a_{k_i}$" (without quotes): node $(n + i)$ computes the logical OR of nodes $a_j$ where $-2 \le a_j &lt; n + i$ and $a_j \neq 0$ for all $1 \le j \le k_i$.</li>
	<li>"<code>AND</code> $k_i$ $a_1$ $a_2$ $\ldots$ $a_{k_i}$" (without quotes): node $(n + i)$ computes the logical AND of nodes $a_j$ where $-2 \le a_j &lt; n + i$ and $a_j \neq 0$ for all $1 \le j \le k_i$.</li>
</ul>

<p>It is fine if $a_u = a_v$ for some $u \neq v$. You must guarantee that $\sum_{i = 1}^{m} k_i \le 2 \cdot 10^5$ and that the depth of the circuit does not exceed $14$.</p>

<p>The output of the circuit <strong>is chosen as</strong> the output of node $n + m$.</p>

<p>To check the circuit you construct, Little Cat will test your circuit for $1500$ rounds. In each round, Little Cat will generate an arbitrary input $x_1, \ldots, x_n$ (he won't say how exactly) and test your circuit with that input. You pass this round if your circuit outputs the majority of the input $x_1, \ldots, x_n$ correctly. You need to pass all the $1500$ rounds.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33445.%E2%80%85Majority/1278013f.png" data-original-src="https://boja.mercury.kr/assets/problem/33445-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>The sample output prints a depth-2 circuit computing $\mathit{Maj}_4$. The circuit $\mathit{Maj}_4 (x_1,x_2,x_3,x_4)$ outputs $1$ if and only if at least two input nodes are $1$. Thus you can compute the logical AND of every pair of input nodes and output the logical OR of these ANDs.</p>

<p>Here are some notes on the circuit nodes:</p>

<ul>
	<li>Nodes $1$, $2$, $3$, and $4$ are input nodes.</li>
	<li>Nodes $5$, $6$, $7$, $8$, $9$, and $10$ compute the logical AND of some input nodes.</li>
	<li>Nodes $11$ and $12$ are redundant.</li>
	<li>Node $13$ is the output node.</li>
	<li>The constant nodes $T$ and $F$ are not drawn in the figure.</li>
</ul>

<p>Here, the existence of redundant nodes will not affect the validity of the circuit as long as the constraints ($1 \le m \le 5 \cdot 10^4$, $\sum k_i \le 2 \cdot 10^5$, $\mathit{depth} \le 14$) are satisfied.</p>

<p>During the test, the following shows a possible scenario:</p>

<p>The input nodes are set to $x_1 = 1$, $x_2 = 0$, $x_3 = 0$, $x_4 = 1$.</p>

<p>Therefore, the outputs of nodes $x_5, \ldots, x_{13}$ are:</p>

<ul>
	<li>$x_5 = x_1 \text{ AND } x_2 = 1 \text{ AND } 0 = 0$</li>
	<li>$x_6 = x_1 \text{ AND } x_3 = 1 \text{ AND } 0 = 0$</li>
	<li>$x_7 = x_1 \text{ AND } x_4 = 1 \text{ AND } 1 = 1$</li>
	<li>$x_8 = x_2 \text{ AND } x_3 = 0 \text{ AND } 0 = 0$</li>
	<li>$x_9 = x_2 \text{ AND } x_4 = 0 \text{ AND } 1 = 0$</li>
	<li>$x_{10} = x_3 \text{ AND } x_4 = 0 \text{ AND } 1 = 0$</li>
	<li>$x_{11} = x_5 \text{ AND } x_5 \text{ AND } x_6 = 0 \text{ AND } 0 \text{ AND } 0 = 0$</li>
	<li>$x_{12} = x_7 = 1$</li>
	<li>$x_{13} = x_5 \text{ OR } x_6 \text{ OR } x_7 \text{ OR } x_8 \text{ OR } x_9 \text{ OR } x_{10} = 0 \text{ OR } 0 \text{ OR } 1 \text{ OR } 0 \text{ OR } 0 \text{ OR } 0 = 1$.</li>
</ul>

<p>The output of the circuit is $x_{13} = 1$, which is the majority of $\{1, 0, 0, 1\}$.</p>
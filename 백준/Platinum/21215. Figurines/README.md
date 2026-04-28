# [Platinum II] Figurines - 21215

[문제 링크](https://www.acmicpc.net/problem/21215)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 147, 정답: 49, 맞힌 사람: 45, 정답 비율: 42.056%

### 분류

자료 구조, 머지 소트 트리, 퍼시스턴트 세그먼트 트리, 세그먼트 트리, 정렬

### 문제 설명

<p>Bob has a lot of mini figurines. He likes to display some of them on a shelf above his computer screen and he likes to regularly change which figurines appear. This ever-changing decoration is really enjoyable. Bob takes care of never adding the same mini figurine more than once. Bob has only $N$ mini figurines and after $N$ days he arrives at the point where each of the $N$ figurines have been added and then removed from the shelf (which is thus empty).</p>

<p>Bob has a very good memory. He is able to remember which mini figurines were displayed on each of the past days. So Bob wants to run a little mental exercise to test its memory and computation ability. For this purpose, Bob numbers his figurines with the numbers $0, \dots, N-1$ and selects a sequence of $N$ integers $d_0 \dots d_{N-1}$ all in the range $[0;N]$. Then, Bob computes a sequence $x_0,\dots, x_N$ in the following way: $x_0=0$ and $x_{i+1}=(x_i+y_i)\mbox{ mod } N$ where $\mbox{mod}$ is the modulo operation and $y_i$ is the number of figurines displayed on day $d_i$ that have a number higher or equal to $x_i$. &nbsp;The result of Bob&#39;s computation is $x_N$.</p>

<p>More formally, if we note $S(i)$ the subset of $\{0,\dots,N-1\}$ corresponding to figurines displayed on the shelf on day $i$, we have:</p>

<ul>
	<li>$S(0)$ is the empty set;</li>
	<li>$S(i)$ is obtained from $S(i-1)$ by inserting and removing some elements.</li>
</ul>

<p>Each element $0 \le j &lt; N$ is inserted and removed exactly once and thus, the last set $S(N)$ is also the empty set. &nbsp;The computation that Bob performs corresponds to the following program:</p>

<p>$x_0 \leftarrow 0$<br />
for $i\in [0;N-1]$<br />
&nbsp; &nbsp; $x_{i+1} \leftarrow (x_i + \#\{y \in S(d_i) \text{ such that } y \ge x_i\}) \mod N$<br />
output $x_N$</p>

<p>Bob asks you to verify his computation. For that he gives you the numbers he used during its computation (the $d_0, \dots, d_{N-1}$) as well as the log of which figurines he added or removed every day. Note that a mini figurine added on day $i$ and removed on day $j$ is present on a day $k$ when $i\leq k &lt; j$. You should tell him the number that you found at the end of the computation.</p>

### 입력

<p>The input is composed of $2N+1$ lines.</p>

<ul>
	<li>The first line contains the integer $N$.</li>
	<li>Lines $2$ to $N+1$ describe the figurines added and removed. Line $i+1$ contains space-separated <code>+</code>$j$ or <code>-</code>$j$, with $0 \le j &lt; N$, to indicate that $j$ is added or removed on day $i$. This line may be empty. A line may contain both <code>+</code>$j$ and <code>-</code>$j$, in that order.</li>
	<li>Lines $N+2$ to $2N+1$ describe the sequence $d_0,\dots, d_{N-1}$. Line $N+2+i$ contains the integer $d_i$ with $0 \le d_i \le N$.</li>
</ul>

### 출력

<p>The output should contain a single line with a single integer which is $x_N$.</p>

### 제한

<ul>
	<li>$1 \le N \le 100\,000$</li>
</ul>

### 힌트

<p>The output is $2$ since</p>

<ul>
	<li>first, $x \leftarrow 2$ since $S(1) = \{ 0, 2 \}$ and $\#\{y \in S(1)&nbsp; \text{ such that } y \ge 0\} = 2$;</li>
	<li>then, $x \leftarrow 0$ since $S(2) = \{ 1, 2 \}$ and $\#\{y \in S(2)&nbsp; \text{ such that } y \ge 2\} = 1$;</li>
	<li>and finally, $x \leftarrow 2$ since $S(2) = \{ 1, 2 \}$ and $\#\{y \in&nbsp; S(2) \text{ such that } y \ge 0\} = 2$.</li>
</ul>
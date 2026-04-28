# [Platinum II] Bojanje - 27549

[문제 링크](https://www.acmicpc.net/problem/27549)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 확률론

### 문제 설명

<p>Oliver is a rubber duck that, not only finds bugs, but also likes to paint. His latest painting has $n$ parts, each coloured with a unique colour. After he got a lot of critiques his painting is too predictable, he decided to modify his painting in $t$ iterations. In every iteration he will do the following steps:</p>

<ol>
	<li>Oliver will select uniformly at random an index $i$ ($1 &le; i &le; n$), and memorize the colour on the $i$-th part od the painting.</li>
	<li>Again, Oliver will select uniformly at random an index $j$ ($1 &le; j &le; n$). He will repaint the $j$-th part of the painting with the colour of the $i$-th part od the painting. If the $j$-th part is already painted in that colour, there is no change. Note that $i$ can be equal to $j$.</li>
</ol>

<p>Now, Oliver is afraid his painting will become monotonous or boring. He considers a painting good if there are at least $k$ differents colours on it. Help him calculate the probability that his painting will be good at the end.</p>

### 입력

<p>The first line contains the numbers from the task statement $n$, $t$ and $k$ ($2 &le; k &le; n &le; 10$, $1 &le; t &le; 10^{18}$).</p>

### 출력

<p>In the first and only line output the answer modulo $10^9 + 7$.</p>

<p>Formally, let $m = 10^9 + 7$. It can be shown that the answer can be expressed as an irreducible fraction $\frac{p}{q}$, where $p$ and $q$ are integers and $q \not\equiv 0 \pmod m$. Output the integer equal to $p &middot; q^{-1} \bmod m$. In other words, output such an integer $x$ that $0 &le; x &lt; m$ and $x &middot; q \equiv p \pmod m$.</p>

### 힌트

<p>Clarification of the first example: On the painting there are two colours, so the probability that it remains the same after one iteration is $\frac{1}{2}$.</p>

<p>Clarification of the second example: After two iterations, the number of different colours can&rsquo;t go from $10$ to less than $5$, so in every case the painting will have at least $5$ different colours.</p>
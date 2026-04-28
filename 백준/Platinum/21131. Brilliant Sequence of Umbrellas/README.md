# [Platinum IV] Brilliant Sequence of Umbrellas - 21131

[문제 링크](https://www.acmicpc.net/problem/21131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 116, 정답: 58, 맞힌 사람: 46, 정답 비율: 47.423%

### 분류

해 구성하기, 수학, 정수론

### 문제 설명

<p>Anton has $n$ umbrellas, each of them has a different number from $1$ to $n$ written on it. He wants to arrange some of the umbrellas in line so that they would form a <em>brilliant sequence of umbrellas</em> (BSU). A sequence of $k$ umbrellas with numbers $a_1, a_2, \ldots, a_k$ is considered a BSU if the following rules apply:</p>

<ul>
	<li>$a_i &gt; a_{i-1}$ for all $2 \le i \le k$;</li>
	<li>$\text{gcd}(a_i, a_{i-1}) &gt; \text{gcd}(a_{i-1}, a_{i-2})$ for all $3 \le i \le k$. Here, $\text{gcd}(x, y)$ denotes the greatest common divisor of integers $x$ and $y$.</li>
</ul>

<p>Anton would like to create a long BSU. Making the longest one doesn&#39;t bother him, he thinks that a BSU of length at least $\left\lceil\frac{2}{3}\sqrt{n}\right\rceil$ is quite enough.</p>

<p>Anton is busy reading fascinating books about lighthouses, so he asks you to find a BSU that would satisfy him.</p>

### 입력

<p>The only line contains an integer $n$, the number of umbrellas ($1 \le n \le 10^{12}$).</p>

### 출력

<p>The first line should contain an integer $k$, the length of the BSU you have found ($\left\lceil\frac{2}{3}\sqrt{n}\right\rceil \le k \le 10^6$).</p>

<p>The second line should contain $k$ integers $a_i$, the sequence itself ($1 \le a_i \le n$). The sequence should satisfy the rules mentioned above.</p>

### 힌트

<p>In the first example, $\left\lceil \frac{2}{3} \cdot \sqrt{10} \right\rceil = 3$, $\text{gcd}(1, 2) = 1$, $\text{gcd}(2, 6) = 2$.</p>

<p>In the second example, $\left\lceil \frac{2}{3} \cdot \sqrt{22} \right\rceil = 4$, $\text{gcd}(1, 2) = 1$, $\text{gcd}(2, 6) = 2$, $\text{gcd}(6, 15) = 3$.</p>
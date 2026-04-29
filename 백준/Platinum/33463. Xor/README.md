# [Platinum I] Xor - 33463

[문제 링크](https://www.acmicpc.net/problem/33463)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 144, 정답: 52, 맞힌 사람: 23, 정답 비율: 24.211%

### 분류

두 포인터, 비트마스킹, 정렬

### 문제 설명

<p>Fran recently learned the operation <em>xor</em>, which for two integers $x$ and $y$ returns the result by applying the bitwise exclusive or (<em>exclusive or</em>). The operation <em>xor</em>, denoted as $\oplus$, compares the corresponding bits of the numbers $x$ and $y$ and sets the result bit at each position according to the following rule:</p>

<ul>
	<li>If the bits at the corresponding position are different ($0$ and $1$, or $1$ and $0$), then the result bit is $1$.</li>
	<li>If the bits are the same ($0$ and $0$, or $1$ and $1$), then the result bit is $0$.</li>
</ul>

<p>For example, for $x = 5$ and $y = 3$, the binary representations are: $x = 101_2$, $y = 011_2$. Applying <em>xor</em> to the corresponding bits gives $x \oplus y = 101_2 \oplus 011_2 = 110_2 = 6$. In other words, $5 \oplus 3 = 6$.</p>

<p>Fran received an array of $n$ integers $a_1, a_2, \dots , a_n$ and decided to do the following:</p>

<ol>
	<li>For every pair of indices $(i, j)$ where $1 ≤ i ≤ j ≤ n$, he calculated the sum $a_i + a_j$.</li>
	<li>Now he wants to calculate the result of the <em>xor</em> of all the obtained sums.</li>
</ol>

<p>Help Fran calculate the required result.</p>

### 입력

<p>In the first line of input, there is $n$ ($1 ≤ n ≤ 5 \cdot 10^5$), the length of the array.</p>

<p>In the second line, there are $n$ numbers $a_1, a_2, \dots , a_n$ ($0 ≤ a_i &lt; 2^{30}$) as described in the problem statement.</p>

### 출력

<p>In the only line of output, print the required result.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>The sums are $2 + 2 = 4$, $2 + 4 = 6$, $2 + 5 = 7$, $4 + 4 = 8$, $4 + 5 = 9$, and $5 + 5 = 10$. The result is $4 \oplus 6 \oplus 7 \oplus 8 \oplus 9 \oplus 10 = 14$.</p>
# [Platinum V] Rikka with Composite Number - 20808

[문제 링크](https://www.acmicpc.net/problem/20808)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 17, 정답 비율: 68.000%

### 분류

애드 혹, 수학, 모듈로 곱셈 역원, 정수론, 소수 판정, 확률론, 재귀, 에라토스테네스의 체

### 문제 설명

<p>Rikka is a professional problem setter. Today, she is going to generate test cases for a problem about Composite Number.</p>

<p>To randomly generate composite numbers, Rikka starts from a non-empty subset $D$ of digits $\{1,2,\dots, 9\}$ and integer $c = 0$, and then generates in turns. In each turn:</p>

<ol>
	<li>Rikka selects a digit $d$ from $D$ uniformly at random, and then changes $c$ to $c \times 10 + d$;</li>
	<li>If $c$ has already been a composite integer, Rikka takes $c$ as the result. Otherwise, Rikka returns to Step $1$ and starts a new turn.</li>
</ol>

<p>The time cost of a generator is crucial. Therefore, Rikka wants you to calculate the expected number of the turns used by the generator to generate a composite number.</p>

<p>A positive integer $n$ is a composite integer if and only if there exists an integer $k \in [2, n - 1]$ satisfying $k$ is a factor of $n$.</p>

### 입력

<p>The first line contains a $01$-string of length $9$. The $i$-th character is $1$ if and only if digit $i$ is inside $D$.</p>

<p>The input guarantees that $D$ is not empty.</p>

### 출력

<p>Output a single integer, representing the expected number of turns.</p>

<p>The answer is guaranteed to be a rational number. You are required to output the answer module $998244353$. Formally, if the simplest fraction representation of the answer is $\frac{x}{y}$, you need to output $x \times y^{998244351} \text{ mod } 998244353$.</p>

### 힌트

<p>For the first sample, the generator must return $111$ in the third turn.</p>

<p>For the second sample, there are $3$ possibilities:</p>

<ul>
	<li>Return $4$ in the first turn, with probability $\frac{1}{2}$;</li>
	<li>Return $33$ in the second turn, with probability $\frac{1}{4}$;</li>
	<li>Return $34$ in the second turn, with probability $\frac{1}{4}$.</li>
</ul>

<p>Therefore, the expected number of turns is $\frac{3}{2}$.</p>
# [Platinum I] Gacha 101 - 30370

[문제 링크](https://www.acmicpc.net/problem/30370)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 19, 맞힌 사람: 18, 정답 비율: 81.818%

### 분류

수학, 누적 합, 확률론

### 문제 설명

<p>For each $i = 1, 2, \dots, N$, there are $A_i$ balls with $i$ written on them. These are put into a box and mixed up. The string variable $s$ consists of initially $N$ &ldquo;0&rdquo;s. Balls are taken out of the box one by one (uniformly at random and independently). When a ball with $i$ written on it is drawn, the $i$-th character of $s$ is changed to &ldquo;1&rdquo; (it remains unchanged if it was already &ldquo;1&rdquo;). Find the probability, modulo $998\,244\,353$, of having a point during this process that $s$ contains &ldquo;101&rdquo; as a contiguous substring.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$N$</p>

<p>$A_1$ $A_2$ $\dots$ $A_N$</p>
</blockquote>

<p>The first line consists of an integer $N$ between $1$ and $200\,000$, inclusive. The second line consists of $N$ positive integers $A_1, A_2, \dots , A_N$. For each $i$ ($1 \le i \le N$), $A_i$ represents the number of balls $i$ written. And they satisfy $\sum_{1 \le i \le N}{A_i} &lt; 998\,244\,353$.</p>

### 출력

<p>Output in a line the probability modulo $998\,244\,353$.</p>

### 힌트

<ul>
	<li>How to find the probability modulo $998\,244\,353$
	<ul>
		<li>It can be proved that the sought probability is always a rational number. Additionally, the constraints of this problem guarantee that if the sought probability is represented as an irreducible fraction $\frac{y}{x}$, then $x$ is not divisible by $998\,244\,353$. Here, there is a unique $0 \le z &lt; 998\,244\,353$ such that $y \equiv xz \pmod{998\,244\,353}$, so report this $z$.</li>
	</ul>
	</li>
</ul>
# [Gold I] Fiboxor - 26483

[문제 링크](https://www.acmicpc.net/problem/26483)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 4, 맞힌 사람: 4, 정답 비율: 16.000%

### 분류

비트마스킹, 수학, 누적 합

### 문제 설명

<p>Little Square and Little Triangle are having a fight on Valentine&rsquo;s day again! The reason of this year&rsquo;s fight? Little Square has said that the Fibonacci sequence is way prettier than the sequence of powers of two (Little Triangle&rsquo;s favorite). Recall that the Fibonacci sequence is the sequence that begins with 0 and 1, and where subsequent elements are the sum of the two previous elements:</p>

<p>$$0, 1, 1, 2, 3, 5, 8, 13, \dots$$</p>

<p>Little Triangle likes this sequence particularly because you can easily calculate the bitwise exclusive or (<code>XOR</code>) of any subarray. Thus they told Little Square that if they can successfully answer $Q$ such <code>XOR</code> subarray queries, then they will accept the fact that Fibonacci is better. Little Triangle isn&rsquo;t cruel though, so they agreed to let Little Square tell them only the value of the subarray <code>XOR</code> modulo $2^k$ each query, due to the fact that the Fibonacci sequence grows exponentially.</p>

<p>In the end, Little Square has to answer $Q$ queries, each of which contains three integers $k$, $l$, $r$. This query asks us to calculate the <code>XOR</code> of the Fibonacci numbers with indexes in the interval $[l, r]$ inclusive, indexed from $0$, modulo $2^k$.</p>

<p>Little Square asks for your help in order to win this argument, so they can go back at having a good time on Valentine&rsquo;s day.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; Q &le; 10^6$</li>
	<li>$0 &le; l &le; r &le; 10^{18}$</li>
	<li>$1 &le; k &le; 20$</li>
</ul>

### 힌트

<p>Let $a &oplus; b$ denote the <code>XOR</code> of $a$ and $b$.</p>

<p>In the first query, $0 &oplus; 1 &oplus; 1 &oplus; 2 \mod 2^2 = 2 \mod 4 = 2$.</p>

<p>In the second query, $3 &oplus; 5 &oplus; 8 \mod 2^4 = 14 \mod 16 = 14$.</p>
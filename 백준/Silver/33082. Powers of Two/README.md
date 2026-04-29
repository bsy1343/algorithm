# [Silver I] Powers of Two - 33082

[문제 링크](https://www.acmicpc.net/problem/33082)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 32, 맞힌 사람: 21, 정답 비율: 87.500%

### 분류

구현, 수학

### 문제 설명

<p>Adrian has learned addition and subtraction from Morgan and is now ready to learn a new concept, the powers of two. Powers of two are integers in the form of $2^x$, where $x ≥ 0$. Some examples of powers of two are $1, 2, 4, 8, \dots$.</p>

<p>To ensure Adrian understands this new concept, Morgan prepares a challenge for him. At first, Adrian is given an integer $N = 0$. Then, Morgan will give him $Q$ queries. Each query can be one of the following types:</p>

<ul>
	<li><code>+</code> $x$, which will add the value of $N$ by $2^x$, or</li>
	<li><code>-</code> $x$, which will subtract the value of $N$ by $2^x$.</li>
</ul>

<p>Adrian is instructed to clap his hands whenever $N$ becomes $0$ after each query.</p>

<p>Adrian finds this challenge is very hard to follow. He asks you whether he should clap or not after each query.</p>

### 입력

<p>Input begins with an integer $Q$ ($1 ≤ Q ≤ 200\, 000$) representing the number of queries. Each of the next $Q$ lines contains a character and an integer $T$ $x$ ($T ∈ \{$<code>+</code>, <code>-</code>$\}$; $0 ≤ x ≤ 200\, 000$) representing the query.</p>

### 출력

<p>After each query, output <code>YES</code> in a single line if the value of $N$ becomes $0$, or output <code>NO</code> otherwise.</p>
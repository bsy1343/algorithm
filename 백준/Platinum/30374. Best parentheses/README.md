# [Platinum IV] Best parentheses - 30374

[문제 링크](https://www.acmicpc.net/problem/30374)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 94, 정답: 45, 맞힌 사람: 37, 정답 비율: 49.333%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>A string consisting only of parentheses &lsquo;<code>(</code>&lsquo; and &lsquo;<code>)</code>&rsquo; is called <em>balanced</em> if it satisfies one of the following conditions.</p>

<ul>
	<li>It is an empty string.</li>
	<li>It is a concatenation of two non-empty balanced strings.</li>
	<li>It is a concatenation of &lsquo;<code>(</code>&lsquo;, $a$, and &lsquo;<code>)</code>&rsquo;, for some balanced string $a$.</li>
</ul>

<p>You are given $n$ characters $s_1, \dots , s_n$ of parentheses and $n$ integers $c_1, \dots , c_n$. Then, you have to choose zero or more integers $t_1, \dots ,t_k$ so that they satisfy the following conditions.</p>

<ul>
	<li>$1 \le t_1 &lt; t_2 &lt; t_3 &lt; \dots &lt; t_k \le n$.</li>
	<li>The concatenation of $s_{t_1}, s_{t_2}, \dots , s_{t_k}$ is a balanced string.</li>
</ul>

<p>Note that the above conditions are always satisfied if you choose zero integers.</p>

<p>Your task is to maximize $\sum_{i=1}^{k}{c_{t_i}}$.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$</p>

<p>$s_1 s_2 \cdots s_n$</p>

<p>$c_1$ $c_2$ $\cdots$ $c_n$</p>
</blockquote>

<p>The first line consists of an integer $n$ ($1 \le n \le 300\,000$). The second line consists of $n$ characters $s_1 s_2 \cdots s_n$, each of which is either &lsquo;<code>(</code>&lsquo; or &lsquo;<code>)</code>&rsquo;. The third line consists of $n$ integers $c_1$ $c_2$ $\cdots$ $c_n$ ($|c_i| \le 10^9$).</p>

### 출력

<p>Output in a line the maximum possible value of $\sum_{i=1}^{k}{c_{t_i}}$ by choosing zero or more integers $t_1, \dots ,t_k$.</p>
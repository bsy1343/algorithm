# [Platinum I] Balanced Sequence - 18978

[문제 링크](https://www.acmicpc.net/problem/18978)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 73, 정답: 27, 맞힌 사람: 21, 정답 비율: 42.000%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>Chiaki has $n$ strings $s_1,s_2,\dots,s_n$ consisting of &#39;<code>(</code>&#39; and &#39;<code>)</code>&#39;. A string of this type is said to be <em>balanced</em>:</p>

<ul>
	<li>if it is the empty string</li>
	<li>if $A$ and $B$ are balanced, $AB$ is balanced,</li>
	<li>if $A$ is balanced, $(A)$ is balanced.</li>
</ul>

<p>Chiaki can reorder the strings and then concatenate them get a new string $t$. Let $f(t)$ be the length of the longest balanced subsequence (not necessary continuous) of $t$. Chiaki would like to know the maximum value of $f(t)$ for all possible $t$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^5$) -- the number of strings.</p>

<p>Each of the next $n$ lines contains a string $s_i$ ($1 \le |s_i| \le 10^5$) consisting of &#39;<code>(</code>&#39; and &#39;<code>)</code>&#39;.</p>

<p>It is guaranteed that the sum of all $|s_i|$ does not exceeds $5 \times 10^6$.</p>

### 출력

<p>For each test case, output an integer denoting the answer.</p>
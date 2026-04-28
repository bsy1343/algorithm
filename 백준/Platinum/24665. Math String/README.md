# [Platinum IV] Math String - 24665

[문제 링크](https://www.acmicpc.net/problem/24665)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 17, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

조합론, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 런타임 전의 전처리

### 문제 설명

<p>Consider a string $S$ of length $N$ composed of 11 characters: &#39;<code>1</code>&#39;, &#39;<code>2</code>&#39;, &#39;<code>3</code>&#39;, &#39;<code>4</code>&#39;, &#39;<code>5</code>&#39;, &#39;<code>6</code>&#39;, &#39;<code>7</code>&#39;, &#39;<code>8</code>&#39;, &#39;<code>9</code>&#39;, &#39;<code>+</code>&#39;, &#39;<code>*</code>&#39;.</p>

<p>We will call string $S$ a <em>math string</em> if:</p>

<ul>
	<li>The first and last characters of $S$ are neither &#39;<code>+</code>&#39; nor &#39;<code>*</code>&#39;.</li>
	<li>When two consecutive characters are taken from $S$, at least one of them is neither &#39;<code>+</code>&#39; nor &#39;<code>*</code>&#39;.</li>
</ul>

<p>Each math string can be treated as an arithmetic expression with integers in decimal notation using ordinary arithmetic operations, where multiplication takes precedence over addition. For each such expression, its value can be calculated: for example, the value of math string &quot;<code>35+2*6</code>&quot; is $47$. Please find the sum of the values of all math strings of the given length $N$, modulo $998\,244\,353$.</p>

### 입력

<p>The input contains one integer $N$ ($1 \le N \le 10^{18}$).</p>

### 출력

<p>Print one integer: the answer to the problem.</p>

### 힌트

<p>In the Example 1, there are only 9 distinct one-digit math strings: the digits from &#39;<code>1</code>&#39; to &#39;<code>9</code>&#39;. The sum of those digits, treated as arithmetic expressions, is equal to $45$.</p>
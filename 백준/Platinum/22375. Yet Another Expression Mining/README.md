# [Platinum IV] Yet Another Expression Mining - 22375

[문제 링크](https://www.acmicpc.net/problem/22375)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

문자열, 파싱, 중간에서 만나기

### 문제 설명

<p>You are given an integer $A$ and a string $S$ which consists of the following 10 characters: an addition operator &#39;<code>+</code>&#39;, a digit &#39;<code>1</code>&#39;, &#39;<code>2</code>&#39;, ... , &#39;<code>9</code>&#39;.</p>

<p>Count the number of subsequences of $S$ which satisfy the following conditions.</p>

<ul>
	<li>The subsequence is not empty.</li>
	<li>The first letter of the subsequence is not &#39;<code>+</code>&#39;.</li>
	<li>The last letter of the subsequence is not &#39;<code>+</code>&#39;.</li>
	<li>&#39;<code>+</code>&#39; does not appear consecutively in the subsequence.</li>
	<li>Reading the subsequence as a mathematical expression, its evaluation result is $A$.</li>
</ul>

<p>Note that a subsequence is a sequence that can be obtained from the given sequence by removing zero or more elements without changing the order of the remaining elements.</p>

<p>Two subsequences are considered different if the set of removed elements&#39; indices are different.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<blockquote>
<p>$S$</p>

<p>$A$</p>
</blockquote>

<p>The first line contains a single string $S$ ($1 \le |S| \le 36$). Each character of $S$ is either &#39;<code>+</code>&#39;, or a digit between &#39;<code>1</code>&#39; and &#39;<code>9</code>&#39;. The second line contains a single integer $A$ ($1 \le A \le 10^{18}$).</p>

### 출력

<p>Output the number of subsequences which satisfy the given conditions in a single line.</p>
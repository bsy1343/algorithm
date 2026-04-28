# [Gold I] zagrade - 3214

[문제 링크](https://www.acmicpc.net/problem/3214)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

자료 구조, 스택, 덱

### 문제 설명

<p>Lets observe sequences made only of round and square brackets, i.e. characters &#39;<code>()[]</code>&#39;.</p>

<p>A sequence of brackets is regular if it satisfies this inductive definition:</p>

<ol>
	<li>&#39;<code>()</code>&#39; and &#39;<code>[]</code>&#39; are regular sequences</li>
	<li>If <code>A</code> is regular, then <code>(A)</code> and <code>[A]</code> are regular sequences</li>
	<li>If <code>A</code> and <code>B</code> are regular, then <code>AB</code> is regular sequence</li>
</ol>

<p>For example &#39;<code>()()[]</code>&#39;, &#39;<code>([])[()]</code>&#39; and &#39;<code>[(())][]</code>&#39; are regular, while &#39;<code>(</code>&#39;, &#39;<code>][</code>&#39;, &#39;<code>[(]</code>&#39; and &#39;<code>([)]</code>&#39; are not regular.</p>

<p>The sequence of brackets is given.</p>

<p>In every step, one bracket is inserted at the beginning or at the end of the sequence (round or square, left or right).</p>

<p>Write a program that will, after each step, determine the length of the shortest regular subsequence of consecutive characters that contains the bracket added in that step.&nbsp;</p>

### 입력

<p>First line contains initial sequence of brackets, whose length is at most 100,000 characters.</p>

<p>Next line contains integer N, 1 &le; N &le; 100,000, a number of steps.</p>

<p>In each of next N lines there are integer A and character C, separated by a single space. If A is zero (0), than character C is inserted at the beginning, and if A is one (1) then C is inserted at the end.</p>

### 출력

<p>In each of N lines, you should write the length of subsequence after that step. If there is no such subsequence, write number 0.</p>
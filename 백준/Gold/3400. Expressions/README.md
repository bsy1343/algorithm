# [Gold IV] Expressions - 3400

[문제 링크](https://www.acmicpc.net/problem/3400)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 22, 맞힌 사람: 21, 정답 비율: 52.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Let X be the smallest set defined as follows</p>

<ul>
	<li>an empty string belongs to X,</li>
	<li>if A, B belong to X then both, (A) and AB, belong to X.</li>
</ul>

<p>The elements of X are called correctly built parenthesis expressions. The following strings are correctly built parenthesis expressions:</p>

<pre>
()(())()
(()(()))</pre>

<p>The expressions below are not correctly built parenthesis expressions:</p>

<pre>
(()))(()
())(()</pre>

<p>Let E be a correctly built parenthesis expression. The length of E is the number of single parenthesis in E. The depth D(E) of E is defined as follows:</p>

<pre>
      &lceil; 0                  if E is empty
D(E)= | D(A)+1             if E = (A), and A is in X
      &lfloor; max(D(A),D(B))     if E = AB, and A, B are in X </pre>

<p>What is the number of correctly built parenthesis expressions of length n and depth d, for given positive integers n and d?</p>

<p>Write a program which</p>

<ul>
	<li>reads two integers n and d from the input;</li>
	<li>computes the number of correctly built parenthesis expressions of length n and depth d;</li>
	<li>writes the result into the output.</li>
</ul>

### 입력

<p>The only line of the input contains two integers n and d separated by a single space character, 2 &le; n &le; 38, 1 &le; d &le; 19.</p>

### 출력

<p>The only line of the output should contain a single integer - the number of correctly built parenthesis expressions of length n and depth d.</p>

### 힌트

<p>There are exactly three correctly built parenthesis expressions of length 6 and depth 2:</p>

<pre>
(())()
()(())
(()())</pre>
# [Gold V] Privileged Cows - 6130

[문제 링크](https://www.acmicpc.net/problem/6130)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 195, 정답: 81, 맞힌 사람: 71, 정답 비율: 47.333%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>Depending on their milk output, each of the N (1 &lt;= N &lt;= 1,000) cows is assigned a &#39;privilege number&#39; of 1, 2, or 3 that dictates whether they get to drink water at the well earlier (privilege number 1) or later. The cows, of course, never remember their privilege numbers until Farmer John admonishes them.</p>

<p>Thus, the cows are lined up in some order and must re-align themselves so that all the privilege number 1&#39;s are together at the front of the line, 2&#39;s follow, and 3&#39;s are together at the end of the line.</p>

<p>Cows, as we are so often reminded, are lazy. &nbsp;What is the minimum number of exchanges that can take place to sort the cows properly?</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer that is the privilege number of the cow at place i in line</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of exchanges required to order the cows properly</li>
</ul>

### 힌트

<p>Here is one way:</p>

<pre>
2   2   2&lt; 1   1
2&lt; 1   1   1   1
1&lt; 2   2   2   2
3   3&lt; 2   2   2 
3   3   3   3&lt; 2
3   3   3   3   3
2   2&lt; 3   3   3
3   3   3   3   3
1   1   1&lt; 2&lt; 3</pre>
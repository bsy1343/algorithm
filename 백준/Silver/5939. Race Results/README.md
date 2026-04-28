# [Silver V] Race Results - 5939

[문제 링크](https://www.acmicpc.net/problem/5939)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 943, 정답: 658, 맞힌 사람: 546, 정답 비율: 69.027%

### 분류

구현, 정렬

### 문제 설명

<p>The herd has run its first marathon! &nbsp;The N (1 &lt;= N &lt;= 5,000) times have been posted in the form of Hours (0 &lt;= Hours &lt;= 99), Minutes (0 &lt;= Minutes &lt;= 59), and Seconds (0 &lt;= Seconds &lt;= 59). Bessie must sort them (by Hours, Minutes, and Seconds) into ascending order, smallest times first.</p>

<p>Consider a simple example with times from a smaller herd of just 3 cows (note that cows do not run 26.2 miles so very quickly):</p>

<pre>
    11:20:20
    11:15:12
    14:20:14</pre>

<p>The proper sorting result is:</p>

<pre>
    11:15:12
    11:20:20
    14:20:14</pre>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains cow i&#39;s time as three space-separated integers: Hours, Minutes, Seconds</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Each line contains a cow&#39;s time as three space-separated integers</li>
</ul>

<p>&nbsp;</p>
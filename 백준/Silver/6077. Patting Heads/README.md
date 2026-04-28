# [Silver II] Patting Heads - 6077

[문제 링크](https://www.acmicpc.net/problem/6077)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 50, 맞힌 사람: 46, 정답 비율: 70.769%

### 분류

구현, 수학, 정수론

### 문제 설명

<p>It&#39;s Bessie&#39;s birthday and time for party games! Bessie has instructed the N (1 &lt;= N &lt;= 100,000) cows conveniently numbered 1..N to sit in a circle (so that cow i [except at the ends] sits next to cows i-1 and i+1; cow N sits next to cow 1). Meanwhile, Farmer John fills a barrel with one billion slips of paper, each containing some integer in the range 1..1,000,000.</p>

<p>Each cow i then draws a number A_i (1 &lt;= A_i &lt;= 1,000,000) (which is not necessarily unique, of course) from the giant barrel. &nbsp;Taking turns, each cow i then takes a walk around the circle and pats the heads of all other cows j such that her number A_i is exactly divisible by cow j&#39;s number A_j; she then sits again back in her original position.</p>

<p>The cows would like you to help them determine, for each cow, the number of other cows she should pat.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: A_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: On line i, print a single integer that is the number of other cows patted by cow i.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The first cow pats the second and third cows; the second cows pats no cows; etc.</p>

<p>&nbsp;</p>
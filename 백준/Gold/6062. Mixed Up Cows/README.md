# [Gold I] Mixed Up Cows - 6062

[문제 링크](https://www.acmicpc.net/problem/6062)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 117, 정답: 74, 맞힌 사람: 63, 정답 비율: 62.376%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Each of Farmer John&#39;s N (4 &lt;= N &lt;= 16) cows has a unique serial number S_i (1 &lt;= S_i &lt;= 25,000). The cows are so proud of it that each one now wears her number in a gangsta manner engraved in large letters on a gold plate hung around her ample bovine neck.</p>

<p>Gangsta cows are rebellious and line up to be milked in an order called &#39;Mixed Up&#39;. A cow order is &#39;Mixed Up&#39; if the sequence of serial numbers formed by their milking line is such that the serial numbers of every pair of consecutive cows in line differs by more than K (1 &lt;= K &lt;= 3400). For example, if N = 6 and K = 1 then 1, 3, 5, 2, 6, 4 is a &#39;Mixed Up&#39; lineup but 1, 3, 6, 5, 2, 4 is not (since the consecutive numbers 5 and 6 differ by 1).</p>

<p>How many different ways can N cows be Mixed Up?</p>

<p>For your first 10 submissions, you will be provided with the results of running your program on a part of the actual test data.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer that is the serial number of cow i: S_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of ways that N cows can be &#39;Mixed Up&#39;. The answer is guaranteed to fit in a 64 bit integer.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The 2 possible Mixed Up arrangements are:</p>

<pre>
3 1 4 2
2 4 1 3</pre>
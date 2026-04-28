# [Platinum V] The Baric Bovine - 6083

[문제 링크](https://www.acmicpc.net/problem/6083)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 10, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Following up on a journal article about increasing milk production, Bessie has become the Baric Bovine by studying atmospheric pressure in order to curry favor with Farmer John.</p>

<p>She takes N (1 &lt;= N &lt;= 100) measurements conveniently named M_1 through M_N during the day (1 &lt;= M_i &lt;= 1,000,000); these measurements are numbered in the order in which Bessie observed them.</p>

<p>In order to characterize the day&#39;s atmospheric pressure readings, she is interested in finding a subset of the measurements (given by the K (1 &lt;= K &lt;= N) indices s_j where 1 &lt;= s_1 &lt; s_2 &lt; ... &lt; s_K &lt;= N) that accurately reflects the entire set, i.e., limits the error as described below.</p>

<p>In any subset of measurements, an error is incurred for each measurement (1) before the first member of the subset, (2) between two consecutive measurements in the subset, and (3) after the last member of the subset. The total error value for a given set of s_j values is the sum of each of the individual errors.</p>

<p>Specifically, for all measurements whose index i is not one of the s_j values:</p>

<p>if i is less than s_1, then the sample error is:</p>

<pre>
             2 * | M_i - M_(s_1) | </pre>

<p>if i is between s_j and s_(j+1), then the sample error is</p>

<pre>
            | 2 * M_i - Sum(s_j, s_(j+1)) |  
  where Sum(x, y) = M_x + M_y;</pre>

<p>if i is greater than s_K, then the sample error is</p>

<pre>
             2 * | M_i - M_(s_K) |</pre>

<p>Given a maximum error value E (1 &lt;= E &lt;= 1,000,000), determine the size of the smallest subset of measurements that produces an error of at most E.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and E</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: M_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: Two space-separated integers: the size of the smallest subset of measurements that produces an error of at most E and the least possible error for the subset of that size.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Choosing the second and fourth measurements is the best option, giving an error of 17. The first term&#39;s error is 2*|10-3| = 14; the third term&#39;s error is |2*20 - (3+40)| = 3.</p>

<p>&nbsp;</p>
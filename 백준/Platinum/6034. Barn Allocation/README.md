# [Platinum III] Barn Allocation - 6034

[문제 링크](https://www.acmicpc.net/problem/6034)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 16, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Farmer John recently opened up a new barn and is now accepting stall allocation requests from the cows since some of the stalls have a better view of the pastures.</p>

<p>The barn comprises N (1 &lt;= N &lt;= 100,000) stalls conveniently numbered 1..N; stall i has capacity C_i cows (1 &lt;= C_i &lt;= 100,000). Cow i may request a contiguous interval of stalls (A_i, B_i) in which to roam (1 &lt;= A_i &lt;= N; A_i &lt;= B_i &lt;= N), i.e., the cow would like to wander among all the stalls in the range A_i..B_i (and the stalls must always have the capacity for her to wander).</p>

<p>Given M (1 &lt;= M &lt;= 100,000) stall requests, determine the maximum number of them that can be satisfied without exceeding stall capacities.</p>

<p>Consider both a barn with 5 stalls that have the capacities shown and a set cow requests:</p>

<pre>
Stall id:    1   2   3   4   5
           +---+---+---+---+---+
Capacity:  | 1 | 3 | 2 | 1 | 3 |  
           +---+---+---+---+---+
Cow 1       XXXXXXXXXXX             (1, 3)
Cow 2           XXXXXXXXXXXXXXX     (2, 5)
Cow 3           XXXXXXX             (2, 3)
Cow 4                   XXXXXXX     (4, 5)</pre>

<p>FJ can&#39;t satisfy all four cows, since there are too many requests for stalls 3 and 4.</p>

<p>Noting that Cow 2 requests an interval that includes stalls 3 and 4, we test the hypothesis that cows 1, 3, and 4 can have their requested stalls. No capacity is exceeded, so the answer for this set of data is 3 -- three cows (1, 3, and 4) can have their requests satisfied.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: C_i</li>
	<li>Lines N+2..N+M+1: Line i+N+1 contains two integers: A_i and B_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The maximum number of requests that can be satisfied</li>
</ul>

<p>&nbsp;</p>
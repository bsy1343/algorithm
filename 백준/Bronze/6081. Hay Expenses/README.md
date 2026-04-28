# [Bronze II] Hay Expenses - 6081

[문제 링크](https://www.acmicpc.net/problem/6081)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 370, 정답: 312, 맞힌 사람: 261, 정답 비율: 90.941%

### 분류

구현

### 문제 설명

<p>Every day Farmer John feeds the cows a lavish meal of premium gourmet hay. He then records the number of bales on the next line of his expense notebook.</p>

<p>When tax time comes, FJ realizes that he neglected to record the dates for the hay feedings. He must calculate a number of different totals of successive hay feedings in order to solve the puzzle of which feedings went with which month of expenses.</p>

<p>FJ has created a dataset with N (4 &lt;= N &lt;= 500) days conveniently numbered 1..N of hay bale counts H_i (1 &lt;= H_i &lt;= 1,000). He has an additional Q (1 &lt;= Q &lt;= 500) queries -- each query is a pair of integers S_j and E_j (1 &lt;= S_j &lt;= E_j &lt;= N) that denote that start and end indices of some hay bale counts. &nbsp;Your job is to sum the hay bale counts for the days S_j..E_j (inclusive) and report one sum for each query.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and Q</li>
	<li>Lines 2..N+1: Line i+1 contains a single hay bale count for day i: H_i</li>
	<li>Lines N+2..N+Q+1: Line j+N+1 describes query j with a pair of integers: S_j and E_j</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..Q: Line j of the output file contains a single integer that is the sum of the hay bale counts for days S_j through E_j</li>
</ul>

<p>&nbsp;</p>

### 힌트

<pre>
Days:      1 2  3  4 
Counts:    5 8 12  6

query 1..3:  5 + 8 + 12 = 25
query 2..4:  8 + 12 + 6 = 26</pre>
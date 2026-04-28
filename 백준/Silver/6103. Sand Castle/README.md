# [Silver I] Sand Castle - 6103

[문제 링크](https://www.acmicpc.net/problem/6103)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 49, 맞힌 사람: 47, 정답 비율: 85.455%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Farmer John has built a sand castle! Like all good castles, the walls have crennelations, that nifty pattern of embrasures (gaps) and merlons (filled spaces); see the diagram below. The N (1 &lt;= N &lt;= 25,000) merlons of his castle wall are conveniently numbered 1..N; merlon i has height M_i (1 &lt;= M_i &lt;= 100,000); his merlons often have varying heights, unlike so many.</p>

<p>He wishes to modify the castle design in the following fashion: he has a list of numbers B_1 through B_N (1 &lt;= B_i &lt;= 100,000), and wants to change the merlon heights to those heights B_1, ..., B_N in some order (not necessarily the order given or any other order derived from the data).</p>

<p>To do this, he has hired some bovine craftsmen to raise and lower the merlons&#39; heights. Craftsmen, of course, cost a lot of money. In particular, they charge FJ a total X (1 &lt;= X &lt;= 100) money per unit height added and Y (1 &lt;= Y &lt;= 100) money per unit height reduced.</p>

<p>FJ would like to know the cheapest possible cost of modifying his sand castle if he picks the best permutation of heights. The answer is guaranteed to fit within a 32-bit signed integer.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, X, and Y</li>
	<li>Lines 2..N+1: Line i+1 contains the two space-separated integers: M_i and B_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, the minimum cost needed to rebuild the castle</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>FJ reduces the first merlon&#39;s height by 1, for a cost of 5 (yielding merlons of heights 2, 1, and 1). He then adds one unit of height to the second merlon for a cost of 6 (yielding merlons of heights 2, 2, and 1).</p>

<p>&nbsp;</p>
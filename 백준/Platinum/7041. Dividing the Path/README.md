# [Platinum IV] Dividing the Path - 7041

[문제 링크](https://www.acmicpc.net/problem/7041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 107, 정답: 42, 맞힌 사람: 32, 정답 비율: 34.783%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 다이나믹 프로그래밍, 슬라이딩 윈도우

### 문제 설명

<p>Farmer John&#39;s cows have discovered that the clover growing along the ridge of the hill in his field is particularly good. To keep the clover watered, Farmer John is installing water sprinklers along the ridge of the hill.&nbsp;</p>

<p>To make installation easier, each sprinkler head must be installed along the ridge of the hill (which we can think of as a one-dimensional number line of length L (1 &lt;= L &lt;= 1,000,000); L is even).&nbsp;</p>

<p>Each sprinkler waters the ground along the ridge for some distance in both directions. Each spray radius is an integer in the range A..B (1 &lt;= A &lt;= B &lt;= 1000). Farmer John needs to water the entire ridge in a manner that covers each location on the ridge by exactly one sprinkler head. Furthermore, FJ will not water past the end of the ridge in either direction.&nbsp;</p>

<p>Each of Farmer John&#39;s N (1 &lt;= N &lt;= 1000) cows has a range of clover that she particularly likes (these ranges might overlap). The ranges are defined by a closed interval (S,E). Each of the cow&#39;s preferred ranges must be watered by a single sprinkler, which might or might not spray beyond the given range.&nbsp;</p>

<p>Find the minimum number of sprinklers required to water the entire ridge without overlap.&nbsp;</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and L&nbsp;</li>
	<li>Line 2: Two space-separated integers: A and B&nbsp;</li>
	<li>Lines 3..N+2: Each line contains two integers, S and E (0 &lt;= S &lt; E &lt;= L) specifying the start end location respectively of a range preferred by some cow. Locations are given as distance from the start of the ridge and so are in the range 0..L.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of sprinklers required. If it is not possible to design a sprinkler head configuration for Farmer John, output -1.</li>
</ul>

### 힌트

<p>&nbsp;</p>

<p>Three sprinklers are required: one at 1 with spray distance 1, and one at 4 with spray distance 2, and one at 7 with spray distance 1. The second sprinkler waters all the clover of the range like by the second cow (3-6). The last sprinkler waters all the clover of the range liked by the first cow (6-7). Here&#39;s a diagram:&nbsp;</p>

<pre>
                 |-----c2----|-c1|       cows&#39; preferred ranges

     |---1---|-------2-------|---3---|   sprinklers

     +---+---+---+---+---+---+---+---+

     0   1   2   3   4   5   6   7   8
</pre>
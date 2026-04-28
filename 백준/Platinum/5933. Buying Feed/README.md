# [Platinum I] Buying Feed - 5933

[문제 링크](https://www.acmicpc.net/problem/5933)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 29, 맞힌 사람: 24, 정답 비율: 54.545%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 다이나믹 프로그래밍, 덱을 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John needs to travel to town to pick up K (1 &lt;= K &lt;= 10,000) pounds of feed. Driving a mile with K pounds of feed costs FJ K*K cents; driving D miles with K pounds of feed in his truck costs FJ D*K*K cents.</p>

<p>FJ can purchase feed from any of N (1 &lt;= N &lt;= 500) stores (conveniently numbered 1..N) that sell feed. Each store is located on a segment of the X axis whose length is E (1 &lt;= E &lt;= 500) miles. Store i is at location X_i (0 &lt; X_i &lt; E) on the number line and can sell FJ as much as F_i (1 &lt;= F_i &lt;= 10,000) pounds of feed at a cost of C_i (1 &lt;= C_i &lt;= 10,000,000) cents per pound. Surprisingly, a given point on the X axis might have more than one store.</p>

<p>FJ starts driving at location 0 on this number line and can drive only in the positive direction, ultimately arriving at location E with at least K pounds of feed. He can stop at any of the feed stores along the way and buy any amount of feed up to the the store&#39;s limit.</p>

<p>What is the minimum amount FJ must pay to buy and transport the K pounds of feed? FJ knows he can purchase enough feed.</p>

<p>Consider this example where FJ needs two pounds of feed which he must purchase from some of the three stores at locations 1, 3, and 4 on a number line whose range is 0..5:</p>

<pre>
      0   1   2   3   4   5  X
      +---|---+---|---|---+
          1       1   1      Available pounds of feed
          1       2   2      Cents per pound</pre>

<p>It is most economical for FJ to buy one pound of feed from both the second and third stores. He must pay two cents to buy each pound of feed for a total cost of 4. FJ&#39;s driving from location 0 to location 3 costs nothing, since he is carrying no feed. When FJ travels from 3 to 4 he moves 1 mile with 1 pound of feed, so he must pay 1*1*1 = 1 cents.</p>

<p>When FJ travels from 4 to 5 he moves one mile with 2 pounds of feed, so he must pay 1*2*2 = 4 cents.</p>

<p>His feed cost is 2 + 2 cents; his travel cost is 1 + 4 cents. The total cost is 2 + 2 + 1 + 4 = 9 cents.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: K, E, and N</li>
	<li>Lines 2..N+1: Line i+1 contains three space-separated integers: X_i, F_i, and C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum cost for FJ to buy and transport the feed</li>
</ul>

<p>&nbsp;</p>
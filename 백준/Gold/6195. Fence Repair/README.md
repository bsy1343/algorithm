# [Gold IV] Fence Repair - 6195

[문제 링크](https://www.acmicpc.net/problem/6195)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 719, 정답: 410, 맞힌 사람: 363, 정답 비율: 58.080%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Farmer John wants to repair a small length of the fence around the pasture. He measures the fence and finds that he needs N (1 &lt;= N &lt;= 20,000) planks of wood, each having some integer length Li (1 &lt;= Li &lt;= 50,000) units. He then purchases a single long board just long enough to saw into the N planks (i.e., whose length is the sum of the lengths Li). FJ is ignoring the &quot;kerf&quot;, the extra length lost to sawdust when a sawcut is made; you should ignore it, too.</p>

<p>FJ sadly realizes that he doesn&#39;t own a saw with which to cut the wood, so he mosies over to Farmer Don&#39;s Farm with this long board and politely asks if he may borrow a saw.</p>

<p>Farmer Don, a closet capitalist, doesn&#39;t lend FJ a saw but instead offers to charge Farmer John for each of the N-1 cuts in the plank. The charge to cut a piece of wood is exactly equal to its length. Cutting a plank of length 21 costs 21 cents.</p>

<p>Farmer Don then lets Farmer John decide the order and locations to cut the plank. Help Farmer John determine the minimum amount of money he can spend to create the N planks. FJ knows that he can cut the board in various different orders which will result in different charges since the resulting intermediate planks are of different lengths.</p>

### 입력

<ul>
	<li>Line 1: One integer N, the number of planks</li>
	<li>Lines 2..N+1: Each line contains a single integer describing the length of a needed plank</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: One integer: the minimum amount of money he must spend to make N-1 cuts</li>
</ul>

### 힌트

<p>The original board measures 8+5+8=21. The first cut will cost 21, and should be used to cut the board into pieces measuring 13 and 8. The second cut will cost 13, and should be used to cut the 13 into 8 and 5. This would cost 21+13=34. If the 21 was cut into 16 and 5 instead, the second cut would cost 16 for a total of 37 (which is more than 34).</p>
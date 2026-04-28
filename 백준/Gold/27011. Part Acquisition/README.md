# [Gold IV] Part Acquisition - 27011

[문제 링크](https://www.acmicpc.net/problem/27011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 20, 맞힌 사람: 18, 정답 비율: 40.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 역추적

### 문제 설명

<p>The cows have been sent on a mission through space to acquire a new milking machine for their barn. They are flying through a cluster of stars containing N (1 &le; N &le; 50,000) planets, each with a trading post.</p>

<p>The cows have determined which of K (1 &le; K &le; 1,000) types of objects (numbered 1..K) each planet in the cluster desires, and which products they have to trade. No planet has developed currency, so they work under the barter system: all trades consist of each party trading exactly one object (presumably of different types).</p>

<p>The cows start from Earth with a canister of high quality hay (item 1), and they desire a new milking machine (item K). Help them find the best way to make a series of trades at the planets in the cluster to get item K. If this task is impossible, output -1.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and K.</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers, a_i and b_i respectively, that are planet i&#39;s trading trading products. The planet will give item b_i in order to receive item a_i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: One more than the minimum number of trades to get the milking machine which is item K (or -1 if the cows cannot obtain item K).</li>
	<li>Lines 2..T+1: The ordered list of the objects that the cows possess in the sequence of trades.</li>
</ul>

### 힌트

<p>The cows possess 4 objects in total: first they trade object 1 for object 3, then object 3 for object 2, then object 2 for object 5.</p>
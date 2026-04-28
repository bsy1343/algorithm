# [Silver I] Yogurt factory - 27007

[문제 링크](https://www.acmicpc.net/problem/27007)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 62, 맞힌 사람: 57, 정답 비율: 90.476%

### 분류

그리디 알고리즘

### 문제 설명

<p>The cows have purchased a yogurt factory that makes world-famous Yucky Yogurt. Over the next N (1 &le; N &le; 10,000) weeks, the price of milk and labor will fluctuate weekly such that it will cost the company C_i (1 &le; C_i &le; 5,000) cents to produce one unit of yogurt in week i. Yucky&#39;s factory, being well-designed, can produce arbitrarily many units of yogurt each week.</p>

<p>Yucky Yogurt owns a warehouse that can store unused yogurt at a constant fee of S (1 &le; S &le; 100) cents per unit of yogurt per week. Fortuitously, yogurt does not spoil. Yucky Yogurt&#39;s warehouse is enormous, so it can hold arbitrarily many units of yogurt.</p>

<p>Yucky wants to find a way to make weekly deliveries of Y_i (0 &le; Y_i &le; 10,000) units of yogurt to its clientele (Y_i is the delivery quantity in week i). Help Yucky minimize its costs over the entire N-week period. Yogurt produced in week i, as well as any yogurt already in storage, can be used to meet Yucky&#39;s demand for that week.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and S.</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers: C_i and Y_i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: Line 1 contains a single integer: the minimum total cost to satisfy the yogurt schedule. Note that the total might be too large for a 32-bit integer.</li>
</ul>

### 힌트

<p>In week 1, produce 200 units of yogurt and deliver all of it. In week 2, produce 700 units: deliver 400 units while storing 300 units. In week 3, deliver the 300 units that were stored. In week 4, produce and deliver 500 units.</p>
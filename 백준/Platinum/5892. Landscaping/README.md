# [Platinum IV] Landscaping - 5892

[문제 링크](https://www.acmicpc.net/problem/5892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 221, 정답: 91, 맞힌 사람: 72, 정답 비율: 41.860%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Farmer John is building a nicely-landscaped garden, and needs to move a large amount of dirt in the process.</p>

<p>The garden consists of a sequence of N flowerbeds (1 &lt;= N &lt;= 100), where flowerbed i initially contains A_i units of dirt. Farmer John would like to re-landscape the garden so that each flowerbed i instead contains B_i units of dirt. The A_i&#39;s and B_i&#39;s are all integers in the range 0..10.</p>

<p>To landscape the garden, Farmer John has several options: he can purchase one unit of dirt and place it in a flowerbed of his choice for \$X. He can remove one unit of dirt from a flowerbed of his choice and have it shipped away for \$Y. He can also transport one unit of dirt from flowerbed i to flowerbed j at a cost of \$Z times |i-j|. Please compute the minimum total cost for Farmer John to complete his landscaping project.</p>

### 입력

<ul>
	<li>Line 1: Space-separated integers N, X, Y, and Z (0 &lt;= X, Y, Z &lt;= 1000).</li>
	<li>Lines 2..1+N: Line i+1 contains the space-separated integers A_i and B_i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer giving the minimum cost for Farmer John&#39;s landscaping project.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>There are 4 flowerbeds in a row, initially with 1, 2, 3, and 4 units of dirt. Farmer John wishes to transform them so they have 4, 3, 2, and 0 units of dirt, respectively. The costs for adding, removing, and transporting dirt are 100, 200, and 1.</p>

<h4>Output Details</h4>

<p>One unit of dirt must be removed (from flowerbed #4), at a cost of 200. The remaining dirt can be moved at a cost of 10 (3 units from flowerbed #4 to flowerbed #1, 1 unit from flowerbed #3 to flowerbed #2).</p>
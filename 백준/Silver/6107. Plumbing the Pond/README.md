# [Silver V] Plumbing the Pond - 6107

[문제 링크](https://www.acmicpc.net/problem/6107)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 164, 정답: 103, 맞힌 사람: 94, 정답 비율: 66.197%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Bessie&#39;s drinks water from a pond in the northwest part of the farm. It has an interesting bottom in that it is full of little hills and valleys. She wonders how deep it is.</p>

<p>She trolls across the pond in her little boat with a very old radar set that tends to have spurious readings. She knows the deepest part is relatively flat and has decided that she&#39;ll believe the largest depth number only if it is verified by the fact that the same depth appears in an adjacent reading.</p>

<p>The pond is modeled as an R x C (1 &lt;= R &lt;= 50; 1 &lt;= C &lt;= 50) grid of (positive integer) depth readings D_rc (0 &lt;= D_rc &lt;= 1,000,000); some readings might be 0 -- those are not part of the pond. A depth reading of 10 means &quot;depth of 10&quot;.</p>

<p>Find the greatest depth that appears in at least two &#39;adjacent&#39; readings (where &#39;adjacent&#39; means in any of the potentially eight squares that border a square on each of its sides and its diagonals). She knows the pond has at least one pair of positive, adjacent readings.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: R and C</li>
	<li>Lines 2..R+1: Line i+1 contains C space-separated integers that represent the depth of the pond across row i: D_rc</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the depth of the pond determined by following Bessie&#39;s rules.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Even though 5 is the deepest reading Bessie gets, and the number 2 occurs twice, 1 is the largest number that occurs in two adjacent cells.</p>

<p>&nbsp;</p>
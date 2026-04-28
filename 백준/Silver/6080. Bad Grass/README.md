# [Silver II] Bad Grass - 6080

[문제 링크](https://www.acmicpc.net/problem/6080)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 638, 정답: 345, 맞힌 사람: 293, 정답 비율: 61.169%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Bessie was munching on tender shoots of grass and, as cows do, contemplating the state of the universe. She noticed that she only enjoys the grass on the wide expanses of pasture whose elevation is at the base level of the farm. Grass from elevations just 1 meter higher is tougher and not so appetizing. The bad grass gets worse as the elevation increases.</p>

<p>Continuing to chew, she realized that this unappetizing food grows the sides of hills that form a set of &#39;islands&#39; of bad grass among the sea of tender, verdant, delicious, abundant grass.</p>

<p>Bessie donned her lab coat and vowed to determine just how many islands of bad grass her pasture had. She created a map in which she divided the pasture into R (1 &lt; R &lt;= 1,000) rows and C (1 &lt; C &lt;= 1,000) columns of 1 meter x 1 meter squares. She measured the elevation above the base level for each square and rounded it to a non-negative integer. She noted hungrily that the tasty grass all had elevation 0.</p>

<p>She commenced counting the islands. If two squares are neighbors in any of the horizontal, vertical or diagonal directions then they are considered to be part of the same island.</p>

<p>How many islands of bad grass did she count for each of the supplied maps?</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: R and C</li>
	<li>Lines 2..R+1: Line i+1 describes row i of the map with C space separated integers</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that specifies the number of islands.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>There are two islands. The big one on the left side that extends all the way to the bottom through a diagonal and the small one on the upper-right corner.</p>

<p>&nbsp;</p>
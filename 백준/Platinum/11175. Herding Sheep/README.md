# [Platinum III] Herding Sheep - 11175

[문제 링크](https://www.acmicpc.net/problem/11175)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 11, 정답 비율: 32.353%

### 분류

그래프 이론, 이분 탐색, 최대 유량

### 문제 설명

<p>Elly and her herd of sheep are in trouble again. After a long day of grazing it is time to bring them into the barns in order to be safe for the night. The size of the barns is limited - each barn can accommodate at most K sheep. Some of the barns might not be entirely filled; they can even remain completely empty. It is only important that each sheep is in a barn.</p>

<p>For simplicity the sheep can be represented as N points and the barns as M points with integer coordinates on the plane. It is possible that several sheep, several barns or several sheep and barns share the same coordinates.</p>

<p>Elly&rsquo;s sheep walk a unit of distance per second. Thus, if for example one of them is at position (0, 0) and wants to go to a barn at (1, 3) it will need approximately 3.16227766 seconds to arrive at its destination. If the barn was at coordinates (3, 4) instead, the animal would need exactly 5 seconds to get there.</p>

<p>Help Elly by calculating the minimal time needed for all sheep to get into barns. The sheep can move simultaneously and you can assume that they do not disturb each other&rsquo;s movement.</p>

### 입력

<p>The first line of the input consists of a single integer, T, the number of test cases.</p>

<p>Each test case begins with three integers, N, M, and K &ndash; the number of sheep, the number of barns, and the maximum number of sheep in a barn, respectively.</p>

<p>After that follows N lines, each with two integers, X and Y , giving the x and y coordinates of a sheep.</p>

<p>Finally comes M lines, each with two integers, X and Y , giving the x and y coordinates of a barn.</p>

<ul>
	<li>1 &le; T &le; 20</li>
	<li>1 &le; N, M, K &le; 200</li>
	<li>&minus;1000 &le; X, Y &le; 1000</li>
	<li>N &le; M &middot; K</li>
</ul>

### 출력

<p>For each test case, output the minimum time needed to get all sheep into barns, such that there are at most K sheep in any given barn. The answer should have a maximum relative or absolute error of at most 10<sup>&minus;6</sup>.</p>
# [Silver III] The Bale Tower - 6221

[문제 링크](https://www.acmicpc.net/problem/6221)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 536, 정답: 286, 맞힌 사람: 237, 정답 비율: 55.634%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 정렬, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Always bored with cud-chewing, the cows have invented a new game. One cow retrieves a set of N (3 &lt;= N &lt;= 20) hay bales from the shed each of which is one unit high. Each bale also has some unique width and unique breadth.</p>

<p>A second cow tries to choose a set of bales to make the tallest stack of bales in which each bale can be placed only on a bale whose own width and breadth are smaller than the width and breadth of the bale below. Bales can not be rotated to interchange the width and breadth.</p>

<p>Help the cows determine the highest achievable tower that can be legally built form a set of bales.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Each line describes a bale with two space-separated integers,respectively the width and breadth</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The height of the tallest possible tower that can legally be built from the bales.</li>
</ul>

### 힌트

<p>These bales can be stacked for a total height of 5:</p>

<pre>
10 12
9 11
8 10
6 9
5 3</pre>

<p>another stacking exists, too</p>
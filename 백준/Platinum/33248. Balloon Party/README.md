# [Platinum V] Balloon Party - 33248

[문제 링크](https://www.acmicpc.net/problem/33248)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 우선순위 큐, 자료 구조

### 문제 설명

<p>The Floating Poodle Company (FPC) is planning on selling balloon animals on festivals. To make these animals float, they are going to fill them with helium. Since they have run out of helium canisters, they are going to store their helium below the ceilings of the party tents from which they sell the balloons.</p>

<p>Because of environmental laws, they are not allowed to spill any helium. This means that they must be careful not to put too much of it into any of the party tents, since if the helium level drops below any part of the edges of the ceiling, this surplus of helium will be blown away and contaminate the atmosphere. They have asked you to calculate the maximum amount of helium they can fit inside one of the tents.</p>

### 입력

<ul>
	<li>One line with two integers: $ 1 \leq w \leq 1000 $ and $ 1 \leq l \leq 1000 $: the width and length of the tent.</li>
	<li>$ l $ lines, each with $ w $ integers in the range $[1, 1000]$. Each of these integers describes the height above the ground of a $1 \times 1$ section of tent ceiling. For this assignment, assume that every one of these sections is completely horizontal.</li>
</ul>

### 출력

<p>The maximum amount of helium that the company can fit below the ceiling of the tent.</p>
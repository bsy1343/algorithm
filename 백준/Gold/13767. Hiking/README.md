# [Gold I] Hiking - 13767

[문제 링크](https://www.acmicpc.net/problem/13767)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

그래프 이론, 최단 경로, 격자 그래프, 플로이드–워셜

### 문제 설명

<p>Alice likes to hike. She likes some bits of track and dislikes others. A cost function will model her distaste for (or liking of) all available track sections. Given a map with the costs of going from one location to the next, find the average cost for a hike in that area.</p>

<p>The map is a rectangular grid of cells. Each cell has information about the cost of going from it to each of its northern, western, southern and eastern neighbours. A hike is a finite sequence of steps each of which goes from a cell to one of its neighbours. The cost of a hike is the sum of the costs of its steps.</p>

<p>When Alice hikes from a given start point to a given end point, she always chooses a minimal cost hike. Determine the average cost of such minimal-cost hikes taken over all possible start and end cells. The start and end cells of a hike must be different. Each pair of start and end cells counts just once towards the average even if there are several minimal-cost hikes between the two cells.</p>

### 입력

<p>The input will contain a single test case.</p>

<p>The first line contains two integers w and h specifying the width and the height of the map (2 &le; w, h &le; 50). Each of the following h lines contains w integers n<sub>ij</sub> (1 &le; i &le; h and 1 &le; j &le; w and &minus;10<sup>7 </sup>&le; n<sub>ij</sub> &le; 10<sup>7</sup> ) specifying the cost of going from cell (i, j) one step to its northern neighbour (i &minus; 1, j). Then follow three blocks of h lines each, similarly specifying costs for the western, southern and eastern neighbours in this order.</p>

<p>It is not permitted to walk off the map; the corresponding costs will be 0. A minimal-cost hike will exist between any two cells.</p>

### 출력

<p>Display the smallest integer that is greater than or equal to the average cost of minimal-cost hikes among all pairs of distinct start and end cells.</p>
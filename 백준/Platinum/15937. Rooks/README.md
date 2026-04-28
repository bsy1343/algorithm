# [Platinum II] Rooks - 15937

[문제 링크](https://www.acmicpc.net/problem/15937)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 12, 맞힌 사람: 11, 정답 비율: 37.931%

### 분류

이분 매칭

### 문제 설명

<p>Consider a square board with N rows (called ranks) and N columns (called files). K of the squares are blocked by obstacles. Pieces similar to the rooks in chess are placed on this board. Two rooks are said to be attacking each other if they are on the same rank or file and there are no obstacles between them.</p>

<p>Given a positive integer N and the positions of the K obstacles, place as many rooks as possible on the board so that no two rooks attack each other.</p>

### 입력

<p>The first line of the input contains N and K, separated by a space. Each of the following K lines contain a pair of numbers r and f, separated by a space describing the rank and file of an obstacle. All the obstacles are distinct.</p>

### 출력

<p>The first line of the output must contain a single number S, the highest number of non-attacking rooks that the table can accommodate. Each of the following S lines must contain a pair of numbers r and f, separated by a space, showing the rank and file of a rook. Any correct placement of S rooks will be accepted.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1,000</li>
	<li>1 &le; K &le; min(N<sup>2</sup>, 2,000)</li>
	<li>Ranks and files are numbered from 1 to N.</li>
</ul>
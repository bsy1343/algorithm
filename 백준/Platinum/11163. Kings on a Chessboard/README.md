# [Platinum I] Kings on a Chessboard - 11163

[문제 링크](https://www.acmicpc.net/problem/11163)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 20, 정답 비율: 60.606%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 런타임 전의 전처리

### 문제 설명

<p>You are given a chessboard of size x &times; y and k identical kings, and are asked to place all the kings on the board such that no two kings can attack each other. Two kings can attack each other if they are horizontally, vertically or diagonally adjacent.</p>

<p>Write a computer program that calculates the number of possible arrangements of the k kings on the given chessboard. Since the number of feasible arrangements may be large, reduce the number modulo 1,000,000,007.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each of the following T lines consists of three integers x, y and k, separated by one space.</p>

<ul>
	<li>0 &lt; T &le; 50</li>
	<li>2 &le; x, y &le; 15</li>
	<li>1 &le; k &le; x &middot; y</li>
</ul>

### 출력

<p>For each test case, output the number of possibilities modulo 1,000,000,007.</p>
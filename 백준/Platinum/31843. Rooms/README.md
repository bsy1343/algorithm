# [Platinum II] Rooms - 31843

[문제 링크](https://www.acmicpc.net/problem/31843)

### 성능 요약

시간 제한: 3.5 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 25, 맞힌 사람: 13, 정답 비율: 38.235%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 애드 혹, 누적 합, 분리 집합

### 문제 설명

<p>You are given a matrix with $N$ rows and $M$ columns which contains lowercase letters of the English alphabet.</p>

<p>A <strong>room</strong> is a maximal component of cells which share the same letter and which are connected in $4$ directions: up, down, left, right.</p>

<p>You have to answer queries of the type: <em>&quot;How many rooms are completely or partly included in a given rectangular submatrix?&quot;</em>.</p>

### 입력

<p>The first line contains two integers $N$ and $M$.</p>

<p>Each of the following $N$ lines contains $M$ lowercase letters.</p>

<p>On the following line there is an integer $Q$ indicating the number of queries.</p>

<p>The next $Q$ lines contain $4$ integers $x_1$, $y_2$, $x_2$, $y_2$, denoting a rectangle formed by the diagonally opposite points of coordinates $(x_1,y_1)$ and $(x_2,y_2)$.</p>

### 출력

<p>You should output $Q$ lines, each containing the answer for a query.</p>

### 제한

<ul>
	<li>$1&le;N,M&le;2\, 000$</li>
	<li>$1&le;Q&le;5\, 000$</li>
	<li>$1&le;x_1,x_2&le;N$</li>
	<li>$1&le;y_1,y_2&le;M$</li>
</ul>
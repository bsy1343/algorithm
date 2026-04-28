# [Platinum III] mapa - 3225

[문제 링크](https://www.acmicpc.net/problem/3225)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 167, 정답: 112, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

자료 구조, 이분 탐색, 스위핑, 분할 정복

### 문제 설명

<p>One of the biggest problems in modern cartography is writing geographic names on the map. If you write on a map the name of each city, town and a village, then some of the names will overlap and the map will become unreadable.</p>

<p>You are given a coordinates of all the points in a Cartesian plane, which are to be marked. The area in which you should write the name is the rectangle which has sides paralel to the axes, and the width is exactly three times the height.</p>

<p>For each point there has to be exactly one rectangle, so that the point which it marks is in his top left corner (i.e. the area for the name has to be bottom-right from the point). Areas for all names must have same dimensions.</p>

<p>Write a program which will find the maximum size of the area for the name, after every point is marked and no two areas for the names overlap (they can touch by an edge or a vertex).</p>

<p>All the coordinates of the given points will be positive integers less than or equal to 1,000,000 (one million). It is allowed for parts of rectangles to leave that area (i.e. some parts of rectangles might exceed the given limit).&nbsp;</p>

### 입력

<p>In the first line, there will be an integer N (number of points on the map), 2 &le; N &le; 100,000.</p>

<p>In the next N lines there will be two integers X and Y, 0 &le; X, Y &le; 1,000,000, coordinates of points. No two points will have the same coordinates.</p>

### 출력

<p>In the first and only line of output you should write the height of rectangle, real decimal number rounded to two decimal places.</p>

<p>Your output value must be within 0.01 absolute error of the correct value.</p>
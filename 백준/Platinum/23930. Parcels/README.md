# [Platinum V] Parcels - 23930

[문제 링크](https://www.acmicpc.net/problem/23930)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 18, 맞힌 사람: 18, 정답 비율: 66.667%

### 분류

너비 우선 탐색, 이분 탐색, 기하학, 그래프 이론, 그래프 탐색, 매개 변수 탐색

### 문제 설명

<p>You have been hired recently as the Chief Decision Maker (CDM) at a famous parcel delivery company, congratulations! Customers love speedy deliveries of their parcels and you have decided to decrease the time it takes to deliver parcels around the world to win customers. You have introduced this idea to the authorities and they have allocated you enough budget to build at most one new delivery office.</p>

<p>The world can be divided into an&nbsp;<b>R</b>&nbsp;&times;&nbsp;<b>C</b>&nbsp;grid of squares. Each square either contains a delivery office or it does not. You may pick a grid square that does not already contain a delivery office and build a new delivery office there.</p>

<p>The delivery time of a parcel to a square is 0 if that square contains a delivery office. Otherwise, it is defined as the minimum Manhattan distance between that square and any other square containing a delivery office. The overall delivery time is the maximum of delivery times of all the squares. What is the minimum overall delivery time you can obtain by building at most one new delivery office?</p>

<p>Note: The&nbsp;<a href="https://en.wikipedia.org/wiki/Taxicab_geometry">Manhattan distance</a>&nbsp;between two squares (r1,c1) and (r2,c2) is defined as |r1 - r2| + |c1 - c2|, where |*| operator denotes the absolute value.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains the number of rows&nbsp;<b>R</b>&nbsp;and number of columns&nbsp;<b>C</b>&nbsp;of the grid. Each of the next&nbsp;<b>R</b>&nbsp;lines contains a string of&nbsp;<b>C</b>&nbsp;characters chosen from the set {<code>0</code>,&nbsp;<code>1</code>}, where&nbsp;<code>0</code>&nbsp;denotes the absence of a delivery office and&nbsp;<code>1</code>&nbsp;denotes the presence of a delivery office in the square.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum overall delivery time you can obtain after adding at most one additional delivery office.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>There is at least one delivery office in the initial grid.</li>
</ul>

### 힌트

<p>In Sample Case #1, you get a minimum overall delivery time of 1 by building a new delivery office in any one of the five squares without a delivery office.</p>

<p>In Sample Case #2, all the squares already have a delivery office and so the minimum overall delivery time is 0. Note you have to add&nbsp;<b>at most</b>&nbsp;one delivery office.</p>

<p>In Sample Case #3, to get a minimum overall delivery time of 2, you can build a new delivery office in any of these squares: (2, 3), (3, 2), (3, 3), (3, 4), or (4, 3). Any other possibility results in a higher overall delivery time than 2.</p>
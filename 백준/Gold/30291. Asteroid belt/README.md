# [Gold I] Asteroid belt - 30291

[문제 링크](https://www.acmicpc.net/problem/30291)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 정렬, 너비 우선 탐색, 스위핑

### 문제 설명

<p>Everyone thinks Prienai Way asteroid belt is filled with asteroids, but Lukas has a map with empty parts of the belt shown on it. In the map, asteroid belt is divided into M &times; N squares, each of which is either empty or full of asteroids.</p>

<p>Lukas wants to fly through the asteroid field. Naturally, he can only fly through empty squares.</p>

<p>Lukas&rsquo;s spaceship can fly horizontally as long as needed, but it uses fuel to fly vertically &ndash; 1 fuel unit per each square passed vertically. Lukas&rsquo;s destination is a planet in square (X<sub>2</sub>, Y<sub>2</sub>).</p>

<p>Figure out the smallest amount of fuel Lukas will need to consume to reach the destination.</p>

### 입력

<p>There are two numbers on the first line: asteroid field length M and height N. Lukas&rsquo;s starting coordinates X<sub>1</sub> and Y<sub>1</sub>, and the destination planet coordinates X<sub>2</sub> ir Y<sub>2</sub> are presented on the second line. The third line contains a single integer K &ndash; the number of empty regions.</p>

<p>Each of the following K lines consist of three natural numbers: h<sub>i</sub>, a<sub>i</sub>, b<sub>i</sub>, meaning that in h<sub>i</sub>-th row of the asteroid belt squares from a<sub>i</sub> to b<sub>i</sub> inclusively are free.</p>

<p>Both the starting point and the destination belongs to one of the K empty regions. No pair of empty regions that are on the same row touch or cross.</p>

### 출력

<p>Output one integer &ndash; lowest possible amount of fuel needed to reach the destination. If it is impossible to reach the destination, output -1.</p>

### 제한

<ul>
	<li>1 &le; X<sub>1</sub>, X<sub>2</sub> &le; M</li>
	<li>1 &le; Y<sub>1</sub>, Y<sub>2</sub> &le; N, 1 &le; ai &le; bi &le; M</li>
	<li>1 &le; h<sub>i</sub> &le; N.</li>
</ul>
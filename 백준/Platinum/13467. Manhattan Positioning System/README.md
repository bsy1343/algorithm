# [Platinum III] Manhattan Positioning System - 13467

[문제 링크](https://www.acmicpc.net/problem/13467)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 41, 맞힌 사람: 39, 정답 비율: 37.864%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>The Manhattan Positioning System (MPS) is a modern&nbsp;variant of GPS, optimized for use in large cities.&nbsp;MPS assumes all positions are discrete points on a regular&nbsp;two-dimensional grid. Within MPS, a position is&nbsp;represented by a pair of integers (X,Y ).</p>

<p>To determine its position, an MPS receiver first measures&nbsp;its distance to a number of beacons. Beacons have&nbsp;known, fixed locations. MPS signals propagate only&nbsp;along the X and Y axes through the streets of the city,&nbsp;not diagonally through building blocks. When an MPS&nbsp;receiver at (X<sub>R</sub>,Y<sub>R</sub>) measures its distance to a beacon&nbsp;at (X<sub>B</sub>,Y<sub>B</sub>), it thus obtains the Manhattan distance:&nbsp;|X<sub>R</sub> &minus; X<sub>B</sub>| + |Y<sub>R</sub> &minus; Y<sub>B</sub>|.</p>

<p>Given the positions of a number of beacons and the&nbsp;Manhattan-distances between the receiver and each&nbsp;beacon, determine the position of the receiver. Note&nbsp;that the receiver must be at an integer grid position&nbsp;(MPS does not yet support fractional coordinates).</p>

### 입력

<p>The first line contains an integer N, the number of beacons (1 &le; N &le; 1000). Then follow N lines, each containing three integers, X<sub>i</sub>, Y<sub>i</sub>, and D<sub>i</sub>, such that &minus;10<sup>6</sup> &le; X<sub>i</sub>, Y<sub>i</sub> &le; 10<sup>6</sup> and 0 &le; D<sub>i</sub> &le; 4&middot;10<sup>6</sup>. The pair (X<sub>i</sub>, Y<sub>i</sub>) denotes the position of beacon i, while Di is the Manhattan distance between receiver and beacon i.</p>

<p>No two beacons have the same position.</p>

### 출력

<p>If there is exactly one receiver position consistent with the input, write one line with two&nbsp;integers, X<sub>R</sub> and Y<sub>R</sub>, the position of the receiver.</p>

<p>If multiple receiver positions are consistent with the input, write one line with the word&nbsp;&ldquo;uncertain&rdquo;.</p>

<p>If no receiver position is consistent with the input, write one line with the word &ldquo;impossible&rdquo;.</p>
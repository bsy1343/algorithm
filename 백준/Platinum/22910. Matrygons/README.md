# [Platinum IV] Matrygons - 22910

[문제 링크](https://www.acmicpc.net/problem/22910)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 80, 정답: 53, 맞힌 사람: 48, 정답 비율: 72.727%

### 분류

다이나믹 프로그래밍, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>A <a href="https://en.wikipedia.org/wiki/Matryoshka_doll" target="_blank">matryoshka</a> is a type of doll that originated in Russia over a century ago. Their defining characteristic is that they consist of a set of dolls, all of a different size, with smaller dolls fitting nicely inside larger dolls.</p>

<p>In this problem, we work with matrygons, which are sets of <a href="https://en.wikipedia.org/wiki/Regular_polygon#Regular_convex_polygons" target="_blank">regular convex polygons</a> that follow a similar nesting pattern. A matrygon consists of a set of regular convex polygons with positive area p<sub>1</sub>, p<sub>2</sub>, &hellip;, p<sub>k</sub> such that, for all i, the vertices of p<sub>i+1</sub> overlap with a proper subset of the vertices of p<sub>i</sub> (p<sub>i+1</sub> has strictly less vertices than p<sub>i</sub>).</p>

<p>For example, the following pictures illustrates two matrygons. The first one contains 3 regular convex polygons: a regular icositetragon (24 sides), a regular hexagon (6 sides), and an equilateral triangle (3 sides). The second one contains 2 regular convex polygons: a regular icosidigon (22 sides) and a regular hendecagon (11 sides). Each of these matrygons has 33 total sides among all polygons in it.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/20b43845-0fc9-4b72-a1b1-a5442bab96e0/-/preview/" style="width: 289px; height: 294px;" /><img alt="" src="https://upload.acmicpc.net/9425f2f9-3ad7-4bfa-af1e-19368e0ee619/-/preview/" style="width: 298px; height: 293px;" /></p>

<p>Given a fixed total number of sides N, calculate the largest number of polygons that can be part of a matrygon such that the total number of sides among all polygons in it is exactly N.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow. Each line represents a test case and contains a single integer N, the target total number of sides.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where x is the test case number (starting from 1) and y is the maximum number of polygons in a matrygon such that the total number of sides among all polygons in it is exactly N.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>

### 힌트

<p>The first matrygon pictured in the problem statement is an optimal solution for Sample Case #1.</p>

<p>In Sample Case #2, we can get to two polygons by fitting a regular pentagon (5 sides) inside a regular decagon (10 sides).</p>

<p>In Sample Case #3, there is no way to create a matrygon with multiple regular polygons, so our only option is to use a single regular tetracontahenagon (41 sides).</p>
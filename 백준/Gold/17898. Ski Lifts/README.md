# [Gold III] Ski Lifts - 17898

[문제 링크](https://www.acmicpc.net/problem/17898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 18, 맞힌 사람: 16, 정답 비율: 45.714%

### 분류

그리디 알고리즘

### 문제 설명

<p>Last winter, an avalanche swept away all the ski lifts from the ski resort Valen. Instead of rebuilding the lifts like they were before, the plan is to do it in a more optimized way, and you are responsible for this.</p>

<p>The only thing remaining from the old lift system are n pylons situated at integer coordinates in the plane. You would like to put lifts in the form of line segments between some of these pylons. The line segments must satisfy the following constraints:</p>

<ol>
	<li>A line segment can only go between pylons (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) if |y<sub>1</sub> &minus; y<sub>2</sub>| = 1.</li>
	<li>There are two types of pylons, one-way and two-way pylons. The one-way pylons can be connected to at most one other pylon, and the two-way pylons can be connected to at most two other pylons. However, if a two-way pylon i is connected to two other pylons, then they must be on opposite sides of i in the y-direction. In other words, the two pylons connected to i must have different y-coordinates.</li>
	<li>Two line segments may not intersect (except that the two line segments incident on a two-way pylon may touch at their endpoints).</li>
</ol>

<p>What is the maximum number of ski lifts (line segments) you can place under these constraints?</p>

### 입력

<p>The first line contains one integer n (1 &le; n &le; 10<sup>5</sup>). Each of the following n lines contains three integers x, y, and a, the coordinates and type of a pylon (0 &le; x, y &le; 10<sup>5</sup>; a = 1 for a one-way pylon and a = 2 for a two-way pylon). All the pylons are situated at different coordinates.</p>

### 출력

<p>Output the maximum number of ski lift line segments that can be placed.</p>
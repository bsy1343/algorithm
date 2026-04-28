# [Gold I] Extended Manhattan Distance - 4724

[문제 링크](https://www.acmicpc.net/problem/4724)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 기하학, 많은 조건 분기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4724.%E2%80%85Extended%E2%80%85Manhattan%E2%80%85Distance/827e9d42.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4724.%E2%80%85Extended%E2%80%85Manhattan%E2%80%85Distance/827e9d42.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4724/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:314px; width:281px" />The streets in Manhattan form a grid. If the grid is aligned such that the grid lines are parallel to the x- and y-coordinate axes, the distance one needs to walk or drive from one point to the other, assuming you can only move along streets and cannot take short cuts through buildings, equals ∆x + ∆y. This is called the Manhattan distance.</p>

<p>Now assume that the land outside the city grid is completely flat with no obstacles that prevent moving anywhere. Suppose we want to move from point A to point B where these points can be on the grid or outside the grid. When traveling outside the city, the shortest distance between the two points in this case will not necessarily be the Manhattan distance. It will be the Manhattan distance if the two points are both on the grid. If both points are, for example, north of the grid, the shortest distance between the two points will be the straight-line (Euclidean) distance between them. In other cases, calculating the distance may be more complicated.</p>

<p>In this problem, two opposite corners of the city grid will be specified. It will be assumed that the grid lines are parallel to the coordinate axes, and that the distance between any two consecutive grid lines, horizontal and vertical, is 1 unit. Two points A and B on the plane with integer coordinates will also be specified. Write a program to calculate the shortest distance between the two points, given that we can only move along the grid lines (i.e. in the city streets) within the city grid.</p>

### 입력

<p>Input will consist of multiple datasets. Each dataset will consist of a single line with eight integers, as follows:</p>

<p style="text-align:center">x<sub>L</sub> y<sub>L</sub> x<sub>U</sub> y<sub>U</sub> x<sub>A</sub> y<sub>A</sub> x<sub>B</sub> y<sub>B</sub></p>

<p>describing the points L, U, A, and B. L and U are the lower-left corner and the upper-right corner of the city grid, respectively. A and B are the two points between which we wish to travel.</p>

<p>All input integers will be in the range from -1000 to 1000 (inclusive), with x<sub>L</sub> &lt; x<sub>u</sub> and y<sub>L</sub> &lt; y<sub>U</sub> . End of data will be signified by a line with eight zeros.</p>

### 출력

<p>For each data set, print one line containing the distance of the shortest path between the A and B, printed to to three decimal places of precision.</p>
# [Platinum V] Polyline Simplification - 15275

[문제 링크](https://www.acmicpc.net/problem/15275)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 20, 맞힌 사람: 20, 정답 비율: 32.787%

### 분류

자료 구조, 기하학, 구현, 시뮬레이션, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Mapping applications often represent the boundaries of countries, cities, etc. as polylines, which are connected sequences of line segments. Since fine details have to be shown when the user zooms into the map, these polylines often contain a very large number of segments. When the user zooms out, however, these fine details are not important and it is wasteful to process and draw the polylines with so many segments. In this problem, we consider a particular polyline simplification algorithm designed to approximate the original polyline with a polyline with fewer segments.</p>

<p>A polyline with n segments is described by n + 1 points p<sub>0</sub> = (x<sub>0</sub>, y<sub>0</sub>), . . . , p<sub>n</sub> = (x<sub>n</sub>, y<sub>n</sub>), with the ith line segment being p<sub>i&minus;1</sub>&minus;p<sub>i</sub>. The polyline can be simplified by removing an interior point p<sub>i</sub> (1 &le; i &le; n &minus; 1), so that the line segments p<sub>i&minus;1</sub>&minus;p<sub>i</sub> and p<sub>i</sub>&minus;p<sub>i+1</sub> are replaced by the line segment p<sub>i&minus;1</sub>&minus;p<sub>i+1</sub>. To select the point to be removed, we examine the area of the triangle formed by p<sub>i&minus;1</sub>, p<sub>i</sub>, and p<sub>i+1</sub> (the area is 0 if the three points are colinear), and choose the point p<sub>i</sub> such that the area of the triangle is smallest. Ties are broken by choosing the point with the lowest index. This can be applied again to the resulting polyline, until the desired number m of line segments is reached.</p>

<p>Consider the example below.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15275/1.png" style="height:283px; width:412px" /></p>

<p>The original polyline is shown at the top. The area of the triangle formed by p<sub>2</sub>, p<sub>3</sub>, and p<sub>4</sub> is considered (middle), and p<sub>3</sub> is removed if the area is the smallest among all such triangles. The resulting polyline after p<sub>3</sub> is removed is shown at the bottom.</p>

### 입력

<p>The first line of input contains two integers n (2 &le; n &le; 200 000) and m (1 &le; m &lt; n). The next n + 1 lines specify p<sub>0</sub>, . . . , p<sub>n</sub>. Each point is given by its x and y coordinates which are integers between &minus;5000 and 5000 inclusive. You may assume that the given points are strictly increasing in lexicographical order. That is, x<sub>i</sub> &lt; x<sub>i+1</sub>, or x<sub>i</sub> = x<sub>i+1</sub> and y<sub>i</sub> &lt; y<sub>i+1</sub> for all 0 &le; i &lt; n.</p>

### 출력

<p>Print on the kth line the index of the point removed in the kth step of the algorithm described above (use the index in the original polyline).</p>
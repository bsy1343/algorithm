# [Platinum IV] Hiking in the Hills - 10379

[문제 링크](https://www.acmicpc.net/problem/10379)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 84, 정답: 15, 맞힌 사람: 13, 정답 비율: 26.531%

### 분류

자료 구조, 기하학, 그래프 이론, 우선순위 큐

### 문제 설명

<p>Helen is hiking with her friends in a highland. Their plan is to hike from their camp A to a beautiful showplace B.</p>

<p>Unfortunately, Helen started feeling dizzy due to altitude sickness. Help her group find a route such that the topmost height on that route is as small as possible.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10379.%E2%80%85Hiking%E2%80%85in%E2%80%85the%E2%80%85Hills/c7aeb2b3.png" data-original-src="https://www.acmicpc.net/upload/images2/hiking.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:279px; width:426px" /></p>

<p style="text-align:center">&nbsp;</p>

### 입력

<p>The input file contains full information about the landscape of a square region 10<sup>6</sup> &times; 10<sup>6</sup> in the following format. The first line contains integer n &mdash; the number of triangles in the landscape (2 &le; n &le; 2000). Each of following n lines contains nine integers x<sub>i1</sub>, y<sub>i1</sub>, z<sub>i1</sub>, x<sub>i2</sub>, y<sub>i2</sub>, z<sub>i2</sub>, x<sub>i3</sub>, y<sub>i3</sub>, z<sub>i3</sub> &mdash; coordinates of a triangle. All coordinates belong to the closed interval [0, 10<sup>6</sup>]. The two last lines contain three integers each: x<sub>A</sub>, y<sub>A</sub>, z<sub>A</sub> and x<sub>B</sub>, y<sub>B</sub>, z<sub>B</sub> &mdash; coordinates of the camp A and the showplace B.</p>

<p>The given triangles are guaranteed to describe a consistent continuous landscape. Projections of triangles onto XY plane are non-degenerate and fill the square without overlapping. A vertex of one triangle never lays inside an edge of another triangle. Points A and B belong to the landscape surface and are different.</p>

### 출력

<p>Output a polyline route from A to B with the smallest possible topmost height. The first line should contain m, the number of vertices in this polyline. Each of following m lines should contain three integer coordinates of a polyline vertex: x<sub>i</sub>, y<sub>i</sub>, and z<sub>i</sub>. Vertices must be listed along the polyline, from A to B (including these two endpoints).</p>

<p>All coordinates of polyline vertices should be integer. Each polyline edge must belong to some triangle from the input file (possibly, to its edge). The number of vertices in the polyline must not exceed 5n.</p>
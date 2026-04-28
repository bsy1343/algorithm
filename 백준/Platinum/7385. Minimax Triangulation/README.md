# [Platinum IV] Minimax Triangulation - 7385

[문제 링크](https://www.acmicpc.net/problem/7385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 기하학, 선분 교차 판정, 다각형의 넓이

### 문제 설명

<p>Triangulation of surfaces has applications in the Finite Element Method of solid mechanics. The objective is to estimate the stress and strain on complex objects by partitioning them into small simple objects which are considered incompressible. It is convenient to approximate a plane surface with a simple polygon, i.e., a piecewise-linear, closed curve in the plane on m distinct vertices, which does not intersect itself. A chord is a line segment between two non-adjacent vertices of the polygon which lies entirely inside the polygon, so in particular, the endpoints of the chord are the only points of the chord that touch the boundary of the polygon. A triangulation of the polygon, is any choice of m &minus; 3 chords, such that the polygon is divided into triangles. In a triangulation, no two of the chosen chords intersect each other, except at endpoints, and all of the remaining (unchosen) chords cross at least one of the chosen chords. Fortunately, finding an arbitrary triangulation is a fairly easy task, but what if you were asked to find the best triangulation according to some measure?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7385.%E2%80%85Minimax%E2%80%85Triangulation/970168c6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7385.%E2%80%85Minimax%E2%80%85Triangulation/970168c6.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7385/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:79px; width:595px" /></p>

<p style="text-align: center;">Figure I.1: Five out of nine possible triangulations of the example polygon. The leftmost has the smallest largest triangle.</p>

### 입력

<p>On the first line of the input is a single positive integer n, telling the number of test scenarios to follow. Each scenario begins with a line containing one positive integer 2 &lt; m &lt; 50, being the number of vertices of the simple polygon. The following m lines contain the vertices of the polygon in the order they appear along the border, going either clockwise or counter clockwise, starting at an arbitrary vertex. Each vertex is described by a pair of integers x y obeying 0 &le; x &le; 10000 and 0 &le; y &le; 10000.</p>

### 출력

<p>For each scenario, output one line containing the area of the largest triangle in the triangulation of the polygon which has the smallest largest triangle. The area should be presented with one fractional decimal digit.</p>
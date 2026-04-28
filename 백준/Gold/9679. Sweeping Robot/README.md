# [Gold V] Sweeping Robot - 9679

[문제 링크](https://www.acmicpc.net/problem/9679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p>A robot equipped with a camera is to sweep some areas in a museum. The museum is a polygon with only horizontal and vertical walls as depicted in the figure. We assume that the polygon is drawn on an underlying mesh of 1x1 cells and its vertices are on the mesh vertices. The robot is also restricted to move only along the mesh edges either horizontally or vertically. Its camera sweeps everything that can be seen on the perpendicular directions of its moving path. That is, when the robot moves horizontally, its camera is directed vertically and can only see any visible items located on the north and south of the horizontal segment of the moving path. Similarly, its camera can see any visible cells located on the east and west of the vertical segment of the moving path. In the figure, a polygon and a moving path of our robot (the dashed line path) are shown. Here, the dotted squares are seen.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9679.%E2%80%85Sweeping%E2%80%85Robot/605c950f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9679/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%205.02.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:349px; width:280px" /></p>

<p>Given such a polygon and a robot-path inside it, the problem is to compute the total areas (total number of squares) seen by the robot.&nbsp;</p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing two integers n and k (2 &le; n,k &le; 100) where n is the number of walls (or vertices) of the museum and k is the number of the vertices of the robot path. The next n lines describe the museum vertices. The i<sup>th</sup> line contains 2 space-separated non-negative integers x<sub>i</sub> and&nbsp;y<sub>i</sub> not exceeding 500 denoting the x and y coordinates of the i<sup>th</sup> vertex of the museum, respectively. There is a wall between vertices i and i+1 (You may assume the (n+1)<sup>th</sup> vertex is the first vertex). The next k lines describe the vertices of the robot path in order of appearing on the path from the starting point to the ending point; each line contains&nbsp;two integers which are the x and y coordinates of a vertex. The robot path is guaranteed to be inside the museum but its vertices (not its edges) can touch the museum walls. Note that the robot path may intersect itself. The input terminates with a line containing &ldquo;0 0&rdquo; which should not be processed.</p>

### 출력

<p>For each test case, output the total area (total number of squares) seen by the given robot.</p>
# [Gold II] Fractals - 6891

[문제 링크](https://www.acmicpc.net/problem/6891)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

구현, 시뮬레이션, 재귀

### 문제 설명

<p>A fractal is a geometric shape where the pattern of the whole shape is self-replicating at each subsection of the shape. A simple &quot;block fractal&quot; is shown below. At each stage of the fractal growth, every straight line in the fractal is divided into three equal parts. The first and last sections stay straight; the middle section contains a square &quot;bump&quot; which has the same height as the width of the middle section. (You will want to consider the four orientations of a line segment within the fractal. Depending upon which line segment is currently being generated, the bump may protrude up, down, left, or right.)</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/36ad7577-1e96-4b33-aa22-b86df61a6691/-/preview/" style="width: 500px; height: 320px;" /></p>

<p>Suppose this fractal is drawn on a Cartesian plane, where $(0, 0)$ is at the bottom left corner. Assume that in the example above, the bottom left point of the fractal is at $(0, 1)$ and the bottom right point of the fractal is at $(27, 1)$. For example the top of the Level 3 fractal is a line from $(13, 14)$ to $(14, 14)$.</p>

<p>Write a program that will keep track of the integer coordinate points of the lines in a similar &quot;block fractal&quot; with its bottom left corner at $(0, 1)$. The program will accept three integers as input: the level of the fractal, the width of the fractal, and an x-coordinate. You may assume that the width of the fractal will be some power of three, and that it will be large enough so that every corner of the fractal will fall on an integer intersection in the Cartesian plane. The width will never be more than $81$. The x-coordinate, $x$, will be in the range $0$ &ndash; width (inclusive). Your program should output the y-coordinate value(s), $y$, where lines of the fractal intersect the point $(x, y)$.</p>

<p>You may draw a graphic representation of the fractal for debugging (and interest). However, test cases may ask you to define fractals that are too large to fit on a single screen.</p>

### 입력



### 출력


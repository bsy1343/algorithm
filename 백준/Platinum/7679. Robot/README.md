# [Platinum IV] Robot - 7679

[문제 링크](https://www.acmicpc.net/problem/7679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라

### 문제 설명

<p>Let (x<sub>1</sub>, y<sub>1</sub>), . . . ,(x<sub>n</sub>, y<sub>n</sub>) be a collection of n points in a two-dimensional plane. Your goal is to navigate a robot from point (x<sub>1</sub>, y<sub>1</sub>) to point (x<sub>n</sub>, y<sub>n</sub>). From any point (x<sub>i</sub>, y<sub>i</sub>), the robot may travel to any other point (x<sub>j</sub>, y<sub>j</sub>) at most R units away at a speed of 1 unit per second. Before it does this, however, the robot must turn until it faces (x<sub>j</sub>, y<sub>j</sub>); this turning occurs at a rate of 1 degree per second.</p>

<p>Compute the shortest time needed for the robot to travel from point (x<sub>1</sub>, y<sub>1</sub>) to (x<sub>n</sub>, y<sub>n</sub>). Assume that the robot initially faces (x<sub>n</sub>, y<sub>n</sub>). To prevent floating-point precision issues, you should use the double data type instead of float. It is guaranteed that the unrounded shortest time will be no more than 0.4 away from the closest integer. Also, if you decide to use inverse trigonometric functions in your solution (hint, hint!), try atan2() rather than acos() or asin().</p>

### 입력

<p>The input test file will contain multiple test cases. Each test case will begin with a single line containing an integer R, the maximum distance between points that the robot is allowed to travel (where 10 &le; R &le; 1000), and an integer n, the number of points (where 2 &le; n &le; 20). The next n lines each contain 2 integer values; here, the ith line contains x<sub>i</sub> and y<sub>i</sub> (where &minus;1000 &le; x<sub>i</sub> , y<sub>i</sub> &le; 1000). Each of the points is guaranteed to be unique. The end-of-file is denoted by a test case with R = n = &minus;1.</p>

### 출력

<p>The output test file should contain a single line per test case indicating the shortest possible time in second (rounded to the nearest integer) required for the robot to travel from (x1, y1) to (xn, yn). If no trip is possible, print &ldquo;impossible&rdquo; instead.</p>
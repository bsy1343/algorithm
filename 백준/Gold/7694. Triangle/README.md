# [Gold III] Triangle - 7694

[문제 링크](https://www.acmicpc.net/problem/7694)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 178, 정답: 96, 맞힌 사람: 82, 정답 비율: 54.667%

### 분류

수학, 기하학, 정수론, 다각형의 넓이, 픽의 정리

### 문제 설명

<p>A lattice point is an ordered pair (x, y) where x and y are both integers. Given the coordinates of the vertices of a triangle (which happen to be lattice points), you are to count the number of lattice points which lie completely inside of the triangle (points on the edges or vertices of the triangle do not count).</p>

### 입력

<p>The input test file will contain multiple test cases. Each input test case consists of six integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>, and y<sub>3</sub>, where (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), and (x<sub>3</sub>, y<sub>3</sub>) are the coordinates of vertices of the triangle. All triangles in the input will be non-degenerate (will have positive area), and &minus;15000 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>,&nbsp;y<sub>3</sub> &le; 15000. The end-of-file is marked by a test case with x<sub>1</sub> = y<sub>1</sub> = x<sub>2</sub> = y<sub>2</sub> = x<sub>3</sub> = y<sub>3</sub> = 0 and should not be processed.</p>

### 출력

<p>For each input case, the program should print the number of internal lattice points on a single line.</p>
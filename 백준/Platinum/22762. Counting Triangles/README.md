# [Platinum IV] Counting Triangles - 22762

[문제 링크](https://www.acmicpc.net/problem/22762)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 34, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

수학, 기하학, 정수론, 조합론, 포함 배제의 원리

### 문제 설명

<p>Triangles are polygons with three sides and strictly positive area. Lattice triangles are the triangles all whose vertices have integer coordinates. In this problem you have to find the number of lattice triangles in an M &times; N grid. For example in a 1 &times; 2 grid there are 18 different lattice triangles as shown in the picture below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8c03fd80-bf43-457b-9b76-82a9190879d5/-/preview/" style="width: 527px; height: 156px;" /></p>

<p style="text-align: center;">Figure 2: Lattice Triangles in a 1 &times; 2 Grid</p>

### 입력

<p>The input file contains at most 21 sets of inputs.</p>

<p>Each set of input consists of a line that contains two integers M and N (0 &lt; M, N &le; 1000). These two integers denote that you have to count triangles in an M &times; N grid.</p>

<p>The input is terminated by a case where the value of M and N are zero. This case should not be processed.</p>

### 출력

<p>For each set of input produce one line of output. This output contains the case number of output followed by the number of lattice triangles in the grid. You can assume that the number of triangles will fit in a 64-bit signed integer.</p>
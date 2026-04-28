# [Gold IV] Rectilinear polygon - 4263

[문제 링크](https://www.acmicpc.net/problem/4263)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

기하학

### 문제 설명

<p><img alt="" src="/upload/images2/rp.jpg" style="float:right; height:178px; width:308px" />Given is n points with integer coordinates in the plane. Is it is possible to construct a simple, that is non-intersecting, rectilinear polygon with the given points as vertices? In a rectilinear polygon there are at least 4 vertices and every edge is either horizontal or vertical; each vertex is an endpoint of exactly one horizontal edge and one vertical edge. There are no holes in a polygon.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of input is an integer giving the number of cases that follow. The input of each case starts with an integer 4 &le; n &le; 100000 giving the number of points for this test case. It is followed by n pairs of integers specifying the x and y coordinates of the points for this case.</p>

### 출력

<p>The output should contain one line for each case on input. Each line should contain one integer number giving the length of the rectilinear polygon passing throught the given points when it exists; otherwise, it should contain -1.</p>
# [Platinum II] vid - 3201

[문제 링크](https://www.acmicpc.net/problem/3201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

자료 구조, 세그먼트 트리, 누적 합, 값 / 좌표 압축

### 문제 설명

<p>N points are given in a plane. Any point has integer coordinates and no two points have the same x coordinates or the same y coordinates.&nbsp;</p>

<p>A pair of points A and B uniquely define a rectangle R(A,B) whose sides are parallel to coordinate axes such that the points A and B are endpoints of one of its diagonals. A pair of two given points A and B are very visible if there are no other given points within a rectangle R(A,B). A pair of points consists of two different points and in this problem pairs (A,B) and (B,A) are regarded to be the samepair and are counted as one pair.&nbsp;</p>

<p>At the beginning a coordinate plane has no given points. Your program should read coordinates of the given points from a file and after reading coordinates of a point, it should write number of pairs of currently very visible given points.&nbsp;</p>

### 입력

<p>First line of input contains an integer N, 2 &le; N &le; 5000, the number of given points.&nbsp;</p>

<p>Each of the following N lines contains two integers X, Y, 0 &le; X,Y &le; 1000000 (one million), coordinates of the given points in the order they should be added to the plane.&nbsp;</p>

### 출력

<p>An output should contain N lines, k<sup>th</sup> line should contain a number of pairs of very visible given points after taking k<sup>th</sup> given point into account.&nbsp;</p>
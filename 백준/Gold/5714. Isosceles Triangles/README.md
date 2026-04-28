# [Gold III] Isosceles Triangles - 5714

[문제 링크](https://www.acmicpc.net/problem/5714)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 18, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

자료 구조, 기하학, 집합과 맵

### 문제 설명

<p>A given triangle can be either equilateral (three sides of the same length), scalene (three sides of different lengths), or isosceles (two sides of the same length and a third side of a different length). It is a known fact that points with all integer coordinates cannot be the vertices of an equilateral triangle.</p>

<p>You are given a set of different points with integer coordinates on the XY plane, such that no three points in the set lay on the same line. Your job is to calculate how many of the possible choices of three points are the vertices of an isosceles triangle.</p>

### 입력

<p>There are several test cases. Each test case is given in several lines. The first line of each test case contains an integer N indicating the number of points in the set (3 &le; N &le; 1000). Each of the next N lines describes a different point of the set using two integers X and Y separated by a single space (1 &le; X, Y &le; 10<sup>6</sup>); these values represent the coordinates of the point on the XY plane. You may assume that within each test case no two points have the same location and no three points are collinear.</p>

<p>The last test case is followed by a line containing a single zero.</p>

### 출력

<p>For each test case output a single line with a single integer indicating the number of subsets of three points that are the vertices of an isosceles triangle.</p>
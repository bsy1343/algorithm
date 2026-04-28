# [Gold V] Close Triangles - 30219

[문제 링크](https://www.acmicpc.net/problem/30219)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 33, 맞힌 사람: 28, 정답 비율: 56.000%

### 분류

브루트포스 알고리즘, 기하학, 백트래킹, 다각형의 넓이

### 문제 설명

<p>When dealing with children, you want to divide things as evenly as possible. In particular, the child who receives the least will compare themselves to the child who receives the most, so you&rsquo;d like these two values to be as close to each other as possible.</p>

<p>Given 3n points, form n triangles (using each point exactly once) such that the difference between the largest triangle (in area) and the smallest triangle (in area) is as small as possible. That is, we want these two triangles to be as close to each other (in area) as possible.</p>

### 입력

<p>The first input line contains an integer, n (2 &le; n &le; 5), indicating the number of triangles to be formed. This is followed by 3n input lines. Each of these lines provides the x and y coordinates of a point. Assume that all of these input values are integers between 1 and 10<sup>3</sup>, inclusive. Also assume that all the points are distinct and we can form n triangles. It is also guaranteed that no triplet of the given points will be colinear.</p>

### 출력

<p>Print the difference (in area) between the largest and smallest triangles, rounded to one decimal point, e.g., 0.74 should be printed as 0.7 and 0.75 should be printed as 0.8.</p>
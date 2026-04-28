# [Platinum II] Ice Igloos - 11621

[문제 링크](https://www.acmicpc.net/problem/11621)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 249, 정답: 34, 맞힌 사람: 33, 정답 비율: 20.497%

### 분류

기하학, 구현, 수학

### 문제 설명

<p>A fishing village built on the surface of a frozen lake far north in the arctic is endangered by global warming &ndash; fractures are starting to form on the lake surface. The village consists of n igloos of spherical shape, each occupying a circular area of the surface.</p>

<p>An igloo can be represented as a circle in the coordinate plane: the center of the circle is a point with integer coordinates, while the radius is a positive floating-point number less than 1 with exactly one fractional digit.</p>

<p>Given the locations of possible ice fractures, the villagers would like to know how many igloos are affected by each. Formally, given q queries where each query is a straight line segment defined by the two endpoints, find the number of igloos each segment intersects. A segment intersects an igloo if it has at least one point in common with the interior of the circle.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100 000) - the number of igloos. Each of the following n lines contains three numbers x, y and r &ndash; the coordinates of the center and the radius of one igloo. The coordinates x and y are integers such that 1 &le; x, y &le; 500, while r is a floating-point number with exactly one fractional digit such that 0 &lt; r &lt; 1. No two igloos will intersect or touch.</p>

<p>The following line contains an integer q (1 &le; q &le; 100 000) - the number of queries. Each of the following q lines contains four integers x1, y1, x2, y2 (1 &le; x1, y1, x2, y2 &le; 500) - the coordinates of the two endpoints of the segment. The two endpoints will be different. Endpoints may be inside igloos.</p>

<p>You may assume that, for every igloo i and the segment s, the square of the distance between s and the center of i is either less than r<sup>2</sup> &minus; 10<sup>&minus;5</sup> or greater than r<sup>2</sup> + 10<sup>&minus;5</sup> where r is the radius of the igloo i.</p>

### 출력

<p>Output should consist of q lines. The k-th line should contain a single integer &ndash; the number of igloos that are intersected by the k-th segment.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11621/1.png" style="height:245px; width:325px" /></p>
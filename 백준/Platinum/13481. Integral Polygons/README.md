# [Platinum IV] Integral Polygons - 13481

[문제 링크](https://www.acmicpc.net/problem/13481)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 57, 정답: 27, 맞힌 사람: 25, 정답 비율: 47.170%

### 분류

기하학, 누적 합, 홀짝성

### 문제 설명

<p>Ingrid holds a polygon shop in a far away country. She sells only convex polygons with integer coordinates.&nbsp;Her customers prefer polygons that can be cut into two halves in a proper way, that is the cut should be&nbsp;straight with starting and ending points in the polygon vertices and both halves should be non-empty&nbsp;and have integer areas. The more ways to cut the polygon in the proper way are &mdash; the more expensive&nbsp;the polygon is.</p>

<p>For example, there are three ways to cut the left polygon in the proper way, and two ways for the right&nbsp;polygon.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13481/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-01%20%EC%98%A4%ED%9B%84%203.47.21.png" style="height:129px; width:315px" /></p>

<p>The polygons in the shop are always of excellent quality, so the business is expanding. Now Ingrid needs&nbsp;some automatic tool to determine the number of ways to cut the polygon in the proper way. This is very&nbsp;important for her shop, since otherwise you will spend a lot of time on setting prices &mdash; just imagine how&nbsp;much time would it take to set prices for a medium-sized van with polygons. Could you help Ingrid and&nbsp;write the tool for her?</p>

### 입력

<p>The first line of the input contains an integer n &mdash; the number of polygon vertices (4 &le; n &le; 200 000).&nbsp;Each of the following n lines contains vertex coordinates: a pair of integers x<sub>i</sub> and y<sub>i</sub> per line&nbsp;(&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup>).&nbsp;The specified polygon is convex and its vertices are specified in the order of traversal.</p>

### 출력

<p>Output a single integer w &mdash; the number of ways to cut the polygon in the proper way.</p>
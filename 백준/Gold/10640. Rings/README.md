# [Gold I] Rings - 10640

[문제 링크](https://www.acmicpc.net/problem/10640)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 18, 맞힌 사람: 15, 정답 비율: 42.857%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>There are two circles with radius 1 in 3D space. Please check two circles are connected as chained rings.</p>

<p>&nbsp;</p>

### 입력

<p>The input is formatted as follows.</p>

<p>pe</p>

<p>First line contains three real numbers(&minus;3 &le; c<sub>xi</sub>, c<sub>yi</sub>, c<sub>zi</sub>&nbsp;&le; 3). It shows a circle&#39;s center position. Second line contains six real numbers (&minus;1 &le; v<sub>xi,j</sub>&nbsp;,vy<sub>i,j</sub>, v<sub>zi,j</sub> &le;1). A unit vector (v<sub>x1,1</sub>, v<sub>y1,1</sub>, v<sub>z1,1</sub>) is directed to the circumference of the circle from center of the circle. The other unit vector (v<sub>x1,2</sub>, v<sub>y1,2</sub>, v<sub>z1,2</sub>) is also directed to the circumference of the circle from center of the circle. These two vectors are orthogonalized. Third and fourth lines show the other circle information in the same way of first and second lines. There are no cases that two circles touch.</p>

### 출력

<p>If two circles are connected as chained rings, you should print &quot;YES&quot;. The other case, you should print &quot;NO&quot;. (quotes for clarity)</p>

<p>&nbsp;</p>
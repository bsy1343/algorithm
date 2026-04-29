# [Silver IV] Triangle of Triangles - 34794

[문제 링크](https://www.acmicpc.net/problem/34794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 45, 정답: 44, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

구현, 기하학, 브루트포스 알고리즘

### 문제 설명

<p>Audrey has a favorite triangle. Specifically, the angles of the triangle are $a_1$ degrees, $b_1$ degrees, and $c_1$ degrees.</p>

<p>Ruan Mei only likes two types of triangles. Specifically, she only likes a triangle if the degrees of the three angles are either $a_2$ degrees, $b_2$ degrees, and $c_2$ degrees; or $a_3$ degrees, $b_3$ degrees, and $c_3$ degrees. The order of the angles does not matter.</p>

<p>Audrey and Ruan Mei only like multiples of $5$, so it is guaranteed that the degree measures of all of the angles in their favorite triangles are divisible by $5$.</p>

<p>Audrey wants to draw a line segment starting at one vertex of her favorite triangle and ending at the opposite side of that vertex such that, if she cuts the triangle along that line segment, she divides the triangle into two smaller triangles, both of which Ruan Mei likes. Is this possible?</p>

### 입력

<p>The first line contains a single integer, $T$ ($1 \le T \le 10^4$). $T$ test cases follow.</p>

<p>The description for each test case spans three lines.</p>

<p>The first line contains three integers, $a_1$, $b_1$, and $c_1$ ($5 \le a_1 \le b_1 \le c_1 \le 170, a_1 + b_1 + c_1 = 180$).</p>

<p>The second line contains three integers, $a_2$, $b_2$, and $c_2$ ($5 \le a_2 \le b_2 \le c_2 \le 170, a_2 + b_2 + c_2 = 180$).</p>

<p>The third line contains three integers, $a_3$, $b_3$, and $c_3$ ($5 \le a_3 \le b_3 \le c_3 \le 170, a_3 + b_3 + c_3 = 180$).</p>

<p>It is guaranteed at least one of $a_2 \neq a_3$, $b_2 \neq b_3$, or $c_2 \neq c_3$. It is furthermore guaranteed that all of these values are divisible by $5$.</p>

### 출력

<p>Output $T$ lines. On the $i$<sup>th</sup> line, output the answer for the $i$<sup>th</sup> test case.</p>

<p>Output <code>YES</code> if it is possible for Audrey to cut her favorite triangle exactly once to form two triangles, both of which Ruan Mei likes. Otherwise, output <code>NO</code>.</p>
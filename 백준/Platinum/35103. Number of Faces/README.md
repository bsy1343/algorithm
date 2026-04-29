# [Platinum III] Number of Faces - 35103

[문제 링크](https://www.acmicpc.net/problem/35103)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Two planes, $H_1$ and $H_2$, are in a three-dimensional Euclidean space with axes, $x$, $y$, and $z$, where $H_1$ is defined by $z = 1$ and $H_2$ by $z = 2$.</p>

<p>You are given $n$ real numbers, $d_1, \dots , d_n$, and $m$ real numbers, $d'_1 , \dots , d'_m$. These real numbers are positive and strictly less than $180$. Consider drawing the following convex polygons on the planes $H_1$ and $H_2$.</p>

<ul>
<li>On $H_1$, you draw an $n$-sided polygon. The interior angles at its vertices are $d_1, \dots , d_n$ degrees in counterclockwise order as viewed from the origin.</li>
<li>Similarly, on $H_2$, you draw an $m$-sided polygon. The interior angles at its vertices are $d'_1 , \dots , d'_m$ degrees in counterclockwise order as viewed from the origin.</li>
</ul>

<p>Here, only the interior angles of the polygons are specified; the lengths of their edges and the positions of their vertices are not.</p>

<p>Once the positions of the two polygons are fixed, the convex polyhedron whose vertex set is these $n+ m$ vertices is uniquely determined. Write a program that enumerates all the possible numbers of faces that such a convex polyhedron can have.</p>

<p>Here, all the dihedral angles (angles between two adjacent faces) of a convex polyhedron must be strictly less than $180$ degrees.</p>

<p>In the first test case of Sample Input 1, quadrilaterals whose interior angles are all $90$ degrees are drawn on $H_1$ and $H_2$. For example, a rectangular cuboid can be constructed as in Figure G.1 (a), which has six faces. By rotating one of the quadrilaterals as shown in Figure G.1 (b), a convex polyhedron with ten faces can be constructed. The possible numbers of faces are six and ten.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35103.%E2%80%85Number%E2%80%85of%E2%80%85Faces/e741d89f.png" data-original-src="https://boja.mercury.kr/assets/problem/35103-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 269px;"></p>

<p style="text-align: center;">Figure G.1. The first test case of Sample Input 1</p>

### 입력

<p>The input consists of at most $50$ test cases, each in the following format.</p>

<blockquote>
<p>$n$</p>

<p>$d_1$</p>

<p>$\vdots$</p>

<p>$d_n$</p>

<p>$m$</p>

<p>$d'_1$</p>

<p>$\vdots$</p>

<p>$d'_m$</p>
</blockquote>

<p>The integer $n$ represents the number of vertices of the polygon drawn on $H_1$ ($3 ≤ n ≤ 50$). The real numbers, $d_1, \dots , d_n$, represent the interior angles. They are at least $10^{−9}$ and strictly less than $180$, and are given with exactly nine digits after the decimal point. They satisfy $d_1 + \cdots + d_n = (n − 2) \times 180$.</p>

<p>Similarly, the integer $m$ represents the number of vertices of the polygon drawn on $H_2$ ($3 ≤ m ≤ 50$). The real numbers, $d'_1 , \dots , d'_m$, represent the interior angles. They are at least $10^{−9}$ and strictly less than $180$, and are given with exactly nine digits after the decimal point. They satisfy $d'_1 + \cdots + d'_m = (m − 2) \times 180$.</p>

<p>The end of the input is indicated by a line consisting only of a zero.</p>

### 출력

<p>For each test case, output in a line all possible numbers of faces that the convex polyhedron can have, in ascending order, separated by a space.</p>
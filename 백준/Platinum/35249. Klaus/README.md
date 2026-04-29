# [Platinum II] Klaus - 35249

[문제 링크](https://www.acmicpc.net/problem/35249)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>We are creating an arrangement of $3$ fake Christmas trees, equally-spaced along a line, for the backdrop of a play.</p>

<p>Each of the fake trees is made out of a vertical trunk and one or more identical triangular pieces of foam designed to be attached to that particular trunk. The pieces for tree $i$ all have exactly the same shape of an isosceles triangle with base width equal to double the height ($(2 \cdot s_i) \times (s_i)$ centimetres).</p>

<p>A tree trunk can have triangles attached at predefined attachment points defined in terms of the elevation from the base of the tree. To make the trees look as full of life as possible, in their foamy way, we want the sum of the areas of the pieces attached on the trees to be as large as possible.</p>

<p>However, the set of pieces we can actually install is limited because we do not want any of the triangles to overlap each other except for touching at the perimeter.</p>

<p>Find a subset of pieces to use with the maximum possible area, while still having none of the pieces on any of the trees overlap.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35249.%E2%80%85Klaus/f3ce6513.png" data-original-src="https://boja.mercury.kr/assets/problem/35249-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 375px; height: 200px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35249.%E2%80%85Klaus/78dc0a4f.png" data-original-src="https://boja.mercury.kr/assets/problem/35249-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 200px;"></p>

<p style="text-align: center;">Figure K.1: Tree arrangements illustrating samples 1 and 2.</p>

<p>Find the maximum sum of areas of triangles that we can install.</p>

### 입력

<ul>
<li>One line containing the integer distance between trees $A$ and $B$, and between $B$ and $C$ in centimetres, $d$ ($1 \leq d \leq 10^7$),</li>
<li>Three descriptions of trees $A$, $B$, and $C$:
<ul>
<li>One line containing the number of triangle positions $n_i$ and triangle size $s_i$ of the $i$-th tree. ($1 \le n \le 100$; $1 \le s \le d$).</li>
<li>One line containing the $n_i$ possible integer triangle heights in centimetres, $y_{ij}$ ($0 \le y \le 10^7$).</li>
</ul>
</li>
</ul>

### 출력

<p>Output the maximum possible combined area of triangular pieces on the trees.</p>
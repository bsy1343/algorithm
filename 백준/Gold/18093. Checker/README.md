# [Gold I] Checker - 18093

[문제 링크](https://www.acmicpc.net/problem/18093)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 14, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

구현, 자료 구조, 정렬, 기하학, 집합과 맵

### 문제 설명

<p>&ldquo;...fool me once, shame on &mdash; shame on you. Fool me &mdash; you can&rsquo;t get fooled again.&rdquo; &ndash; W.</p>

<p>In this task, we will observe regular polygons that have each of their N sides colored in one of three colors and whose vertices are denoted from 1 to N in a clockwise order. A <em>triangulaton</em> of a polygon is a decomposition of its area into a set of non-overlapping triangles whose sides either lie on the sides of the polygon or its internal diagonals. Of course, in this task, each of the diagonals used for polygon triangulation is also colored in one of three colors.</p>

<p>The triangulation is said to be <em>patriotic</em> if each of its N &minus; 2 triangles has all three sides of different colors. Your task is to determine whether a given polygon with its diagonals is triangulated and whether that triangulation is patriotic.</p>

### 입력

<p>The frist line contains the number of subtask this particular test case belongs to (see the table in the scoring section). If your solution doesn&rsquo;t care about that, simply read the number and feel free to ignore it.</p>

<p>The second line contains an integer N from the task description.</p>

<p>The third line contains an integer consisting of N digits which represent the colors of polygon sides. More precisely, the first digit represents the color of side (1, 2), the second digit represents the color of side (2, 3), and so on until the N-th digit which represents the color of side (N, 1). The colors will always be denoted with digits 1, 2 and 3.</p>

<p>Each of the next N &minus; 3 lines contain a description of one diagonal in the form X Y C, where X and Y are polygon vertices and C is the color of the diagonal (1 &le; X, Y &le; N, 1 &le; C &le; 3). Each line describes a valid diagonal, i.e., vertices X and Y will neither be equal nor neighbouring.</p>

### 출력

<p>If the input polygon is not correctly triangulated, you should output &quot;neispravna triangulacija&quot; (invalid triangulation in Croatian).</p>

<p>If the input polygon is correctly triangulated but the triangulation is not patriotic, you should output &quot;neispravno bojenje&quot; (invalid coloring in Croatian).</p>

<p>If the input polygon is correctly triangulated and that triangulation is patriotic, you should output &quot;tocno&quot; (correct in Croatian).</p>

### 힌트

<p>Clarifications of examples:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18093.%E2%80%85Checker/62bcaa01.png" data-original-src="https://upload.acmicpc.net/84bcd7d0-a57d-4a61-96a3-11659002b836/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 608px; height: 182px;" /></p>
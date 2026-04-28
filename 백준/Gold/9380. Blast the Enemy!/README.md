# [Gold I] Blast the Enemy! - 9380

[문제 링크](https://www.acmicpc.net/problem/9380)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 27, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

수학, 기하학, 미적분학, 다각형의 넓이

### 문제 설명

<p>A new computer game has just arrived and as an active and always-in-the-scene player, you should finish it before the next university term starts. At each stage of this game, you have to shoot an enemy robot on its weakness point. The weakness point of a robot is always the &ldquo;center of mass&rdquo; of its 2D shape in the screen. Fortunately, all robot shapes are simple polygons with uniform density and you can write programs to calculate exactly the center of mass for each polygon.</p>

<p>Let&#39;s have a more formal definition for center of mass (COM). The center of mass for a square, (also circle, and other symmetric shapes) is its center point. And, if a simple shape C is partitioned into two simple shapes A and B with areas S<sub>A</sub> and S<sub>B</sub>, then COM(C) (as a vector) can be calculated by<br />
\( COM(C) = \frac{S_A \times COM(A)+ S_B \times COM(B)}{S_A + S_B} \)</p>

<p>As a more formal definition, for a simple shape A with area S<sub>A</sub>:<br />
\( COM(A) = \frac{ \iint_{A} \vec{a}\cdot ds}{S_A} \)</p>

### 입력

<p>The input contains a number of robot definitions. Each robot definition starts with a line containing n, the number of vertices in robot&rsquo;s polygon (n &lt;= 100). The polygon vertices are specified in the next n lines (in either clockwise or counter-clock-wise order). Each of these lines contains two space-separated integers showing the coordinates of the corresponding vertex. The absolute value of the coordinates does not exceed 100. The case of n=0 shows the end of input and should not be processed.&nbsp;</p>

### 출력

<p>The i<sup>th</sup> line of the output should be of the form &ldquo;Stage #i: x y&rdquo; (omit the quotes), where (x,y) is the center of mass for the i<sup>th</sup> robot in the input. The coordinates must be rounded to exactly 6 digits after the decimal point.&nbsp;</p>
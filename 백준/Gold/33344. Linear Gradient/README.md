# [Gold V] Linear Gradient - 33344

[문제 링크](https://www.acmicpc.net/problem/33344)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 20, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

기하학, 미적분학, 수학

### 문제 설명

<p>There is a trapezoid with vertices $(x_1, y_1)$, $(x_1, y_2)$, $(x_2, y_3)$, $(x_2, y_4)$ in the Euclidean plane that is painted with a linear gradient (defined below).</p>

<p>Let a triple of real numbers $(r, g, b)$ represent a color of a point, and let us use this to define three colors:</p>

<ul>
	<li><strong>red</strong>: $r \geq 150$, $g \leq 75$, $b \leq 75$;</li>
	<li><strong>green</strong>: $g \geq 150$, $r \leq 75$, $b \leq 75$;</li>
	<li><strong>blue</strong>: $b \geq 150$, $r \leq 75$, $g \leq 75$.</li>
</ul>

<p>The trapezoid is colored using a set of lines which collectively cover the entire area of the trapezoid and produce a color gradient. The set is defined as follows:</p>

<ul>
	<li>Each line in the set is defined by a value of $t$ ($t \in [0, 1]$).</li>
	<li>The endpoints of the line are $(x_1, (1 - t) y_1 + t y_2)$ and $(x_2, (1 - t) y_3 + t y_4)$.</li>
	<li>The color of the left endpoint is ($r_{\ell}, g_{\ell}, b_{\ell}$), and the color of the right endpoint is ($r_r, g_r, b_r$).</li>
	<li>The color of an inner point on the line is determined by linear interpolation (see Note for definition) between the left and right colors, based on the distance from the left endpoint to that point.</li>
</ul>

<p>Calculate the total area of the red, blue, and green parts of the trapezoid.</p>

### 입력

<p>The first line contains integers $x_1$, $y_1$, $y_2$, $r_{\ell}$, $g_{\ell}$, $b_{\ell}$.</p>

<p>The second line contains integers $x_2$, $y_3$, $y_4$, $r_r$, $g_r$, $b_r$.</p>

### 출력

<p>Output three real numbers: the red area, the blue area, and the green area, respectively. The absolute or relative error should not exceed $10^{-9}$.</p>

### 제한

<ul>
	<li>$0 \leq x_1 &lt; x_2 \leq 100\,000$;</li>
	<li>$0 \leq y_1 &lt; y_2 \leq 100\,000$;</li>
	<li>$0 \leq y_3 &lt; y_4 \leq 100\,000$;</li>
	<li>$0 \leq r_{\ell}, g_{\ell}, b_{\ell}, r_r, g_r, b_r \leq 255$.</li>
</ul>

### 힌트

<p>Linear interpolation is a method of estimating values within an interval, based on known values at the endpoints. In the context of color interpolation, it means that the color components $(r, g, b)$ are calculated as a weighted average of the corresponding components of the left and right colors, with the weights determined by the relative distance of the point from the left endpoint and the right endpoint. This creates a smooth transition of colors along the line.</p>
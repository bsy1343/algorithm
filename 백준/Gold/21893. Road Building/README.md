# [Gold II] Road Building - 21893

[문제 링크](https://www.acmicpc.net/problem/21893)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

기하학, 스위핑

### 문제 설명

<p>The burger eating contest is coming! The contest is taking place at two different cities. But there was a slight miscalculation --- there is no direct road between these cities across the forest. To save enough time organizers decided to build a direct road with maximum width through the forest without cutting any trees. Moreover, it was decided to leave at least one tree on both sides of the road.</p>

<p>For simplicity, let&#39;s represent each tree as a circle on plane with Cartesian coordinates. Build a road of infinite length and maximum width parallel to straight line, that passes through two given points.&nbsp;</p>

### 입력

<p>First line contains four integers $x_s$, $y_s$, $x_f$ and $y_f$ --- coordinates of points $(x_s, y_s)$ and $(x_f, y_f)$ that the line passes through.</p>

<p>Second line contains single integer $n$ --- number of trees in the forest ($2 \le n \le 2 \cdot 10^5$). There are no intersecting trees, but they can touch each other.</p>

<p>Each of the next $n$ lines contains three integers $x_i$, $y_i$ and $r_i$ --- coordinates of the center and radius of $i$-th tree ($1 \le r_i \le 10^9$).</p>

<p>All coordinates&#39; absolute values don&#39;t exceed $10^9$.</p>

### 출력

<p>Output maximum width of the road parallel to straight line, that passes through points $(x_s, y_s)$ and $(x_f, y_f)$. There should be at least one tree on both sides of the road. The road may touch the trees, but not intersect them. If there is no such road, output 0.</p>

<p>Your answer will be accepted, if it&#39;s absolute or relative error doesn&#39;t exceed $10^{-6}$. Formally speaking, if your answer is $a$ and jury&#39;s is $b$, then it will be accepted if $\frac {|a - b|}{\max(1, b)} \le 10^{-6}$.</p>

### 힌트

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td>First example</td>
			<td>Second example</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21893.%E2%80%85Road%E2%80%85Building/905703e3.png" data-original-src="https://upload.acmicpc.net/7ddc575f-f31d-4225-bff9-d8cc375596a7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 500px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21893.%E2%80%85Road%E2%80%85Building/124ea48f.png" data-original-src="https://upload.acmicpc.net/54c0e7a5-198f-48ab-b8dd-e710b9567a27/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 500px;" /></td>
		</tr>
	</tbody>
</table>
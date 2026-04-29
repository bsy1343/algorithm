# [Gold III] Ray Chasing - 33648

[문제 링크](https://www.acmicpc.net/problem/33648)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

기하학, 많은 조건 분기, 선분 교차 판정, 수학

### 문제 설명

<p>Ray tracing is becoming very popular in modern video games. You decide to brush up on the topic. After reading a bit of the math behind how it works, you feel the need to get a bit of hands-on experience. So you consider the following simple problem that does not involve any reflections of the ray.</p>

<p>Given a box with sides parallel to the $x$- and $y$-axes of the Euclidean plane, you emit a ray starting from some point in the interior of the box. Calculate which side of the box is first hit by the ray. If the ray perfectly hits a corner, you should indicate both sides of the box that meet at that corner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33648.%E2%80%85Ray%E2%80%85Chasing/96b7a537.png" data-original-src="https://boja.mercury.kr/assets/problem/33648-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 378px; height: 289px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the second test case. The ray starting at $(0,0)$ and passing through $(-3,3)$ will pass through the <code>top-left</code> corner of the box.</p>

### 입력

<p>The first line of input consists of four integers $X_1$, $X_2$, $Y_1$, $Y_2$. These give the coordinates of the sides of the box. The second line contains four integers $X_s$, $Y_s$, $X_r$, $Y_r$ describing two points $X_1&lt;X_s&lt;X_2$, $Y_1&lt;Y_s&lt;Y_2$ and $(X_s,Y_s) \ne (X_r,Y_r)$ (i.e. the points are distinct). This indicates the ray starts at point $(X_s,Y_s)$ and travels in the direction that passes through $(X_r,Y_r)$. All integers in the input will lie between $-10^4$ and $10^4$ (inclusive). Note, the point $(X_r,Y_r)$ may lie inside the box, on the boundary of the box, or even outside the box; it merely indicates the direction the ray is travelling.</p>

### 출력

<p>If the ray does not hit a corner of the box, print the appropriate string <code>left</code>, <code>right</code>, <code>bottom</code>, or <code>top</code> indicating which side was hit by the ray. These correspond to the following ranges of coordinates.</p>

<ul>
	<li>The <code>left</code> side is $\{(X_1,y):Y_1≤y≤Y_2\}$.</li>
	<li>The <code>right</code> side is $\{(X_2,y):Y_1≤y≤Y_2\}$.</li>
	<li>The <code>bottom</code> side is $\{(x,Y_1):X_1≤y≤X_2\}$.</li>
	<li>The <code>top</code> side is $\{(x,Y_2):X_1≤y≤X_2\}$.</li>
</ul>

<p>If the ray hits a corner of the box, output the corresponding hyphenated string indicating which corner was hit: <code>top-left</code>, <code>top-right</code>, <code>bottom-left</code>, or <code>bottom-right</code>.</p>
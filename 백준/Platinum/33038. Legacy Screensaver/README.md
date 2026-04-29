# [Platinum III] Legacy Screensaver - 33038

[문제 링크](https://www.acmicpc.net/problem/33038)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 40, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

구현, 수학, 시뮬레이션, 정수론, 조합론

### 문제 설명

<p>On a very old operating system, a screensaver consists of two rectangles flying around the screen. The screen is $W$ pixels wide and $H$ pixels high. Consider the origin to be in the top-left corner of the screen, the $x$-axis to go from the origin to the right, and the $y$-axis to go from the origin to the bottom.</p>

<p>Rectangle $i$ ($i = 1, 2$) has a width of $w_i$ pixels, a height of $h_i$ pixels, initially its top-left corner has coordinates $(x_i, y_i)$, and its initial movement direction is $(\delta x_i, \delta y_i)$, where each of $\delta x_i$ and $\delta y_i$ is either $-1$ or $1$. At the end of each second, rectangle $i$'s top-left corner coordinates instantly change by $(\delta x_i, \delta y_i)$. </p>

<p>Whenever rectangle $i$ touches the left or the right border of the screen, the value of $\delta x_i$ changes sign before the next second. Similarly, whenever rectangle $i$ touches the top or the bottom border of the screen, the value of $\delta y_i$ changes sign before the next second. Whenever rectangle $i$ touches two borders of the screen at the same time (which can only happen at the corner of the screen), both $\delta x_i$ and $\delta y_i$ change sign.</p>

<p>As a result of the above, both rectangles stay fully within the screen at all times. Informally, collisions of the rectangles with the screen borders are perfectly elastic. Note, however, that rectangle movement is still discrete: each rectangle moves instantly by $1$ pixel in both directions at the end of each second.</p>

<p>You are curious how often these two rectangles overlap. The rectangles are considered to be overlapping if their intersection has a positive area.</p>

<p>Let $f(t)$ be the number of integers $\tau = 0, 1, \ldots, t - 1$ such that the rectangles overlap during second $\tau$ (where second $0$ is before the rectangles start moving).</p>

<p>Find the limit of $\frac{f(t)}{t}$ as $t \rightarrow \infty$ as an irreducible fraction. It can be shown that this limit is a rational number.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $T$ ($1 \le T \le 1000$). The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $W$ and $H$, denoting the width and the height of the screen ($3 \le W, H \le 4000$).</p>

<p>The next two lines describe the two rectangles. Each rectangle is described by six integers $w_i$, $h_i$, $x_i$, $y_i$, $\delta x_i$, $\delta y_i$, describing the $i$-th rectangle and denoting its width, its height, the coordinates of its top-left corner, and its initial movement direction ($1 \le w_i \le W - 2$; $1 \le h_i \le H - 2$; $0 &lt; x_i &lt; W - w_i$; $0 &lt; y_i &lt; H - h_i$; $\delta x_i, \delta y_i \in \{-1, 1\})$.</p>

<p>The sum of the values of $W + H$ across all test cases is guaranteed to not exceed $8000$.</p>

### 출력

<p>For each test case, print a non-negative integer $p$ and a positive integer $q$, separated by a slash ('<code>/</code>') without spaces, meaning that the limit of $\frac{f(t)}{t}$ as $t \rightarrow \infty$ is equal to $\frac{p}{q}$. The fraction must be irreducible --- that is, the greatest common divisor of $p$ and $q$ must be equal to $1$.</p>

### 힌트

<p>For the second test case, the state of rectangles during the first few seconds is shown in the following pictures. The rectangles overlap during seconds $\tau = 0$ and $\tau = 6$. Thus, for example, $f(8) = 2$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33038.%E2%80%85Legacy%E2%80%85Screensaver/ac688550.png" data-original-src="https://boja.mercury.kr/assets/problem/33038-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 475px; height: 208px;"></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33038.%E2%80%85Legacy%E2%80%85Screensaver/04694e87.png" data-original-src="https://boja.mercury.kr/assets/problem/33038-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 473px; height: 208px;"></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33038.%E2%80%85Legacy%E2%80%85Screensaver/9030edfc.png" data-original-src="https://boja.mercury.kr/assets/problem/33038-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 479px; height: 208px;"></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33038.%E2%80%85Legacy%E2%80%85Screensaver/f325d626.png" data-original-src="https://boja.mercury.kr/assets/problem/33038-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 475px; height: 208px;"></p>
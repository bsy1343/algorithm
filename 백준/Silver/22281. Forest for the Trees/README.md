# [Silver I] Forest for the Trees - 22281

[문제 링크](https://www.acmicpc.net/problem/22281)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 22, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

수학, 정수론

### 문제 설명

<p>You are playing hide-and-go-seek in a forest with Belle. &nbsp;The forest has one tree at each of the positive integer lattice points. &nbsp;That is, there is a tree at every point $(x,y)$ where $x$ and $y$ are both positive integers. &nbsp;You may consider each tree as a point. &nbsp;A logging company has cut down all of the trees in some axis-aligned rectangle, including those on the boundary of the rectangle.</p>

<p>You are standing at $(0,0)$ and Belle is standing at $(x_b,y_b)$. You can see Belle if and only if there is no tree blocking your line of sight to Belle. If there is a tree at $(x_b,y_b)$, Belle will make it easier for you to find her by standing on the side of the tree facing your location.</p>

<p>For example, suppose that Belle is standing at $(2,6)$. &nbsp;If the trees in the rectangle with corners at $(1,1)$ and $(5,4)$ are cut down (blue rectangle in figure), then you can see Belle. &nbsp;However, if the rectangle was at $(3,5)$ and $(5,7)$ (red rectangle in figure), then the tree at $(1,3)$ would be in the way.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22281.%E2%80%85Forest%E2%80%85for%E2%80%85the%E2%80%85Trees/f33b7918.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/22281.%E2%80%85Forest%E2%80%85for%E2%80%85the%E2%80%85Trees/f33b7918.png" data-original-src="https://upload.acmicpc.net/1839943b-aaf7-46e4-91ca-b5eb3e632b71/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 283px; height: 328px;" /></p>

<p>Given the rectangle and Belle&#39;s location, can you see her?</p>

### 입력

<p>The first line of input contains two integer $x_b$ and $y_b$ ($1 \leq x_b,y_b \leq 10^{12}$), which are the coordinates that Belle is standing on.</p>

<p>The second line of input contains four integers $x_1$, $y_1$, $x_2$ and $y_2$ ($1 \leq x_1 \leq x_2 \leq 10^{12}$ and $1 \leq y_1 \leq y_2 \leq 10^{12}$), which specify two opposite corners of the rectangle at $(x_1, y_1)$ and $(x_2, y_2)$.</p>

### 출력

<p>If you can see Belle, display <code>Yes</code>.</p>

<p>Otherwise, display <code>No</code> and the coordinates of the closest tree that is blocking your view.</p>
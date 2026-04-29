# [Platinum V] Ellipse Eclipse - 32501

[문제 링크](https://www.acmicpc.net/problem/32501)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 66, 맞힌 사람: 54, 정답 비율: 63.529%

### 분류

기하학, 삼분 탐색, 수학, 이분 탐색

### 문제 설명

<p>An <em>Ellipse</em> is a 2D geometric figure. It consists of the set of all points such that the sum of the distance from each point to two specific points is constant. The two specific points are called the <em>Foci</em> of the ellipse. The <em>Major Axis</em> of an ellipse is the diameter of the ellipse that runs through both foci. It is the longest diameter of the ellipse.</p>

<p>Given an ellipse’s two foci and the length of its major axis, determine the coordinates of the tightest axis-aligned bounding box that can block out that ellipse.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32501.%E2%80%85Ellipse%E2%80%85Eclipse/c7c70ee2.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32501-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

### 입력

<p>The single line of input contains five integers $x_1$, $y_1$, $x_2$, $y_2$ ($-100≤x_1,y_1,x_2,y_2≤100$) and $a$ ($\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2} ≤ a ≤ 1\,000$), where the two foci of the ellipse are at $(x_1,y_1)$ and $(x_2,y_2)$ and the length of the major axis is $a$ (Note that’s the major axis, not the semi-major axis or the major radius).</p>

### 출력

<p>Output four space-separated real numbers on a single line. The numbers, in order, are $x_{\text{low}}$, $y_{\text{low}}$, $x_{\text{high}}$, $y_{\text{high}}$, where $(x_{\text{low}},y_{\text{low}})$ is the lower left corner of the tightest bounding box of the ellipse, and $(x_{\text{high}},y_{\text{high}})$ is the upper right corner of the tightest bounding box of the ellipse. Each output will be considered correct if it is within an absolute or relative error of $10^{-4}$.</p>
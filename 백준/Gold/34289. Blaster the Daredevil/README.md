# [Gold IV] Blaster the Daredevil - 34289

[문제 링크](https://www.acmicpc.net/problem/34289)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

기하학, 스위핑, 우선순위 큐, 자료 구조, 정렬, 차분 배열 트릭

### 문제 설명

<p>This year, Blaster wants to make a grand exit from graduation, and what better way to do so than by launching himself out of a cannon? Blaster's stunt can be modeled as a path in the XY-plane where the cannon is positioned at the origin, $(0, 0)$, and can be aimed at any angle.</p>

<p>Suspended in the air are $n$ floating hoops, each represented as a vertical segment. The $i$-th hoop is located $x_i$ meters along the X-axis. The bottom of the hoop is positioned $a_i$ meters above the X-axis, and the top of the hoop is positioned $b_i$ meters above the X-axis.</p>

<p>Blaster, modeled as a single point, will follow a perfectly straight-line trajectory after launch (since he has conveniently disabled Earth's gravity for this stunt). He is considered to pass through a hoop if his trajectory intersects or touches at least one point on the vertical line segment between $(x_i, a_i)$ and $(x_i, b_i)$.</p>

<p>Your task is to determine the maximum number of hoops Blaster can pass through if you carefully choose the cannon's launch angle.</p>

### 입력

<p>The first line contains a single integer $n$ $(1 \leq n \leq 10^5)$ — the number of hoops.</p>

<p>Each of the next $n$ lines contains three integers $x_i, a_i, b_i$ $(1 \leq x_i \leq 10^9, 0 \leq a_i \leq b_i \leq 10^9)$, describing the position and height range of the $i$-th hoop.</p>

<p>It is guaranteed that perturbing the endpoints of hoops up or down by at most $10^{-6}$ meters will not affect the answer.</p>

### 출력

<p>Print a single integer---the maximum number of hoops Blaster can pass through for an optimal choice of launch angle.</p>
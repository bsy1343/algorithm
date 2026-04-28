# [Platinum I] Almost Free Falling - 21116

[문제 링크](https://www.acmicpc.net/problem/21116)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

수학, 이분 탐색, 매개 변수 탐색, 미적분학, 물리학

### 문제 설명

<p>Bob likes skydiving very much, so during his last internship at an IT company, he decided to live the experience of jumping from an aircraft and fall through the air before opening his parachute. But, before he imagined, he was already at the ground, everything happened so fast!</p>

<p>Now, he wants to know how much height he traveled through the air starting from the point where he jumped at some specific moments, and the total time he was falling.</p>

<p>We can describe this more formally: at time $t = 0$, suppose that Bob is a point-mass with mass $m$ with initial position at the point where he jumped, with initial velocity zero (he jumped from rest) and with his parachute closed. Naturally, the gravity from the Earth will apply a downwards force equal to his weight, $m \cdot g$, where $g = 9.81 \, \text{m} / \text{s}^2$. And to make it more realistic, in the period of time when he hasn&#39;t opened his parachute, the air will apply an upwards force (air resistance) equal to $b_1 v(t)$, where $b_1$ is a given constant and $v(t)$ is his instantaneous velocity. Then, at the moment when he opens his parachute at time $t = t_1$, that force will disappear and immediately a new upwards force equal to $b_2 v(t)$ will appear, where $b_2 &gt; b_1$. That means that the effect of opening the parachute will apply more resistance to Bob&#39;s falling, or in other words, he will fall more slowly.</p>

<p>Help Bob with the task of calculating how much distance he has fallen at the moments he needs to know and the total time of falling. It is guaranteed that the parachute opens strictly before he has reached the ground (in other words, he doesn&#39;t die), and all the times in the queries are strictly less than the total time of falling.</p>

### 입력

<p>The first line contains five integers: $m$ ($40 \leq m \leq 120$), $b_1$, $b_2$ ($1 \leq b_1 &lt; b_2 \leq 100$), $t_1$ ($90 \leq t_1 \leq 180$), and $h_f$ ($1 \leq h_f \leq 70\,000$), indicating Bob&#39;s mass in kilograms, the constant when the parachute is closed in $\text{N}\cdot\text{s} / \text{m}$, the constant when the parachute is opened in $\text{N}\cdot\text{s} / \text{m}$, the time when the parachute opens in seconds, and the total height from the starting point to the ground in meters, respectively. Recall that force is measured in Newtons, and $1 \, \text{N} = 1 \, \text{kg} \cdot {m} / \text{s}^2$.</p>

<p>The second line contains an integer $q$ ($1 \leq q \leq 20$), the number of queries from Bob.</p>

<p>Each of the following $q$ lines contains an integer $t_i$ in seconds, indicating a moment where Bob wants to know his traveled distance.</p>

### 출력

<p>Print $q$ lines: for each query, the distance traveled, in meters. And after that, print one line indicating the total time of falling, in seconds.</p>

<p>The absolute or relative error of the answers should not exceed $10^{-4}$.</p>
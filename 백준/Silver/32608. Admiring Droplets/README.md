# [Silver V] Admiring Droplets - 32608

[문제 링크](https://www.acmicpc.net/problem/32608)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 47, 맞힌 사람: 28, 정답 비율: 100.000%

### 분류

구현, 수학

### 문제 설명

<p>On a rainy day, Davina is travelling by train to the Fluffy Puppy College. It is a long ride, and she is dozing away, admiring the rain droplets rolling down the window. Some droplets appear to go faster than others, so she pretends that the droplets are racing each other to the bottom. Shaking herself awake, she wants to see if she can predict how fast exactly these droplets roll down the window.</p>

<p>For all droplets she sees in one vertical line on the window, she has noted the sizes and positions of these droplets. She finds the velocity of a droplet to be exactly proportional to the sixth root of its volume: $v = \sqrt[6]{V}$, where $v$ is in $\text m/\text s$ and $V$ is in $\text{m}^3$. When two droplets meet, they coalesce into a single droplet, the speed of which immediately changes according to this equation. You can assume the droplets to be point-like.<sup>1</sup></p>

<p>Initially, all droplets are <em>stationary</em>. From the moment that the droplet at the very top starts rolling down the window, calculate the time that it takes for the fully coalesced droplet to reach the bottom of the window.</p>

<p>As an example, consider the first sample input. The first droplet starts rolling with a velocity of $v = \sqrt[6]{10 \cdot 10^{-9}} \text{ m}/\text{s} \approx 46\text{ mm}/\text{s}$. It meets the second droplet after $100/46 \approx 2.2\text{ s}$. They coalesce into a droplet of $40\text{ mm}^3$ with a speed of $v = \sqrt[6]{40 \cdot 10^{-9}} \text{ m}/\text{s} \approx 58\text{ mm}/\text{s}$. This new droplet meets the third droplet after $200/58 \approx 3.4\text{ s}$. The fully coalesced droplet has a volume of $60\text{ mm}^3$ and a speed of $v = \sqrt[6]{60 \cdot 10^{-9}} \text{ m}/\text{s} \approx 63\text{ mm}/\text{s}$. It reaches the bottom of the window after $100/63 \approx 1.6\text{ s}$. This makes the total time $2.2+3.4+1.6 \approx 7.2\text{ s}$.</p>

<hr>
<p><sup>1</sup>I.e., to be infinitesimally small / dimensionless.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $h$ ($1\leq n\leq 10^5$, $n\leq h\leq 10^9$), the number of droplets and the height of the window in $\text{mm}$.</li>
	<li>$n$ lines, each with two integers $s$ and $y$ ($1\leq s\leq 300$, $0 \leq y &lt; h$), the size of a droplet in $\text{mm}^3$ ($\mu\text{L}$) and the distance of a droplet from the top of the window in mm.</li>
</ul>

<p>The $y$-coordinates of the droplets are strictly increasing (i.e., they are distinct and ordered from top to bottom).</p>

### 출력

<p>Output the time it takes for the fully coalesced droplet to reach the bottom of the window after the first droplet starts rolling, in seconds.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>
# [Gold III] Communications Satellite - 31046

[문제 링크](https://www.acmicpc.net/problem/31046)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 15, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>The Johnson Space Center has hired you to design NASA&rsquo;s new communications satellite! The satellite, consisting of a set of dish antennas held together with titanium beams, must meet NASA&rsquo;s exacting specifications, but a lot of the design is up to you.</p>

<p>Specifically, the design can be represented by a set of circles of various radii (representing the dish antennas) and line segments (the beams) in the 2D plane. A valid satellite design must meet all of the following criteria:</p>

<ul>
	<li>The necessary size and location of each dish on the $xy$ plane was computed by NASA, and you are not allowed to reposition any of the dishes.</li>
	<li>You may add any number of titanium beams to the design, connecting one point on the circumference of one dish antenna to another point on the circumference of a different dish. Treat each beam as a straight line segment (of negligible width).</li>
	<li>Beams are not allowed to cross each other, or attach to each other. Beams are also not allowed to occlude (cover up) any part of the interior of any dish antenna.</li>
	<li>Your final design must consist of a single connected structure.</li>
	<li>Two dishes might exactly touch (in which case they are already connected to each other); but NASA guarantees that no two dish antennas overlap.</li>
</ul>

<p>Titanium isn&rsquo;t cheap these days, so you want to compute the cheapest possible compliant design: the one that <em>minimizes the sum</em> of the beam lengths.</p>

### 입력

<p>The first line of the input contains a single integer $1 \leq N \leq 2\, 000$, the number of dish antennas attached to the satellite.</p>

<p>Then follow $N$ lines, each of which contains three integers $X$, $Y$, and $R$ specifying the location and radius of one dish antenna. These integers satisfy the bounds $-1\, 000 \leq X, Y\leq 1\, 000$ and $1\leq R \leq 100$.</p>

### 출력

<p>Compute the satellite design that minimizes the sum of beam lengths, while obeying the above specifications, and print that sum. The answer is considered correct if the absolute or relative error is less than $10^{-6}$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31046.%E2%80%85Communications%E2%80%85Satellite/edcddec3.png" data-original-src="https://upload.acmicpc.net/7bae1d3c-c238-4fb7-a82e-1d5ca1c899c0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 183px;" /></p>

<p style="text-align: center;">Illustration of the sample input solution (beams in blue).</p>
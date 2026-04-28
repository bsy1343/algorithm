# [Platinum IV] Clearing Space - 30560

[문제 링크](https://www.acmicpc.net/problem/30560)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 31, 맞힌 사람: 18, 정답 비율: 22.222%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>You are putting up an event space in Nottingham&#39;s Sherwood Forest by erecting a fence in a circular-shaped clearing you found that is exactly one kilometre in radius. You will put some fence posts in the trees around the edge of the clearing and then connect them together with fencing later.</p>

<p>You would like to put the fence around as much of the event space as possible. However, the ground is only suitable in a few places around the border, and you only have so many fence posts to put in the ground, so you&#39;ll have to choose carefully if you want to maximise area.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30560.%E2%80%85Clearing%E2%80%85Space/45e68438.png" data-original-src="https://upload.acmicpc.net/bfb08f8d-6a3e-4b5d-8820-7b838bfee99e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 250px; width: 244px;" /></p>

<p style="text-align: center;">Figure C.1: An illustration of using 4 posts to capture the maximum area in sample input 1.</p>

<p>Knowing the safe places to put fence posts, and the number of posts you have, what is the maximum area of clearing you can enclose?</p>

### 입력

<ul>
	<li>One line containing the integer number of safe points around the $1$km-radius clearing, $n$ ($3 \le n \le 100$).</li>
	<li>One line containing the integer number of fence posts you have, $p$ ($3 \le p \le n$).</li>
	<li>One line containing $n$ distinct real numbers $a_1, \ldots, a_n$ in ascending order, the angles in degrees of each of the safe places to add fence posts ($0 \le a_i &lt; 360$).</li>
</ul>

### 출력

<p>Output the maximum area you can capture with a polygonal clearing made using at most $p$ fence posts, in square metres.</p>

<p>The output must be accurate to an absolute or relative error of $10^{-6}$.</p>

<p>As a reminder, the radius of the clearing is $1$km.</p>
# [Gold II] Arranging Adapters - 30898

[문제 링크](https://www.acmicpc.net/problem/30898)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 266, 정답: 87, 맞힌 사람: 70, 정답 비율: 37.433%

### 분류

그리디 알고리즘, 정렬, 매개 변수 탐색

### 문제 설명

<p>It is the day before the NWERC and you and your team are on the train towards Delft. The journey is long and boring but you came up with a good idea: &quot;Let&#39;s do some <em>train</em>ing&quot;.</p>

<blockquote>
<p><em>-- silence --</em></p>
</blockquote>

<p>You take your laptop out and try to plug it in when you notice that the only socket is already in use. Your friends smirk and reply: &quot;No socket for you, no <em>train</em>ing for us&quot;. Their smirks quickly fade as you pull out a power strip, unplug the charger from the socket, and plug it back into the power strip. Now, there is enough space for your charger as well.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30898.%E2%80%85Arranging%E2%80%85Adapters/b4ba92ea.png" data-original-src="https://upload.acmicpc.net/cb744204-3602-4ec5-abc2-23ecab373225/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 140px;" /></p>

<p style="text-align: center;">Figure A.1: Illustration of Sample Input 2. The first six chargers can be plugged in as shown. Note that this is not the only possible solution. However, it can be shown that it is impossible to plug in all seven chargers.</p>

<p>However, as soon as more sockets are available, your friends suddenly take out more devices that need to be charged. You realize that you will not get them to train like this, so you decide to trick them into solving a problem instead.</p>

<p>Your power strip comprises a row of $s$ sockets, and each socket is $3 \text{cm}$ in diameter. Furthermore, as you examine the chargers, you notice that they all have integer lengths. The plug of each charger is always on one of the two ends, and each charger can only be used in two orientations. Chargers cannot overlap, but can touch, and can extend beyond the end of the power strip as long as they are plugged in to a socket. Now you challenge them to charge as many devices as possible. This is visualized in Figure A.1. Hoping that this allows them to avoid the <em>train</em>ing, your friends agree to write a program to solve this.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $s$ $(1\leq n\leq2\cdot 10^5$, $1\leq s\leq10^9)$, the number of chargers you have and the number of sockets on the power strip.</li>
	<li>One line with $n$ integers $w$ ($3\leq w\leq10^9$), the width of each charger in centimetres.</li>
</ul>

<p>Note that you are allowed to rotate chargers by $180^\circ$ before plugging them in.</p>

### 출력

<p>Output the maximum number of chargers you can plug into the power strip at the same time.</p>
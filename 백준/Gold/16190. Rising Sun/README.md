# [Gold III] Rising Sun - 16190

[문제 링크](https://www.acmicpc.net/problem/16190)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 360, 정답: 108, 맞힌 사람: 101, 정답 비율: 30.699%

### 분류

기하학, 수학

### 문제 설명

<p>Joon has a midterm exam tomorrow, but he hasn&#39;t studied anything. So he decided to stay up all night to study. He promised himself that he will not stop studying before the sun rises.</p>

<p>Joon&#39;s house is in some mountains. For convenience, let&#39;s say that Joon is living in a 2-dimensional coordinate system. The mountains are in the region $y\geq 0$, starting at $x=a_0$, and the boundary of them consists of $2n$ line segments parallel to either $y=x$ or $y=-x$.</p>

<p>More precisely, the boundary of the mountains can be described by $(2n-1)$ additional integers, where the $i$th number $a_i$ of them is the $x$-coordinate of the $i$th cusp of the mountains. The boundary line starts at $(a_0,\ 0)$, proceeds parallel to $y=x$ until its $x$-coordinate reaches $a_1$, then proceeds parallel to $y=-x$ until its $x$-coordinate reaches $a_2$, and so on. After the last step, the line proceeds parallel to $y=-x$ until it meets the $x$-axis.</p>

<p>The interior of the mountains is the region below the boundary and above the $x$-axis. Thus, the interior and the boundary are disjoint.</p>

<p>At some point between $x=a_0$ and $x=a_{2n-1}$, there is Joon&#39;s house on the boundary of the mountains. The size of his house is neglectable compared to the mountains.</p>

<p>Currently, the sun is at the origin and it rises vertically ($+y$ direction), 1 per minute. Joon can see the sun if the interior of the mountains does not intersect the straight line segment connecting Joon&#39;s house and the sun. Joon is completely exhausted and wants to know when can he stop studying. But as you may expect, he is out of his mind, so he cannot do such difficult math. Help him!</p>

### 입력

<p>The first line of the input contains an integer $n$ ($1\leq n\leq 1,000$).</p>

<p>The next line contains $2n$ integers, the $i$th of which is the integer $a_{i-1}$ ($1\leq a_0&lt;\cdots&lt;a_{2n-1}\leq 10^6$).</p>

<p>The last line contains an integer $x$, the $x$-coordinate of Joon&#39;s house ($a_0\leq x\leq a_{2n-1}$).</p>

<p>It is guaranteed that the boundary of the mountains is in the region $y\geq 0$.</p>

### 출력

<p>Print exactly one integer $m$, the smallest integer such that Joon can see the sun after $m$ minutes.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16190.%E2%80%85Rising%E2%80%85Sun/5d679d35.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16190.%E2%80%85Rising%E2%80%85Sun/5d679d35.png" data-original-src="https://upload.acmicpc.net/0d8493f2-b781-4060-970a-fc6d6dc0b351/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><em><strong>Figure</strong>: Illustration of the first example</em></p>
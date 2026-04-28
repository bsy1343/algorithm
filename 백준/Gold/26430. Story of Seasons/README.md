# [Gold III] Story of Seasons - 26430

[문제 링크](https://www.acmicpc.net/problem/26430)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 7, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

자료 구조, 그리디 알고리즘, 구현, 우선순위 큐, 시뮬레이션, 정렬

### 문제 설명

<p>You are a super farmer with some vegetable seeds and an infinitely large farm. In fact, not only are you a farmer, but you are also secretly a super programmer! As a super programmer, you hope to maximize the profit of your farming using your programming skills.</p>

<p>Since your daily energy is limited, you can plant at most $\mathbf{X}$ seeds each day. In the beginning, you have $\mathbf{N}$ kinds of vegetable seeds. The number of seeds of the $i$-th kind of vegetable is $\mathbf{Q_i}$, and each seed of this kind needs $\mathbf{L_i}$ days to mature from the day it is planted. Once it matures, you can sell it for $\mathbf{V_i}$ dollars. Assume that no energy or time is required for harvesting and selling vegetables. Also, your farm is infinitely large so the growing vegetables do not crowd out each other.</p>

<p>Notice that although the area of your farm is infinite, the number of days that you can plant seeds is limited. The warm season only lasts $\mathbf{D}$ days, and after that, the harsh winter comes. Any vegetable that has not matured yet will die immediately and cannot be turned into profit. The remaining seeds that were not planted cannot be turned into profit either.</p>

<p>As a super farmer and a super programmer, you want to come up with a perfect planting plan that will maximize your profit. Find the total amount of profit you will earn.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains three integers $\mathbf{D}$, $\mathbf{N}$, and $\mathbf{X}$: the number of days of the warm season, the number of kinds of vegetable seeds you have to start with, and the maximum number of seeds you can plant each day, respectively.</p>

<p>The next $\mathbf{N}$ lines describe the seeds. The $i$-th line contains three integers $\mathbf{Q_i}$, $\mathbf{L_i}$, and $\mathbf{V_i}$: the quantity of this kind of seed, the number of days it needs to mature, and the value of each matured plant, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum amount of money you can earn by optimizing your farming plan.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{V_i} \le 10^6$, for all $i$.</li>
	<li>$1 \le \mathbf{L_i} \le \mathbf{D}$, for all $i$.</li>
</ul>
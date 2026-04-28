# [Platinum II] Cute Little Butterfly - 26435

[문제 링크](https://www.acmicpc.net/problem/26435)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 정렬, 세그먼트 트리, 스위핑

### 문제 설명

<p>In a forest of the magical world, there lies a garden full of magical creatures. The garden has plenty of flowers which are not just beautiful but also a source of energy for butterflies.</p>

<p>Consider the garden a 2D plane where the X-axis represents the ground, and the Y-axis represents the altitude. There are plants of infinite height on every non-negative integral point on the X-axis. There are $\mathbf{N}$ flowers in the garden, where the $i$-th flower is on the point ($\mathbf{X_i}$, $\mathbf{Y_i}$) with the nectar of some energy value $\mathbf{C_i}$.</p>

<p>Our cute little butterfly wants as much energy as possible to become strong. By going to the same position of a flower, the butterfly can consume its nectar and gain that flower&#39;s energy value. Each flower&#39;s nectar can only be consumed once.</p>

<p>The butterfly is initially at point $(0, 10^{18})$ with $0$ units of energy and facing towards the right. At any point, the butterfly can:</p>

<ul>
	<li>Move to a lower altitude, that is, from $(x, y)$ to $(x, y-1)$ only if its current altitude is positive ($y &gt; 0$).</li>
	<li>Move in the positive direction along the X-axis, that is, from $(x, y)$ to $(x+1, y)$ if it is facing right.</li>
	<li>Move in the negative direction along the X-axis, that is, from $(x, y)$ to $(x-1, y)$ if it is facing left.</li>
	<li>Change the direction it is facing (from left to right or vice versa). This will consume $\mathbf{E}$ units of energy.</li>
</ul>

<p>We know our butterfly is lazy, and it hates to move upwards during the journey. So, for this problem, we will assume that going upwards is not allowed. Also, energy can be negative at any point. Negative energy means the butterfly has spent more energy than it obtained from the flowers.</p>

<p>Find the <i>maximum</i> energy our cute butterfly can achieve.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains two integers, $\mathbf{N}$ and $\mathbf{E}$: the number of flowers and the energy required per turn, respectively.</p>

<p>The next $\mathbf{N}$ lines describe the flowers. The $i$-th line contains three integers, $\mathbf{X_i}$, $\mathbf{Y_i}$ and $\mathbf{C_i}$: the position and the energy value of the $i$-th flower, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum overall energy our cute butterfly can achieve.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$0 \le \mathbf{E} \le 10^9$.</li>
	<li>$1 \le \mathbf{C_i} \le 10^9$, for all $i$.</li>
	<li>All flowers are located at distinct points.</li>
</ul>
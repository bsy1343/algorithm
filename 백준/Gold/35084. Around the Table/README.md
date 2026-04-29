# [Gold II] Around the Table - 35084

[문제 링크](https://www.acmicpc.net/problem/35084)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 22, 맞힌 사람: 22, 정답 비율: 88.000%

### 분류

애드 혹

### 문제 설명

<p>Emilia and her brother Alex meet up with a lot of friends in the park to play table tennis together. Since there is only one table, they play round-the-table which is everybody's favourite.</p>

<p>The rules are simple: There are $\ell \geq 2$ kids queueing up on the left side and $r \geq 1$ kids queueing up on the right side of the table. The first kid on the left side starts with the ball. Whoever has the ball hits it over the net onto the opposite side and runs around the table to join the queue at the opposite side. This is repeated until the first mistake.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35084.%E2%80%85Around%E2%80%85the%E2%80%85Table/76d42a93.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35084-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 297px;"></p>

<p style="text-align: center;">Figure A.1: Visualization of the first sample. During Hit $1$ and $5$, and during Hit $3$ and $7$, we observe the same pairing. After $8$ hits we end up in the initial state again and cannot observe any new pairing afterwards. Therefore, there are $6$ different pairings we will see in total.</p>

<p>Emilia, Alex, and their friends play this game all the time and are so good that they can go on almost forever without making any mistake. After some time, Emilia notices that she has never faced Alex, meaning that they have never been at the front of opposite queues at the same time. She wonders if this will ever happen in this round. Curious about this, she starts keeping track which pairings have already faced each other.</p>

<p>How many different pairings has she counted after the ball went over the net $10^{10^{100}}$ times?</p>

### 입력

<p>The input consist of:</p>

<ul>
<li>One line with two integers $\ell$ and $r$ ($2 \leq \ell \leq 10^{9}$ and $1 \leq r \leq 10^{9}$), the number of players on the left and right side of the table, respectively.</li>
</ul>

### 출력

<p>Output the number of different pairings Emilia counts.</p>
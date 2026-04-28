# [Platinum III] Buttons - 22373

[문제 링크](https://www.acmicpc.net/problem/22373)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 21, 맞힌 사람: 11, 정답 비율: 37.931%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 벨만–포드

### 문제 설명

<p>There is an $H \times W$ grid, with one button in each cell. Initially, all buttons are off. You will push them and turn them on.</p>

<p>Your task is to find a &quot;good&quot; timing of pressing the buttons. Let $t_{ij}$ be the timing to push the button of row $i$ and column $j$. The timing is said to be &quot;good&quot; if and only if the following conditions are satisfied.</p>

<ul>
	<li>$t_{ij}$ is an integer between $0$ and $10^9$ for all $i$ and $j$.</li>
	<li>$t_{kl} + a_{ij} \le t_{ij} \le t_{kl} + b_{ij}$ for every cell $kl$ which is a horizontal or vertical neighbor of the cell $ij$, i.e., $|i - k| + |j - l| = 1$.</li>
</ul>

<p>Write a program to output a &quot;good&quot; timing for the given $a$ and $b$. If there are several possible timings, you can output any of them. If there is no &quot;good&quot; timing, you should output $-1$.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$H$ $W$</p>

<p>$a_{11}$ $\dots$ $a_{1W}$</p>

<p>$\vdots$</p>

<p>$a_{H1}$ $\dots$ $a_{HW}$</p>

<p>$b_{11}$ $\dots$ $b_{1W}$</p>

<p>$\vdots$</p>

<p>$b_{H1}$ $\dots$ $b_{HW}$</p>
</blockquote>

<p>$H$ and $W$ represent the height and width of the given grid ($w \le H, W \le 50$). $a_{ij}$ and $b_{ij}$ represent the range of time differences for the button of row $i$ and column $j$ ($-100,000 \le a_{ij} \le b_{ij} \le 100,000$).</p>

### 출력

<p>If there is a &quot;good&quot; timing, output it in the following format.</p>

<blockquote>
<p>$T_{11}$ $\dots$ $T_{1W}$</p>

<p>$\vdots$</p>

<p>$T_{H1}$ $\dots$ $T_{HW}$</p>
</blockquote>

<p>$T_{ij}$ is an integer representing the timing to push the button of row $i$ and column $j$. The timings should satisfy the conditions defined in the problem statement. If there are multiple correct answers, you can print any of them.</p>

<p>If there is no &quot;good&quot; timing, you should output $-1$ instead.</p>
# [Platinum II] Evil Problemsetters - 20780

[문제 링크](https://www.acmicpc.net/problem/20780)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 16, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 누적 합

### 문제 설명

<p>Due to the challenging problems, some of the contestants decide to escape from this contest. However, to prevent this from happening, the EVIL problem setters made a labyrinth at the stadium&#39;s exit. The labyrinth is made of an $n \times m$ grid, on which lie the entrance and the exit, and $k$ black holes. Contestants who accidentally step into any black hole will fall into it and thus can never escape from the contest.</p>

<p>What&#39;s worse, the problem setters may also adjust the coordinates of the entrance and the exit. You, a poor contestant, who start from the entrance and wish to reach the exit without stepping into any of the black holes, can only move to one of the four adjacent cells in each step. You want to know, after each time the problem setters change the coordinates of the entrance and the exit, what&#39;s the minimum number of steps needed to reach the exit starting from the entrance?</p>

### 입력

<p>The first line of the input contains four integers $n, m, k, q$ $(1 \leq n, m \leq 200\,000, nm \leq 200\,000, 0 \leq k \leq 42,$ $ 1 \leq q \leq 100\,000)$, denoting the number of rows, the number of columns, the number of black holes in the labyrinth, and the number of queries, respectively.</p>

<p>The following $k$ lines contain the description of the black holes. Each of these lines contains two integers $x, y$ $(1\leq x \leq n,1\leq y \leq m)$, denoting the coordinates of a black hole. No two black holes are located at the same position.</p>

<p>The last $q$ lines contain the description of the queries. Each of the $q$ lines contains four integers $x_s, y_s, x_t, y_t$ $(1 \leq x_s, x_t\leq n, 1\leq y_s, y_t \leq m)$, where $(x_s, y_s)$ is the coordinates of the entrace and $(x_t, y_t)$ is the exit.</p>

### 출력

<p>For each query, output a number in a line, denoting the minimum number of steps needed to reach the exit starting from the entrance. If it is impossible to reach the exit, output <code>-1</code> instead. It should be considered impossible when the entrace or the exit coincides with a black hole.</p>

### 힌트

<p>The plots for the labyrinth and the first query of the first sample data are shown below.</p>

<table class="table table-bordered td-center" style="width:100%;">
	<tbody>
		<tr>
			<td style="width:50%;"><img alt="" src="https://upload.acmicpc.net/ae61486a-2536-4d1f-923d-c6cc9a2a14f7/-/preview/" style="width: 259px; height: 260px;" /></td>
			<td style="width:50%;"><img alt="" src="https://upload.acmicpc.net/3712f563-6350-4f0a-999e-eb44376ff784/-/preview/" style="width: 259px; height: 260px;" /></td>
		</tr>
		<tr>
			<td style="width:50%;">(a) The labyrinth</td>
			<td style="width:50%;">(b) One possible shortest path for the first query</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/dcb958e9-d8e0-47c5-b2c6-f88e3cf70660/-/preview/" style="width: 486px; height: 44px;" /></p>

<p style="text-align: center;">Plots for sample test data</p>
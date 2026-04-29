# [Gold V] Drone Control - 32563

[문제 링크](https://www.acmicpc.net/problem/32563)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

삼분 탐색, 수학

### 문제 설명

<p>You are designing a controller for an interesting aircraft called the <em>Single Copter</em>. It only has one propeller, but the outgoing air flow is further shaped by four <em>flaps</em> that control three Euler angles (pitch, roll and yaw) that help maintain the requested orientation of the craft. Each of these flaps can assume any angle requested by the flight controller, and the effects of the flaps being at certain angles should translate to exerting the requested forces on pitch, roll and yaw.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32563.%E2%80%85Drone%E2%80%85Control/2a8ea778.png" data-original-src="https://boja.mercury.kr/assets/problem/32563-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 175px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32563.%E2%80%85Drone%E2%80%85Control/3867407d.png" data-original-src="https://boja.mercury.kr/assets/problem/32563-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 155px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32563.%E2%80%85Drone%E2%80%85Control/8619dea3.png" data-original-src="https://boja.mercury.kr/assets/problem/32563-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 171px;"></td>
		</tr>
		<tr>
			<td>Pitch</td>
			<td>Roll</td>
			<td>Yaw</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure D.1: Pitch, roll and yaw on a <em>Single Copter</em></p>

<p>Define the angles of the flaps to be $n$, $e$, $s$, and $w$ (for "north", "east", "south" and "west" respectively). The forces in the directions of pitch, roll and yaw are defined by the following equations:</p>

<p>\begin{align*} p &amp;= e - w \\ r &amp;= n - s \\ y &amp;= n + e + s + w \end{align*}</p>

<p>As there are four variables and three constraints, you decided that, from the perspective of aerodynamics, it makes sense to make the maximum of the flap angles as small as possible, that is, you additionally want to minimise $\max\{ |n|, |e|, |s|, |w| \}$.</p>

<p>Find the best parameters to send to the <em>Single Copter</em> to achieve the desired pitch, yaw, and roll.</p>

### 입력

<ul>
	<li>One line containing the number $q$, $1 \le q \le 10^4$, the number of requests to follow.</li>
	<li>$i$ further lines, each containing three real numbers $p_i$, $r_i$, $y_i$ ($-1 \le p_i, r_i, y_i \le +1$).</li>
</ul>

### 출력

<p>Output $q$ lines. In the $i$-th line, output the solution for the $i$-th request, four numbers $n_i$, $e_i$, $s_i$, $w_i$, separated by whitespace.</p>

<p>Your answer will be considered correct if the resulting pitch, roll and yaw differ by at most $10^{-6}$ from the requested ones, and the maximum of the absolute values of flap outputs does not exceed the true value by more than $10^{-6}$.</p>
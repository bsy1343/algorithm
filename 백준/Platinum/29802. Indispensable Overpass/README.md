# [Platinum II] Indispensable Overpass - 29802

[문제 링크](https://www.acmicpc.net/problem/29802)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

조합론, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 수학, 누적 합, 트리에서의 전방향 다이나믹 프로그래밍, 트리

### 문제 설명

<p>A modern railroad system built in Ekiya&#39;s town bumped into a major hurdle: the main freeway running north to south. $\mathbf{W}$ stations have already been built and connected on the western side of the freeway and $\mathbf{E}$ on the eastern side. One more connection is needed between a western and an eastern station, but because the freeway is in the way, that connection needs to be built using an overpass.</p>

<p>Ekiya is assessing which stations would be most convenient to connect with the overpass. As part of that assessment, she wants to know how the average length (in number of stations) of a path within the system might change with each possible option.</p>

<p>A path between stations $s$ and $t$ is a list of distinct stations that starts with $s$, ends with $t$, and such that any two consecutive stations on the list share a connection. The railroad system currently has $\mathbf{W}$ stations on the western side, connected through $\mathbf{W}-1$ connections such that there is exactly one path between any two distinct western stations. Similarly, there are $\mathbf{E}$ eastern stations connected through $\mathbf{E}-1$ connections such that there is exactly one path between any two distinct eastern stations. After the overpass connection is built connecting one western and one eastern station, there will be exactly one path between any two distinct stations.</p>

<p>A complete map is a map that has $\mathbf{W}+\mathbf{E}-1$ total connections and exactly one path between any pair of stations. The average distance of a complete map is the average of the length of paths between all pairs of different stations. The length of a path is one less than the length of the list of stations that defines it (e.g., the path between directly connected stations has a length of $1$).</p>

<p>As an example, the picture below illustrates a scenario with $\mathbf{W} = 2$ stations on the west side and $\mathbf{E} = 3$ stations on the east side. There are $2$ possible overpasses shown.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29802.%E2%80%85Indispensable%E2%80%85Overpass/cd552433.png" data-original-src="https://upload.acmicpc.net/22f35861-6fbb-476b-b019-5923026244ad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>This table shows the lengths of the paths between pairs of stations if each overpass were to be built.</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<th style="border: 0;"> </th>
			<th style="border: 0;"> </th>
			<th>$\color{darkred}{\mathbf{1 \leftrightarrow 1}}$</th>
			<th>$\color{darkblue}{\mathbf{2 \leftrightarrow 3}}$</th>
		</tr>
		<tr>
			<td>West $1$</td>
			<td>West $2$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>West $1$</td>
			<td>East $1$</td>
			<td>$1$</td>
			<td>$3$</td>
		</tr>
		<tr>
			<td>West $1$</td>
			<td>East $2$</td>
			<td>$3$</td>
			<td>$3$</td>
		</tr>
		<tr>
			<td>West $1$</td>
			<td>East $3$</td>
			<td>$2$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>West $2$</td>
			<td>East $1$</td>
			<td>$2$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>West $2$</td>
			<td>East $2$</td>
			<td>$4$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>West $2$</td>
			<td>East $3$</td>
			<td>$3$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>East $1$</td>
			<td>East $2$</td>
			<td>$2$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>East $1$</td>
			<td>East $3$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>East $2$</td>
			<td>East $3$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td style="border: 0;"> </td>
			<th>Average:</th>
			<td>$2$</td>
			<td>$1.8$</td>
		</tr>
	</tbody>
</table>

<p>Given the current stations and connections, and a list of options for the overpass connection, help Ekiya by calculating the average distance of the map that would result if that option was the only overpass connection built.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case starts with a line with three integers $\mathbf{W}$, $\mathbf{E}$, and $\mathbf{C}$, the number of western and eastern stations, and the number of options for the overpass connection, respectively. Western stations are numbered between $1$ and $\mathbf{W}$ and eastern connections are numbered between $1$ and $\mathbf{E}$.</p>

<p>The second line of a test case contains $\mathbf{W}-1$ integers $\mathbf{X_1}, \mathbf{X_2}, \dots, \mathbf{X_{W-1}}$ representing that the $i$-th existing connection among western stations connects western stations $i$ and $\mathbf{X_i}$.</p>

<p>The third line of a test case contains $\mathbf{E}-1$ integers $\mathbf{F_1}, \mathbf{F_2}, \dots, \mathbf{F_{E-1}}$ representing that the $j$-th existing connection among eastern stations connects eastern stations $j$ and $\mathbf{F_j}$.</p>

<p>Finally, the last $\mathbf{C}$ lines of a test case describe the options for the overpass connection. The $k$-th of these lines contains two integers $\mathbf{A_k}$ and $\mathbf{B_k}$ representing the western and eastern stations, respectively, that the $k$-th option for an overpass connection would connect.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y<sub>1</sub> y<sub>2</sub> ... y<sub>C</sub></code>, where $x$ is the test case number (starting from 1) and $y_k$ is the average distance of the map resulting in adding the $k$-th option as an overpass connection to all existing connections.</p>

<p>$y_1$, $y_2$, $\dots$ and $y_k$ will be considered correct if they are within an absolute or relative error of $10^{-6}$ of the correct answer.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$2 \le \mathbf{W} \le 10^5$.</li>
	<li>$2 \le \mathbf{E} \le 10^5$.</li>
	<li>$i + 1 \le \mathbf{X_i} \le \mathbf{W}$, for all $i$. (This implies that there is exactly one path between each pair of western stations.)</li>
	<li>$j + 1 \le \mathbf{F_j} \le \mathbf{E}$, for all $j$. (This implies that there is exactly one path between each pair of eastern stations.)</li>
	<li>$1 \le \mathbf{A_k} \le \mathbf{W}$, for all $k$.</li>
	<li>$1 \le \mathbf{B_k} \le \mathbf{E}$, for all $k$.</li>
	<li>$(\mathbf{A_k}, \mathbf{B_k}) \neq (\mathbf{A_\ell}, \mathbf{B_\ell})$, for all $k \neq \ell$. (Each listed overpass connection is different.)</li>
</ul>

### 힌트

<p>Sample Case #1 is explained and illustrated in the problem statement. Sample Case #2 and Sample Case #3 are illustrated below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29802.%E2%80%85Indispensable%E2%80%85Overpass/f86ca709.png" data-original-src="https://upload.acmicpc.net/a0fd40ab-df4d-4287-98ae-d7e5e9ab2365/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
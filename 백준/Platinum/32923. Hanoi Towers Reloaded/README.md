# [Platinum III] Hanoi Towers Reloaded - 32923

[문제 링크](https://www.acmicpc.net/problem/32923)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

다이나믹 프로그래밍, 수학, 애드 혹

### 문제 설명

<p>The <em>Towers of Hanoi</em> is a famous mathematical puzzle consisting of three rods and $n$ disks with diameters $1, 2, \ldots, n$. Each of the three rods contains some disks, stacked in order of decreasing diameter from bottom to top, so that the smallest disk is always at the top. A valid move consists of taking the smallest disk from a rod and putting it on top of another rod. This move must preserve the sorted order: you can't put a larger disk onto a smaller one. The original puzzle's goal is to transfer all disks from one rod to another.</p>

<p>In this variation of the puzzle, you can only move the disks <strong>between adjacent rods</strong>: you can move a disk between rods $1$ and $2$, and between rods $2$ and $3$, but not between rods $1$ and $3$.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32923.%E2%80%85Hanoi%E2%80%85Towers%E2%80%85Reloaded/c8f7e89d.png" data-original-src="https://boja.mercury.kr/assets/problem/32923-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 190px; height: 78px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32923.%E2%80%85Hanoi%E2%80%85Towers%E2%80%85Reloaded/9c58785f.png" data-original-src="https://boja.mercury.kr/assets/problem/32923-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 190px; height: 78px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32923.%E2%80%85Hanoi%E2%80%85Towers%E2%80%85Reloaded/7e65fa9e.png" data-original-src="https://boja.mercury.kr/assets/problem/32923-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 189px; height: 78px;"></td>
		</tr>
		<tr>
			<td>Valid move</td>
			<td>Invalid move: non-adjacent rods</td>
			<td>Invalid move: moving a larger disk onto a smaller one</td>
		</tr>
	</tbody>
</table>

<p>Given two configurations of this puzzle, find the minimum number of moves required to reach the second configuration starting from the first one. As this number might be large, print it modulo $998\,244\,353$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^3$). Descriptions of the test cases follow.</p>

<p>The first line of each test case contains an integer $n$, denoting the number of disks involved ($1 \le n \le 10^5$).</p>

<p>The second line contains $n$ integers $x_1, x_2, \ldots, x_n$, describing the initial configuration of the puzzle, where $x_i$ is the rod that contains the $i$-th disk ($x_i \in \{ 1, 2, 3 \}$).</p>

<p>The third line describes the final configuration of the puzzle in the same format.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print the minimum number of moves required to reach the second configuration from the first one, modulo $998\,244\,353$.</p>

<p>It can be shown that any two configurations are reachable from each other in this variation of the puzzle.</p>
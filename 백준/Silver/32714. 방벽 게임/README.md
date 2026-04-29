# [Silver II] 방벽 게임 - 32714

[문제 링크](https://www.acmicpc.net/problem/32714)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 310, 정답: 200, 맞힌 사람: 183, 정답 비율: 67.033%

### 분류

게임 이론, 애드 혹

### 문제 설명

<p>건덕이와 건구스는 $N$행 $2$열의 칸으로 이루어진 전장에서 승부를 겨루고 있다. 건덕이는 $1$행 $1$열에서 시작하여 말을 $N$행까지 이동해야 한다. 건구스는 칸과 칸 사이에 방벽을 설치하여 건덕이를 저지할 수 있다. </p>

<p>게임은 아래의 순서로 건덕이의 말이 $N$행에 도달할 때까지 반복된다.</p>

<ul>
	<li>건덕이가 말을 상하좌우로 인접한 칸으로 이동한다. 단, 현재 위치한 칸과 이동하려는 칸 사이에 방벽이 있는 경우 해당 칸으로 이동할 수 없다. </li>
	<li>건구스가 게임판 내에서 가로 또는 세로로 연속하는 두 칸을 선택하여 그 사이에 방벽을 설치한다. 단, 건덕이가 $N$행에 도달할 수 없게 막아버리면 안 된다. 조건에 맞게 방벽을 설치할 수 없거나 설치하고 싶지 않다면 차례를 넘길 수 있다.</li>
</ul>

<p>건덕이는 말을 최대한 빨리, 건구스는 최대한 늦게 $N$행에 도달하게 하고자 한다. 모두가 최선을 다할 때, 말이 $N$행에 도달하기 위한 이동 횟수를 구해보자.</p>

### 입력

<p>첫째 줄에 격자의 행 수 $N$이 주어진다. $\left(2 \leq N \leq 1,000,000\right)$</p>

### 출력

<p>말이 $N$행에 도달하기 위한 이동 횟수를 출력한다.</p>

### 힌트

<p>$N = 3$일 때 풀이</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/2e75fa20.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 292px; width: 200px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/d7d08cdf.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 287px; width: 200px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/5519f986.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 287px; width: 200px;"></td>
		</tr>
		<tr>
			<td><strong>초기상태</strong></td>
			<td><strong>1턴</strong> - 건덕이: 말 이동</td>
			<td><strong>1턴</strong> - 건구스: 방벽 설치</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/a5ad3c43.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 284px; width: 200px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/8428edb7.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 288px; width: 200px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32714.%E2%80%85%EB%B0%A9%EB%B2%BD%E2%80%85%EA%B2%8C%EC%9E%84/be134805.png" data-original-src="https://boja.mercury.kr/assets/problem/32714-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 291px; width: 200px;"></td>
		</tr>
		<tr>
			<td><strong>2턴</strong> - 건덕이: 말 이동</td>
			<td><strong>2턴</strong> - 건구스: 방벽 설치</td>
			<td><strong>3턴</strong> - 건덕이: 말 이동 후 도착</td>
		</tr>
	</tbody>
</table>

<p>건덕이와 건구스가 최선으로 게임할 때 말이 $3$턴 후 $N$행에 도착하게 된다.</p>
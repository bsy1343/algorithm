# [Silver IV] 벌집우주와 쿼리 - 33836

[문제 링크](https://www.acmicpc.net/problem/33836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 602, 정답: 249, 맞힌 사람: 150, 정답 비율: 36.145%

### 분류

많은 조건 분기, 수학, 애드 혹

### 문제 설명

<p><code>pjshwa</code>는 로켓을 타고 광활한 벌집우주를 여행하고 있다. 벌집우주는 아래 그림과 같은 좌표계를 사용한다.</p>

<div style="display:flex;flex-direction:column;align-items:center;"><img src="%EB%B0%B1%EC%A4%80/Silver/33836.%E2%80%85%EB%B2%8C%EC%A7%91%EC%9A%B0%EC%A3%BC%EC%99%80%E2%80%85%EC%BF%BC%EB%A6%AC/91ec6ec1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33836-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:400px;max-width:100%"></div>

<p>$(x, y)$에 위치한 로켓은 방향각 $r^\circ$와, 이동할 거리 $t$를 정하여 다음 6가지 좌표 중 하나로 갈 수 있다.</p>

<table align="center" border="1" cellpadding="5px" cellspacing="0" class="table table-bordered" style="text-align: center; max-width: 500px;">
	<thead>
		<tr>
			<th scope="col" style="text-align: center;">방향각 $r^\circ$</th>
			<th scope="col" style="text-align: center;">이동 후 좌표</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>$0^\circ$</td>
			<td>$(x + t, y)$</td>
		</tr>
		<tr>
			<td>$60^\circ$</td>
			<td>$(x + t, y + t)$</td>
		</tr>
		<tr>
			<td>$120^\circ$</td>
			<td>$(x, y + t)$</td>
		</tr>
		<tr>
			<td>$180^\circ$</td>
			<td>$(x - t, y)$</td>
		</tr>
		<tr>
			<td>$240^\circ$</td>
			<td>$(x - t, y - t)$</td>
		</tr>
		<tr>
			<td>$300^\circ$</td>
			<td>$(x, y - t)$</td>
		</tr>
	</tbody>
</table>

<p>멀미가 심한 <code>pjshwa</code>는 로켓의 방향을 가능한 적게 바꾸고 싶다. 가고 싶은 좌표 $Q$개가 주어질 때, $(0, 0)$에서 $0^\circ$ 방향으로 놓여 있는 로켓이 그 좌표에 도달하기 위해 필요한 최소 방향 전환 횟수를 계산하자!</p>

### 입력

<p>첫 번째 줄에 <code>pjshwa</code>가 가고 싶어 하는 좌표의 개수 $Q$가 주어진다. $(1 \leq Q \leq 100\,000)$</p>

<p>두 번째 줄부터 $Q$개의 줄에 걸쳐 좌표를 나타내는 정수 $x, y$가 공백으로 구분되어 주어진다. $(-10^9 \leq x, y \leq 10^9)$</p>

### 출력

<p>각 좌표마다 $(0, 0)$에서 $0^\circ$ 방향으로 놓여 있는 로켓이 해당 좌표에 도달하기 위해 필요한 최소 방향 전환 횟수를 한 줄에 하나씩 출력한다.</p>
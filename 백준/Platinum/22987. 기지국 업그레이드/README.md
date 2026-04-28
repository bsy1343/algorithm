# [Platinum I] 기지국 업그레이드 - 22987

[문제 링크](https://www.acmicpc.net/problem/22987)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 123, 정답: 52, 맞힌 사람: 35, 정답 비율: 39.326%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 트리를 사용한 집합과 맵, 값 / 좌표 압축

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/7604823e-c3a0-4c04-a7a9-15a999ffd055/-/preview/" style="width:100%" /><br />
<img alt="" src="https://upload.acmicpc.net/2385993d-7d85-4a58-a129-885f8aeebdd2/-/preview/" style="width:100%" /></p>

<p>천재 과학자 토끼가 사는 도시에는 동서로 길게 뻗어있는 도로가 있고, 이 도로를 따라서 $N$ 개의 기지국이 세워져 있다. 이 기지국은 도로에서의 원활한 통신을 도와준다. 편의상 도로 위에 있는 시청에서 동쪽으로 $X$만큼 떨어진 곳을 위치 $X$라고 하자($X &lt; 0$인 경우에는, 서쪽으로 $-X$ 만큼 떨어져 있다.) $i$ 번 기지국은 위치 $X_i$ 에 있으며, 크기가 $H_i$이다. 기존 1세대 통신 방법을 사용하면 $i$ 번 기지국으로부터 거리가 $H_i$ 이하인 모든 위치에 1세대 통신 방법으로 통신을 할 수 있다. 즉 $p$가 폐구간 $\left[X_i-H_i, X_i+H_i\right]$ 안에 속해있으면 위치 $p$에서 $i$ 번 기지국과 1세대 통신 방법으로 통신을 할 수 있다.</p>

<p>토끼는 새로운 2세대 통신 방법을 개발했다. 이 통신 방법을 사용하면 대용량 통신을 할 수 있고, 통신 거리가 $3$배씩 늘어서 $i$ 번 기지국과 거리가 $3H_i$ 이하인 모든 위치에 2세대 통신 방법으로 통신을 할 수 있다. 즉 $p$가 폐구간 $\left[X_i-3H_i, X_i+3H_i\right]$ 안에 속해있으면 위치 $p$에서 $i$ 번째 기지국과 2세대 통신 방법으로 통신을 할 수 있다. 2세대 통신 방법에는 치명적인 문제가 있는데, 기지국이 너무 촘촘하게 있으면 서로 간섭을 일으킬 수 있다. 어떤 위치가 2개 이상의 기지국과 1세대 통신 방법으로 통신을 할 수 있을 정도로 가까이 있으면, 해당 위치에서 전파 간섭이 일어난다. 다시 말하면, $\left\lvert X_j-X_k \right\rvert&nbsp;\le H_j + H_k$인 경우에 $j$ 번 기지국과 $k$ 번 기지국이 담당하는 범위가 겹쳐서 전파 간섭이 일어난다.</p>

<p>이 도시의 시장 로얄은, 기존에 있는 기지국 중 일부를 2세대 통신으로 업그레이드하고, 나머지 기지국을 철거하는 방식으로 2세대 통신을 지원하려고 한다. 이때, 업그레이드한 기지국끼리는 서로 전파 간섭이 일어나서는 안 되고, 하위 호환성을 위해 기존의 1세대 통신 방법을 사용하여 통신을 할 수 있었던 위치에서 2세대 통신 방법을 사용하여 통신할 수 있어야 한다. 다시 말해서, 위치 $x$에 대해 $x \in \left[X_i-H_i, X_i+H_i\right]$인 $i$가 존재하면, 2세대 통신으로 업그레이드 한 $j$ 번 기지국이 존재해서 $x \in \left[X_j-3H_j, X_j+3H_j\right]$를 만족해야 한다.&nbsp;로얄을 도와서 어떤 기지국을 2세대 통신으로 업그레이드해야 하는지 계산해주자.&nbsp;<strong>업그레이드할 기지국의 개수를 최소화할 필요가 없음에 유의하자.</strong></p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td style="width: 35%; text-align: center;"><img alt="" src="https://upload.acmicpc.net/ba13205a-5c01-4ddb-b94c-6429c2257c95/-/preview/" style="width:100%" /></td>
			<td style="width: 64%; text-align: center;"><img alt="" src="https://upload.acmicpc.net/bdf8f832-fdea-4c91-ae46-8129c309a95d/-/preview/" style="width:100%" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">(a) 전파 간섭으로 인해 업그레이드 불가</td>
			<td style="text-align: center;">(b) 하위 호환성을 만족하지 않는 상황</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: center;">조건을 만족하지 않는 2세대 업그레이드 예시</td>
		</tr>
	</tbody>
</table>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;">
<p>$N$ &nbsp;</p>

<p>$X_1$ $H_1$</p>

<p>$\dots$</p>

<p>$X_N$ $H_N$</p>
</div>

<ul>
	<li>$N$은 기지국의 개수이다. ($1 \le N \le 500\,000$)</li>
	<li>$X_i$는 $i$ 번 기지국의 위치이다. ($-10^{18} \le X_i \le 10^{18}$)</li>
	<li>$H_i$는 $i$ 번 기지국의 높이이다. ($1 \le H_i \le 10^{18}$)</li>
	<li>입력으로 주어지는 모든 수는 정수다.</li>
</ul>

### 출력

<p>첫째 줄에 2세대 통신으로 업그레이드할 기지국의 수 $M$을 출력한다. 그다음 줄에, 2세대 통신으로 업그레이드할 기지국의 번호 $M$ 개를 공백으로 구분하여 출력한다. 답이 여러 가지면 그 중 아무거나 하나를 출력한다.</p>

<p>만약 문제의 조건을 만족하면서 업그레이드할 기지국을 고르는 것이 불가능하다면, 대신에 첫 번째 줄에 <code><span style="color:#e74c3c;">-1</span></code>을 출력한다.</p>
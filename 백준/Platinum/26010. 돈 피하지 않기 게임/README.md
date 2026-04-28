# [Platinum II] 돈 피하지 않기 게임 - 26010

[문제 링크](https://www.acmicpc.net/problem/26010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 90, 정답: 26, 맞힌 사람: 20, 정답 비율: 25.974%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/ea5f66dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/ea5f66dc.png" data-original-src="https://upload.acmicpc.net/27edf74b-e3d8-4fcd-834a-384cf1ca4ceb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 400px;" /></p>

<p>HI-ARC Games의 신작 게임 &quot;돈 피하지 않기&quot;가 출시되었다. 이 게임은 흔히 &quot;똥 피하기&quot;라고 알려진 게임과 유사하지만, 모든 똥을 피해야 하는 &quot;똥 피하기&quot;와 다르게 &quot;돈 피하지 않기&quot;는 모든 돈을 모아야 한다. 게임은 각 칸을 $(x, y)$로 나타내는 $2$차원 격자에서 진행된다. 그린은 초기에 $(0, 0)$ 칸에 위치해 있으며, $y &lt; 0$인 칸들은 전부 땅이다.</p>

<p>&larr;키와 &rarr;키를 눌러서 땅 위($y=0$)에서 그린을 각각 좌, 우로 움직일 수 있으며, &uarr;키를 이용하면 점프를 하여 잠시 $y=1$까지 올라갈 수 있다. 그린은 일정한 속도로 아래로 떨어지는 $N$개의 돈을 하나도 빠짐없이 모아야 한다. 돈은 땅을 뚫고 내려가므로, 땅 아래 ($y &lt; 0$)까지 도달하게 된다면 그 돈을 먹을 방법이 없어지므로 게임오버이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/d66ae077.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/d66ae077.png" data-original-src="https://upload.acmicpc.net/1b4faf85-c532-4282-86e6-b5306b8eef95/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 600px;" /></p>

<p>돈은 매초마다 아래로 한 칸 움직이며, 그린은 매초 플레이어가 어떤 키를 누르느냐에 따라 위의 그림과 같이 움직인다. 반투명한 캐릭터가 그려진 칸이 $t-1$초에 마지막으로 방문한 칸이라면, $t$초에는 화살표를 따라 차례대로 칸을 방문한다. &quot;!&quot;가 그려진 칸이 $t$초에 마지막으로 방문하게 되는 칸이다. (자세한 정의는 하단의 [노트]에 나와 있다.)</p>

<p>만약 돈이 움직여 도착한 칸을 그린이 같은 초에 방문한다면, 그 돈을 얻을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/b1461a46.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26010.%E2%80%85%EB%8F%88%E2%80%85%ED%94%BC%ED%95%98%EC%A7%80%E2%80%85%EC%95%8A%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/b1461a46.png" data-original-src="https://upload.acmicpc.net/6d5ba0a5-d0c0-4790-ad5d-ad410cd2d1d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 300px;" /></p>

<p>예를 들어 $t-1$초에 그린은 $(0,0)$에 있고, $5$개의 돈이 각각 $(0,1), (0,2), (1,0), (1,1), (1,2)$에 있다고 해보자. 만약 &rarr;키 + &uarr;키를 누른다면,  $t$초에 $(1,1)$로 이동하는 $5$번째 돈과 $(1, 0)$으로 이동하는 $4$번째 돈을 수집할 수 있다. 이때 $(0,0)$은 그린이 $t-1$초에 방문했었던 칸이지, $t$초에 방문한 칸이 아니므로 $1$번째 돈은 모을 수 없다. 반면에 &uarr;키만 눌렀거나 아무 키도 누르지 않았다면, 방문하는 칸에 $(0, 0)$이 포함되어 있기 때문에 $1$번째 돈을 모을 수 있다.</p>

<p>이 게임의 모든 룰의 파악한 연두는 드디어 게임을 플레이해 보려고 한다. 하지만, 백준 랭작을 너무 많이 해서 손가락 관절이 좋지 않은 연두는 최소한의 힘만을 이용해서 이 게임에서 승리하고자 한다. &larr;키나 &rarr;키를 한번 누르는 것은 $P_{lr}$의 힘이, &uarr;키를 한번 누르는 것은 $P_j$의 힘이 소모된다. 모든 돈을 모아 게임에서 승리하기 위해, 힘을 최소 얼마나 소모해야 할지 구해보자.</p>

### 입력

<p>첫째 줄에 $N$, $P_{lr}$, $P_j$가 주어진다. ($1 \le N, P_{lr}, P_j \le 10^5$)</p>

<p>다음 $N$개의 줄에, $i$번째 돈의 초기 위치 $x_i$와 $y_i$가 주어진다. 모든 돈의 초기 위치는 다르다. ($-10^9 \le x_i \le 10^9, 1 \le y_i \le 10^9$)</p>

<p>입력에서 주어지는 모든 수는 정수이다.</p>

### 출력

<p>$N$개의 돈을 모두 모으는 것이 가능하다면, 그때 소모되는 힘의 합의 최솟값을 출력한다.</p>

<p>$N$개의 돈을 모두 모으는 것이 불가능하다면, 대신 $-1$을 출력한다.</p>

### 힌트

<ul>
	<li>$0$초에 각 돈은 입력에서 주어진 초기 위치에 존재하며, 그린은 $(0, 0)$을 방문한다.</li>
	<li>$t (t&gt;0)$초에 돈과 그린은 다음과 같이 움직인다.
	<ul>
		<li>$t-1$초에 $(x, y)$에 위치했던 돈은, $t$초에 $(x, y-1)$에 위치한다.</li>
		<li>$t-1$초에 마지막으로 그린이 방문한 칸이 $(x, 0)$이라면, 어떤 키를 누르냐에 따라 $t$초에 다음과 같은 칸을 순서대로 방문한다.
		<ul>
			<li>
			<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 500px;">
				<thead>
					<tr>
						<th scope="row">누른 키</th>
						<th scope="col">방문하는 칸 (순서대로)</th>
						<th scope="col">소모되는 힘</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>&larr;키</td>
						<td>$(x-1, 0)$</td>
						<td>$P_{lr}$</td>
					</tr>
					<tr>
						<td>아무 키도 누르지 않음</td>
						<td>$(x, 0)$</td>
						<td>$0$</td>
					</tr>
					<tr>
						<td>&rarr;키</td>
						<td>$(x+1, 0)$</td>
						<td>$P_{lr}$</td>
					</tr>
					<tr>
						<td>&larr;키 + &uarr;키</td>
						<td>$(x-1, 1) \rightarrow (x-1, 0)$</td>
						<td>$P_{lr}$ + $P_{j}$</td>
					</tr>
					<tr>
						<td>&uarr;키</td>
						<td>$(x, 1) \rightarrow (x,0)$</td>
						<td>$P_{j}$</td>
					</tr>
					<tr>
						<td>&rarr;키 + &uarr;키</td>
						<td>$(x+1, 1) \rightarrow (x+1, 0)$</td>
						<td>$P_{lr}$ + $P_{j}$</td>
					</tr>
				</tbody>
			</table>
			</li>
		</ul>
		</li>
	</ul>
	</li>
	<li>$t$초에 어떤 돈이 위치하는 칸을, $t$초에 그린이 방문하게 된다면 그 돈을 모을 수 있다.</li>
</ul>
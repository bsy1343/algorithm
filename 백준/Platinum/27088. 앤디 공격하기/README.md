# [Platinum III] 앤디 공격하기 - 27088

[문제 링크](https://www.acmicpc.net/problem/27088)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 29, 맞힌 사람: 25, 정답 비율: 40.323%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제

### 문제 설명

<p>이 문제에서 두 지점 사이의 거리는 택시 거리로 계산된다. 두 점 $(x_1, y_1)$과 $(x_2, y_2)$ 사이의 택시 거리는 $(|x_1 - x_2| + |y_1 - y_2|)$이다.</p>

<p>앤디를 싫어하는 싸이컴 부원 $N$명이 앤디를 공격하려고 한다. 각 부원이 앤디를 공격할 때, 다음과 같은 성질을 가진다.</p>

<ul>
	<li>각 부원이 앤디를 공격하려면 앤디가 보여야 한다. 시야 방향은 $+x, -x, +y, -y$ 중 하나이고 시야각은 좌우 45도이다. 앤디와 부원이 같은 위치에 있는 경우, 또 시야각에 걸치는 경우에도 볼 수 있다고 가정한다.</li>
	<li>앤디를 공격하는 공격력은 부원과 앤디 사이의 거리와 같다.</li>
</ul>

<p>앤디를 물리치려면 $N$명의 공격력의 합이 앤디의 체력 $k$ 이상이 되어야 한다.</p>

<p>예를 들어, $k=23$이고 아래와 같이 위치하는 경우를 생각하자. 아래 예시는 예제 1과 같다.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27088.%E2%80%85%EC%95%A4%EB%94%94%E2%80%85%EA%B3%B5%EA%B2%A9%ED%95%98%EA%B8%B0/7230b997.png" data-original-src="https://upload.acmicpc.net/34f54917-6037-402a-847b-6206361eddf2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27088.%E2%80%85%EC%95%A4%EB%94%94%E2%80%85%EA%B3%B5%EA%B2%A9%ED%95%98%EA%B8%B0/1acb992a.png" data-original-src="https://upload.acmicpc.net/820d9af7-e336-4d54-94ba-6268ee47ef70/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
	</tbody>
</table>

<p>위와 같은 위치에서 앤디를 공격할 수 있는 사람은 1과 2 뿐이므로 앤디가 받는 공격량은 17이다. 여기서 3번을 왼쪽으로 5만큼 움직였을 때, 앤디가 받는 공격이 25가 되므로 앤디를 물리칠 수 있고, 이 경우가 최적이다.</p>

<p>$k$와 앤디를 포함한 싸이컴 부원 $N+1$명의 위치 및 시야 방향이 주어질 때, 앤디를 물리치기 위해 필요한 $N$명의 이동 거리의 합의 최솟값을 출력하라. 단, 여러 명이 같은 위치에 존재해도 문제가 없으며, 공간에는 제약이 없어 얼마든지 원하는 방향으로 이동할 수 있다고 가정한다.</p>

### 입력

<p>첫 줄에 두 정수 $N$과 $k$가 주어진다.</p>

<p>둘째 줄에 앤디의 좌표 $X_0$와 $Y_0$가 주어진다.</p>

<p>셋째 줄부터 $N+2$번째 줄까지 $N$명의 좌표 정보와 시야 정보가 주어진다. 구체적으로 $i+2$번째 줄에는 $i$번째 부원의 좌표 $X_i$와 $Y_i$, 그리고 보는 방향 $S_i$가 주어진다. $S_i$는 0, 1, 2, 3 중 하나이며, 각각 $+x$, $-x$, $+y$, $-y$ 방향을 의미한다.</p>

### 출력

<p>앤디를 물리치기 위해 필요한 $N$명의 이동 거리의 합의 최솟값을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 10^3$</li>
	<li>$1 \le k \le 10^3$</li>
	<li>$1 \le X_i \le 10^3~(0 \le i \le N)$</li>
	<li>$1 \le Y_i \le 10^3~(0 \le i \le N)$</li>
	<li>$0 \le S_i \le 3~(0 \le i \le N)$</li>
	<li>입력으로 들어오는 모든 수는 정수이다.</li>
</ul>

### 힌트

<p>문제 이미지의 방향은 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27088.%E2%80%85%EC%95%A4%EB%94%94%E2%80%85%EA%B3%B5%EA%B2%A9%ED%95%98%EA%B8%B0/c5179e54.png" data-original-src="https://upload.acmicpc.net/5aa4ad3d-25c0-4886-ba21-c99901737982/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
# [Gold I] Azber is playing at Biou's house - 27528

[문제 링크](https://www.acmicpc.net/problem/27528)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 83, 정답: 67, 맞힌 사람: 61, 정답 비율: 80.263%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Azber는 Biou의 집에 놀러 가서 게임을 한다. Biou의 집에는 지하 $0$층부터 $N-1$층까지 있으며, $i$층에 $2^i$번부터 $2^{i+1}-1$번 방이 있다. 각 방에는 수가 부여되는데, $j(1 \leq j \leq 2^N-1)$번 방에는 수 $a_j$가 부여된다.</p>

<p>Biou의 집에는 한 방에서 다른 방으로 이동할 수 있는 통로가 있다. 같은 층에 있는 인접한 번호를 가진 방 사이에는 양방향 통로가 있다. 모든 $i&gt;1$번 방에서는 $\lfloor \frac{i}{2}\rfloor$번 방으로 가는 단방향 통로가 있다.</p>

<p>Azber과 Biou는 Azber를 시작으로 턴을 번갈아 가면서 로봇을 조종하는 게임을 한다. 게임을 시작할 때 로봇을 놓을 방은 Azber와 Biou가 합의하여 결정한다. 아래의 그림은 $N=3$이고 로봇이 $5$번 방에서 시작하는 게임을 묘사한다. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27528.%E2%80%85Azber%E2%80%85is%E2%80%85playing%E2%80%85at%E2%80%85Biou's%E2%80%85house/eeb90f9d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27528.%E2%80%85Azber%E2%80%85is%E2%80%85playing%E2%80%85at%E2%80%85Biou's%E2%80%85house/eeb90f9d.png" data-original-src="https://upload.acmicpc.net/d48ad3dc-7287-4d97-a5f3-4b67ab3607f4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 286px; width: 500px;" /></p>

<p>각 플레이어는 자신의 차례에 다음의 행동 중 하나를 선택할 수 있다.</p>

<ul>
	<li>로봇을 통로를 따라서 다른 방으로 이동시킨다. 단, 로봇은 예전에 방문했던 방으로 다시 이동할 수 없다. 처음에 로봇이 있던 방도 로봇이 방문했던 방으로 생각한다.</li>
	<li>게임의 종료를 선언한다.</li>
</ul>

<p>플레이어에 의해 게임의 종료가 선언되면 게임이 종료된다. 로봇이 $1$번 방에 있으면 더 이상 움직일 곳이 없으므로 게임이 종료된다. 게임의 점수는 로봇이 방문한 방에 부여된 수들의 합으로 결정된다. Azber는 게임의 점수를 최대한 작게 하고 싶고, Biou는 게임의 점수를 최대한 크게 하고 싶다. Azber과 Biou는 게임에 대한 이해도가 높아서 항상 최적으로 플레이한다.</p>

<p>Azber과 Biou는 심심해서 모든 방에 대해서 그 방에서 로봇이 시작할 때 게임의 최종 점수가 궁금해졌다. Azber과 Biou의 궁금증을 해결해주자!</p>

### 입력

<p>첫 번째 줄에는 Biou의 집의 층 수 $N$이 주어진다. ($1 \leq N \leq 11$)</p>

<p>두 번째 줄에는 $1$번 방부터 $2^N-1$번 방까지 각 방에 부여된 수 $a_1, a_2, \cdots , a_{2^N-1}$이 공백으로 구분되어 주어진다. ($-10^9 \leq a_i \leq 10^9$, $a_i$는 정수)</p>

### 출력

<p>$2^N-1$개의 정수를 공백으로 구분하여 출력한다. $i$번째 정수는 로봇 $i$번 방에서 시작할 때 게임의 최종 점수이다.</p>
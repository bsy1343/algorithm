# [Platinum III] 마법의 도넛 게임 - 31810

[문제 링크](https://www.acmicpc.net/problem/31810)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Albert는 균등한 크기의 $N$ 개의 칸으로 구성된 도넛 모양의 게임 보드를 이용한 마법의 도넛 게임 놀이를 즐겨한다.</p>

<p>우선 도넛 모양의 게임 보드의 칸 중 하나를 &quot;기준 칸&quot;으로 삼아 12시 방향에 놓이도록 한 후, 각 칸에는 시계 방향 순으로 $V_1, V_2, \dots, V_N$ 의 정수 값을 적어넣는다. 예를 들어 아래 그림은 $N = 7, V = [2, 0, 2, 4, 9, 9, 9]$ 인 경우를 나타내며 &quot;기준 칸&quot;은 화살표로 강조되어있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/34fd4d1f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/34fd4d1f.png" data-original-src="https://upload.acmicpc.net/5799c133-8276-4fde-90fb-cc54e6964b04/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 250px; width: 250px;" /></p>

<p>이후, 지시 사항이 적힌 카드 $M$ 장을 순서대로 뽑아 카드에 적힌 지시 사항을 수행한다 - 각 카드에는 3개의 정수가 적혀있는데, 편의상 $i$ 번째 카드에 적힌 3개의 정수를 순서대로 $S_i, X_i, Y_i$ 라 하자. 총 다섯 종류의 지시 사항이 있으며, 각 카드에 적힌 첫 번째 정수 ($S_i$)의 값이 지시 사항의 내용을 결정한다 (즉, $S_i \in \{1, 2, 3,4, 5\}$).</p>

<ul>
	<li>$1$ $X_i$ $0$ : 게임 보드를 반시계 방향으로 $X_i$ 칸만큼 돌린다. 이 경우 항상 $Y_i = 0$ 이 적혀있다.</li>
	<li>$2$ $X_i$ $0$ : 게임 보드를 시계 방향으로 $X_i$ 칸만큼 돌린다. 이 경우 항상 $Y_i = 0$ 이 적혀있다.</li>
	<li>$3$ $0$ $0$ : 게임 보드를 12시-6시 축을 기준으로 뒤집는다. 이 경우 항상 $X_i = Y_i = 0$ 이 적혀있다.</li>
	<li>$4$ $X_i$ $Y_i$ : 게임 보드의 기준칸부터 시작하여 시계 방향으로 총 $X_i$ 개의 칸에 적힌 값을 각각 $Y_i$ 씩 증가시킨다.</li>
	<li>$5$ $X_i$ $0$ : 게임 보드의 기준칸부터 시작하여 시계 방향으로 총 $X_i$ 개의 칸에 적힌 값을 모두 더하여 메모지에 기록한다 (메모지에 $j$ 번째로 적은 값을 $O_j$ 라 하자).</li>
</ul>

<p>예를 들어 $M = 9$ 이고 $S = [1, 4, 5, 5, 3, 5, 2, 4, 5]$, $X = [2, 4, 3, 5, 0, 3, 2, 4, 3]$, $Y = [0, 3, 0, 0, 0, 0, 0, 2, 0]$ 이라 하자.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>게임 보드 상태</td>
			<td>설명</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/34fd4d1f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/34fd4d1f.png" data-original-src="https://upload.acmicpc.net/5799c133-8276-4fde-90fb-cc54e6964b04/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 250px; width: 250px;" /></td>
			<td>
			<p>게임을 시작할 때의 게임 보드 상태이다.</p>

			<p>화살표로 표시된 칸이 &quot;기준칸&quot; 현재 시점의 기준칸이다.</p>
			</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/92150dbd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/92150dbd.png" data-original-src="https://upload.acmicpc.net/9249052e-cc51-4606-97d2-9e07eb6eef6e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 249px; width: 250px;" /></td>
			<td>1번 카드를 뽑은 후 게임 보드를 반시계 방향으로 2칸 돌린 이후의 게임 보드 상태이다.</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/dda82ca4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/dda82ca4.png" data-original-src="https://upload.acmicpc.net/17068189-195c-4dcd-b851-b79a6054f4e4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 252px; width: 250px;" /></td>
			<td>2번 카드를 뽑은 후 4개의 칸에 각각 3씩 더한 이후의 게임 보드 상태이다.</td>
		</tr>
		<tr>
			<td> </td>
			<td>
			<p>3번 카드를 뽑아 총 3개의 칸에 적힌 값을 모두 더하면 $5 + 7 + 12 = 24$가 되므로 $O_1 = 24$ 이다.</p>

			<p>게임 보드의 상태는 변화가 없다.</p>
			</td>
		</tr>
		<tr>
			<td> </td>
			<td>
			<p>4번 카드를 뽑아 총 5개의 칸에 적힌 값을 모두 더하면 $5 + 7 + 12 + 12 + 9= 45$가 되므로 $O_2 = 45$ 이다.</p>

			<p>게임 보드의 상태는 변화가 없다.</p>
			</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/0dce32d2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/0dce32d2.png" data-original-src="https://upload.acmicpc.net/bfd5c26c-e03a-4356-9122-43ba23efc618/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 248px; width: 250px;" /></td>
			<td>5번 카드를 뽑아 게임 보드를 뒤집은 이후의 게임 보드 상태이다. 12시 방향을 가리키는 기준칸은 위치가 변하지 않음에 유의하자.</td>
		</tr>
		<tr>
			<td> </td>
			<td>
			<p>6번 카드를 뽑아 총 3개의 칸에 적힌 값을 모두 더하면 $5 + 0 + 2 = 7$이 되므로 $O_3 = 7$ 이다.</p>

			<p>게임 보드의 상태는 변화가 없다.</p>
			</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/8b271e6d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/8b271e6d.png" data-original-src="https://upload.acmicpc.net/32d9e40b-0b82-4c47-bc2a-9920d05c49f1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 250px; width: 250px;" /></td>
			<td>7번 카드를 뽑은 후 게임 보드를 시계 방향으로 2칸 돌린 이후의 게임 보드 상태이다.</td>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/ad28bf88.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31810.%E2%80%85%EB%A7%88%EB%B2%95%EC%9D%98%E2%80%85%EB%8F%84%EB%84%9B%E2%80%85%EA%B2%8C%EC%9E%84/ad28bf88.png" data-original-src="https://upload.acmicpc.net/5c96cd2e-1855-4e03-9261-63b3e9beadcd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 252px; width: 250px;" /></td>
			<td>8번 카드를 뽑은 후 4개의 칸에 각각 2씩 더한 이후의 게임 보드 상태이다.</td>
		</tr>
		<tr>
			<td> </td>
			<td>
			<p>9번 카드를 뽑아 총 3개의 칸에 적힌 값을 모두 더하면 $14 + 9 + 7 = 30$이 되므로 $O_4 = 30$ 이다.</p>

			<p>게임 보드의 상태는 변화가 없다.</p>
			</td>
		</tr>
	</tbody>
</table>

<p>이 때 5번 종류의 지시사항이 적힌 카드는 총 4장이므로 $O = [24, 45, 7, 30]$  가 된다.</p>

<p>입력으로 $N, M, V, S, X, Y$ 값이 주어졌을 때, 위 놀이를 마친 후 메모지에 적힌 값들을 구해보자 (즉, $O_1, O_2, \dots$ 값을 구하면 된다).</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$ 가 주어진다.</p>

<p>각 테스트의 첫 줄에는 $N, M$이 공백으로 구분되어 주어진다. 둘째 줄에는 배열 $V$ 의 원소인 $N$ 개의 정수가 공백으로 구분되어 주어진다. 셋째 줄에는 배열 $S$ 의 원소인 $M$ 개의 정수가 공백으로 구분되어 주어진다. 넷째 줄에는 배열 $X$ 의 원소인 $M$ 개의 정수가 공백으로 구분되어 주어진다. 다섯째 줄에는 배열 $Y$ 의 원소인 $M$ 개의 정수가 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답이 되는 배열  $O$ 의 값을 공백으로 구분하여 각 줄에 출력한다. 단, 이 값이 매우 커질 수 있으므로 $O$ 의 각 원소를 $10^9 + 7$ 로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 10$</li>
	<li>$3 \le N \le 250,000$</li>
	<li>$3 \le M \le 123,456$</li>
	<li>$1 \le i \le N$ 인 각 $i$에 대하여: $0 \le V_i \le 10^9$</li>
	<li>$1 \le j \le M$ 인 각 $j$에 대하여:
	<ul>
		<li>$S_j \in \{1, 2, 3, 4, 5\}$</li>
		<li>$S_j = 3$ 인 경우 $X_j = 0$ 이고, $S_j \neq 3$ 인 경우 $1 \le X_j \le N$</li>
		<li>$S_j \neq 4$ 인 경우 $Y_j = 0$ 이고, $S_j = 4$ 인 경우 $1 \le Y_j \le 10^9$</li>
	</ul>
	</li>
	<li>$1 \le V_i \le 10^9$</li>
	<li>입력으로 주어진 배열 $S$ 에서 최소 1개의 원소는 $S_j = 5$ 임이 보장된다 - 즉, 출력해야 하는 배열 $O$ 가 비어있는 경우는 입력으로 주어지지 않는다.</li>
</ul>
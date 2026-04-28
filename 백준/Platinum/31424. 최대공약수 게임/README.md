# [Platinum II] 최대공약수 게임 - 31424

[문제 링크](https://www.acmicpc.net/problem/31424)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 185, 정답: 48, 맞힌 사람: 42, 정답 비율: 37.500%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 비트마스킹, 게임 이론

### 문제 설명

<p>철수와 영희는 $N$개의 카드로 구성된 카드 뭉치와 칠판을 가지고 최대공약수 카드 게임을 진행한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31424.%E2%80%85%EC%B5%9C%EB%8C%80%EA%B3%B5%EC%95%BD%EC%88%98%E2%80%85%EA%B2%8C%EC%9E%84/9ffc6df4.webp" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31424.%E2%80%85%EC%B5%9C%EB%8C%80%EA%B3%B5%EC%95%BD%EC%88%98%E2%80%85%EA%B2%8C%EC%9E%84/9ffc6df4.webp" data-original-src="https://u.acmicpc.net/92493f8d-8aaa-471d-9156-1f186fba035a/download.webp" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 550px; height: 353px;" /></p>

<p>각 카드는 $1$번부터 $N$번까지 번호가 매겨져 있고 $i$번 카드에는 양의 정수 $A_i$가 적혀 있으며 칠판에는 $2$ 이상의 정수 $X$가 적혀 있다. 게임은 철수부터 시작해서 아래의 과정을 수행하며 턴을 진행한다.</p>

<ol>
	<li>카드 뭉치에서 카드를 하나 고른다. 이때 칠판에 적힌 수와 플레이어가 고른 카드에 적힌 수의 최대공약수가 $1$이면 안 된다.</li>
	<li>칠판에 적힌 수와 카드에 적힌 수의 최대공약수를 칠판에 새로 적고, 원래 칠판에 적힌 수는 지운다.</li>
	<li>플레이어가 고른 카드는 카드 뭉치에서 제외한다.</li>
</ol>

<p>자신의 턴에 카드 뭉치에서 고를 수 있는 카드가 없을 때 (더 이상 카드가 없거나 어떤 카드를 고르더라도 칠판에 적힌 수가 $1$이 되는 경우) 해당 플레이어는 패배하게 된다. 철수와 영희는 이 게임에서 최선의 전략을 알고 있고 이를 활용하여 게임에 참여한다. 게임을 시작하기 전 칠판에 적힌 수와 카드의 조합이 주어졌을 때 승자를 판단해 보자.</p>

### 입력

<p>첫 번째 줄에 카드의 수 $N$, 칠판에 적은 양의 정수 $X$가 공백으로 구분되어 주어진다. $(1 \leq N \leq 300;$ $2 \leq X \leq 10^9)$</p>

<p>두 번째 줄에 카드에 적힌 양의 정수 $A_1, A_2, \dots, A_N$가 공백으로 구분되어 주어진다. $(1 \leq A_i \leq 10^9)$</p>

### 출력

<p>철수가 이긴다면 <span style="color:#e74c3c;"><code>First</code></span>, 영희가 이긴다면 <span style="color:#e74c3c;"><code>Second</code></span>를 출력한다.</p>
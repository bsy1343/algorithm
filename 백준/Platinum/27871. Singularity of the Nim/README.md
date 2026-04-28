# [Platinum I] Singularity of the Nim - 27871

[문제 링크](https://www.acmicpc.net/problem/27871)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 210, 정답: 113, 맞힌 사람: 84, 정답 비율: 59.574%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p><em>지수적 계단 님</em>(Exponential staircase nim)은 $N$칸으로 이루어진 계단에서 <em>수많은</em> 코인을 가지고 하는 게임이다.</p>

<p>지수적 계단 님은 두 사람이 차례를 번갈아 가면서 하는 게임으로, 계단의 각 칸에 몇 개의 코인을 올려둔 상태에서 게임을 시작한다.</p>

<p>밑에서 $i$번째 칸에 올려둔 코인의 개수를 $C_i$라고 하자. 다음 그림은 $N=4$, $C=[3, 1, 0, 2]$인 예를 나타낸다.</p>

<p style="margin-top: 0px; margin-bottom: 10px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27871.%E2%80%85Singularity%E2%80%85of%E2%80%85the%E2%80%85Nim/8978cff5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27871.%E2%80%85Singularity%E2%80%85of%E2%80%85the%E2%80%85Nim/8978cff5.png" data-original-src="https://upload.acmicpc.net/1262c0b1-318f-4819-8c11-ba428198fdd5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 500px;" /></p>

<p>게임을 하는 두 사람은 각자의 차례에 코인이 있는 계단 칸을 하나 골라 $1$개에서 $P$개 사이의 코인을 가져와야 한다.</p>

<p>밑에서 $i$번째 칸에서 $x$개의 코인을 가져오면, $x$의 값에 따라 그 밑에 있는 모든 칸에 새로운 코인이 지수적으로 추가된다. 정확히 말해, 밑에서 $j(&lt;i)$번째 칸에는 $x^j$개의 코인이 추가된다.</p>

<p>다음 그림들은 처음 예로 들었던 상황에서 $i=2$, $x=1$를 선택해 차례를 진행한 결과와 $i=4$, $x=2$를 선택해 차례를 진행한 결과를 각각 나타낸다.</p>

<p style="margin-top: 20px; margin-bottom: 10px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27871.%E2%80%85Singularity%E2%80%85of%E2%80%85the%E2%80%85Nim/225a033f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27871.%E2%80%85Singularity%E2%80%85of%E2%80%85the%E2%80%85Nim/225a033f.png" data-original-src="https://upload.acmicpc.net/bc418519-1e70-48fe-9f3e-6987a5a65bd6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 800px;" /></p>

<p>만약 위쪽에 있는 칸에서 코인을 많이 가져오면, 인간이 따라잡을 수 없는 속도로 게임이 커지는 <em>특이점</em>을 보게 될 것이다.</p>

<p>그래도 게임을 계속해 나가다 보면 언젠가는 더 이상 가져올 수 있는 코인이 없는 사람이 생길 것이고, 그 사람은 게임에서 패배한다.</p>

<p>게임을 하는 두 사람이 각자의 승리를 위해 최선을 다한다고 할 때, 선공과 후공 중 누가 승자가 되는지 구해 보자.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다. 앞으로 각 테스트 케이스마다 두 줄씩, $2T$개의 줄에 걸쳐 모든 테스트 케이스가 주어진다.</p>

<p>각 테스트 케이스의 첫 번째 줄에는 계단의 칸 수 $N$과 한 번에 가져갈 수 있는 코인의 최대 개수 $P$가 주어진다.</p>

<p>두 번째 줄에는 게임을 시작할 때 계단의 각 칸에 올려둔 코인의 개수를 의미하는 $N$개의 정수 $C_1, C_2, \cdots, C_N$이 주어진다.</p>

### 출력

<p>각 테스트 케이스마다 한 줄에 선공인 사람이 이기면 <code>First</code>를, 후공인 사람이 이기면 <code>Second</code>를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 200\,000$</li>
	<li>주어지는 모든 $N$의 합은 $200\,000$ 이하이다.</li>
	<li>$1 \leq P \leq 10^{18}$</li>
	<li>$0 \leq C_i \leq 10^{18}$</li>
	<li>$C_N \neq 0$</li>
</ul>
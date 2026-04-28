# [Platinum IV] 도박사 곰곰 - 25199

[문제 링크](https://www.acmicpc.net/problem/25199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 147, 정답: 81, 맞힌 사람: 57, 정답 비율: 50.442%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>곰곰이에게는&nbsp;큰 야심이 있다.</p>

<p>그 야심은 하루에 한 번씩 치킨 댄스를 추는 것이다.</p>

<p>하지만 2만원을 넘어가는&nbsp;치킨의 가격으로 인해 현실은 그리 녹록지 않다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25199.%E2%80%85%EB%8F%84%EB%B0%95%EC%82%AC%E2%80%85%EA%B3%B0%EA%B3%B0/54cbf6f9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25199.%E2%80%85%EB%8F%84%EB%B0%95%EC%82%AC%E2%80%85%EA%B3%B0%EA%B3%B0/54cbf6f9.png" data-original-src="https://upload.acmicpc.net/44b53cd6-6a2e-4e31-8311-31e074adcaaf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>자신의 야심을 이루기 위해 어떻게 매일 비싼 치킨을 먹을 수 있을지 곰곰이 생각한 곰곰이는, 자신의 특기인 카드게임을 통해&nbsp;당신의 돈을 뺏으려고&nbsp;결심했다.</p>

<p>게임의 규칙은 다음과 같다.</p>

<ul>
	<li>$1$부터 $M$까지의 정수가&nbsp;표시된&nbsp;무한히 많은 카드 더미에서 곰곰이와 당신은 각각 $N$장의 카드를 뽑는다.</li>
	<li>뽑은 $N$개의 카드에 표시된 정수&nbsp;중 하나를 골라, 그 정수가 표시된&nbsp;카드를 모두 낸다.</li>
	<li>둘이 제출한 카드의 개수가 다르다면, 개수가 더 많은 쪽이 이긴다.</li>
	<li>둘이 제출한 카드의 개수가 같다면, 카드의 정수가 큰&nbsp;쪽이 이긴다.</li>
	<li>둘이 제출한 카드의 개수가 같고 정수도 같다면 비기게 된다.</li>
	<li><strong>곰곰과 당신은 이 과정에서 항상 최선의 전략으로 임한다.</strong></li>
</ul>

<p>예를 들어, 뽑은 카드의 개수가 $5$개일 때, 곰곰이가 $[ 1, 3, 3, 3, 4&nbsp;]$를 뽑고, 당신이 $[ 1, 2, 2, 2, 4&nbsp;]$를 뽑는다면, 곰곰이는&nbsp;$3$이 쓰여진&nbsp;카드를 $3$장, 당신은 $2$가 쓰여진 카드를 $3$장 내게 되므로 곰곰이는&nbsp;치킨 댄스를 추며 하루를 마무리할 수 있다.</p>

<p>그러나 뽑은 카드의 개수가 $4$개일 때, 곰곰이가 $[ 1, 1, 4, 4 ]$를 뽑고, 당신이 $[ 1, 1, 1, 2 ]$를 뽑는다면, 곰곰이는&nbsp;오늘 저녁엔 치킨을 먹을 수 없다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25199.%E2%80%85%EB%8F%84%EB%B0%95%EC%82%AC%E2%80%85%EA%B3%B0%EA%B3%B0/b438bc02.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25199.%E2%80%85%EB%8F%84%EB%B0%95%EC%82%AC%E2%80%85%EA%B3%B0%EA%B3%B0/b438bc02.png" data-original-src="https://upload.acmicpc.net/2e3c1be4-4adf-4e44-8caf-5b0634784bde/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>곰곰이는 카드를 이미 뽑은 상태이고, 이제 당신이 카드를 뽑을 차례이다.</p>

<p>곰곰이가 <strong>이기도록</strong> 하는 당신의 카드 조합의 수를 구해보자.</p>

<p>카드를 뽑은 순서가 다르더라도, 같은 정수가 쓰여진 카드의 개수가&nbsp;동일하다면 같은 카드 조합으로 생각한다.</p>

### 입력

<p>첫째 줄에는 뽑아야 하는 카드의 개수 $N$과&nbsp;카드에 표시된 정수&nbsp;$M$이&nbsp;공백을 사이에 두고 주어진다. $(1 \le N, M \le 1\ 000)$</p>

<p>둘째 줄에는 곰곰이 뽑은 카드 $N$장의 카드에 표시된 정수가 각각 공백을 사이에 두고 주어진다. $(1 \le \texttt{카드에 표시된 정수} \le M)$</p>

<p>입력으로 주어지는 수는 모두 정수이다.</p>

### 출력

<p>곰곰이와 게임을 하여 곰곰이가 <strong>이기도록</strong> 하는 당신의 카드 조합의 수를 $10^9 + 7$로 나눈 나머지를 출력한다.</p>
# [Gold I] 파?이 트?리 게임 - 33624

[문제 링크](https://www.acmicpc.net/problem/33624)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 39, 맞힌 사람: 33, 정답 비율: 44.000%

### 분류

게임 이론, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>너무 많은 트리 문제를 푼 민기는 일반적인 트리 문제에 질리게 되었다. 따라서 민기는 트리의 모양을 색다르게 변환시키고 이를 통해 민찬이와 게임을 하고자 한다. 민기가 만든 그래프는 <strong>파?이 트?리</strong>로, 일반적인 트리의 모든 간선에 반원 혹은 원을 추가로 그려 만들어진다. 즉, 모든 간선은 아래 그림들 중 하나의 모양을 가지게 된다.</p>

<p>이때 반원과 원의 중점은 간선의 중점이고, 반원의 위치(간선의 위 혹은 아래)는 구분하지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33624.%E2%80%85%ED%8C%8C%3F%EC%9D%B4%E2%80%85%ED%8A%B8%3F%EB%A6%AC%E2%80%85%EA%B2%8C%EC%9E%84/dda25fdb.png" data-original-src="https://boja.mercury.kr/assets/problem/33624-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 214px; width: 500px;"></p>

<p>초기 상태에, 트리의 루트 노드에 해당하는 <strong>파?이 트?리</strong>의 정점에 말이 놓여 있다. 민기와 민찬이는 이 말을 인접한 노드로 한 번씩 번갈아 가면서 움직인다. 게임은 민기가 먼저 시작하며, 한 번 지난 간선은 다시 지날 수 없고,  자신의 차례에 말을 움직일 수 없을 경우 그 사람이 패배한다. 민기는 게임에서 이기기 위해, 자신이 이기는 <strong>파?이 트?리</strong>를 준비해 가고자 한다. 이때 원 혹은 반원과 본래 트리의 간선의 교점도 <strong>파?이 트?리</strong>의 노드로 취급하고, 민기가 그리는 반원과 원의 지름은 간선의 길이보다 짧으며, 다른 간선에 그린 반원, 원과 겹치지 않는다.</p>

<p>민기를 도와 민기와 민찬이가 게임을 이기기 위해 최선을 다할 때 전체 $2^{(N-1)}$가지의 <strong>파?이 트?리 </strong>중에서 민기가 항상 게임에서 이기는 <strong>파?이 트?리</strong>의 개수를 $1,000,000,007$ $(=10^9+7)$로 나눈 나머지를 출력하여라.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33624.%E2%80%85%ED%8C%8C%3F%EC%9D%B4%E2%80%85%ED%8A%B8%3F%EB%A6%AC%E2%80%85%EA%B2%8C%EC%9E%84/ed383996.png" data-original-src="https://boja.mercury.kr/assets/problem/33624-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>위 그림은 <strong>파?이 트?리</strong>의 예시이다.</p>

### 입력

<p>첫 번째 줄에 초기 트리의 노드의 수 $N$와 루트 노드의 번호 $R$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $N-1$개 줄에 초기 트리의 각 간선이 연결하고 있는 두 노드의 번호 $a_i$와 $b_i$가 공백으로 구분되어 주어진다. $(1 \leq i \leq N)$</p>

### 출력

<p>민기가 게임에서 이기는 <strong>파?이 트?리</strong>의 개수를 $1,000,000,007$로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1 ≤ N ≤ 100,000$</li>
	<li>$1 \leq R \leq N$</li>
	<li>$1 \leq a_i , b_i \leq N,  a_i \neq b_i$</li>
</ul>
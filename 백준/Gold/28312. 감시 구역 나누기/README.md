# [Gold II] 감시 구역 나누기 - 28312

[문제 링크](https://www.acmicpc.net/problem/28312)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 172, 정답: 61, 맞힌 사람: 39, 정답 비율: 38.614%

### 분류

수학, 이분 탐색, 누적 합, 매개 변수 탐색

### 문제 설명

<p>Albert는 지하 연구소의 보안을 강화하기 위해 감시용 로봇을 사용해보려 한다. 지하 연구소는 $N$개의 방이 있고 좌측부터 우측까지 1번부터 $N$번까지 번호가 붙어 있는데, 아래 그림처럼 기다란 복도 형태이다 (이 경우 $N = 5$ 이다.)</p>

<p>$i$번째 방과 $i+1$번째 방 사이의 거리는 $d_i$ 이며 아래 그림의 경우 $d = [2, 3, 1, 4]$ 이다. 편의상 이 문제에서 두 방 $i, j$ 사이의 거리를 $D(i, j)$로 나타내자 -- 따라서 $i \lt j$일 때 $D(i, j) = \sum_{i \le k \lt j} d_k$ 이며 $D(i, i) = 0$이다.</p>

<p>가령 이 예제에서 $D(1, 4) = d_1+d_2+d_3 = 6$이고 $D(3, 4) = d_3 = 1$ 이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/e5fe69fa.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/e5fe69fa.png" data-original-src="https://upload.acmicpc.net/1daf68b9-9f13-496f-83a5-23105443103a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 78px; width: 600px;" /></p>

<p>Albert는 총 $M$대의 감시용 로봇을 활용하고 싶은데 우선 $N$개의 방을 적절하게 $M$개의 연속한 구역으로 쪼갠 후 각 구역을 하나의 감시용 로봇이 24시간 감시하도록 하고 싶다. 각 구역은 1개 이상의 연속한 방으로 구성되며, 각 방은 반드시 하나의 구역에 속해야 한다. 이후 각 로봇은 자신이 담당한 구역에 속한 방들을 감시하는데, 이 때 필요한 에너지의 양은 해당 구역에 속한 서로 다른 방간의 거리 총합과 같다. 즉, 어떤 구역이 $i$번 방부터 $j$번 방까지 포함한다면 이 구역을 감시하기 위해 필요한 에너지의 양을 $S(i, j)$라 하면 $S(i, j) = \sum_{i \le k \le l \le j} D(k, l)$ 이 된다 - 이 정의에 따르면 $S(i, i) = 0$ 임에 유의하자 (이 경우 감시용 로봇은 $i$번째 방에 가만히 있을 수 있으므로 에너지를 거의 소비하지 않는다).</p>

<p>예를 들어 $M = 2$ 인 경우, 총 4가지 다른 방법으로 5개의 방을 2개의 구간으로 나눌 수 있다 - 곡선으로 표시된 거리는 두 방 사이의 거리인 $D(\cdot, \cdot)$ 값을 나타낸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/c0d7826e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/c0d7826e.png" data-original-src="https://upload.acmicpc.net/7c292fab-4a89-456b-a2d5-38c43680f68d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 310px; width: 600px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/675ddc9a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28312.%E2%80%85%EA%B0%90%EC%8B%9C%E2%80%85%EA%B5%AC%EC%97%AD%E2%80%85%EB%82%98%EB%88%84%EA%B8%B0/675ddc9a.png" data-original-src="https://upload.acmicpc.net/127dd59c-e5b3-4a04-96ee-36664b2bf29c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 466px; width: 600px;" /></p>

<ul>
	<li>첫 번째 방법은 [1, 3]과 [4, 5]로 두 구역을 나눈 경우이다. 첫 번째 구역을 감시하는데 필요한 에너지의 양은 $D(1, 2) + D(1, 3) + D(2, 3) = 10$ 이며 두 번째 구역을 감시하는데 필요한 에너지의 영은 $D(4, 5) = 4$ 이다.</li>
	<li>두 번째 방법은 [1, 2]와 [3, 5]로 두 구역을 나눈 경우이다. 각각의 구역을 감시하는데 필요한 에너지는 2와 10이다.</li>
	<li>세 번째 방법은 [1, 1]과 [2, 5]로 두 구역을 나눈 경우이다. 첫 번째 구역을 감시하는데 필요한 에너지는 0이며 두 번째 구역을 감시하기 위해서는 25의 에너지가 필요하다.</li>
	<li>네 번째 방법은 [1, 4]와 [5, 5]로 두 구역을 나눈 경우이다. 첫 번째 구역을 감시하는데 필요한 에너지는 21이며 두 번째 구역을 감시하기 위해서는 0의 에너지가 필요하다.</li>
</ul>

<p>로봇이 사용하는 배터리의 용량이 너무 크면 돈이 많이 들기 때문에 Albert는 각 로봇이 필요로 하는 에너지의 양이 최소가 되도록 하고 싶다 - 즉, $M$개의 구역이 필요로 하는 에너지의 최댓값을 최소화 하고 싶다. 위 예제의 경우 첫 번째 혹은 두 번째 방법으로 구역을 나누는 것이 최적이며, 정답은 10이다.</p>

<p>Albert를 도와 $N$, $M$, 그리고 $d$값이 주어졌을 때, $N$개의 방을 $M$개의 연속한 구역으로 나눌 때 각 구역이 필요로 하는 에너지의 최댓값을 최소로 만들면 이 값이 무엇인지 구해보자.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스의 첫 줄에는 $N$과 $M$이 공백으로 구분되어 주어진다. 둘째 줄에 $N-1$개의 정수가 공백으로 구분되어 주어지는데 이는 $d_1, d_2, \dots, d_{N-1}$ 값을 나타낸다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 20$</li>
	<li>$4 \le N \le 30000$</li>
	<li>$1 \le M \le N$</li>
	<li>$1 \le i \lt N$ 인 모든 $i$에 대하여: $1 \le d_i \le 10^6$</li>
</ul>
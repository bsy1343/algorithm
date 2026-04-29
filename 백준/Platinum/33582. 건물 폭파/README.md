# [Platinum IV] 건물 폭파 - 33582

[문제 링크](https://www.acmicpc.net/problem/33582)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 41, 맞힌 사람: 37, 정답 비율: 56.923%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>$1$번부터 $N$번까지 번호가 매겨진 $N$개의 건물이 $N-1$개의 도로로 이어져 있는 트리 형태의 도시가 있다. ecode는 이 도시를 재건축하기 위해 모든 건물을 무너뜨리려고 한다.</p>

<p>ecode는 원하는 건물에 원하는 강도의 폭파 작업을 원하는 만큼 시행할 수 있다. 건물을 폭파하면 폭발은 도로를 통해 인접한 건물로 전달된다. 전달되는 폭발의 강도는 도로 하나를 통과할 때마다 $1$씩 감소하며, 전달되는 강도가 $0$이 되면 더 이상 전달되지 않는다. 건물의 내구도는 건물이 받은 폭발 강도만큼 감소하며, 내구도가 $0$ 이하가 되면 건물은 무너진다.</p>

<p>예를 들어 ecode가 재건축하려는 도시가 아래와 같다고 하자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33582.%E2%80%85%EA%B1%B4%EB%AC%BC%E2%80%85%ED%8F%AD%ED%8C%8C/446cdf3a.png" data-original-src="https://boja.mercury.kr/assets/problem/33582-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 344px; width: 500px;"></p>

<p>$7$번 건물에 강도 $1$의 폭발을 일으키면 아래와 같이 $7$번 건물의 내구도가 $1$ 감소한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33582.%E2%80%85%EA%B1%B4%EB%AC%BC%E2%80%85%ED%8F%AD%ED%8C%8C/c74cb37f.png" data-original-src="https://boja.mercury.kr/assets/problem/33582-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 344px; width: 500px;"></p>

<p>이어서 $3$번 건물에 강도 $6$의 폭발을 일으키면 아래와 같이 $3$번 건물의 내구도가 $6$ 감소한다. 폭발이 주변으로 전달되면서 주변 건물들의 내구도 또한 전달된 폭발의 강도만큼 감소한다. 모든 건물의 내구도가 $0$ 이하가 되었으므로 모든 건물이 무너졌다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33582.%E2%80%85%EA%B1%B4%EB%AC%BC%E2%80%85%ED%8F%AD%ED%8C%8C/ff715f26.png" data-original-src="https://boja.mercury.kr/assets/problem/33582-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 344px; width: 500px;"></p>

<p>따라서 $1+6=7$의 폭발 강도의 합으로 도시의 모든 건물을 무너뜨릴 수 있다.</p>

<p>ecode는 건물을 모두 무너뜨리는 데 필요한 모든 폭파 강도의 합을 최소화하려고 한다. 건물을 모두 무너뜨리기 위해 ecode가 일으켜야 할 폭파 강도의 합의 최솟값을 구하여라.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다. $(2 \leq N \leq 10^5)$</p>

<p>두 번째 줄부터 $N-1$개의 줄에 걸쳐 도로로 연결된 두 건물의 번호 $u$와 $v$가 공백으로 구분하여 주어진다. $(1 \leq u, v \leq N; u \ne v)$</p>

<p>$N+1$번째 줄에 각 건물의 내구도를 나타내는 $N$개의 정수 $A_1, A_2, \cdots, A_N$이 공백으로 구분하여 주어진다. $(1 \leq A_1, A_2, \cdots, A_N \leq 10^9)$</p>

<p>입력으로 주어진 그래프는 올바른 트리이다.</p>

### 출력

<p>모든 건물을 무너뜨리기 위해 ecode가 시행해야 할 폭파 강도의 합의 최솟값을 출력한다.</p>
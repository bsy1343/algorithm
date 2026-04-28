# [Gold I] 회로의 저항 - 24459

[문제 링크](https://www.acmicpc.net/problem/24459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 283, 정답: 105, 맞힌 사람: 95, 정답 비율: 43.182%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>어떤 PCB (Printed Circuit Board)에는 노드 $N$개가 있으며, 저항 $N-1$개가 그 사이를 사이클 없이 연결하고 있다.</p>

<p>우리는 PCB의 정보가 주어질 때, 두 가장자리 노드를 연결해 얻을 수 있는 가장 큰 저항값과 가장 작은 저항값을 구할 것이다. 이때 가장자리 노드란 저항 한 개만 연결된 노드이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/d5c13be6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/d5c13be6.png" data-original-src="https://upload.acmicpc.net/2365d43b-46f0-4848-bed8-e99387ec932b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; height: 360px;" /></p>

<p>위 그림에서 두 가장자리 노드를 연결하는 가장 큰 저항값과 가장 작은 저항값을 찾으면 아래와 같은 그림이 나온다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/32cb3e6a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/32cb3e6a.png" data-original-src="https://upload.acmicpc.net/1d703528-5b61-45ed-81d3-b730bbb58e91/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; height: 360px;" /></p>

<p>위 그림은 두 가장자리 노드를 연결하는 가장 큰 저항값을 만드는 데 사용되는 저항이 있는 부분에 빨간색으로 나타낸 것이다. 이때 회로에서 만든 가장 큰 저항값은 $20 \Omega$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/9f6a6152.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24459.%E2%80%85%ED%9A%8C%EB%A1%9C%EC%9D%98%E2%80%85%EC%A0%80%ED%95%AD/9f6a6152.png" data-original-src="https://upload.acmicpc.net/3a812473-e6c2-4f31-a5b6-7b884c488032/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; height: 360px;" /></p>

<p>위 그림은 두 가장자리 노드를 연결하는 가장 작은 저항값을 만드는 데 사용되는 저항이 있는 부분에 나타낸 것이다. 이때 회로에서 만든 가장 작은 저항값은 $9 \Omega$이다.</p>

<p>PCB에서 두 가장자리 노드를 연결해 얻을 수 있는 최대 저항과 최소 저항을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 노드의 개수 $N$이 정수로 주어진다. $(2 \le N \le 100\,000)$</p>

<p>그다음 $N-1$줄에 걸쳐 각 줄에는 간선의 정보로 세 정수 $p$, $q$, $w$가 공백으로 구분되어 주어진다. $(0 \le p, q &lt; N,\ p &ne; q,\ 1 \le w \le 10\,000)$</p>

<p>$p$와 $q$는 저항이 연결하는 노드의 번호이고, $w$는 저항의 값이다. (단위는 $\Omega$)</p>

### 출력

<p>두 가장자리 노드를 연결하는 가장 큰 저항값과 가장 작은 저항값을 한 줄에 하나씩 순서대로 출력한다.</p>

### 힌트

<p>그림에&nbsp;있는&nbsp;저항의&nbsp;값은&nbsp;실제와&nbsp;다르다.</p>
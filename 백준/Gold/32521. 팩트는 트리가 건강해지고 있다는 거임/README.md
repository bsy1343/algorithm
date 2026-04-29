# [Gold II] 팩트는 트리가 건강해지고 있다는 거임 - 32521

[문제 링크](https://www.acmicpc.net/problem/32521)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 245, 정답: 108, 맞힌 사람: 88, 정답 비율: 47.059%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>트리를 가지고 노는 것을 좋아하는 예환이는 나뭇가지로 하나의 트리를 만들었다. 하지만 시간이 지나자 나뭇가지들의 접합부 중 몇몇이 썩고 있다는 것을 발견했다. 예환이는 곧바로 장미칼을 가져와서 최소 개수의 나뭇가지들을 잘라내어 모든 연결 요소들이 <strong>건강</strong>해지게 만들고 싶다.</p>

<p>나뭇가지들이 만나는 접합부를 노드라고 할 때, 노드들을 간선(나뭇가지)으로 연결한 그래프 $G$를 생각하자. 그래프 $G$는 트리(수형도)이다. 썩고 있는 노드를 <strong>안 건강 노드</strong>라고 하자. 예환이는 하나의 연결 요소 속 <strong>안 건강 노드</strong>의 개수가 $K$를 넘지 않으면 그 연결 요소를 <strong>건강</strong>하다고 판단한다.</p>

<p style="text-align: center;"><img alt="" height="258" src="%EB%B0%B1%EC%A4%80/Gold/32521.%E2%80%85%ED%8C%A9%ED%8A%B8%EB%8A%94%E2%80%85%ED%8A%B8%EB%A6%AC%EA%B0%80%E2%80%85%EA%B1%B4%EA%B0%95%ED%95%B4%EC%A7%80%EA%B3%A0%E2%80%85%EC%9E%88%EB%8B%A4%EB%8A%94%E2%80%85%EA%B1%B0%EC%9E%84/e7875353.png" data-original-src="https://boja.mercury.kr/assets/problem/32521-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="963"><img alt="" src="https://ibb.co/dfxLT2G"></p>

<p>위의 그림은 $K=2$일 때 트리를 <strong>건강</strong>하게 나눈 예시 중 하나이다. (빨간 노드가 <strong>안 건강 노드</strong>를 의미한다.)</p>

<p>총 노드의 수 $N$, 한 연결 요소 속 <strong>안 건강 노드</strong>의 최대 개수 $K$가 주어졌을 때, 최소 몇 개의 간선을 없앴을 때 남은 모든 연결 요소들이 <strong>건강</strong>해지는지 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 두 정수 $N$, $K$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 $N$개의 정수 $H_1, H_2, \cdots, H_N$가 공백으로 구분되어 주어진다. 각 $1\leq i\leq N$에 대하여, $i$번째 노드가 <strong>안 건강 노드</strong>이면 $H_i=1$이고 그렇지 않으면 $H_i=0$이다.</p>

<p>이후 $N - 1$개의 줄에 걸쳐 각 줄마다 두 정수 $U$, $V$가 공백으로 구분되어 주어진다. 이는 $U$번째 노드와 $V$번째 노드 사이를 잇는 간선이 존재한다는 의미이다.</p>

### 출력

<p>최소 몇 개의 간선을 없앴을 때 남은 모든 연결 요소들이 <strong>건강</strong>해지는지 출력한다.</p>

### 제한

<ul>
	<li>$1\leq N\leq 10^5$, $1\leq K\leq N$</li>
	<li>각 $1\leq i\leq N$에 대하여, $ H_i\in\{0, 1\}$</li>
	<li>$1\leq U\leq N$, $1\leq V\leq N$, $U\neq V$</li>
	<li>주어지는 모든 수는 정수이다.</li>
	<li>주어지는 그래프는 트리이다.</li>
</ul>
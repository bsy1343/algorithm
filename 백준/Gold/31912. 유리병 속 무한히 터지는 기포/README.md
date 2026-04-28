# [Gold II] 유리병 속 무한히 터지는 기포 - 31912

[문제 링크](https://www.acmicpc.net/problem/31912)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 199, 정답: 72, 맞힌 사람: 50, 정답 비율: 36.765%

### 분류

구현, 자료 구조, 집합과 맵, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<blockquote>
<p style="text-align: right;"><em>너에게서는 멸종된 과일 향기가 난다</em></p>

<p style="text-align: right;"><em>투룸 신축 빌라 보증금 이천에 월세 구십, 어떻게 해야 너를 웃길 수 있을까 하는 생각, 두 시간 동안의 폭우, 일주일 동안의 아침, 유리병 속 무한히 터지는 기포</em></p>

<p style="text-align: right;">-고선경, [샤워젤과 소다수]</p>
</blockquote>

<p>세로로 길쭉한 유리병 하나가 있다. 이 속에서 기포가 무한히 터지고 있다.</p>

<p>과학자 정우가 이 현상에 호기심을 느끼고 계속해서 관찰한 결과 다음과 같은 사실을 알아냈다. 먼저, 유리병을 세로로 $N$등분하여 가장 아래에 위치한 $1$번째 구역부터 가장 위에 위치한 $N$번째 구역까지 총 $N$개의 구역으로 나눌 수 있다. 각 구역마다 최대 $M$개의 기포가 존재할 수 있다. 처음에는 어느 구역에도 기포가 존재하지 않고, $1$초마다 유리병 내에서 다음 두 현상이 순서대로 번갈아 가며 일어난다.</p>

<ul>
	<li><strong>기포 생성</strong>: 유리병 내의 구역 하나에서 기포가 생성된다. $i$번째 기포 생성이 일어날 때, $y_i$번째 구역에서 $k_i$개의 기포가 생성된다. 만약 그 구역에서 원래부터 존재하던 기포 수와 새로 생성된 기포 수의 합이 $M$을 넘으면, $M$개만 남고 나머지 기포는 모두 사라진다.</li>
	<li><strong>기포 이동</strong>: 모든 구역에서 기포들이 동시에 위 또는 아래로 이동한다. $i$번째 구역에 $a_i$개의 기포가 존재한다면, $\displaystyle{\left\lfloor\frac{a_i}{5}\right\rfloor}$개의 기포가 바로 위 구역으로 이동하고, $\displaystyle{\left\lfloor\frac{a_i}{5}\right\rfloor}$개의 기포가 바로 아래 구역으로 이동하며, $\displaystyle{\left\lfloor\frac{a_i}{5}\right\rfloor}$개의 기포는 제자리에 남아 있고, 나머지 기포는 사라진다. 만약 $1$번째 구역의 아래 또는 $N$번째 구역의 위로 움직이려 하는 기포가 있을 경우 그 기포는 사라진다. 기포 이동 후 각 구역마다 그 구역의 기포 수가 $M$을 넘으면, $M$개만 남고 나머지 기포는 모두 사라진다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31912.%E2%80%85%EC%9C%A0%EB%A6%AC%EB%B3%91%E2%80%85%EC%86%8D%E2%80%85%EB%AC%B4%ED%95%9C%ED%9E%88%E2%80%85%ED%84%B0%EC%A7%80%EB%8A%94%E2%80%85%EA%B8%B0%ED%8F%AC/5c2f0c70.png" data-original-src="https://upload.acmicpc.net/43790731-7f3e-4066-9056-8846dbcd6142/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 350px; width: 202px;" />                     <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31912.%E2%80%85%EC%9C%A0%EB%A6%AC%EB%B3%91%E2%80%85%EC%86%8D%E2%80%85%EB%AC%B4%ED%95%9C%ED%9E%88%E2%80%85%ED%84%B0%EC%A7%80%EB%8A%94%E2%80%85%EA%B8%B0%ED%8F%AC/608170c6.png" data-original-src="https://upload.acmicpc.net/58eee8ab-4b77-4dc8-8124-06fc53eac9c6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 350px; width: 447px;" /> <strong>그림 1.</strong> (a) 유리병을 $N$개의 구역으로 나눈 모습. (b) $1$번째 구역과 $N$번째 구역에서 각각 기포 이동이 일어나는 모습.</p>

<p>정우는 유리병 속 기포의 움직임을 모델링하는 프로그램을 만들려 한다. $t$초가 지난 후, 즉 기포 생성과 기포 이동이 각각 $t$번 일어난 후 유리병 속에 남은 모든 기포의 수를 $S(t)$라 하자. 관찰을 진행한 시간 $T$가 주어질 때, $S(1), S(2), \cdots, S(T)$의 값을 구하시오.</p>

### 입력

<p> 첫째 줄에 유리병을 이루는 구역의 수 $N$, 각 구역마다 존재할 수 있는 최대 기포의 수 $M$, 관찰을 진행한 시간 $T$가 공백으로 구분되어 주어진다. ($1 \leq N \leq 100\,000$, $1 \leq M \leq 100\,000$, $1 \leq T \leq 50\,000$)</p>

<p>둘째 줄부터 $T$개의 줄에 걸쳐, $i$번째 기포 생성에 대해 기포가 생성되는 구역의 번호 $y_i$와 그 구역에서 생성되는 기포의 수 $k_i$가 공백으로 구분되어 주어진다. ($1 \leq y_i \leq N$, $0 \leq k_i \leq M$)</p>

### 출력

<p>$T$개의 줄에 걸쳐, $i$번째 줄에 $S(i)$의 값을 출력한다.</p>

### 힌트

<p>$\lfloor\cdot\rfloor$는 바닥 함수로, 주어진 실수 이하의 최대 정수를 나타내는 함수이다.</p>
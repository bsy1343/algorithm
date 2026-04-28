# [Silver I] 진심 좌우 반복뛰기 - 23631

[문제 링크](https://www.acmicpc.net/problem/23631)

### 성능 요약

시간 제한: 0.15 초  (하단 참고), 메모리 제한: 512 MB

### 통계

제출: 1258, 정답: 407, 맞힌 사람: 281, 정답 비율: 34.185%

### 분류

수학, 이분 탐색

### 문제 설명

<p>히어로 협회에는 아래와 같은 두 가지 소문이 있다.</p>

<ol>
	<li>진심 좌우 반복 뛰기를 $10^{100}$일 동안&nbsp;반복하면 히어로가 된다.</li>
	<li>뛴 거리의 총합이 $N$m 이상이면 대머리가 된다.</li>
</ol>

<p>지나가던 제로x는&nbsp;소문을 듣고 진심 좌우 반복 뛰기를 하기로 결심했다. 진심 좌우 반복 뛰기는 간단하다.</p>

<ul>
	<li>위치 $x = 0$에서 시작하여, 처음에는&nbsp;<strong>오른쪽</strong>으로 $K$m를 뛴 다음 방향을 바꾼다.</li>
	<li>방향을 바꿀 때마다 이전에 움직인 거리에 $K$m만큼 더한 거리를 뛰고, 다시 방향을 바꾼다.</li>
</ul>

<p>예를 들어, $K = 2$&nbsp;라면, 오른쪽으로 $2$m, 왼쪽으로 $4$m, 오른쪽으로 $6$m,&nbsp;...</p>

<p>하지만, 제로x는 대머리가 되는 것이 너무나도 싫었다. 즉, 소문에 따라&nbsp;뛴 거리의 총합이 $N$m 이상이 되지 않아야 한다.&nbsp;대머리가 되지 않으면서도 운동의 효과는 보고 싶었던 제로x는&nbsp;정확히 $(N - 1)$m만&nbsp;뛸 것이다.</p>

<p>하지만 제로x는 어디서 멈춰야 하는지 계산할 수 없었다. 제로x가 대머리가 되지 않도록 도와주자!</p>

<p>$(N - 1)$m를 뜀과 동시에&nbsp;전환점에 도달할 경우, 방향을 바꾸고 멈춘다. 예제 1의 두 번째 테스트 케이스를 참고하자.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스 수 $T$가 주어진다. 두 번째 줄부터 $T$개의 줄에는&nbsp;자연수 $N, K$가 공백으로 구분되어&nbsp;주어진다.</p>

<ul>
	<li>$1 &le; T&nbsp;&le; 100,000$</li>
	<li>$1 &le; N,K &le; 10,000,000$</li>
</ul>

### 출력

<p>제로x가 멈춰야 하는 $x$좌표와 바라보고 있게 될 방향을 출력한다. 방향을 출력할 때&nbsp;오른쪽은 <code>R</code>, 왼쪽은 <code>L</code>로 나타낸다.</p>

### 힌트

<p>아래의 그림은 $N = 15, K = 3$ 인 경우의 예제이다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/23631.%E2%80%85%EC%A7%84%EC%8B%AC%E2%80%85%EC%A2%8C%EC%9A%B0%E2%80%85%EB%B0%98%EB%B3%B5%EB%9B%B0%EA%B8%B0/a4a8cd4e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/23631.%E2%80%85%EC%A7%84%EC%8B%AC%E2%80%85%EC%A2%8C%EC%9A%B0%E2%80%85%EB%B0%98%EB%B3%B5%EB%9B%B0%EA%B8%B0/a4a8cd4e.png" data-original-src="https://upload.acmicpc.net/a18902f9-9236-46e6-b56a-09ba1d001fe5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 700px;width:90%" /></p>

<p>총 거리가 $14$인 지점의 $x$좌표는 2이고, 방향은 오른쪽이다. 그래서 답은 <code>&quot;2 R&quot;</code>이다.</p>

<p>$N = 7, K = 2$ 인 경우, $x$좌표가 $-2$인 지점에서 멈추고($2 - 4 = -2$), 방향을 바꾼다. 이후 더 이상 진행할 수 없으므로 정답은 <code>&quot;-2 R&quot;</code>이다.</p>
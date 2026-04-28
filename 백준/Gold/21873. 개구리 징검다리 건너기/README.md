# [Gold I] 개구리 징검다리 건너기 - 21873

[문제 링크](https://www.acmicpc.net/problem/21873)

### 성능 요약

시간 제한: 1.2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 306, 정답: 173, 맞힌 사람: 139, 정답 비율: 59.149%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21873.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC%E2%80%85%EC%A7%95%EA%B2%80%EB%8B%A4%EB%A6%AC%E2%80%85%EA%B1%B4%EB%84%88%EA%B8%B0/f6ef80bf.png" data-original-src="https://upload.acmicpc.net/18c7647b-3eca-4267-893a-18ef765751af/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>서대문구에 있는 한 연못에 $N$마리의 하얀 개구리와 $N$마리의 검은 개구리가 $2N+1$개의 연꽃으로 이루어진 징검다리를 건너려고 하고 있다. 그림에서 보이는 것과 같이&nbsp;각&nbsp;무리의 개구리들에는&nbsp;앞에서부터 $1$부터 $N$까지 번호가 붙어있다. 각&nbsp;무리의 개구리들은&nbsp;징검다리를 건너서 서로 반대쪽으로&nbsp;지나가려고 하고 있다. 그러나&nbsp;바쁜 일이 있는 개구리들은 서로 먼저 지나가라고 양보하기 어려운 상황이었기 때문에&nbsp;모두 동시에 징검다리를 건너려고 한다.</p>

<p>개구리들은 다음과 같이 이동할 수 있다.</p>

<ul>
	<li>하얀 개구리들은 오른쪽으로만, 검은 개구리들은 왼쪽으로만 움직인다.</li>
	<li>한 번에 한 마리의 개구리만 움직일 수 있다.</li>
	<li>자신의 진행 방향&nbsp;바로 앞에 있는&nbsp;연꽃이 비어있는 경우, 진행 방향으로&nbsp;한 칸&nbsp;이동할 수 있다.</li>
	<li>자신의 진행 방향&nbsp;바로 앞에 있는&nbsp;연꽃에 자신의&nbsp;색과&nbsp;다른&nbsp;개구리가 있는&nbsp;경우, 그&nbsp;개구리 한 마리를 건너뛰어서 두 칸&nbsp;이동할 수 있다.</li>
	<li>자신의 진행 방향&nbsp;앞에 있는 두 개 이상의 연꽃이 비어있다고 하더라도 한 번에&nbsp;두 칸 이상&nbsp;이동할 수 없다.</li>
	<li>두 마리 이상의 개구리를 뛰어넘거나,&nbsp;자신의 색과&nbsp;같은 색의 개구리를&nbsp;뛰어넘을 수 없다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21873.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC%E2%80%85%EC%A7%95%EA%B2%80%EB%8B%A4%EB%A6%AC%E2%80%85%EA%B1%B4%EB%84%88%EA%B8%B0/81cb0221.png" data-original-src="https://upload.acmicpc.net/5735d70c-b7f3-46bc-a5a1-1f95718d82a6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>위의 규칙에 따라&nbsp;각 개구리를&nbsp;움직여서&nbsp;그림과 같이 개구리들이 반대편에 도달할 수 있도록&nbsp;하여라.</p>

### 입력

<p>각 무리에 있는&nbsp;개구리의 수&nbsp;$N$이 주어진다. ($1 \le N \le 1\,000$)</p>

### 출력

<p>첫 번째 줄에 개구리들을&nbsp;움직여야 하는&nbsp;횟수 $M$을 출력한다. 단, $M$은 $1\,500\,000$을 넘어서는 안된다.</p>

<p>두 번째 줄부터 $M$개의 줄에 걸쳐서 움직인 개구리의 정보를 순서대로&nbsp;출력한다. $p$번째 하얀 개구리가 움직인 경우 <code><span style="color:#e74c3c;">1 p</span></code>를 출력하고, $p$번째 검은 개구리가 움직인 경우 <span style="color:#e74c3c;"><code>2 p</code></span>를 출력한다.</p>
# [Gold I] 미로에 갇힌 건우 - 18224

[문제 링크](https://www.acmicpc.net/problem/18224)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1697, 정답: 300, 맞힌 사람: 189, 정답 비율: 17.339%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>평소 탱자탱자 놀던 건우가 마지막 날에 과제를 시작했다. 건우는 피곤이 몰려왔는지, 그만 잠이 들고 말았다! 그러고는 꿈을 꿨다. 그곳은 미로였는데 너무 현실성이 없었던 탓에 건우는 꿈이란 걸 알아챘다. 얼른 꿈에서 깨려고 노력했지만 깰 수 없었다. 왜냐하면 건우가 꿈에서 깨어나려면 반드시 미로를 탈출해야만 했기 때문이다. 미로의 특징은 다음과 같다.</p>

<ul>
	<li><em>n&times;n</em>미로이며 가장 왼쪽 위가 출발지, 가장 오른쪽 아래가 도착지이다. 출발지와 도착지에는 벽이 없음이 보장된다.</li>
	<li>건우는 상하좌우로만 움직일 수 있으며, 벽을 넘는 것을 제외하면 한 번 이동할 때 벽이 없는 인접한 칸으로&nbsp;이동한다.</li>
	<li>초기 상태는 첫 번째 날 낮으로 시작하고, 건우가 <em>m</em>번 이동할 때 마다&nbsp;낮에서 밤 또는 밤에서 낮으로 바뀐다.</li>
	<li>밤에는 낮과 달리 추가로 벽을 넘을 수 있다. 벽을 넘을 때는 가려는 방향의 인접한 칸에 벽이 있어야 하며, 건우가 서 있을 수 있는 칸이 나올때까지 연속된 벽을 넘는다.</li>
	<li>벽을 넘는 도중에&nbsp;방향을 바꿀 순 없으며, 벽을 넘으면 1번 이동한 것으로 간주한다.</li>
</ul>

<p>다음은 벽을 넘는 것에 대한 예시다. 주황색은 건우가 있는 곳 파란색은 벽이다.<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/95e6fa3c.png" data-original-src="https://boja.mercury.kr/assets/problem/18224-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/8b70183e.png" data-original-src="https://boja.mercury.kr/assets/problem/18224-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/ea53107f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/ea53107f.png" data-original-src="https://upload.acmicpc.net/8dedbc28-5f75-42e1-b285-dbfae801a0a2/-/crop/818x328/113,156/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 241px; width: 600px;" /></p>

<p>위 경우는 벽을 넘을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/bdde2516.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18224.%E2%80%85%EB%AF%B8%EB%A1%9C%EC%97%90%E2%80%85%EA%B0%87%ED%9E%8C%E2%80%85%EA%B1%B4%EC%9A%B0/bdde2516.png" data-original-src="https://upload.acmicpc.net/988cf875-949f-4d6e-a7d7-4fbbd92c4a5d/-/crop/870x344/120,146/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 610px; height: 241px;" /></p>

<p>위 경우처럼 벽을 넘었을 때 미로를 벗어날 경우에는 이동할 수 없다.</p>

<p>건우가 가장 빨리 탈출할 수 있는&nbsp;날이 몇 번째 날의 낮 혹은 밤인지를 구해서 건우가 잠에서 깨도록 만들자!</p>

### 입력

<p>첫 번째 줄에 n, m이 주어진다. (1 &le;&nbsp;<em>n&nbsp;</em>&le; 500, 1 &le;&nbsp;<em>m&nbsp;</em>&le; 10)</p>

<p>두 번째 줄부터&nbsp;n개의 각 줄에 0 또는 1이 공백을 사이에 두고 n개씩&nbsp;주어진다.<br />
이 때&nbsp;0 은 벽이 없어 건우가 설 수 있는 곳, 1 은 벽이 있어 건우가 설 수 없는 곳을 의미한다.</p>

### 출력

<p>건우가 가장 빨리 탈출할 수 있는 날이&nbsp;몇번째 날인지, 그리고&nbsp;낮이면 &quot;<code>sun</code>&quot;, 밤이면 &quot;<code>moon</code>&quot;을 공백으로 구분하여 함께&nbsp;출력한다.<br />
예를 들어, 2번째 날 밤일 경우, &quot;<code>2 moon</code>&quot; 을 출력하고,&nbsp;3번째 날 낮일 경우, &quot;<code>3 sun</code>&quot; 을 출력한다. 만약 탈출할 수 없을 경우 -1을 출력한다.</p>
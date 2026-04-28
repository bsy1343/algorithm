# [Platinum I] blobcry - 24504

[문제 링크](https://www.acmicpc.net/problem/24504)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 147, 정답: 51, 맞힌 사람: 45, 정답 비율: 39.474%

### 분류

다이나믹 프로그래밍, 그래프 이론, 트리, 트리에서의 다이나믹 프로그래밍, 단절점과 단절선

### 문제 설명

<p>라이트온은&nbsp;블롭들이 사는 Light&nbsp;왕국의 왕이다.</p>

<p>Light&nbsp;왕국은 $N$개의 섬과 $M$개의 다리로 이루어져 있다.&nbsp;각각의 섬에는 $1$부터 $N$까지의 번호가 하나씩 붙어 있고, 각각의 다리에도 $1$부터 $M$까지의 번호가 하나씩 붙어 있다.</p>

<p>하지만, 이 왕국은&nbsp;전쟁을 좋아하는 Conflict&nbsp;왕국의 공격을 받고 있다.</p>

<p>Conflict&nbsp;왕국의&nbsp;공격이 Light&nbsp;왕국에 주는 피해는 다음과 같다.</p>

<ul>
	<li>Conflict&nbsp;왕국은&nbsp;Light&nbsp;왕국의 섬&nbsp;중 다리가 둘&nbsp;이상 연결된 섬 하나를 골라 그 섬과 연결되어 있는 임의의 두 다리를 아주 두꺼운 레이저로 파괴한다.</li>
</ul>

<p>한편, 신성한 침묵을 통해 역사를 배운 Harmony&nbsp;왕국의 왕 정후는&nbsp;Light&nbsp;왕국의&nbsp;다리가 하나밖에 남지 않았고, 그곳에 라이트온과 다른 블롭들이 있다는 사실을 알게 되었다.</p>

<p style="text-align: center;"><img alt="img" src="%EB%B0%B1%EC%A4%80/Platinum/24504.%E2%80%85blobcry/8144a2b9.png" data-original-src="https://upload.acmicpc.net/9e5d30b1-6aae-46d6-ae21-894e9a615e17/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: inline-block; max-width: 768px;" /></p>

<p>정후는 Light&nbsp;왕국을&nbsp;도와주기 위해 블롭들이 Harmony&nbsp;왕국으로&nbsp;탈출할 수 있는 포탈을 설치하려고 한다. 그는 Light&nbsp;왕국의 구조를 알고 있지만, 마지막으로 남은 다리가 무엇인지는 모른다. 정후는 자신의 부하에게 Light&nbsp;왕국으로&nbsp;가서 마지막으로 남은 다리가 무엇인지 알아 오라고 했지만, 시간이 많지 않아서 이론적으로 마지막 다리가 될 수 있는 곳만 탐색하려고 한다.</p>

<p>당신은 프로그래밍을 잘하는 정후의 부하이고, Light&nbsp;왕국의 구조를 입력받아 마지막 다리가 될 수 있는 곳을 모두 출력하는 프로그램을 만들어야 한다.</p>

<p>불쌍한 라이트온을 도와주자!</p>

### 입력

<p>첫째 줄에 Light&nbsp;왕국의 섬의 개수 $N$과 다리의 개수 $M$이 주어진다.</p>

<p>둘째 줄부터 $M$개의 줄에 걸쳐 $i$번&nbsp;다리가 연결하는 두 섬의 번호&nbsp;$u_i$, $v_i$가 공백으로 구분되어&nbsp;주어진다.</p>

### 출력

<p>첫째 줄에 마지막에 남을 수 있는 다리의 개수를 출력한다.</p>

<p>마지막에 남을 수 있는 다리가 있다면, 둘째 줄에 마지막에 남을 수 있는 다리의 번호를 공백으로 구분하여 오름차순으로 출력한다.</p>

### 제한

<ul>
	<li>$2 \le N \le&nbsp;3 \times 10^5$</li>
	<li>$N - 1&nbsp;\le&nbsp;M \le \min(3 \times 10^5, \frac{N(N-1)}{2})$</li>
	<li>$1 \le&nbsp;u_i, v_i&nbsp;\le&nbsp;N$, $u_i \ne v_i$ ($1 \le&nbsp;i \le&nbsp;N$)</li>
	<li>임의의 두 섬을 직접 연결하는 다리는 최대 한 개이며, 어떤 섬에서&nbsp;다리를 통해 모든 섬으로 이동할 수 있다.</li>
</ul>
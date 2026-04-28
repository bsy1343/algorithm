# [Platinum I] 사이클 - 22990

[문제 링크](https://www.acmicpc.net/problem/22990)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 202, 정답: 78, 맞힌 사람: 63, 정답 비율: 41.447%

### 분류

최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22990.%E2%80%85%EC%82%AC%EC%9D%B4%ED%81%B4/960dedc8.png" data-original-src="https://upload.acmicpc.net/18a4fb63-b67a-4674-860d-a5dd1b110bfd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 357px; height: 180px;" /></p>

<p>정점이 $N$개, 가중치가 있는 간선이 $M$개인 방향 그래프가 주어진다.</p>

<p>경로는 두 정점을 잇는 간선의 수열을 의미하고, 사이클은 시작점과 끝점이 같은 경로를 의미한다. 사이클 중에서 단순 사이클은 시작점과 끝점을 제외하고 중복되는 정점이 없는 사이클을 의미한다.</p>

<p>주어진 그래프에서 가중치의 합이&nbsp;최소가 되도록 모든 정점을 포함하고 정점과 간선이 서로 겹치지 않는 단순 사이클의 집합을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px;">$N\ M$<br />
$u_1$ $v_1$ $w_1$<br />
$\vdots$<br />
$u_M$ $v_M$ $w_M$</div>

<ul>
	<li>$N$은 정점의 개수이고 $M$은 간선의 개수이다. ($2&nbsp;\le N \le 200$, $0 \le M \le N\left(N-1\right)$)</li>
	<li>$u_i$ $v_i$ $w_i$는 정점 $u_i$에서 $v_i$로 가는 가중치 $w_i$의 간선이 존재한다는 뜻이다. ($1 \le u, v \le N$, $u \ne v$, $-10^9 \le w \le 10^9$)</li>
</ul>

<p>주어진 그래프 내에서 루프는 존재하지 않으며, 서로 다른 두 정점 사이에 최대 한 개의 간선이 존재한다.</p>

### 출력

<p>모든 정점을 포함하고 정점과 간선이 서로 겹치지 않는 단순 사이클의 집합이 존재하는 경우 첫 번째 줄에 <code><span style="color:#e74c3c;">1</span></code>을 출력한다. 그렇지 않으면 <code><span style="color:#e74c3c;">0</span></code>을 출력한다.</p>

<p>모든 정점을 포함하고 정점과 간선이 서로 겹치지 않는 단순 사이클의 집합이 존재하는 경우, 두 번째 줄에 이러한 집합들의&nbsp;가중치의 합의 최솟값을 출력하고, 이후&nbsp;$N$개의 줄에 걸쳐서 해당 집합의 단순 사이클에 속한 간선들을 출력한다. 간선들의 출력 순서는 상관없으며, 답이 여러 개인 경우 그 중 아무 것이나 출력하면 된다.</p>
# [Platinum I] 게임이론 - 16142

[문제 링크](https://www.acmicpc.net/problem/16142)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 120, 정답: 49, 맞힌 사람: 45, 정답 비율: 52.941%

### 분류

게임 이론, 그래프 이론, 그래프 탐색

### 문제 설명

<p>효원이랑 승재는 다음과 같은 게임을 한다. 게임은 정점 $1,2,\cdots,n$ 사이를 간선으로 연결해서 만든 그래프 위에서 진행되며,&nbsp;이 그래프는&nbsp;임의의 두 정점 사이에 경로가 존재하고, 모든 정점은 자기 자신과 연결해주는&nbsp;loop를 가졌다.&nbsp;각 정점 $i$마다 돌을 $w_i&gt;0$개 놓은 상태로 시작한다.</p>

<p>효원이는 정점 $s$부터 시작한다. 효원이랑 승재는 순서를 바꿔가며 다음과 같이 그래프 위에서 움직이며&nbsp;돌을 제거한다.</p>

<ul>
	<li>현재 위치한 정점을 $u$, 정점 $u$에 있는 돌의 개수가 $w$라고 하자. 최소 $1$개, 최대 $w$개까지 정점 $u$에 있는 돌을 제거한다.</li>
	<li>$u$에 연결된 정점으로 이동한다. Loop가 있으므로 $u$에서 $u$로 이동하는 것도 가능하다. 도착한 정점에 돌의 개수가 $0$개라면 한 번 더 이동해야 한다. 돌의 개수가 $0$이 아닌&nbsp;정점에 도착할 때까지 돌의 개수가 $0$인 정점은&nbsp;통과한다. $0$이 아닌 정점에 정지하면, 상대방의 턴이 시작한다.</li>
</ul>

<p>마지막 돌을 제거하는 사람이 이긴다. 다음은 한 게임 플레이의 예시다. 아직 효원이랑 승재가 규칙을 잘 모르는 상태로 플레이를 해서 최적으로 플레이하지 않았을&nbsp;수도 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/00c395e6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/00c395e6.png" data-original-src="https://upload.acmicpc.net/fc800ca8-bbca-4bf3-aa6d-0acee6d0d7eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/149941cd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/149941cd.png" data-original-src="https://upload.acmicpc.net/9e698ac3-38a3-4d80-a3e5-01841d95d769/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/2ce07546.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/2ce07546.png" data-original-src="https://upload.acmicpc.net/811ba934-a241-478c-b516-8365a293b87d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/fdae8a17.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/fdae8a17.png" data-original-src="https://upload.acmicpc.net/42919eb1-475e-4269-8cb9-6b7f2a02f1fb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/295ea40b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16142.%E2%80%85%EA%B2%8C%EC%9E%84%EC%9D%B4%EB%A1%A0/295ea40b.png" data-original-src="https://upload.acmicpc.net/d17b236d-bd64-4fc6-9a22-8ab6c56c7fa5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>이제 효원이랑 승재는 이 게임의 규칙을 잘 이해한다. 두 명 모두&nbsp;최적으로 게임을&nbsp;할 경우, 누가 이기는지 판정하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에는 정점의 수 $n$,&nbsp;간선의 수 $m$, 게임을 시작하는 정점 $s$가 주어진다. 그래프는 임의의 두 정점 사이에 경로가 존재하고, 모든 정점은 자기 자신과 연결하는 loop를&nbsp;가진다. 그래프의 크기는 $1\leq n\leq 50,000$, $2n-1\leq m\leq 500,000$을 만족한다.</p>

<p>둘째 줄에는 각 정점에 있는 돌의 개수 $w_1,w_2,\cdots,w_n$가&nbsp;공백으로 구분되어 주어진다. 모든 정점에서 돌의 수는 $1$개 이상 $2^{20}$개 미만이다.</p>

<p>셋째 줄부터 $(m+2)$번째 줄까지 간선에 관한 정보가 두 수 $u$와 $v$로 주어진다. 이는 $u$와 $v$ 사이에 무방향 간선이 있다는 의미이다. $u=v$일 수 있다.</p>

### 출력

<p>효원이랑 승재 둘다 최적으로 게임을 할 경우, 이기는 사람을 출력하라. 효원이가 이기는 경우 &quot;<code><code>hwy</code></code>&quot;, 승재가 이기는 경우 &quot;<code><code>sjh</code></code>&quot;을 따옴표 없이 출력하라.</p>
# [Platinum III] 막대기 게임 - 12848

[문제 링크](https://www.acmicpc.net/problem/12848)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 311, 정답: 87, 맞힌 사람: 60, 정답 비율: 29.126%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>영선이와 효빈이는 이번 컨테스트 개최자이다. 둘 밖에 없기에 대회 스태프도 겸하는데, 소규모 대회이고 실제 대회와 달리 풍선을 달아주거나 기타 일이 없기 때문에, 사고가 터지지 않는 한 크게 할 일이 없다.</p>

<p>그래서 대회 동안 딴 짓을 할 게임을 준비했으니, 그 이름하여 &quot;막대기 게임&quot;이다. 게임 규칙은 다음과 같다.</p>

<ol>
	<li>N*M모양의 격자 판이 있다.</li>
	<li>곳곳에 막대기를 둘 수 없는 장애물이 있다.</li>
	<li>임의의 1*k의 막대기들이 무한히 있다.</li>
	<li>두 사람이 번 갈아 가며 막대기를 하나 골라&nbsp;임의의 위치에 둔다.</li>
	<li>더 이상 둘 곳이 없으면 그 사람이 진다.</li>
	<li>막대기는 겹쳐서 둘 수 없으며, 회전할 수도 없다.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12848.%E2%80%85%EB%A7%89%EB%8C%80%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84/7fd88541.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12848/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:227px; width:368px" /></p>

<p>(위 그림처럼 막대기를 둘 수 있다)</p>

<p>생각보다 여유가 있었던 두 사람은 충분히 생각하여 언제나 최적의 수로 게임을 진행한다. 게임은 항상 영선이가 먼저 시작한다. 게임 판이 주어졌을 때 이기는 사람의 아이디를 출력한다.</p>

### 입력

<p>첫째 줄에 n , m이 주어진다. (1 &le;&nbsp;n, m &le;&nbsp;1,000)</p>

<p>다음 n줄로 m개의 게임 격자 판이 주어진다.</p>

<p>빈 공간이라면 &#39;.&#39; 장애물이 존재한다면 &#39;@&#39;으로 표시된다.</p>

<p>다음 줄에는 막대기의 종류의 수 k가 주어진다. (1 &le; k &le; 1,000)</p>

<p>다음 줄에는 k개의 수 p<sub>i</sub>가 오름차순으로 주어진다. (1 &le;&nbsp;p<sub>i</sub> &le; 1,000)</p>

### 출력

<p>영선이가 이긴다면 &quot;nein&quot; 효빈이가 이긴다면 &quot;hyo123bin&quot;을 출력한다</p>
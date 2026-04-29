# [Gold I] 물고기와 쿼리 - 34195

[문제 링크](https://www.acmicpc.net/problem/34195)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 185, 정답: 90, 맞힌 사람: 76, 정답 비율: 49.032%

### 분류

애드 혹

### 문제 설명

<p>다다스는 물고기를 아주 좋아해서 물고기 화석 하나를 소중히 간직하고 있다. 이 화석은 총 $N$개의 조각으로 이루어져 있으며, 각 조각은<span style="color:#e74c3c;"> <code>&gt;</code></span> 또는 <span style="color:#e74c3c;"><code>&lt;</code> </span>중 하나의 모양을 갖는다. 모든 조각은 일렬로 나열되어 있으며, 각 조각은 왼쪽에서부터 $1, 2, \cdots, N$번 조각이다.</p>

<p>모그는 다다스가 정말로 물고기를 좋아하는지를 확인해보기 위해 총 $Q$번의 행동을 취한다. 각 행동은 다음 두 가지 중 하나이다:</p>

<ul>
	<li><code>1 l r</code>: $l \leq i \leq r$를 만족하는 모든 정수 $i$에 대해 $i$번째 조각을 <strong>각각 180도 회전</strong>시킨다. 즉 <span style="color:#e74c3c;"><code>&gt;</code></span>는 <span style="color:#e74c3c;"><code>&lt;</code></span>로, <span style="color:#e74c3c;"><code>&lt;</code></span>는 <span style="color:#e74c3c;"><code>&gt;</code></span>로 바뀐다.</li>
	<li><code>2</code>: 현재 화석에서 <strong>물고기의 개수</strong>를 출력한다. 물고기란, 연속된 세 조각이 <span style="color:#e74c3c;"><code>&gt;&lt;&gt;</code></span> 또는 <span style="color:#e74c3c;"><code>&lt;&gt;&lt;</code> </span>형태를 갖는 경우를 말한다.</li>
</ul>

<p>다다스는 계산에 약하므로 여러분이 대신해서 모그의 행동을 처리해주어야 한다. 모그의 모든 행동에 올바르게 응답하자.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $N$이 주어진다. ($1\le N\le 3\times10^5$)</p>

<p>두 번째 줄에 물고기 화석을 이루는 $N$개의 조각이 공백 없이 주어진다. 각 조각은 <span style="color:#e74c3c;"><code>&gt;</code></span>또는 <span style="color:#e74c3c;"><code>&lt;</code></span>중 하나이다.</p>

<p>세 번째 줄에 양의 정수 $Q$가 주어진다. ($1\le Q\le 3\times10^5$)</p>

<p>네 번째 줄부터 $Q$개의 줄에 걸쳐 1번 또는 2번 쿼리가 주어진다. 2번 쿼리는 최소 한 개 이상 주어진다. ($1\le l\le r\le N$)</p>

### 출력

<p>2번 쿼리가 주어질 때마다 물고기 화석에서의<strong> 물고기의 개수</strong>를 출력하여라.</p>
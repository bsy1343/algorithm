# [Platinum III] 도시 계획 - 15934

[문제 링크](https://www.acmicpc.net/problem/15934)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 48, 맞힌 사람: 33, 정답 비율: 36.264%

### 분류

정렬, 이분 매칭

### 문제 설명

<p>신도시의 도시 계획을 세우려고 한다. 신도시의 어느 곳에&nbsp;고층 빌딩과 공원을 지을지 결정해야 한다. 신도시는 R x C 개의 단지로 구성되어 있으며, R개의 행 C개의 열로 구성된 격자 모양으로 나타낸다. 예를 들어, 아래 그림은 2개의 행과 3개의 열로 구성된 신도시를 나타낸다.&nbsp;총 여섯 개의 단지가 있다. 각각의 단지는 해발 고도를 나타내는 정수 값을 하나씩 가지고 있다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/62258ff9-e897-4dee-82a4-4862b8084cbe/-/preview/" style="width: 148px; height: 100px;" /></p>

<p>신도시에 고층 빌딩과 공원을 지을 때는 아래 조건을 모두 만족해야 한다.</p>

<ol>
	<li>고층 건물 하나는&nbsp;단지 하나 위에 지어져야 한다. 즉, 고층 건물을 단지 두 개에 걸쳐서 지을 수 없다.</li>
	<li>각각의 단지에는 고층 건물이 하나 있거나, 공원의 일부이어야 한다.</li>
	<li>고층 건물이 지어진 곳의 해발 고도가 y라면, 해발 고도가 y이하인 모든 단지에도 고층 건물이 있어야 한다.</li>
	<li>공원은 인접한 두 개의 단지 위에 지어야 하고, 두 개의 서로 다른 공원이 겹치면 안 된다. 즉, 단지 하나가 공원 2개에 포함될 수는 없다. 또, 공원이 단지 격자를 벗어나면 안 된다.</li>
</ol>

<p>3번 조건 때문에, 도시 계획을 세울 때는 음이 아닌 정수 Z를 먼저 골라야 한다. 그 다음, 해발 고도가 Z 이하인 모든 단지에 고층 건물을 짓고, 나머지 단지에는 공원을 지으려고 한다. 공원은 두 개의 인접한 단지 위에 지어야 한다. 두 단지가 도로를 공유할 때, 두 단지를 인접하다고 한다.</p>

<p>공원 하나를 짓는데는 D원이 필요하다. 고층 빌딩 전체를 짓는 비용은 Z&times;W원이다.&nbsp;</p>

<p>위의 모든 조건을 만족하면서, 고층 빌딩과 공원을 짓는 비용의 최솟값을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 줄에 4개의 정수 R, C, D, W 가 주어진다 (1 &le; R, C &le; 50 그리고 1 &le; D, W &le; 10<sup>9</sup>). 다음 R줄에는 각 줄에 C개의 정수가 주어진다. 이 수는 각 단지의 y값을 나타낸다. 각 y값은 1 이상 10<sup>9</sup> 이하이다.</p>

### 출력

<p>첫 줄에 고층 건물과 공원을 모든 단지에 짓는데 필요한 최소 비용을 출력하라.</p>

### 힌트

<p>Python을 사용하는 참가자는 PyPy 사용을 권장 합니다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/62258ff9-e897-4dee-82a4-4862b8084cbe/-/preview/" style="width: 148px; height: 100px;" /></p>

<p>위의 그림 예제의 경우에, Z를 10으로 고른다면 좌상단과 우하단에 위치한 단지에 고층 건물을 짓고, 나머지 단지에는 공원을 두 개 지을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e24205a1-1e9a-4153-a012-5104bdb352d9/-/preview/" style="width: 148px; height: 100px;" /></p>

<p>아래 세 예제는 이 규칙을 따르지 않고 공원을 지은 경우를 나타낸다.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bbed5636-00a0-4c77-997c-67fde229350b/-/preview/" style="width: 148px; height: 100px;" /><img alt="" src="https://upload.acmicpc.net/f02c0644-597a-47e0-9ff6-124de86f8141/-/preview/" style="width: 148px; height: 100px;" /><img alt="" src="https://upload.acmicpc.net/856bd1ff-af93-41f9-a749-5f9c8b9eb465/-/preview/" style="width: 148px; height: 100px;" /><br />
&nbsp;</p>

<p>왼쪽 예제는 공원이 도시 격자를 벗어난 경우를 나타낸다. 중간 예제는 두 개의 공원이 겹쳐서 하나의 단지 위에 지어진 경우를 나타낸다. 상단 중간 단지를 공유하고 있다. 우측 예제는 공원이 두 개의 인접한 단지 위에 지어지지 않은 경우를 나타낸다. 이 세 경우 모두 공원을 잘못 지은 경우이다.</p>
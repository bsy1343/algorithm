# [Silver II] 알고리즘 수업 - 깊이 우선 탐색 6 - 24484

[문제 링크](https://www.acmicpc.net/problem/24484)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2060, 정답: 1048, 맞힌 사람: 952, 정답 비율: 52.136%

### 분류

그래프 이론, 그래프 탐색, 정렬, 깊이 우선 탐색

### 문제 설명

<p>오늘도 서준이는 깊이 우선 탐색(DFS) 수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><em>N</em>개의 정점과&nbsp;<em>M</em>개의 간선으로 구성된 무방향&nbsp;그래프(undirected graph)가 주어진다. 정점 번호는 1번부터&nbsp;<em>N</em>번이고 모든 간선의 가중치는 1이다. 정점&nbsp;<em>R</em>에서 시작하여 깊이&nbsp;우선 탐색으로 만들어 지는 트리를 깊이 우선 탐색 트리라고 하자. 깊이&nbsp;우선 탐색 트리에 있는&nbsp;<em>i</em>번 노드의 깊이(depth)를&nbsp;<em>d<sub>i</sub></em>라고 하자. 시작 정점&nbsp;<em>R</em>의 깊이는&nbsp;0이고 방문 되지 않는 노드의 깊이는&nbsp;-1이다.&nbsp;정점&nbsp;<em>R</em>에서 시작하여 깊이 우선 탐색으로 노드를 방문할 경우&nbsp;<em>i</em>번 노드의 방문 순서를&nbsp;<em>t<sub>i</sub></em>라고 하자.&nbsp;시작 정점의 방문 순서는 1이고&nbsp;시작 정점에서 방문할 수 없는 노드는&nbsp;0이다. 모든 노드에 대한&nbsp;<em>d<sub>i</sub></em>&nbsp;&times;&nbsp;<em>t<sub>i</sub></em>&nbsp;값의 합을 구해보자.</p>

<p>깊이 우선 탐색 의사 코드는&nbsp;다음과 같다.&nbsp;인접 정점은&nbsp;<strong>내림차순</strong>으로 방문한다.</p>

<pre>
dfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
&nbsp;   visited[R] &lt;- YES;  # 시작 정점 R을 방문 했다고 표시한다.
&nbsp;   for each x &isin; E(R)  # E(R) : 정점 R의 인접 정점 집합.(정점 번호를 <strong>내림차순</strong>으로 방문한다)
        if (visited[x] = NO) then dfs(V, E, x);
}</pre>

### 입력

<p>첫째 줄에 정점의 수&nbsp;<em>N</em>&nbsp;(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 100,000), 간선의 수&nbsp;<em>M</em>&nbsp;(1 &le;&nbsp;<em>M</em>&nbsp;&le; 200,000), 시작 정점&nbsp;<em>R</em>&nbsp;(1 &le;&nbsp;<em>R</em>&nbsp;&le;&nbsp;<em>N</em>)이&nbsp;주어진다.</p>

<p>다음&nbsp;<em>M</em>개 줄에 간선 정보&nbsp;<code><em>u</em>&nbsp;<em>v</em></code>가 주어지며 정점&nbsp;<em>u</em>와&nbsp;정점&nbsp;<em>v</em>의 가중치 1인 양방향 간선을&nbsp;나타낸다. (1 &le;&nbsp;<em>u</em>&nbsp;&lt;&nbsp;<em>v</em>&nbsp;&le;&nbsp;<em>N</em>,&nbsp;<em>u</em>&nbsp;&ne;&nbsp;<em>v</em>) 모든 간선의 (<em>u</em>,&nbsp;<em>v</em>) 쌍의 값은 서로 다르다.</p>

### 출력

<p>첫째 줄에 모든 노드에 대한&nbsp;<em>d<sub>i</sub></em>&nbsp;&times;&nbsp;<em>t<sub>i</sub></em>&nbsp;값의 합을 출력한다.</p>
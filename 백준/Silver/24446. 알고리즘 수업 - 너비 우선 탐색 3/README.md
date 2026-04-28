# [Silver II] 알고리즘 수업 - 너비 우선 탐색 3 - 24446

[문제 링크](https://www.acmicpc.net/problem/24446)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2513, 정답: 1449, 맞힌 사람: 1256, 정답 비율: 56.833%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>오늘도 서준이는 너비 우선 탐색(BFS) 수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><em>N</em>개의 정점과&nbsp;<em>M</em>개의 간선으로 구성된 무방향&nbsp;그래프(undirected graph)가 주어진다. 정점 번호는 1번부터&nbsp;<em>N</em>번이고 모든 간선의 가중치는 1이다. 정점&nbsp;<em>R</em>에서 시작하여 너비 우선 탐색으로&nbsp;만들어 지는 트리를 너비 우선 탐색 트리라고 하자. 너비 우선 탐색 트리에 있는 모든&nbsp;노드의 깊이(depth)를&nbsp;출력하자. 시작 정점 <em>R</em>의 깊이는&nbsp;0이고 방문 되지 않는 노드의 깊이는&nbsp;-1로 출력하자.</p>

<p>너비 우선 탐색 의사 코드는&nbsp;다음과 같다.&nbsp;</p>

<pre>
bfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
&nbsp;   for each v &isin; V - {R}
&nbsp;       visited[v] &lt;- NO;
&nbsp;   visited[R] &lt;- YES;  # 시작 정점 R을 방문 했다고 표시한다.
&nbsp;   enqueue(Q, R);  # 큐 맨 뒤에 시작 정점 R을 추가한다.
&nbsp;   while (Q &ne; &empty;) {
        u &lt;- dequeue(Q);  # 큐 맨 앞쪽의 요소를 삭제한다.
&nbsp;       for each v &isin; E(u)  # E(u) : 정점 u의 인접 정점 집합
&nbsp;           if (visited[v] = NO) then {
                visited[v] &lt;- YES;  # 정점 v를 방문 했다고 표시한다.
&nbsp;               enqueue(Q, v);  # 큐 맨 뒤에 정점 v를 추가한다.
&nbsp;           }
&nbsp;   }
}</pre>

### 입력

<p>첫째 줄에 정점의 수&nbsp;<em>N</em>&nbsp;(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 100,000), 간선의 수&nbsp;<em>M</em>&nbsp;(1 &le;&nbsp;<em>M</em>&nbsp;&le; 200,000), 시작 정점&nbsp;<em>R</em>&nbsp;(1 &le;&nbsp;<em>R</em>&nbsp;&le; <em>N</em>)이&nbsp;주어진다.</p>

<p>다음&nbsp;<em>M</em>개 줄에 간선 정보&nbsp;<code><em>u</em>&nbsp;<em>v</em></code>가 주어지며 정점&nbsp;<em>u</em>와&nbsp;정점&nbsp;<em>v</em>의 가중치 1인 양방향 간선을&nbsp;나타낸다. (1 &le; <em>u</em> &lt;&nbsp;<em>v</em> &le;&nbsp;<em>N</em>, <em>u</em> &ne; <em>v</em>) 모든 간선의 (<em>u</em>,&nbsp;<em>v</em>) 쌍의 값은 서로 다르다.</p>

### 출력

<p>첫째 줄부터&nbsp;<em>N</em>개의&nbsp;줄에 정수를 한 개씩 출력한다.&nbsp;<em>i</em>번째 줄에는 정점&nbsp;<em>i</em>의 깊이를&nbsp;출력한다. 시작 정점 <i>R</i>의 깊이는&nbsp;0이고 방문 되지 않는 노드의 깊이는 -1로 출력하자.</p>
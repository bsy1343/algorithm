# [Platinum III] Tree Reconstruction - 10642

[문제 링크](https://www.acmicpc.net/problem/10642)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 26, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

수학, 자료 구조, 그래프 이론, 그래프 탐색, 애드 혹, 분리 집합, 선형대수학

### 문제 설명

<p>You have a directed graph. Some non-negative value is assigned on each edge of the graph. You know that the value of the graph satisfies the flow conservation law That is, for every node v, the sum of values on edges incoming to v equals to the sum of values of edges outgoing from v. For example, the following directed graph satisfies the flow conservation law.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10642.%E2%80%85Tree%E2%80%85Reconstruction/d7accbf6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10642.%E2%80%85Tree%E2%80%85Reconstruction/d7accbf6.png" data-original-src="https://www.acmicpc.net/upload/images2/flow3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:260px; width:201px" /></p>

<p>Suppose that you choose a subset of edges in the graph, denoted by E&#39;, and then you erase all the values on edges other than E&#39;. Now you want to recover the erased values by seeing only remaining information. Due to the flow conservation law, it may be possible to recover all the erased values. Your task is to calculate the smallest possible size for such E&#39;.</p>

<p>For example, the smallest subset E&#39; for the above graph will be green edges in the following figure. By the flow conservation law, we can recover values on gray edges.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10642.%E2%80%85Tree%E2%80%85Reconstruction/1dd5e6ae.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10642.%E2%80%85Tree%E2%80%85Reconstruction/1dd5e6ae.png" data-original-src="https://www.acmicpc.net/upload/images2/flow4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:260px; width:201px" /></p>

### 입력

<p>The input consists of multiple test cases. The format of each test case is as follows.</p>

<pre>
N M
s<sub>1</sub> t<sub>1</sub>
...
s<sub>M</sub> t<sub>M</sub>
</pre>

<p>The first line contains two integers N (1 &le; N &le; 500) and M (0 &le; M &le; 3,000) that indicate the number of nodes and edges, respectively. Each of the following M lines consists of two integers s<sub>i</sub> and t<sub>i</sub> (1 &le; s<sub>i</sub>,t<sub>i</sub> &le; N). This means that there is an edge from s<sub>i</sub> to t<sub>i</sub> in the graph.</p>

<p>You may assume that the given graph is simple:</p>

<ul>
	<li>There are no self-loops: s<sub>i</sub> &ne; t<sub>i</sub>.</li>
	<li>There are no multi-edges: for all i&lt;j, {s<sub>i</sub>,t<sub>i</sub>}&ne;{s<sub>j</sub>,t<sub>j</sub>}.</li>
</ul>

<p>Also, it is guaranteed that each component of the given graph is strongly connected. That is, for every pair of nodes v and u, if there exist a path from v to u, then there exists a path from u to v.</p>

<p>Note that you are NOT given information of values on edges because it does not effect the answer.</p>

### 출력

<p>For each test case, print an answer in one line.</p>

<p>&nbsp;</p>
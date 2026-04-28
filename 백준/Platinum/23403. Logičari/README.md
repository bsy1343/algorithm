# [Platinum II] Logičari - 23403

[문제 링크](https://www.acmicpc.net/problem/23403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 10, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>A group of perfect logicians has again received a request to be the main protagonists of a new logic puzzle. They must now agree upon which n of them should participate.</p>

<p>This time the logic puzzle takes place on an undirected graph with n nodes, and logically, n edges. Each edge connects two different nodes and between any two nodes there is at most one edge. Additionally, the graph is connected, which means that it is possible to go from any node to any other node via a sequence of edges. For each node there will be one logician located on that node and each logician is able to see precisely those logicians whose nodes are connected by an edge with their own node.</p>

<p>They already suspected that the catch might be related to their eye color, so they decided to arrange themselves so that each logician sees <strong>exactly one</strong> other person with blue eyes. As it ususally happens to be, none of the logicians can see their own eye color, which means that even logicians with blue eyes should see exactly one other person with blue eyes.</p>

<p>What is the least number of blue-eyed logicians needed to make the required arrangement?</p>

### 입력

<p>The first line contains the integer n - the number of nodes in the graph, and also the number of logicians.</p>

<p>The following n lines contain pairs of integers representing the edges of the graph. Each edge connects two different nodes and no edge is repeated twice in the input.</p>

### 출력

<p>If the required arrangement does not exist, in the first and only line output -1.</p>

<p>Otherwise, in the first and only line output the required least number of blue-eyed logicians.</p>

### 제한

<p>In every subtask, it holds that 3 &le; n &le; 100 000.</p>

### 힌트

<p>Clarification of the first example: Blue-eyed logicians could for example be those on nodes 1 and 2.</p>

<p>Clarification of the second example: If only one of the logicians has blue eyes, then he surely can&rsquo;t see anyone else with blue eyes. If there are two or more of them with blue eyes, then surely someone will see more than one person with blue eyes.</p>
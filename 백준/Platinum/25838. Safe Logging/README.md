# [Platinum III] Safe Logging - 25838

[문제 링크](https://www.acmicpc.net/problem/25838)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 14.286%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 누적 합, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider a tree (not necessarily a binary tree). We will use the term neighbor to refer to the parent and children of a node, i.e., nodes with direct connection to the node. Some of the nodes in the tree have a log. All logs have two colors: Red at the top-half and Black at the bottom-half.</p>

<p>Our strong friend, Lumber-Knight (LK), needs to cut all these logs in half. When a log is cut, the Red (top) part falls into a neighbor but the neighbor cannot contain a Black part. This means each node will eventually contain only one Black log or several (zero or more) Red logs. Note that the Black logs do not move from node to node. Note also that when a Red log falls into a neighbor, it does not move anymore.</p>

<p>Lumber-Knight, besides being strong, is also very stylish. He does not want any node with Black log to have two (or more) neighbors with Red logs. Your job is to determine all different ways the Red logs can be moved to (cut and fall into) neighbors to meet the LK&rsquo;s style. Since the number of ways can be quite large, output the number of ways modulo 1,000,000,007.</p>

<p>Given a tree description and locations of the logs, determine the number of ways in which LumberKnight can cut the logs and move the Red logs into neighbors such that no node with Black log has two (or more) neighbors with Red logs.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 100,000), representing the number of nodes in the tree (assume the tree nodes are numbered 1 to n, with 1 being the tree root). Each of the following n &ndash; 1 input lines contains two integers, a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n; a<sub>i</sub> &ne; b<sub>i</sub>), representing a direct connection between two nodes.</p>

<p>Following the tree description will be an integer, m (1 &le; m &le; n), representing the number of tree nodes with a log. The following input line contains m distinct integers (i.e., no duplicates), representing the tree nodes that contain a log.</p>

### 출력

<p>Print a single integer representing the number of ways the m logs can be cut and the Red part moved to a neighbor such that no node with a Black log has two (or more) neighbors with Red part. If it is not possible to accomplish the task, print 0 (zero).</p>

<p>Two cutting sequences are considered different if there is a node with different contents in the two sequences, e.g., the node is empty in one case and contains Red log(s) in the other case.</p>
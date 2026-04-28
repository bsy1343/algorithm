# [Platinum V] Justified Jungle - 15267

[문제 링크](https://www.acmicpc.net/problem/15267)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 559, 정답: 146, 맞힌 사람: 121, 정답 비율: 27.009%

### 분류

수학, 다이나믹 프로그래밍, 트리, 정수론, 트리에서의 다이나믹 프로그래밍, 조화수

### 문제 설명

<p>As you probably know, a tree is a graph consisting of n nodes and n &minus; 1 undirected edges in which any two nodes are connected by exactly one path. A forest is a graph consisting of one or more trees. In other words, a graph is a forest if every connected component is a tree. A forest is justified if all connected components have the same number of nodes.</p>

<p>Given a tree G consisting of n nodes, find all positive integers k such that a justified forest can be obtained by erasing exactly k edges from G. Note that erasing an edge never erases any nodes. In particular when we erase all n &minus; 1 edges from G, we obtain a justified forest consisting of n one-node components.</p>

### 입력

<p>The first line contains an integer n (2 &le; n &le; 1 000 000) &mdash; the number of nodes in G. The k-th of the following n &minus; 1 lines contains two different integers a<sub>k</sub> and b<sub>k</sub> (1 &le; a<sub>k</sub> , b<sub>k</sub> &le; n) &mdash; the endpoints of the k-th edge.</p>

### 출력

<p>The first line should contain all wanted integers k, in increasing order.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15267.%E2%80%85Justified%E2%80%85Jungle/0c991bc4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15267.%E2%80%85Justified%E2%80%85Jungle/0c991bc4.png" data-original-src="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15267/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:198px; width:425px" /></p>

<p style="text-align:center">Figures depict justified forests obtained by erasing 1, 3 and 7 edges from the tree in the example input.</p>
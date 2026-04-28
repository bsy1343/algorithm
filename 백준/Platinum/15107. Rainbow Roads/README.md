# [Platinum II] Rainbow Roads - 15107

[문제 링크](https://www.acmicpc.net/problem/15107)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 58, 맞힌 사람: 52, 정답 비율: 61.176%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 오일러 경로 테크닉

### 문제 설명

<p>You are given a tree with n nodes (conveniently numbered from 1 to n). Each edge in this tree has one of n colors. A path in this tree is called a rainbow if all adjacent edges in the path have different colors. Also, a node is called good if every simple path with that node as one of its endpoints is a rainbow path.</p>

<p>Find all the good nodes in the given tree.</p>

<p>A simple path is a path that does not repeat any vertex or edge.</p>

### 입력

<p>The first line of input contains a single integer n (1 &le; n &le; 50,000).</p>

<p>Each of the next n &minus; 1 lines contains three space-separated integers a<sub>i</sub>, b<sub>i</sub>, and c<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub> &le; n; a<sub>i</sub>&nbsp;&ne;&nbsp;b<sub>i</sub>), describing an edge of color c<sub>i</sub> that connects nodes a<sub>i</sub> and b<sub>i</sub>.</p>

<p>It is guaranteed that the given edges form a tree.</p>

### 출력

<p>On the first line of the output, print k, the number of good nodes.</p>

<p>In the next k lines, print the indices of all good nodes in numerical order, one per line.</p>

### 힌트

<p>For the first sample, node 3 is good since all paths that have node 3 as an endpoint are rainbow. In particular, even though the path 3&mdash;4&mdash;5&mdash;6 has two edges of the same color (i.e. 3&mdash;4, 5&mdash;6), it is still rainbow since these edges are not adjacent.</p>
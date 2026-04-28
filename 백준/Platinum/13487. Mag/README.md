# [Platinum I] Mag - 13487

[문제 링크](https://www.acmicpc.net/problem/13487)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 133, 정답: 27, 맞힌 사람: 25, 정답 비율: 24.272%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 수학, 트리

### 문제 설명

<p>You are given an undirected tree with each of its node assigned a magic X<sub>i</sub>.</p>

<p>The magic of a path is defined as the product of the magic of the nodes on that path divided by the number of the nodes on the path. For example, the magic of a path that consists of&nbsp;nodes with magic 3 and 5 is 7.5 (3&sdot;5 / 2).</p>

<p>In the given tree, find the path with the minimal magic and output the magic of that path.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10<sup>6</sup>), the number of nodes in the tree.</p>

<p>Each of the following N - 1 lines contains two integers, A<sub>i</sub> and B<sub>i</sub>&nbsp;(1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N), the labels of&nbsp;nodes connected with an edge.<br />
The ith of the following N lines contains the integer X<sub>i</sub> (1 &le; X<sub>i</sub> &le; 10<sup>9</sup> ), magic of the ith node.&nbsp;</p>

### 출력

<p>Output the magic of the path with minimal magic in the form of a completely reduced fraction&nbsp;P/Q (P and Q are relatively prime integers).</p>

<p>In all test cases, it will hold that the required P and Q are smaller than 10<sup>18</sup>.</p>

### 힌트

<p>Notice that the path may begin and end in the same node. The path with the minimal magic consists of&nbsp;the node with magic 3, so the entire path&rsquo;s magic is 3 / 1.&nbsp;</p>
# [Platinum V] Hyacinth - 10525

[문제 링크](https://www.acmicpc.net/problem/10525)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 193, 정답: 74, 맞힌 사람: 67, 정답 비율: 40.854%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 트리

### 문제 설명

<p>As a new employee at the Northwestern Europe Routing Company (NWERC), you do a lot of thinking about wireless network architectures. Lately you learned about a multi-channel mesh network architecture (called Hyacinth) that equips each mesh network node with multiple network interface cards (NICs) to increase the network throughput. You can choose a channel frequency for each NIC. In order to communicate, for every two network nodes that are in range of each other, their NICs must share at least one common frequency. The theoretical throughput is optimal when the total number of used frequencies in the network is maximal.</p>

<p>Your bosses at NWERC want you to figure out a procedure for assigning frequencies to the NICs such that the number of frequencies in use is maximized, subject to the constraint that all pairs of adjacent nodes must be able to communicate. A frequency is considered used if any pair of nodes within range of each other share that frequency. In the mesh network that you will be dealing with, each node is equipped with exactly two NICs (i.e., each node can use at most two frequencies). Since you are new at NWERC, your bosses further restrict the network layouts to make your job easier: the network graph will form a tree.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with one integer n (2 &le; n &le; 10 000), the number of nodes in the network;</li>
	<li>n &minus; 1 lines, each with two space-separated integers i and j, with 1 &le; i, j &le; n signifying that the (one-indexed) network nodes i and j are in range of each other.</li>
</ul>

### 출력

<p>Output a frequency assignment for each of the 2n NICs such that all adjacent nodes can communicate and the number of used frequencies is maximized. You should output n lines, where the ith line contains the two frequencies of network node i. Valid frequencies are nonnegative integers less than 10<sup>9</sup>.</p>
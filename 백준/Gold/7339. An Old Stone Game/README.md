# [Gold III] An Old Stone Game - 7339

[문제 링크](https://www.acmicpc.net/problem/7339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리

### 문제 설명

<p>There is an old stone game, played on an arbitrary general tree T. The goal is to put one stone on the root of T observing the following rules:</p>

<ol>
	<li>At the beginning of the game, the player picks K stones and puts them all in one bucket.</li>
	<li>At each step of the game, the player can pick one stone from the bucket and put it on any empty leaf.</li>
	<li>When all of the r immediate children of a node p each has one stone, the player may remove all of these r stones, and put one of the stones on p. The other r -1 stones are put back into the bucket, and can be used in the later steps of the game.</li>
</ol>

<p>The player wins the game if by following the above rules, he succeeds to put one stone on the root of the tree.</p>

<p>You are to write a program to determine the least number of stones to be picked at the beginning of the game (K), so that the player can win the game on the given input tree.</p>

### 입력

<p>The input file describes several trees. The first line of this file is M, the number of trees (1 &le; M &le; 10). Description of these M trees comes next in the file. Each tree has N &lt; 200 nodes, labeled 1, 2, ... N, and each node can have any possible number of children. Root has label 1. Description of each tree starts with N in a separate line. The following N lines describe the children of all nodes in order of their labels. Each line starts] with a number p (1 &le; p &le; N, the label of one of the nodes), r the number of the immediate children of p, and then the labels of these r children.</p>

### 출력

<p>One line for each input tree showing the minimum number of stones to be picked in step 1 above, in order to win the game on that input tree.</p>
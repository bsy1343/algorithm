# [Platinum V] Gathering Sharks - 34611

[문제 링크](https://www.acmicpc.net/problem/34611)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 23, 맞힌 사람: 23, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are the leader of a swarm of $n$ sharks living in a one-dimensional ocean. The sharks are positioned from left to right, with each adjacent pair separated by a distance of one unit.</p>

<p>As the leader, you want all the sharks to gather at a common point to form a single group. Initially, no two sharks belong to the same group; for each $i = 1, \dots , n$, the $i$-th shark from the left forms its own group, uniquely numbered $a_i$, consisting of only itself.</p>

<p>To achieve your goal, you can command the sharks to perform the following actions $n − 1$ times.</p>

<ol>
<li>You shout out an integer $b$ that meets both conditions:
<ul>
<li>There exists a group numbered $b$.</li>
<li>There exists at least one group numbered strictly smaller than $b$.</li>
</ul>
</li>
<li>Afterward, letting $c$ be the <strong>largest existing</strong> group number strictly smaller than $b$, all the sharks in the group numbered $b$ <em>simultaneously</em> move to the position of the group numbered $c$, and the two groups merge.</li>
<li>The merged group is numbered $b$, and the group numbered $c$ ceases to exist.</li>
</ol>

<p>All sharks move at a constant speed of one unit distance per unit time. Commands must be executed sequentially, with no overlap in execution. Once a command is completed, the next one can begin immediately.</p>

<p>Compute the minimum time required for all the sharks to gather at a common point by commanding the sharks $n − 1$ times optimally.</p>

### 입력

<p>The first line of input contains an integer $n$ ($2 ≤ n ≤ 500$). The second line contains $n$ pairwise distinct integers $a_1, a_2, \dots , a_n$ ($1 ≤ a_i ≤ n$).</p>

### 출력

<p>Output the minimum time required for all the sharks to gather at a common point.</p>
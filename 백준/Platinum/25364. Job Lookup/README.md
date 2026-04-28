# [Platinum III] Job Lookup - 25364

[문제 링크](https://www.acmicpc.net/problem/25364)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 39, 맞힌 사람: 35, 정답 비율: 53.030%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Julia&#39;s $n$ friends want to organize a startup in a new country they moved to. They assigned each other numbers from 1 to $n$ according to the jobs they have, from the most front-end tasks to the most back-end ones. They also estimated a matrix $c$, where $c_{ij} = c_{ji}$ is the average number of messages per month between people doing jobs $i$ and $j$.</p>

<p>Now they want to make a hierarchy tree. It will be a <strong>binary tree</strong> with each node containing one member of the team. Some member will be selected as a leader of the team and will be contained in the root node. In order for the leader to be able to easily reach any subordinate, for each node $v$ of the tree, the following should apply: all members in its left subtree must have smaller numbers than $v$, and all members in its right subtree must have larger numbers than $v$.</p>

<p>After the hierarchy tree is settled, people doing jobs $i$ and $j$ will be communicating via the shortest path in the tree between their nodes. Let&#39;s denote the length of this path as $d_{ij}$. Thus, the cost of their communication is $c_{ij} \cdot d_{ij}$.</p>

<p>Your task is to find a hierarchy tree that minimizes the total cost of communication over all pairs: $\sum_{1 \le i &lt; j \le n} c_{ij} \cdot d_{ij}$.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 200$) -- the number of team members organizing a startup.</p>

<p>The next $n$ lines contain $n$ integers each, $j$-th number in $i$-th line is $c_{ij}$ --- the estimated number of messages per month between team members $i$ and $j$ ($0 \le c_{ij} \le 10^9; c_{ij} = c_{ji}; c_{ii} = 0$).</p>

### 출력

<p>Output a description of a hierarchy tree that minimizes the total cost of communication. To do so, for each team member from 1 to $n$ output the number of the member in its parent node, or 0 for the leader. If there are many optimal trees, output a description of any one of them.</p>

### 힌트

<p>The minimal possible total cost is $566 \cdot 1+239 \cdot 1+30 \cdot 1+1 \cdot 2+1 \cdot 2=839$:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a59cf6e2-7960-4b70-8466-00f63747fe98/-/preview/" style="width: 206px; height: 150px;" /></p>
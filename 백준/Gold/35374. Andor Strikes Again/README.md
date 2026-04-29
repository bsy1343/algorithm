# [Gold I] Andor Strikes Again - 35374

[문제 링크](https://www.acmicpc.net/problem/35374)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Cassian Andor is a rebel spy who has infiltrated the Empire's foremost starship armory. He has managed to hack into the facility's main computer where he's found various decision-making processes for the Empire's next big weapon---the Death and Boy Do We Mean Death Star (the name is a work in progress). Each decision-making process is in the form of an AND/OR tree, where leaves of the tree store boolean values and interior nodes are either AND nodes or OR nodes, alternating along any path from the root. An AND node evaluates to <code>true</code> if all its subtrees evaluate to <code>true</code> and evaluates to <code>false</code> otherwise; an OR node evaluates to <code>true</code> if at least one of its subtrees evaluates to <code>true</code> and evaluates to <code>false</code> otherwise. The value of a decision tree or any subtree is the value its root evaluates to. An example of an AND/OR tree (which evaluates to <code>true</code>) is shown in Figure 1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35374.%E2%80%85Andor%E2%80%85Strikes%E2%80%85Again/e967b3ad.png" data-original-src="https://boja.mercury.kr/assets/problem/35374-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 139px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong>: Example AND/OR tree</p>

<p>Cassian has decided to sabotage each decision tree by making changes to one or more leaves in order to flip the value returned by the root. In order to make his subversion hard to detect he would like to change the minimum number of leaves. For example, in the tree above Cassian could change every leaf value to <code>false</code> to make the tree evaluate to <code>false</code>, but he can get the same result by changing just one of the left-most <code>true</code> leaves to <code>false</code>.</p>

<p>Though Cassian is a bit of a lone wolf, he could use a hand here. Help him out by writing a program that, given an AND/OR tree, determines the minimum number of leaves that need to be changed in order to change the evaluation of the tree.</p>

### 입력

<p>Input starts with a line containing two values $n$ $t$, where $n$ ($2 \leq n \leq 20$) is the number of levels in the tree and $t$ is either <code>A</code> or <code>O</code> indicating the type of nodes in odd levels of the tree; nodes in even levels will be of the opposite type. The root of the tree is at level $1$. Following this are $n$ lines describing the AND/OR tree. Each line contains one or more entries $e_1$ $e_2$ $\ldots$ $e_m$, where each $e_i$ is either the character <code>T</code> or <code>F</code>---indicating a leaf with value <code>true</code> or <code>false</code>---or a positive integer $v \leq 10$ indicating an internal node with $v$ children. There is a single numeric value in the first of these lines; the number of entries in each subsequent line is equal to the sum of the numeric values in the previous level. Nodes in each level should be assigned left-to-right to nodes in the previous level. The total number of nodes in the tree, both internal nodes and leaves, is less than or equal to $10^5$.</p>

### 출력

<p>Output the minimum number of leaves that need to be flipped to change the evaluation of the tree.</p>
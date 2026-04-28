# [Platinum II] Admiral - 19101

[문제 링크](https://www.acmicpc.net/problem/19101)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

너비 우선 탐색, 양방향 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해싱, 휴리스틱

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19101.%E2%80%85Admiral/7f59150e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19101.%E2%80%85Admiral/7f59150e.png" data-original-src="https://upload.acmicpc.net/ccb766f1-c901-4831-89c1-e350766ab29a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 244px; height: 202px; float: right;" />Suppose that you are an admiral of a famous naval troop. The troop consists of 21 battleships. There are 6 kinds of battleships. First, there is one flagship in which the admiral must be, and it is denoted by the integer 0. Other battleship kinds are denoted by integers from 1 to 5, and there are 2, 3, 4, 5, and 6 ships of these kinds, respectively.</p>

<p>The troop is going to a battle against the enemy. Hence, the correct arrangement of the battleships is very important. The shape of the battlefield is shown on the picture to the right. For simplicity, we consider all battleships to have the same rectangular shape.</p>

<p>Fortunately, the optimal arrangement of the battleships is already known. As you can see, the battlefield consists of 6 rows. In the optimal arrangement, all the battleships denoted by number $i$ must be located in the $i$-th row (rows are numbered starting from $0$).</p>

<p>You are given the initial state of the battlefield as input. The battleships occupy the 21 required positions, but some of them may be in a wrong row. You can change the state of battlefield by swapping the position of <strong>the flagship</strong>&nbsp;with an adjacent battleship. Two battleships are considered adjacent if and only if they are not in the same row, but share parts of their edges. For example, if we denote a cell in $i$-th row and $j$-th position from the left as $(i, j)$, then the cell $(2, 1)$ is adjacent to the cells $(1, 0)$, $(1, 1)$, $(3, 1)$, and $(3, 2)$ (here, rows and positions are numbered starting from $0$). Your task is to make the minimum possible number of swaps so as to reach the optimal arrangement, or to report that more than $20$ swaps are required.</p>

### 입력

<p>The first line of input contains an integer $T$, the number of test cases ($1 \le T \le 10$).</p>

<p>Each test case consists of 6 lines. The $i$-th line of each test case contains $i$ space-separated integers denoting the kinds of battleships at the $i$-th row of the battlefield, listed from left to right.</p>

### 출력

<p>For each test case, if you can&#39;t reach the goal in 20 or less swaps, print &quot;<code>too difficult</code>&quot; on a single line. Otherwise, print one integer: the minimum possible number of swaps.</p>
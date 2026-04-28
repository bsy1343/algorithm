# [Platinum IV] Moving Cells - 24845

[문제 링크](https://www.acmicpc.net/problem/24845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Little Alice has got a modern pixel picture for her birthday.</p>

<p>The picture is a rectangular grid of size $n\times m$. Each column of the grid has one or more consecutive cells colored black, all the other cells are colored white.</p>

<p>Alice considers the picture <em>beautiful</em> if there is a path between any two black cells $u$ and $v$ that runs only through the black cells, each time going from a cell to a side-adjacent cell --- begin in the black cell $u$, then go to a side adjacent to $u$ black cell $w$, then go to a side adjacent to $w$ black cell, and so on, eventually reaching the black cell $v$.</p>

<p>Since the picture is modern, it can be changed. In one <em>action</em> you may select any column and move all black cells in that column one cell in the same direction --- up or down. Cells can be moved only if they do not go outside the picture.</p>

<p>Alice wonders what is the minimum number of actions it would take to get a <em>beautiful</em> black picture.</p>

### 입력

<p>The first line of input has two integers $n$ and $m$ --- the number of rows and the number of columns in the picture, respectively ($1 \le n, m \le 100\,000$). It is guaranteed that the total number of the picture cells does not exceed $10^{6}$ ($1 \le n \cdot m \le 1\,000\,000$).</p>

<p>The next $m$ lines contain two integers $s_i$ and $t_i$ each --- the starting and the ending positions of black cells in the $i$-th column of the grid ($1 \le s_i \le t_i \le n$).</p>

### 출력

<p>Output a single integer --- the minimum number of actions you need to make the given picture <em>beautiful</em>.</p>
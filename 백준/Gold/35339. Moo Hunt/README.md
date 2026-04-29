# [Gold III] Moo Hunt - 35339

[문제 링크](https://www.acmicpc.net/problem/35339)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Bessie is playing the popular game "Moo Hunt". In this game, there are $N$ ($3 \le N \le 20$) cells in a line, numbered from $1$ to $N$. All cells either have the character $M$ or $O$ with the $i$-th cell having character $s_i$.</p>

<p>Bessie plans to perform $K$ ($1 \le K \le 2 \cdot 10^5$) mooves. On her $i$-th moove, Bessie will tap $3$ <strong>different</strong> cells ($x_{i},y_{i},z_{i}$) ($1 \le x_{i},y_{i},z_{i} \le N$). Bessie will earn a point if $s_{x_i}=M$ and $s_{y_i}=s_{z_i}=O$. In other words, Bessie will earn a point if she forms the string $MOO$ by tapping cells $x_{i},y_{i},z_{i}$ in that order.</p>

<p>Farmer John wants to help Bessie get a new high score. He wants you to find the maximum possible score Bessie could get across all possible boards if she performs the $K$ mooves as well as the number of different boards that will allow Bessie to achieve this maximum possible score. Two boards are different if there exists a cell such that the corresponding characters at the cell are different.</p>

### 입력

<p>The first line contains $N$ and $K$, the number of cells and the number of mooves Bessie will perform.</p>

<p>Each of the next $K$ lines contains $x_i, y_i, z_i$ describing Bessie's $i$-th move ($x_i, y_i, z_i$ are pairwise distinct).</p>

### 출력

<p>Output the maximum possible score Bessie could achieve, followed by the count of different boards that will allow Bessie to achieve this maximum score.</p>
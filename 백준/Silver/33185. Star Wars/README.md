# [Silver I] Star Wars - 33185

[문제 링크](https://www.acmicpc.net/problem/33185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 74, 정답: 41, 맞힌 사람: 35, 정답 비율: 53.030%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Amirreza is playing the Star Wars game. This game is played on an $n \times m$ board where each cell is either empty (‘<code>.</code>’), contains a white piece (‘<code>W</code>’) or a black piece (‘B’). At start of the game, Amirreza should choose exactly one white piece to play with. Afterwards he can move this piece multiple times to knock out as many black pieces as possible. Suppose the white piece is currently in cell $(i, j)$ of the board; In one move, this piece can go up-left $(i - 1, j - 1)$, up $(i - 1, j)$ or up-right $(i - 1, j + 1)$, provided that cell exists on the board and it does not contains another white piece. If the cell contains a black piece, it will be knocked out. Help Amireza figure out the maximum number of black pieces he can knock out.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \le n, m \le 50$), the number of rows and columns in the board, respectively. This is followed by $n$ lines, each containing $m$ characters. The $j$<sup>th</sup> character of the $(i + 1)$<sup>th</sup> line represents cell $(i, j)$. Each character is ‘<code>W</code>’, ‘<code>B</code>’, or ‘<code>.</code>’, denoting a white piece, a black piece, or an empty cell, respectively.</p>

### 출력

<p>Print a single integer, the maximum number of black pieces Amirreza can knock out.</p>
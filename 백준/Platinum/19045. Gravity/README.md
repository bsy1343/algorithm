# [Platinum I] Gravity - 19045

[문제 링크](https://www.acmicpc.net/problem/19045)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 16, 정답 비율: 64.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>You are given an $N \times M$ binary matrix. Cell $(i, j)$ contains the character &quot;<code>.</code>&quot; if it is free and the character &quot;<code>#</code>&quot;&#39; if the cell is occupied by a piece. Each maximal 4-connected component of &quot;<code>#</code>&quot; characters forms an indivisible piece. During the process described below, the pieces do not merge or split in any way. All cells that are part of the same piece will move in exactly the same way.</p>

<p>The pieces start falling towards the floor (the last row of the matrix) with equal speeds. The pieces move down without any rotations. Every second, all pieces try to move down one row. If this motion results in a piece crossing the lower boundary of the matrix, that piece stops in place instead. Similarly, if this motion results in a piece overlapping with another piece (note that this can only happen if the latter piece is not moving), then the former piece also stops in place. In other words, pieces stop falling when they hit the floor or when they hit another piece.</p>

<p>Output the final state of the pieces after all of them stop falling.</p>

### 입력

<p>The first line of input contains two integers $N$ and $M$ ($1 \le N, M \le 2000$).</p>

<p>The next $N$ lines describe the matrix. Each of them contains $M$ characters which are either &quot;<code>.</code>&quot; or &quot;<code>#</code>&quot;. The characters denoting cells on the same line are <strong>not</strong>&nbsp;separated by any whitespace.</p>

### 출력

<p>Print the resulting matrix after all pieces have finished falling. The matrix must be printed in the same format as given in the input, except for the line containing the matrix dimensions.</p>
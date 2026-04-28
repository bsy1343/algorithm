# [Bronze I] Friendly Rooks - 24843

[문제 링크](https://www.acmicpc.net/problem/24843)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 136, 정답: 89, 맞힌 사람: 79, 정답 비율: 72.477%

### 분류

해 구성하기

### 문제 설명

<p>Rook is a piece in the game of chess. It moves horizontally or vertically through any number of unoccupied squares, and can not jump over pieces. The rook can capture other piece if the piece is on the same vertical or horizontal line with the rook. There can be no more than one rook in one square of the chess board.</p>

<p>You are given $k$ rooks and a chess board with of $n \times m$. You need place these rooks on the board so that they cannot capture each other.</p>

### 입력

<p>The only line of input contains three integers $n$, $m$ and $k$ --- the lengths of the chess board sides and the number of rooks ($1 \le n, m, k \le 100$).</p>

### 출력

<p>If it is impossible to place $k$ rooks on an $n \times m$ chess board, print the line <code>Impossible</code>.</p>

<p>If there is at least one correct placement, print <code>Possible</code>. Then output $n$ lines of $m$ characters each --- the description of the placement of the rooks on the chess board. The $j$-th character of the $i$-th line must be &quot;<code>*</code>&quot; if the square $(i, j)$ contains a rook, or &quot;<code>.</code>&quot; if the corresponding square in your placement is empty.</p>

<p>If there are several correct placements, you can output any of them.</p>

### 힌트

<p>Image of the rook placement for the third test case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/24843.%E2%80%85Friendly%E2%80%85Rooks/82855ee3.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/24843.%E2%80%85Friendly%E2%80%85Rooks/82855ee3.png" data-original-src="https://upload.acmicpc.net/b9e91143-9218-4c8d-a6d8-d528094d3a5e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 186px;" /></p>

<p>Red marks the squares that the lower left rook can capture, blue marks the squares that the upper right rook can capture, purple --- squares that can be captured by both rooks.</p>
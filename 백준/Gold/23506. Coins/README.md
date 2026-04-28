# [Gold IV] Coins - 23506

[문제 링크](https://www.acmicpc.net/problem/23506)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 34, 맞힌 사람: 30, 정답 비율: 76.923%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are given an $N\times N$ matrix and in exactly $N$ of its cells there is a single coin. &nbsp;You are going to play a game on this matrix where in one turn you can take a coin and move it to any adjacent cell. Two cells are adjacent if they share a side. However, during these moves, no two coins may occupy the same cell at the same time. Your goal is to make every row and column contain exactly one coin in as few moves as possible. Determine the minimum number of moves required.</p>

### 입력

<p>In the first line of input is the number $N$ ($N\leq 200000$): the number of rows, columns and coins.</p>

<p>In the $(i+1)$-th line are two integers $r_i$ and $c_i$, denoting the initial row and column of the $i$-th coin. &nbsp;It is guaranteed that all pairs $(r_i,c_i)$ are different.</p>

### 출력

<p>Print a single integer: the minimum number of moves required to win at the game.</p>
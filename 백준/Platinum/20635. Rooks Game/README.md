# [Platinum III] Rooks Game - 20635

[문제 링크](https://www.acmicpc.net/problem/20635)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 23, 맞힌 사람: 21, 정답 비율: 65.625%

### 분류

그래프 이론, 그래프 탐색, 이분 매칭

### 문제 설명

<p>Rooks Game is a single-player game and uses a chessboard which has $N \times N$ grid and $M$ rook pieces.</p>

<p>A rook moves through any number of unoccupied squares horizontally or vertically. When a rook can attack another rook, it can capture the rook and move to the square which was occupied. Note that, in Rooks Game, we don&#39;t distinguish between white and black, in other words, every rook can capture any of other rooks.</p>

<p> Initially, there are $M$ rooks on the board. In each move, a rook captures another rook. The player repeats captures until any rook cannot be captured. There are two types of goal of this game. One is to minimize the number of captured rooks, and the other is to maximize it.</p>

<p>In this problem, you are requested to calculate the minimum and maximum values of the number of captured rooks.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ which are the size of the chessboard and the number of rooks, respectively ($1 \le N,M \le 1000$). Each of the following $M$ lines gives the position of each rook. The $i$-th line with $x_i$ and $y_i$ means that the $i$-th rook is in the $x_i$-th column and $y_i$-th row ($1 \le x_i,y_i \le N$). You can assume any two rooks are not in the same place.</p>

### 출력

<p>Output the minimum and maximum values of the number of captured rooks separated by a single space.</p>
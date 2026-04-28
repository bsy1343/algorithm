# [Bronze II] Chess Puzzle - 5239

[문제 링크](https://www.acmicpc.net/problem/5239)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 192, 정답: 150, 맞힌 사람: 138, 정답 비율: 80.233%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Jake and Sully are playing around with a chessboard one night after working with their avatars all day. They decide it would be interesting to place some rooks on the chessboard in a way that no rook can threaten another rook. Since rooks move along rows and columns, this means two rooks may not be on the same row or column. Your goal is to write a program to determine whether any rooks are threatened.</p>

### 입력

<p>Chessboards are 8x8 boards with positions between (1,1) and (8,8). The input begins with the number of chess boards. Each chessboard is on a separate line and begins with the number of rooks, followed by the column and row positions of each rook.</p>

### 출력

<p>For each chessboard, your program should output the words &rdquo;SAFE&rdquo; or &rdquo;NOT SAFE&rdquo; on a single line.</p>
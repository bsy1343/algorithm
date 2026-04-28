# [Platinum I] Adjacent Rooks - 21060

[문제 링크](https://www.acmicpc.net/problem/21060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 25, 맞힌 사람: 22, 정답 비율: 70.968%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Professor Oak is preparing a problem for his students. The problem consists in counting the number of ways of placing $n$ rooks on an $n \times n$ chessboard such that no rook is threatening another rook (that is, no two rooks are in the same column or in the same row).</p>

<p>However, this problem is too easy, so he has decided to add a twist. He only wants you to count the number of solutions in which there are exactly $k$ pairs of rooks that are diagonally adjacent (that is, they are in neighboring columns and in neighboring rows). Can you solve it?</p>

<p>Output your answer modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains a single integer $t$, the number of test cases ($1 \leq t \leq 5000$).</p>

<p>Each test case is given on a single line containing two integers $n$ and $k$: ($1 \leq n \leq 1000$; $0 \leq k \leq n-1$): the number of rooks and the number of pairs of rooks that must be diagonally adjacent.</p>

### 출력

<p>Print one integer: the number of ways to place $n$ rooks such that no two are in the same row or column and such that there are exactly $k$ pairs of diagonally adjacent rooks. The answer must be expressed modulo $10^9 + 7$.</p>
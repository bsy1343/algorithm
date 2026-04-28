# [Gold III] Rooks - 4168

[문제 링크](https://www.acmicpc.net/problem/4168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 10, 맞힌 사람: 10, 정답 비율: 25.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>You have unexpectedly become the owner of a large chessboard, having fifteen squares to each side. Because you do not know how to play chess on such a large board, you find an alternative way to make use of it.</p>

<p>In chess, a rook attacks all squares that are in the same row or column of the chessboard as it is. For the purposes of this problem, we define a rook as also attacking the square on which it is already standing.</p>

<p>Given a set of chessboard squares, how many rooks are needed to attack all of them?</p>

### 입력

<p>Input consists of a number of test cases. Each test case consists of fifteen lines each containing fifteen characters depicting the chess board. Each character is either a period (.) or a hash (#). Every chessboard square depicted by a hash must be attacked by a rook. After all the test cases, one more line of input appears. This line contains the word END.</p>

### 출력

<p>Output consists of exactly one line for each test case. The line contains a single integer, the minimum number of rooks that must be placed on the chess board so that every square marked with a hash is attacked.</p>
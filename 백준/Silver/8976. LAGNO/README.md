# [Silver III] LAGNO - 8976

[문제 링크](https://www.acmicpc.net/problem/8976)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 159, 정답: 103, 맞힌 사람: 94, 정답 비율: 65.278%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Lagno (also known as Reversi and Othello) is a board game for two players, one black and one white. The board is square, consisting of 8 rows and 8 columns.&nbsp;</p>

<p>In one move, the black player places a black piece into an empty square so that, in at least one of eight directions (up, down, left, right and the four diagonal directions), there is a row of white pieces between the newly placed piece and some other black piece. After placing, all white pieces between (in any direction) the newly placed black piece and pre-existing black pieces become black.&nbsp;</p>

<p>Write a program that, for a given board layout, calculates the largest number of white pieces the black player can convert in one move.&nbsp;</p>

### 입력

<p>The input contains eight lines, each consisting of exactly eight characters &#39;.&#39;, &#39;B&#39; or &#39;W&#39;. The character &#39;.&#39; represents an empty square, the letter &#39;B&#39; a square with a black piece, and the letter &#39;W&#39; a square with a white piece.&nbsp;</p>

### 출력

<p>Output the largest number of white pieces that black can convert in a single move. If there are no legal moves, output 0.&nbsp;</p>
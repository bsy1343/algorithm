# [Silver V] MO - 3227

[문제 링크](https://www.acmicpc.net/problem/3227)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 277, 정답: 133, 맞힌 사람: 108, 정답 비율: 51.923%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Mirko and Slavko are playing MO (mini-go). MO is similar to ancient chinese game GO, but is simpler and it plays on (one-dimensional) table which consists of certain number of squares in the sequence.</p>

<p>Mirko is playing with white coins, and he plays first. Slavko is playing with black coins, and he plays second.</p>

<p>In the beginning of the game, all the squares on the table are empty. The players are playing one by one and in each move they put one of their coins on any empty square on the table.</p>

<p>If there are consequent sequence of opponent&#39;s coins between just putted coin and previously putted coin with same color, then that sequence of opponent&#39;s coins are removed from the table.</p>

<p>Squares on the table are denoted with numbers from 1 till P, from left to right.</p>

<p>Write a program which will calculate number of white and number of black coins on the table on the end of the game.&nbsp;</p>

### 입력

<p>In the first line there are two integers P and N, separated with one space character, number of squares on the table and total number of moves of both players, 1 &le; P &le; 100, 1 &le; N &le; 1000.</p>

<p>In each of the next N lines, there are moves of Mirko and Slavko, from the beggining to the end of the game.&nbsp;</p>

### 출력

<p>In the only line of the output file you have to write number of white and number of black coins in the end of the game. That numbers must be separated with one space character.&nbsp;</p>
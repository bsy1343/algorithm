# [Gold III] JOKER - 3240

[문제 링크](https://www.acmicpc.net/problem/3240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 23, 맞힌 사람: 14, 정답 비율: 24.138%

### 분류

구현, 그리디 알고리즘, 정렬, 시뮬레이션

### 문제 설명

<p>Mirko plays very interesting card game. This game is played with N cards one of which is a joker.</p>

<p>Mirko puts cards on the table from left to right so that the joker is the rightmost card on the table and then in determined number of moves removes the cards from the table.</p>

<p>He chooses two cards, card A and card B (none of which is joker) and then removes all cards between card A and card B, including A and B. He writes down that move on the paper as (A,B), and then moves card from the right of the space left so that they maintain order.</p>

<p>After a certain number of moves, there is only one card left on the table, the joker, after which Slavko steals Mirko&rsquo;s piece of paper containing the moves made, and copies them to another piece of paper, in a random order. On occasions he will also modify the numbers themselves.</p>

<p>Write a program that will determine some order (if it exists) of the moves written on paper, so that the execution of the moves in that order will leave joker the only card on table.&nbsp;</p>

### 입력

<p>In the first line of input file there are two integers N and K, separated by space, 1 &le; K &lt; N &le; 1,000,000,000,&nbsp;number of cards and number of moves</p>

<p>In every of the following K lines there are two integers A and B separated by space, A &le; B. They represent move (A, B).&nbsp;</p>

### 출력

<p>Output file should contain K lines. In i-th line should be i-th move from the text.</p>

<p>If ordering doesn&rsquo;t exist you should write &lsquo;-1&rsquo;.&nbsp;</p>
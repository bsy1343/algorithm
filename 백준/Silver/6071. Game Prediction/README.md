# [Silver III] Game Prediction - 6071

[문제 링크](https://www.acmicpc.net/problem/6071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 35, 맞힌 사람: 33, 정답 비율: 44.595%

### 분류

그리디 알고리즘

### 문제 설명

<p>Suppose there are M people, including you, playing a special card game. At the beginning, each player receives N cards. The pip of a card is a positive integer which is at most N*M. And there are no two cards with the same pip. During a round, each player chooses one card to compare with others. The player whose card with the biggest pip wins the round, and then the next round begins. After N rounds, when all the cards of each player have been chosen, the player who has won the most rounds is the winner of the game.&nbsp;</p>

<p>Given your cards received at the beginning, write a program to tell the maximal number of rounds that you may at least win during the whole game.&nbsp;</p>

### 입력

<p>The input consists of several test cases. The first line of each case contains two integers m (2?20) and n (1?50), representing the number of players and the number of cards each player receives at the beginning of the game, respectively. This followed by a line with n positive integers, representing the pips of cards you received at the beginning. Then a blank line follows to separate the cases.&nbsp;</p>

<p>The input is terminated by a line with two zeros.&nbsp;</p>

### 출력

<p>For each test case, output a line consisting of the test case number followed by the number of rounds you will at least win during the game.</p>
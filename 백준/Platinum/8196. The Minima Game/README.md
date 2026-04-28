# [Platinum V] The Minima Game - 8196

[문제 링크](https://www.acmicpc.net/problem/8196)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 190, 정답: 112, 맞힌 사람: 81, 정답 비율: 57.042%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 게임 이론

### 문제 설명

<p>Alice and Bob learned the minima game, which they like very much, recently. The rules of the game are as follows. A certain number of cards lies on a table, each inscribed with a positive integer. The players make alternate moves, Alice making the first one. A move consists in picking an arbitrary positive number of cards from the table. For such move the player receives a number of points equal to the minimum of the numbers inscribed on the cards he collected. The game ends when the last card is removed from the table. The goal of each player is maximizing the difference between their and their opponent&#39;s score.</p>

<p>Alice and Bob have duly noted that there is an optimal strategy in the game. Thus they are asking you to write a program that, for a given set of cards, determines the outcome of the game when both players play optimally.</p>

### 입력

<p>In the first line of the standard input there is one integer n (1 &le; n &le; 1,000,000) given, denoting the number of cards. The second line holds n positive integers k<sub>1</sub>,k<sub>2</sub>,&hellip;,k<sub>n</sub> (1 &le; k<sub>i</sub> &le; 10<sup>9</sup>), separated by single spaces, that are inscribed on the cards.</p>

### 출력

<p>Your program should print out a single line with a single integer to the standard output - the number of points by which Alice wins over Bob, assuming they both play optimally; if it is Bob who has more points, the result should be negative.</p>

### 힌트

<p>Alice picks a single card, the one with 3, which grants her three points. Bob takes both the remaining cards, for which he receives one point. The games ends with three to one score, hence Alice wins by two points.</p>
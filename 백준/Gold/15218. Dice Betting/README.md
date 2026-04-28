# [Gold II] Dice Betting - 15218

[문제 링크](https://www.acmicpc.net/problem/15218)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 15, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Gunnar and his friends like games which involve rolling dice. Gunnar has a huge collection of 6-sided, 12-sided and 20-sided dice. All the games with dice started to bore him, so he came up with a new game. He rolls an s-sided die n times and wins if at least k different numbers appear in the n throws. An s-sided die contains s distinct numbers 1, . . . , s on its sides.</p>

<p>Since this is a game only for one person, Gunnar and his friends decided to make it more fun by letting other people bet on a particular game. Before you bet on a particular game, you would like to know how probable it is to throw at least k different numbers in n throws with an s-sided die. We assume that all numbers have the same probability of being thrown in each throw.</p>

### 입력

<p>The input consists of a single line with three integers n, s, and k (1 &le; n &le; 10 000, 1 &le; k &le; s &le; 500). n is the number of throws, k the number of different numbers that are needed to win and s is the number of sides the die has.</p>

### 출력

<p>Output one line with the probability that a player throws at least k different numbers within n throws with an s-sided die. Your answer should be within absolute or relative error at most 10<sup>&minus;7</sup>.</p>
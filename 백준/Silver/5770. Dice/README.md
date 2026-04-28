# [Silver V] Dice - 5770

[문제 링크](https://www.acmicpc.net/problem/5770)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 72, 정답: 52, 맞힌 사람: 44, 정답 비율: 73.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A simple boardgame that generations of children have played consists of a board containing a trail of squares and a set of colored pieces. At the beginning of the game each player is assigned a piece; all pieces are initially positioned right before the first square of the trail.</p>

<p>The game proceeds in rounds. At each round, players rolls a pair of dice, and move their pieces forward a number of squares equal to the rolled result. Players roll the dice always in the same order (player A, then player B, etc.) in the rounds.</p>

<p>Most of the squares on the board are plain squares, but some are &ldquo;traps&rdquo;. If a player&rsquo;s piece falls on a trap square at the end of the player&rsquo;s move, the player misses the next round. That is, she/he does not roll the dice, and her/his piece stays one round without moving.</p>

<p>There will be exactly three traps on the trail.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5770.%E2%80%85Dice/6e3091dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/5770.%E2%80%85Dice/6e3091dc.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5770/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:162px; width:584px" /></p>

<p>The winner of the game is the player whose piece reaches the end of the trail first. The end of the trail is after the last square of the board. Consider, for example, the board in the figure above, which has squares numbered from 1 to 48. At the start, the pieces are positioned at the place marked &lsquo;Begin&rsquo; in the figure, that is, before the square number 1. Therefore, if a player rolls a 7 (dice showing 2 and 5 for example), her/his piece is positioned at square number 7 at the end of the first round of the game. Furthermore, if a player&rsquo;s piece is positioned at square 41, the player needs a roll result of at least 8 to reach the end of the trail and win the game. Notice also that there will be no draw in the game.</p>

<p>You will be given the number of players, the number of squares in the trail, the location of the traps and a list of dice rolls results. You must write a program that determines the winner.</p>

### 입력

<p>Your program should process several test cases. The first line of a test case contains two integers P and S representing respectively the number of players and the number of squares in the trail (1 &le; P &le;&nbsp;10 and 3 &le; S &le; 10000). The second line describes the traps, represented by three distinct integers T1 , T2 and T3 , denoting their positions in the trail (1 &le; T1 , T2 , T3 &le; S). The third line contains a single integer N indicating the number of dice rolls in the test. Each of the following N lines contain two integers D1 and D2 (1 &le; D1 , D2 &le; 6), representing the results of the dice rolls. The end of input is indicated by P = S = 0. The set of dice roll results in a test will be always the exact number necessary for a player to win the game.</p>

<p>A player is identified by a number from 1 to P. Players play in a round in sequential order from 1 to P.</p>

### 출력

<p>For each test case in the input, your program should output a single integer: the number representing the winner.</p>
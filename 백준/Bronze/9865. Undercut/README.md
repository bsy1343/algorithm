# [Bronze II] Undercut - 9865

[문제 링크](https://www.acmicpc.net/problem/9865)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 170, 정답: 113, 맞힌 사람: 96, 정답 비율: 70.073%

### 분류

구현, 문자열, 시뮬레이션, 많은 조건 분기

### 문제 설명

<p>The game of Undercut is played between two people who each have five cards numbered 1 through 5. At each turn of the game each player secretly selects one of their cards and then they simultaneously reveal them. Points are then awarded as follows: the player with the higher card gets the number of points on the card unless the other player&rsquo;s card is one less; in that case, the player with the lower card gets the sum of the two cards played (this is called an undercut). If both players play the same card, then no points are awarded. For example, if Tessa and Danny are playing Undercut, and Tessa plays a 5 and Danny plays a 3 then Tessa gets 5 points; however if Tessa plays a 5 and Danny plays a 4 instead, Danny would get 5+4=9 points.</p>

<p>Undercut is a great mental game, as each side is thinking &ldquo;Okay, they think I&rsquo;ll play a 5, so they&rsquo;ll play a 4, so therefore I&rsquo;ll play a 3 to undercut them. But they&rsquo;ll realize I&rsquo;ll think that, so they&rsquo;ll play a 2, so instead I&rsquo;ll just play a 5. But then they&rsquo;ll think...&rdquo; Unfortunately, we can&rsquo;t model thinking like that in this contest, so instead we&rsquo;ll just give you a list of what each player played and ask you to determine the final score. To make things more interesting, we&rsquo;ll change the rules slightly: if you undercut a 2 with a 1, you&rsquo;ll get 6 points instead of 3 (in the real game, this makes it more worthwhile to play a 1).</p>

### 입력

<p>The input file will start with an integer n indicating the number of test cases. Each test case will start with a line containing a positive integer m &le; 100 indicating the number of rounds for that game. Following this (on one or more subsequent lines) will be m pairs of integers indicating the cards played in each round &ndash; the first two numbers will be the cards played by Tessa and Danny, respectively, in the first round, the next two numbers will be their plays in the second round, and so on. Card values will always be between 1 and 5, inclusive.</p>

### 출력

<p>For each test case, output Tessa&rsquo;s and Danny&rsquo;s scores.</p>
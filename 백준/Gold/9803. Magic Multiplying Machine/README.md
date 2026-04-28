# [Gold IV] Magic Multiplying Machine - 9803

[문제 링크](https://www.acmicpc.net/problem/9803)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 68, 정답: 17, 맞힌 사람: 17, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Well known Las-Vegas casino &quot;Big Jo&quot; has recently introduced the new playing machine, called Magic Multiplying Machine (MMM). MMM has N levers and one big red button. Each lever is marked with some integer number ranging from 1 to M, thus i-th lever is marked with number a<sub>i</sub>.</p>

<p>A player who wishes to play on MMM inserts a coin into a special slot. After that she chooses some levers and pulls them. After she has made her choice, she presses the big red button. MMM blinks all its lights, rings its bells, plays different tunes and after that declares whether player has won the game.</p>

<p>The algorithm for determining whether the player has won is the following. If the player has pulled some real subset S of {1, 2, . . .N} of levers, her score is the product of numbers that these levers are marked with, taken modulo M (if the player has pulled no levers, her score is 1):</p>

<p style="text-align: center;">score =&Pi;<sub>i&isin;S</sub>a<sub>i</sub> mod M</p>

<p>Player has won the game if her score is maximal possible for the given machine.</p>

<p>Given the description of some MMM determine which levers should be pulled to win the game.</p>

### 입력

<p>The first line of the input contains two integer numbers N and M (1 &le;&nbsp;N &le; 10 000, 2 &le;&nbsp;M &le;&nbsp;1 000). The second line of the input file contains N integer numbers ranging from 1 to M -- a<sub>1</sub>, a<sub>2</sub>, . . . a<sub>N</sub>.</p>

### 출력

<p>On the first line of the output file print one integer number -- the score that should be obtained to win the game. On the second line print in ascending order the numbers of levers that should be pulled to obtain this score (levers are numbered starting from one).</p>

<p>If there are several solutions, output any one.</p>
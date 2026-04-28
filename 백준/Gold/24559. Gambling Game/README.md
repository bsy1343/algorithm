# [Gold I] Gambling Game - 24559

[문제 링크](https://www.acmicpc.net/problem/24559)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 11, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

임의 정밀도 / 큰 수 연산, 많은 조건 분기, 조합론, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>The Ionian Commission on Procuring Cash has come up with a new gambling game to raise funds for the government. The game is played as follows: Each week, the government will televise a set of $m$ balls (numbered $1 \ldots m$) being selected one at a time without replacement. Anyone who wants to play will have to buy a game card. Each card contains $n$ squares (where $n \leq m/2$) and in each square are two numbers between 1 and $m$. No number appears more than once on a card. A sample card is shown in Figure E.1.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/237ab023-b8e1-4884-81b0-1b89914764c7/-/preview/" style="width: 271px; height: 90px;" /></p>

<p style="text-align: center;">Figure E.1: Sample game card with m = 10, n = 4 and p = 5.</p>

<p>After each ball is selected, players cover any square which contains that number (there will be at most one such square on any card). Each game card also has a number $p$ printed on it, and a contestant wins if he or she covers all $n$ squares after exactly $p$ ball selections (i.e., prior to the $p^{\text{th}}$ selection, they only had $n-1$ squares covered). Before issuing cards to its citizens, the government would like to get an idea of the likelihood of winning for various values of $m, n$ and $p$ so they can set up the payoffs appropriately. They have procured you to write a program to solve this problem.</p>

### 입력

<p>Input consists of a single line containing 3 integers $m, n$ and $p$, as described above, where $2 \leq m \leq 33$, $0 \leq n \leq m/2$ and $0 \leq p \leq m$.</p>

### 출력

<p>Output the probability of winning on the $p^{\text{th}}$ selection as a fraction <code>x/y</code> in simplest form.&nbsp;</p>
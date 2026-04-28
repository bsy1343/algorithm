# [Gold IV] Deadly Dice Game - 22665

[문제 링크](https://www.acmicpc.net/problem/22665)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 13, 맞힌 사람: 12, 정답 비율: 30.769%

### 분류

수학, 다이나믹 프로그래밍, 브루트포스 알고리즘, 확률론

### 문제 설명

<p>T.I. Financial Group, a world-famous group of finance companies, has decided to hold an evil gambling game in which insolvent debtors compete for special treatment of exemption from their debts.</p>

<p>In this game, each debtor starts from one cell on the stage called the Deadly Ring. The Deadly Ring consists of N cells and each cell is colored black or red. Each cell is connected to exactly two other adjacent cells and all the cells form a ring. At the start of the game, each debtor chooses which cell to start. Then he rolls a die and moves on the ring in clockwise order by cells as many as the number of spots shown on the upside of the die. This step is called a round, and each debtor repeats a round&nbsp;<i>T</i>&nbsp;times. A debtor will be exempted from his debt if he is standing on a red cell after he finishes all the rounds. On the other hand, if he finishes the game at a black cell, he will be sent somewhere else and forced to devote his entire life to hard labor.</p>

<p>You have happened to take part in this game. As you are allowed to choose the starting cell, you want to start from a cell that maximizes the probability of finishing the game at a red cell. Fortunately you can bring a laptop PC to the game stage, so you have decided to write a program that calculates the maximum winning probability.</p>

### 입력

<p>The input consists of multiple datasets.</p>

<p>Each dataset consists of two lines. The first line contains two integers&nbsp;<i>N</i>&nbsp;(1 &le;&nbsp;<i>N</i>&nbsp;&le; 2000) and&nbsp;<i>T</i>&nbsp;(1 &le;&nbsp;<i>T</i>&nbsp;&le; 2000) in this order, delimited with a single space. The second line contains a string of&nbsp;<i>N</i>&nbsp;characters that consists of characters &lsquo;R&rsquo; and &lsquo;B&rsquo;, which indicate red and black respectively. This string represents the colors of the cells in clockwise order.</p>

<p>The input is terminated by a line with two zeros. This is not part of any datasets and should not be processed.</p>

### 출력

<p>For each dataset, print the maximum probability of finishing the game at a red cell in one line. Your program may output an arbitrary number of digits after the decimal point, provided that the absolute error does not exceed 10<sup>-8</sup>.</p>
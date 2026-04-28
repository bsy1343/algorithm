# [Silver III] stolni - 3168

[문제 링크](https://www.acmicpc.net/problem/3168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 75, 정답: 33, 맞힌 사람: 30, 정답 비율: 48.387%

### 분류

구현, 해 구성하기, 시뮬레이션

### 문제 설명

<p>Two friends, Mirko and Slavko, are playing table soccer. Mirko has no players on the table, and Slavko&#39;s players are attached to vertical bars.&nbsp;</p>

<p>The ball is situated on the left edge of the table and Mirko shots the ball in the up-right diagonal direction. After that, the ball moves in a straight line across the table deflecting from the upper and lower edges.</p>

<pre style="text-align: center;">
....................
......|..|....|.....
.........|..........
......|.......|.....
L.....|.............
..............|.....</pre>

<p>If the ball hits some of the Slavko&#39;s players, Mirko fails to score, and if the ball reaches the right edge of the table, Mirko scores.&nbsp;</p>

<p>Slavko knows that he is a better player than Mirko and he wants to allow Mirko to score.&nbsp;</p>

<p>Write a program that finds some arrangement of the Slavko&#39;s players that allows Mirko to score. Also, draw the path of the ball.&nbsp;</p>

<p>Slavko can arrange the players by moving each column up or down a certain distance with the restriction that all players have to remain within the table.&nbsp;</p>

### 입력

<p>The first line of input contains two integers R and C, 2 &le; R,C &le; 100, the numbers of rows and columns on the table.&nbsp;</p>

<p>Each of the following R lines contains C characters &ndash; the initial layout of the table.&nbsp;</p>

<p>The ball is labeled with &#39;L&#39;, players with &#39;|&#39; (vertical line) and empty squares on the table with &#39;.&#39; (dot). There will be no players in the leftmost column on the table.&nbsp;</p>

### 출력

<p>Output the final layout of the table, together with the path of the ball.&nbsp;</p>

<p>Note: the test data will be such that a solution, although not necessarily unique, will always exist.&nbsp;</p>
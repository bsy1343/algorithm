# [Platinum V] Calvinball championship - 10956

[문제 링크](https://www.acmicpc.net/problem/10956)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 158, 정답: 36, 맞힌 사람: 33, 정답 비율: 24.265%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In addition to CEOI and ice hockey championship, Czech Republic hosts this year also a Calvinball championship. We will not go into the quasiexistent rules of Calvinball, and instead focus on the team selection procedure.</p>

<p>A game of Calvinball is played by n players with distinct names, divided into any number of non-empty teams. To record the teams, the following convention is employed. First, the player in each team with the lexicographically smallest name is chosen as the captain of the team. Then, the teams are sorted lexicographically by the names of their captains and numbered by consecutive integers starting from 1. Finally, the players are listed in the lexicographic order together with their team numbers.</p>

<p>For example, if there are three teams, one consisting of Calvin, Hobbes, and Susie, one consisting of Tom and Jerry, and one consisting only of Batman, the record would look like this:</p>

<pre>
Batman 1
Calvin 2
Hobbes 2
Jerry 3
Susie 2
Tom 3</pre>

<p>The same players play each day of the championship, but each time, different teams are chosen. As the players are the same each day, we can for briefness omit their names from the listing and record the teams only as the sequence of team numbers (1 2 2 3 2 3 in the above example). The championship ends when all the possible team choices were tried out.</p>

<p>As there are many possible team choices, deciding the teams for each day used to be quite confusing. This year, the International Calvinball Disorganization decided that the team selections will be made according to the lexicographic ordering of the sequences that represent them. So, the first day, all players will be on the same team (sequence 1 1 1 1 1 1), the second day everybody plays agains Tom (sequence 1 1 1 1 1 2), . . . , and on the last day, everybody plays against everybody (sequence 1 2 3 4 5 6).</p>

<p>For a given record of teams, determine on which day of the tournament it will be used. Output the number modulo 1 000 007.</p>

<p>Please note that the names of the players in the example are for the sake of explanation only and they play no role in the actual task.</p>

### 입력

<p>A description of the teams is read from the standard input. The first line of the input contains a positive integer n (1 &le; n &le; 10 000). The second line of the input contains n positive integers separated by spaces, giving the description of teams as specified in the task statement.</p>

### 출력

<p>To the standard output, write a single integer giving the number of the day of the championship on which the given team selection will be used modulo 1 000 007. The first day of the championship has number 1.</p>

### 힌트

<p>Note that the possible team selections in a 3-person tournament are 1 1 1; 1 1 2; 1 2 1; 1 2 2; and 1 2 3.</p>
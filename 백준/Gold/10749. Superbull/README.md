# [Gold I] Superbull - 10749

[문제 링크](https://www.acmicpc.net/problem/10749)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 425, 정답: 213, 맞힌 사람: 165, 정답 비율: 49.401%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Bessie and her friends are playing hoofball in the annual Superbull championship, and Farmer John is in charge of making the tournament as exciting as possible. A total of N (1 &lt;= N &lt;= 2000) teams are playing in the Superbull. Each team is assigned a distinct integer team ID in the range 1...2^30-1 to distinguish it from the other teams. The Superbull is an elimination tournament -- after every game, Farmer John chooses which team to eliminate from the Superbull, and the eliminated team can no longer play in any more games. The Superbull ends when only one team remains.</p>

<p>Farmer John notices a very unusual property about the scores in matches! In any game, the combined score of the two teams always ends up being the bitwise exclusive OR (XOR) of the two team IDs. For example, if teams 12 and 20 were to play, then 24 points would be scored in that game, since 01100 XOR 10100 = 11000.</p>

<p>Farmer John believes that the more points are scored in a game, the more exciting the game is. Because of this, he wants to choose a series of games to be played such that the total number of points scored in the Superbull is maximized. Please help Farmer John organize the matches.</p>

### 입력

<p>The first line contains the single integer N. The following N lines contain the N team IDs.</p>

### 출력

<p>Output the maximum possible number of points that can be scored in the Superbull.</p>

### 힌트

<p>OUTPUT DETAILS: One way to achieve 37 is as follows: FJ matches teams 3 and 9, and decides that 9 wins, so teams 6, 9, and 10 are left in the tournament. He then matches teams 6 and 9, and lets team 6 win. Teams 6 and 10 are then left in the tournament. Finally, teams 6 and 10 face off, and team 10 wins. The total number of points scored is (3 XOR 9) + (6 XOR 9) + (6 XOR 10) = 10 + 15 + 12 = 37.</p>

<p>NOTE: The bitwise exclusive OR operation, commonly denoted by the ^ symbol, is a bitwise operation that performs the logical exclusive OR operation on each position in two binary integers. The result in each position is 1 if only the first bit is 1 or only the second bit is 1, but is 0 if both bits are 0 or both are 1. For example: 10100 (decimal 20) XOR 01100 (decimal 12) = 11000 (decimal 24)</p>
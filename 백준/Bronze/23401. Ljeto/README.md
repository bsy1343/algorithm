# [Bronze II] Ljeto - 23401

[문제 링크](https://www.acmicpc.net/problem/23401)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 276, 정답: 155, 맞힌 사람: 132, 정답 비율: 56.410%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Bruno and his friends are playing with water guns. They are passionate gamers, which is why this is not a regular water gun game, but is in fact very similar to video-games. They even hired a moderator for the game.</p>

<p>At the beginning of the game, the players are divided into two teams: pineapples and blueberries. During the game, the moderator keeps track of every time some player sprays some other player, writing down the time when it happened. Just like in video-games, the players acquire points. When a player from some team sprays someone from the opposing team, their team receives 100 points. However, if within 10 seconds the same player again sprays someone from the opposing team, this is counted as a double-spray and their team receives an additional 50 points. A player can achieve multiple double-sprays in a row, each worth an additional 50 points for their team.</p>

### 입력

<p>The first line contains the integer n (1 &le; n &le; 100), the number of sprays that happened during the game.</p>

<p>Each of the following n lines contains three integers t<sub>i</sub>, a<sub>i</sub>, b<sub>i</sub> (0 &le; t<sub>i</sub> &le; 1000, 1 &le; a<sub>i</sub>, b<sub>i</sub> &le; 8) which denote that player a<sub>i</sub> sprayed player b<sub>i</sub> at time t<sub>i</sub> (in seconds).</p>

<p>Labels of the players from team pineapple are positive integers from 1 to 4, while the labels of the players from team blueberry are the positive integers from 5 to 8. The players a<sub>i</sub> and b<sub>i</sub> are guranteed to be from different teams.</p>

<p>The numbers t<sub>i</sub> are distinct and are ordered increasingly.</p>

### 출력

<p>The first and only line should contain two numbers: the total score of team pineapple and the total score of team blueberry.</p>

### 힌트

<p>Clarification of the first example: At seconds 10 and 20, player 1 sprayed players 6 and 7 from the other team. For each spraying the&nbsp;pineapples received 100 points. As the sprays happened within 10 seconds, the team receieved an additional 50 poitns (250 = 2 &middot; 100 + 50). Team blueberries sprayed only one player from the opposing team, which is why they received only 100 points.</p>

<p>Clarification of the second example: Player 2 achieved two double-sprays in a row, which is why team pineapple got a total of 3&middot;100+2&middot;50 = 400 points.</p>
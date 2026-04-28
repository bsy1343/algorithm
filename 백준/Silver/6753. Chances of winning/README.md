# [Silver II] Chances of winning - 6753

[문제 링크](https://www.acmicpc.net/problem/6753)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 27, 맞힌 사람: 25, 정답 비율: 86.207%

### 분류

브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 재귀

### 문제 설명

<p>You want to determine the chances that your favourite team will be the champion of a small tournament.</p>

<p>There are exactly four teams. At the end of the tournament, a total of six games will have been played with each team playing every other team exactly once. For each game, either one team wins (and the other loses), or the game ends in a tie. If the game does not end in a tie, the winning team is awarded three points and the losing team is awarded zero points. If the game ends in a tie, each team is awarded one point.</p>

<p>Your favourite team will only be the champion if it ends the tournament with strictly more total points than every other team (i.e., a tie for first place is not good enough for your favourite team).</p>

<p>The tournament is not over yet but you know the scores of every game that has already been played. You want to consider all possible ways points could be awarded in the remaining games that have not yet been played and determine in how many of these cases your favourite team will be the tournament champion.</p>

### 입력

<p>The first line of input will contain an integer T which is your favourite team (1 &le; T &le; 4). The second line will contain an integer G, the number of games already played (0 &le; G &le; 5). The next G lines will give the results of games that have already been played. Each of these lines will consist of four integers A, B, S<sub>A</sub>, S<sub>B</sub> separated by single spaces where 1 &le; A &lt; B &le; 4, and S<sub>A</sub>, S<sub>B</sub> &ge; 0 . This corresponds to a game between team A (which had score S<sub>A</sub>) and team B (which had score S<sub>B</sub>) where team A won if S<sub>A</sub> &gt; S<sub>B</sub>, team B won if S<sub>A</sub> &lt; S<sub>B</sub> and the game ended in a tie if S<sub>A</sub> = S<sub>B</sub>. The pairs A and B on the input lines are distinct, since no pair of teams plays twice.</p>

### 출력

<p>The output will consist of a single integer which is the number of times that team T is the champion over all possible awarding of points in the remaining games in the tournament.</p>
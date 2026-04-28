# [Silver I] Rank - 9917

[문제 링크](https://www.acmicpc.net/problem/9917)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 21, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>In a tournament of N players and K games, each game involves 2 players. &nbsp;A player may play any number of games, but in each game his opponent must be a different person. &nbsp;A player needs not play with everybody (it is even possible, though strange, that a player does not play any game at all!). &nbsp;In a game, there is no draw &ndash; a player either wins or losses.</p>

<p>After all the games have been played, the players are ranked. &nbsp;There are a few situations where ranking is not possible, but here we are interested only in one particular ituation where more than 2 players are involved in a &lsquo;cyclic&rsquo; order. &nbsp;One example is as follows: player A beats player B, player B beats player C, and player C in turns beats player A. &nbsp;In this case, the relative ranking of these 3 players cannot be determined.</p>

<p>Note that a player may be involved in more than one cyclic ordering; when this happens, the player should be counted only once.</p>

<p>(Since we are only interested in players involved in cyclic ordering, those players whose ranking cannot be determined due to other reasons &ndash; &nbsp;for instance, a player who did not play any game at all &ndash; should not be considered here. &nbsp;See the examples.)</p>

<p>You are given a list of games and their results, and you are to find the total number of players whose ranking cannot be determined due to cyclic ordering.</p>

### 입력

<p>The first line contains 2 integers N (2 &le; N &le; 20) and K (1 &le; K &le; 30) in this order, where N is the number of players, and K the number of games played. &nbsp;The players are identified by the integers 1, 2, 3, ..., N.</p>

<p>There are K lines after the first line. &nbsp;Each of the K lines contains 4 integers a b sa sb representing the result of a game: a and b are the identifiers of the players, and sa and sb are the scores of players a and b respectively. &nbsp;All scores are non-negative integers less than 10, and the player with the larger score wins.</p>

### 출력

<p>The output contains an integer which is the number of players whose ranking cannot be determined due to cyclic ordering.</p>
# [Gold IV] Ticket Completed? - 24762

[문제 링크](https://www.acmicpc.net/problem/24762)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 87, 정답: 62, 맞힌 사람: 44, 정답 비율: 63.768%

### 분류

수학, 그래프 이론, 그래프 탐색, 조합론, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1053415b-d575-4429-ba2b-90429fcea070/-/preview/" style="width: 378px; height: 305px;" /></p>

<p>Many are familiar with the board game Ticket To&nbsp;Ride (<a href="https://www.daysofwonder.com/tickettoride/en/">Ticket To&nbsp;Ride</a> is copyrighted by Days of Wonder, Inc.) where players compete to build a railway empire, claiming routes between cities. The game consists of a map of cities and various rail segments each connecting two adjacent cities.&nbsp;</p>

<p>A key way to score points towards winning the game is to complete <em>Destination Tickets</em>. &nbsp;Each ticket specifies two distinct cities. A player earns the points that are indicated on the ticket if they have claimed one or more rail segments that form a path connecting the two cities.</p>

<p>There is one ticket for each distinct unordered pair of cities. In our version of the game, each player is randomly given a ticket and they have an equal probability of receiving any ticket. Given a list of rail segments you have already claimed, determine the probability you earn points from the ticket you are given.</p>

### 입력

<p>The first line of input contains two integers $N$ ($2 \leq N \leq 10^5$), which is the number of cities, and $M$ ($0 \leq M \leq 10^6$), which is the number of rail segments you have claimed.</p>

<p>The next $M$ lines describe your claimed rail segments. Each line contains two distinct integers $i$ ($1 \leq i \leq N$) and $j$ ($1 \leq j \leq N$), which are the cities that this rail segment connects.</p>

### 출력

<p>Display the probability you earn points from the ticket you are given.</p>

<p>Your answer should have an absolute error of at most $10^{-6}$.</p>
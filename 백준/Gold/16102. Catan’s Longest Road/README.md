# [Gold IV] Catan’s Longest Road - 16102

[문제 링크](https://www.acmicpc.net/problem/16102)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 24, 맞힌 사람: 18, 정답 비율: 81.818%

### 분류

브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 파싱, 문자열

### 문제 설명

<p>In the game Settlers of Catan, several players compete to gain the most points by building items on a hexagonal grid. You and two friends are playing on the grid shown in Figure C.1. The board consists of seven regular hexagons which define 24 intersections (vertices of the hexagons) and 30 lanes (edges of the hexagons) connecting them.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/68531ebd-6a14-4378-9743-0a372cf2dd84/-/preview/" style="width: 320px; height: 336px;" /></p>

<p style="text-align: center;">Figure C.1: The game board.</p>

<p>In the game, each player can build road segments on the lanes. Each road segment is owned by exactly one player. At most one road segment can be built on each lane. A player has a road of length k if there is a sequence of k + 1 (not necessarily distinct) intersections I<sub>0</sub>, I<sub>1</sub>, . . . , I<sub>k</sub> such that the player owns k distinct road segments that connect intersections I<sub>j</sub> and I<sub>j+1</sub> (for each j &isin; {0, 1, . . . , k &minus; 1}).</p>

<p>There is a reward for the player who has the longest road. What is the length of each player&rsquo;s longest road?</p>

### 입력

<p>The input consists of a text representation of the game board. The game board consists of 19 lines and has size 19 &times; 31. Each intersection is represented by one of &lsquo;&gt;&rsquo; or &lsquo;&lt;&rsquo;. If a lane does not have a road segment on it, then all characters on that lane are one of &lsquo;-&rsquo;, &lsquo;/&rsquo; or &lsquo;\&rsquo;. If a lane does have a road segment on it, then all characters on that lane are one of &lsquo;1&rsquo;, &lsquo;2&rsquo; or &lsquo;3&rsquo;, representing the player that owns the road segment on that lane. All other characters of the input are &lsquo;.&rsquo;.</p>

<p>The game board with no road segments is shown in the first sample input. It is guaranteed that any differences between that empty game board and the input are full lanes replaced with one of &lsquo;1&rsquo;, &lsquo;2&rsquo; or &lsquo;3&rsquo;.</p>

### 출력

<p>Display the length of the longest road owned by each of the three players (Player 1 first, then Player 2, then Player 3).</p>
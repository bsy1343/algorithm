# [Gold V] Battleship - 3953

[문제 링크](https://www.acmicpc.net/problem/3953)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 140, 정답: 33, 맞힌 사람: 31, 정답 비율: 31.633%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>When playing battleship, players take turns trying to sink the other players navy. Each player may take shots at one coordinate at once. If he hits one of his enemy&rsquo;s ships and the enemy has any other ships left, he may continue. Else, the other player may take shots. After hitting a ship at one coordinate, shooting at that coordinate again counts as a miss.</p>

<p>The game is finished when every part of every ship of a navy of one player has been hit. The first player starts, and every player gets the same number of turns. That means, that the second player might get another turn even if all his ships have been sunk.</p>

<p>The game ends with a draw if both navies are completely sunk, or if there are still ships left after all shots have been fired.</p>

<p>Tom the little spy watches a game of battleships between two fleet admirals. As he has successfully tapped the communication wires, he can intercept the shot orders. However, he was unable to determine which admiral ordered what shot to be fired.</p>

<p>After the game, he successfully breaks into the super secret game management facility, and manages to secure the fleet deployment maps. As he wants to determine which fleet admiral is more dangerous, he wants to know which admiral won.</p>

<p>He transmits the deployment maps and the shot orders, and wants you to determine which admiral won.</p>

### 입력

<p>Input starts with one line, containing the number of test cases t (0 &lt; t &le; 20).</p>

<p>Every test case starts with a line, containing three integers w, h and n (1 &le; w, h &le; 30; 1 &le; n &le; 2000), describing the width and height of the fleet deployment maps, and the number of shots.</p>

<p>The next h lines contain the deployment map for player one. Each line contains w field descriptions, where &rsquo;_&rsquo; means &ldquo;water&rdquo; and &rsquo;#&rsquo; means &ldquo;ship&rdquo;. Then follow h lines containing the deployment map for player two.</p>

<p>The following n lines contain the shot orders; each order consists of two integers, the x and y coordinate of the shot. The x coordinate indicates the column of the shot, running from 0 to w &minus; 1, with 0 meaning the leftmost column. The y coordinate indicates the line of the shot, running from 0 to h &minus; 1, with 0 meaning the last line, and h &minus; 1 meaning the first line of the respective map.</p>

<p>Please note that there may be more shot orders than needed to end the game.</p>

### 출력

<p>For every test case, print one of &ldquo;player one wins&rdquo;, &ldquo;player two wins&rdquo; or &ldquo;draw&rdquo;, on a line.</p>
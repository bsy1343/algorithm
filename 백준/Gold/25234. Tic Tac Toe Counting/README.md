# [Gold III] Tic Tac Toe Counting - 25234

[문제 링크](https://www.acmicpc.net/problem/25234)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 286, 정답: 86, 맞힌 사람: 61, 정답 비율: 54.464%

### 분류

구현, 다이나믹 프로그래밍, 자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 백트래킹, 트리를 사용한 집합과 맵

### 문제 설명

<p>Tic Tac Toe is a simple children&#39;s game. It is played on a $3 \times 3$ grid. The first player places an <code>X</code> in any of the $9$ cells. The next player places an <code>O</code> in any of the remaining 8 cells. The players continue to alternate placing <code>X</code>s and <code>O</code>s in unoccupied cells until either a player gets three of their symbols in a row, or the grid is full. If either player gets three in a row, in any of the three rows, three columns or two diagonals, that player wins and the game ends.</p>

<p>Fred and Sam are playing a game of Tic Tac Toe. In the middle of the game, Fred wonders: &quot;How many games from this point in the game onward are winners for <code>X</code>? How many for <code>O</code>?&quot; Two games are different if they have different sequences of moves, even if they result in the grid looking the same at any point.</p>

<p>Given a list of grids, determine first if they can be reached in a game of Tic Tac Toe, and if they can, how many games from that point on result in wins for <code>X</code>, and how many for <code>O</code>.</p>

### 입력

<p>The first line of input contains a single integer $t$ ($1 \le t \le 10^5$), which is the number of test case grids.</p>

<p>Each of the next $t$ lines contains a single string $s$ ($|s|=9$) which consists of only the characters <code>&#39;.&#39;</code>, <code>&#39;X&#39;</code> and/or <code>&#39;O&#39;</code>. These are the test case grids. The first three characters represent the first row, the second three are the second row, and the last three are the last row, with <code>&#39;.&#39;</code> representing an empty cell. For example, the string <code>XX..O....</code> represents this grid:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25234.%E2%80%85Tic%E2%80%85Tac%E2%80%85Toe%E2%80%85Counting/dc049f5c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25234.%E2%80%85Tic%E2%80%85Tac%E2%80%85Toe%E2%80%85Counting/dc049f5c.png" data-original-src="https://upload.acmicpc.net/2abda38c-13c7-455c-9ba3-50d730033a00/-/crop/504x504/115,136/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;" /></p>

### 출력

<p>For each test case, output two space-separated integers. If the grid is not reachable in a game of Tic Tac Toe, output <code>-1 -1</code>. If the grid is reachable, output the number of games from that point on (including that grid) that are wins for <code>X</code>, followed by wins for <code>O</code>.</p>
# [Gold II] Coin Turning Game - 11334

[문제 링크](https://www.acmicpc.net/problem/11334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 35, 정답: 16, 맞힌 사람: 12, 정답 비율: 46.154%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Alice and Bob are playing the following game (Alice plays first):</p>

<p>They start with an arrangement of N coins in a row (some of them showing heads and some of them showing tails) At each player&#39;s turn, they can flip any number of consecutive coins but the rightmost one has to go from head to tail. Whoever is unable to make a move loses.</p>

<p>Given the initial arrangement of coins, if both Alice and Bob play optimally, can Alice win the game?</p>

### 입력

<p>First line of the input contains an integer T (1 &lt;= T &lt;= 100) - the number of test cases. Each test case consist of a single line containing a string S (3 &lt;= |S| &lt;= 15) - the initial arrangement of coins. Each character of S will be either &#39;H&#39; or &#39;T&#39; (telling us if heads or tails are up).</p>

### 출력

<p>For each test case determine if Alice can win the game if both she and Bob play optimally. If she can, print &quot;YES&quot; followed by two integers - the position of the rightmost coin flipped (1-based) and the number of coins flipped. If there are several initial moves with which Alice wins the game, you can print any of them. If Alice cannot win the game, just print &quot;NO&quot; for that test case.</p>
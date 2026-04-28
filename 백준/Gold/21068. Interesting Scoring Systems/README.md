# [Gold III] Interesting Scoring Systems - 21068

[문제 링크](https://www.acmicpc.net/problem/21068)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 23, 맞힌 사람: 23, 정답 비율: 32.394%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p>Score in chess tournaments is a controversial topic. Abel likes the classical system: 2 points per win and 1 point per draw. Bolzano prefers the football way: 3 points per win and 1 point per draw. But Cardano doesn&#39;t like either way and has his own system to declare a winner. We define the graph of the tournament as the graph where each node represents a player and an edge goes from player $v$ to player $u$ if player $v$ won at least one game against player $u$. Then Cardano states that a player $v$ wins the tournament only if in the graph of the tournament there is a path from $v$ to everyone else and there is none from any other player to $v$.</p>

<p>Recently, there has been a chess tournament of $n$ players, numbered from $0$ to $n-1$. The only information we have is the number of points of each player according to Abel&#39;s and Bolzano&#39;s criteria. Each player might have played any number of times with any other player. Determine if it is possible that player $0$ won the tournament according to Cardano&#39;s criteria.</p>

### 입력

<p>The first line contains one integer $t$, the number of test cases ($1 \leq t \leq 10^4$). Each test case consists of three lines:</p>

<p>The first line of contains one integer $n$ ($1 \leq n \leq 10^6$), the number of participants in the tournament.</p>

<p>The second line contains $n$ integers $a_0, a_1, \dots, a_{n-1}$ ($0 \leq a_i \leq 10^9$), where $a_i$ is the number of points player $i$ has obtained according to Abel&#39;s criteria.</p>

<p>The third line contains $n$ integers $b_0, b_1, \dots, b_{n-1}$ ($0 \leq b_i \leq 10^9$), where $b_i$ is the number of points player $i$ has obtained according to Bolzano&#39;s criteria.</p>

<p>The sum of $n$ for all test cases won&#39;t exceed $10^6$.</p>

<p>It is guaranteed that the given scoring corresponds to a valid tournament.</p>

### 출력

<p>For each test case, print a line with the word &quot;<code>YES</code>&quot; if it is possible that player $0$ won the tournament according to Cardano&#39;s criteria. Otherwise, print a line with the word &quot;<code>NO</code>&quot;.</p>
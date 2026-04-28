# [Silver II] Competition - 19076

[문제 링크](https://www.acmicpc.net/problem/19076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 30, 맞힌 사람: 25, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>A wrestling competition will be held tomorrow. A total of $n$ players will take part in it. The $i$-th player&#39;s strength is $a_i$.</p>

<p>If there is a match between the $i$-th player and the $j$-th player, the result will depend solely on $|a_i - a_j|$. If $|a_i - a_j| &gt; K$, the player with the higher strength will win. Otherwise, each player will have a chance to win.</p>

<p>The competition rules are a little strange. For each fight, the referee will choose two players from all remaining players uniformly at random and hold a match between them. The loser will be eliminated. After $n - 1$ matches, the last remaining player will be the winner.</p>

<p>Given the numbers $n$ and $K$ and the array $a$, find how many players have a chance to win the competition.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $K$ ($1 \leq n \leq 10^5$, $0 \leq K &lt; 10^9$).</p>

<p>The second line contains $n$ integers $a_i$ ($1 \leq a_i \leq 10^9$).</p>

### 출력

<p>Print a single line with a single integer: the number of players which have a chance to win the competition.</p>
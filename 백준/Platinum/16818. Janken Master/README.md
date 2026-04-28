# [Platinum IV] Janken Master - 16818

[문제 링크](https://www.acmicpc.net/problem/16818)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

수학, 다이나믹 프로그래밍, 비트마스킹, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are supposed to play the rock-paper-scissors game. There are $N$ players including you.</p>

<p>This game consists of multiple rounds. While the rounds go, the number of remaining players decreases. In each round, each remaining player will select an arbitrary shape independently. People who show rocks win if all of the other people show scissors. In this same manner, papers win rocks, scissors win papers. There is no draw situation due to the special rule of this game: if a round is tied based on the normal rock-paper-scissors game rule, the player who has the highest programming contest rating (this is nothing to do with the round!) will be the only winner of the round. Thus, some players win and the other players lose on each round. The losers drop out of the game and the winners proceed to a new round. They repeat it until only one player becomes the winner.</p>

<p>Each player is numbered from $1$ to $N$. Your number is $1$. You know which shape the other $N-1$ players tend to show, that is to say, you know the probabilities each player shows rock, paper and scissors. The $i$-th player shows rock with $r_i$% probability, paper with $p_i$% probability, and scissors with $s_i$% probability. The rating of programming contest of the player numbered $i$ is $a_i$. There are no two players whose ratings are the same. Your task is to calculate your probability to win the game when you take an optimal strategy based on each player&#39;s tendency and rating.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre class="mathjax">$N$ $a_1$ $a_2 \ r_2 \ p_2 \ s_2$ $\vdots$ $a_N \ r_N \ p_N \ s_N$</pre>

<p>The first line consists of a single integer $N \ (2 \le N \le 14)$. The second line consists of a single integer $a_1 \ (1 \le a_1 \le N)$. The $(i+1)$-th line consists of four integers $a_i$, $r_i$, $p_i$ and $s_i$ ($1 \le a_i \le N$, $0 \le r_i, p_i, s_i \le 100$, $r_i + p_i + s_i = 100$) for $i = 2, \ldots, N$. It is guaranteed that $a_1, \ldots, a_N$ are pairwise distinct.</p>

### 출력

<p>Print the probability to win the game in one line. Your answer will be accepted if its absolute or relative error does not exceed $10^{-6}$.</p>
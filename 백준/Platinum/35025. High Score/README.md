# [Platinum II] High Score - 35025

[문제 링크](https://www.acmicpc.net/problem/35025)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 수학, 해 구성하기

### 문제 설명

<p>Hermione loves to play the following computer game, in which the player controls an unordered multiset of integers. Initially, the multiset is empty and the player's score is $0$. At any moment in the game, the multiset contains at most $k$ integers (not necessarily distinct). In one turn, the player can choose one of the following moves:</p>

<ul>
<li><strong>Insert</strong>. Choose an integer $2$ or $4$ and insert it into the multiset. This move does not change the score, and it is only allowed if the size of the multiset before the move is strictly less than $k$.</li>
<li><strong>Merge</strong>. Choose an integer $x$ such that the multiset contains at least two copies of $x$. Remove two copies of $x$ from the multiset, and insert one copy of $2x$ into the multiset. This move adds the value $2x$ to the player's score.</li>
</ul>

<p>The player can stop the game after any turn, at which point the player's score becomes final.</p>

<p>Hermione has been on vacation for the whole summer, and she hasn't played the game in a while. Today, she opened the game on her laptop and saw the leaderboard with the highest scores she's ever had: $h_1, h_2, \ldots, h_n$ in some order. Now she is curious how she managed to achieve those scores.</p>

<p>For each $h_i$, find any multiset of integers that Hermione could have at the end of the game if her final score was $h_i$, or determine that it is impossible to achieve such a score.</p>

### 입력

<p>The first line contains two integers $n$ and $k$, denoting the number of scores on the leaderboard and the maximum size of the multiset ($1 \le n \le 10^4$; $2 \le k \le 16$).</p>

<p>Each of the next $n$ lines contains a single integer $h_i$, denoting a score on the leaderboard ($1 \le h_i \le 10^9$).</p>

### 출력

<p>For each score $h_i$, print the final size of the multiset $s$, followed by $s$ integers describing the contents of the multiset in any order ($0 \le s \le k$). It must be possible to achieve the score $h_i$ with this multiset at the end of the game. If there are multiple answers, print any of them.</p>

<p>If it is impossible to have the score $h_i$ at the end of the game, print a single integer $-1$ instead.</p>

### 힌트

<p>A possible sequence of moves for the first test is shown below:</p>

<p style="text-align: center;">$\{\} \xrightarrow{\texttt{insert 2}} \{2\} \xrightarrow{\texttt{insert 2}} \{2, 2\} \xrightarrow[\texttt{score += 4}]{\texttt{merge, x = 2}} \{4\} \xrightarrow{\texttt{insert 4}} \{4, 4\} \xrightarrow[\texttt{score += 8}]{\texttt{merge, x = 4}} \{8\} $</p>
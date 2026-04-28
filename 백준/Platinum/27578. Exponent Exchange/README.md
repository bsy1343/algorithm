# [Platinum II] Exponent Exchange - 27578

[문제 링크](https://www.acmicpc.net/problem/27578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 8, 맞힌 사람: 8, 정답 비율: 19.048%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Alice and Bob are playing a cooperative game.  They hold $b^p$ dollars between them, for given integers $b$ and $p$.  Alice initially holds $x$ dollars, and Bob holds $b^p - x$ dollars.  Alice and Bob want to consolidate their money, so one person holds all the money.</p>

<p>In each transaction, one player can choose to send the other player $b^y$ dollars, for some integer $y$ with $0 \le y &lt; p$.  But each player wants to initiate as few transactions as possible.  They are willing to cooperate such that the player that initiates the most transactions (the busiest player), initiates as few as possible.</p>

<p>Alice and Bob want to know the fewest number of transactions that the busiest player needs to initiate to complete the transfer.</p>

### 입력

<p>The first line of input contains two integers $b$ ($2 \le b \le 100$) and $p$ ($2\le p\le 1000$), where $b$ is the base, and $p$ is the number of digits.</p>

<p>The next line contains $p$ integers $x_{p-1}, x_{p-2}, \ldots,  x_0$, separated by spaces, with $0\le x_i&lt;b$ and $0&lt;x_{p-1}$. These are the base-$b$ digits of the value of $x$, with the most significant digit first.  Specifically, $x=\sum_{0\le i&lt;p} b^i x_i$. Note that they are given in order from the highest power to the lowest. For example, in the sample, <code>4 2 7 8 6</code> with $b=10$ represents the base $10$ number $42\,786$.</p>

### 출력

<p>Output a single integer, which is the minimum number of transactions the busiest player must initiate to transfer all the money to either Alice or Bob.</p>
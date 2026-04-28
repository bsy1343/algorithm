# [Platinum I] IQ Game - 26871

[문제 링크](https://www.acmicpc.net/problem/26871)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 20, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>A popular TV show &quot;Kak? Zachem? Pochemu?&quot; highlights a team of six players working together to solve challenging questions. Players sit around a circular table divided into $n$ sectors numbered clockwise from $1$ to $n$. At the start of the game, each sector contains an envelope with a question to be answered.</p>

<p>Each round, the spinning top at the center of the table chooses a sector of the table uniformly at random. If the chosen sector contains an envelope, the host opens it and reads the question inside. If there is no envelope in the chosen sector, the host opens the next envelope in the clockwise direction from the chosen sector instead. After the round, the opened envelope is removed from the table.</p>

<p>Tonight, the audience&#39;s favorite team is playing. They have already played $n - k$ rounds out of $n$, so there are $k$ envelopes remaining on the table. Things are not looking good for the team --- one more incorrect answer will send them home. One of the questions is a special, notoriously hard question called &quot;Hyperblitz&quot;. The team is confident they can answer each of the remaining questions except &quot;Hyperblitz&quot;. Find the expected number of rounds they will play, modulo $998\,244\,353$ (see the Output section for details).</p>

### 입력

<p>The first line contains three integers $n$, $k$, and $s$ --- the total number of sectors, the number of remaining questions, and the sector containing the &quot;Hyperblitz&quot; question ($1 \le n \le 10^9$; $1 \le k \le \min(n, 200)$; $1 \le s \le n$). It is guaranteed that $n$ is not equal to $998\,244\,353$.</p>

<p>The second line contains $k$ distinct integers $q_1, q_2, \ldots , q_k$ --- the numbers of sectors that still have envelopes, in clockwise order ($1 \le q_1 &lt; q_2 &lt; \ldots &lt; q_k \le n$).</p>

<p>There is exactly one index $i$ with $q_i = s$.</p>

### 출력

<p>Print a single integer --- the expected number of rounds the team will play (including the inevitable &quot;Hyperblitz&quot;), modulo $998\,244\,353$.</p>

<p>Formally, let $M = 998\,244\,353$. It can be shown that the expected number of rounds can be expressed as an irreducible fraction $\frac{p}{q}$, where $p$ and $q$ are integers and $q \not \equiv 0 \pmod{M}$. Print the integer equal to $p \cdot q^{-1} \bmod M$. In other words, print such an integer $x$ that $0 \le x &lt; M$ and $x \cdot q \equiv p \pmod{M}$.</p>

### 힌트

<p>In the first example test, in the first round, the team plays the &quot;Hyperblitz&quot; with probability $\frac 13$, so with probability $\frac 13$ they play 1 round, and with probability $\frac 23$ they play 2 rounds. The expected number of rounds is $1 \cdot \frac 13 + 2 \cdot \frac 23 = \frac 53$.</p>

<p>As $3^{-1} \bmod {998\,244\,353} = 332\,748\,118$, the correct output is $5 \cdot 332\,748\,118 \bmod {998\,244\,353} = 665\,496\,237$.</p>
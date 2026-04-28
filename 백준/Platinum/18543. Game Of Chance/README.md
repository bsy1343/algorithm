# [Platinum II] Game Of Chance - 18543

[문제 링크](https://www.acmicpc.net/problem/18543)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 10, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

이분 탐색, 게임 이론, 수학

### 문제 설명

<p>Billionaires Robin McBobin and Ronald Dump are playing the Game of Chance.</p>

<p>The game takes \(n\) turns. On each turn, one of the players has the right of choice, Robin gets it for the first move. On each turn, an integer chosen uniformly and independently from \(1\)&nbsp;to \(m\) appears on the screen. The player with the right of choice has to choose whether to take this number and pass the right of choice to the opponent, or to give this number to the opponent but keep the right of choice for themselves</p>

<p>Both Robin and Ronald are more interested in dominating their opponent than in gaining scores, so both will choose the option which would maximize the expected difference between their and the opponent&rsquo;s sum of numbers. Both players play optimally.</p>

<p>Let \(d_n\) be the expected value of difference between Robin&rsquo;s sum and Ronald&rsquo;s sum after \(n\) turns. It may be proven that for \(m \ge 3\), there exists a rational number \(d\) such that \(\lim_{n \to \infty}{d_n} = d\). You have to find this number.</p>

### 입력

<p>The first line of input contains a single integer \(t\) which is the number of test cases (\(1 \le t \le 5 \cdot 10^5\)).</p>

<p>Each test case is given on a single line containing a single integer \(m\) (\(3 \le m \le 10^9\)).</p>

### 출력

<p>For each test case, if \(d&nbsp;= \frac{P}{Q}\) such that \(P\) and \(Q\) are coprime, output (\(P \cdot Q^{&minus;1}\)) mod (\(10^9 + 7\)). It is guaranteed that \(Q \not\equiv&nbsp;0\) (mod \(10^9 + 7\)).</p>

### 힌트

<p>For \(m = 3\), the answer is \(d = 1\). For \(m = 4\), the answer is \(d = 1.333\dots&nbsp;= \frac{4}{3}\).</p>
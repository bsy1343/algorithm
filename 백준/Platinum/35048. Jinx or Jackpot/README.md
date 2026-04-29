# [Platinum II] Jinx or Jackpot - 35048

[문제 링크](https://www.acmicpc.net/problem/35048)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 14, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

기댓값의 선형성, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Jack is in his favourite casino and has $1000$ dollars. The casino has literally nothing but a single slot machine. Jack knows the history of this casino. Once upon a time, the future owner of the casino was walking and suddenly saw an array of $n$ integer <strong>choices</strong> $p_{1}, \dots, p_{n}$ each from $0$ to $100$. He picked an index $i$ ($1 \leq i \leq n$) uniformly at random and thought that it was a good idea to create a casino in which there is only one slot machine with jackpot probability of $\frac{p_i}{100}$. And he created it. </p>

<p>Jack knows the array of choices $p_{1}, \dots, p_{n}$ that suddenly appeared to the owner during the walk, but he does not know which $i$ the owner picked. However, the chosen index $i$ is fixed forever; the slot machine always uses the same $p_i$ as explained below.</p>

<p>On the slot machine, Jack can bet $x$ dollars, where $x$ is a <strong>non-negative</strong> integer, and pull the lever. Then:</p>

<ol>
<li>With probability $\frac{p_i}{100}$ it will be a jackpot, and the slot machine returns $2x$ dollars to him, so he gains $x$ dollars. </li>
<li>With probability $1 - \frac{p_i}{100}$ it will be a jinx, and the slot machine returns nothing to him, so he loses $x$ dollars.</li>
</ol>

<p>Even if Jack bets $0$ dollars, he will understand whether it was a jinx or a jackpot.</p>

<p>Also, the slot machine is not very durable, so Jack can play at most $k$ rounds on it.  </p>

<p>Find the maximum expected <em>profit</em> Jack can achieve by an optimal strategy. Here a profit is defined as the final amount of money Jack has minus his initial $1000$ dollars.</p>

<p>Of course, Jack can't make a bet that is more than his current balance.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 \leq n \leq 100\,000$; $1 \leq k \leq 30$) --- the number of choices and the limit on the number of rounds. The second line contains $n$ integers $p_{1}, \dots, p_{n}$ ($0 \le p_i \le 100$) --- the choices.</p>

### 출력

<p>Output a single real number --- the expected profit Jack can achieve by an optimal strategy. Your answer will be considered correct if its absolute or relative error is at most $10^{-4}$.</p>
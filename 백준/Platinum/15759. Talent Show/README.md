# [Platinum III] Talent Show - 15759

[문제 링크](https://www.acmicpc.net/problem/15759)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 552, 정답: 137, 맞힌 사람: 113, 정답 비율: 30.053%

### 분류

다이나믹 프로그래밍, 매개 변수 탐색, 배낭 문제

### 문제 설명

<p>Farmer John is bringing his $N$ cows, conveniently numbered $1 \ldots N$, to the county fair, to compete in the annual bovine talent show! His $i$th cow has a weight $w_i$ and talent level $t_i$, both integers.</p>

<p>Upon arrival, Farmer John is quite surprised by the new rules for this year&#39;s talent show:</p>

<p>(i) A group of cows of total weight at least $W$ must be entered into the show (in order to ensure strong teams of cows are competing, not just strong individuals), and</p>

<p>(ii) The group with the largest ratio of total talent to total weight shall win.</p>

<p>FJ observes that all of his cows together have weight at least $W$, so he should be able to enter a team satisfying (i). Help him determine the optimal ratio of talent to weight he can achieve for any such team.</p>

### 입력

<p>The first line of input contains $N$ ($1 \leq N \leq 250$) and $W$ ($1 \leq W \leq 1000$). The next $N$ lines each describe a cow using two integers $w_i$ ($1 \leq w_i \leq 10^6$) and $t_i$ ($1 \leq t_i \leq 10^3$).</p>

### 출력

<p>Please determine the largest possible ratio of total talent over total weight Farmer John can achieve using a group of cows of total weight at least $W$. If your answer is $A$, please print out the floor of $1000A$ in order to keep the output integer-valued (the floor operation discards any fractional part by rounding down to an integer, if the number in question is not already an integer).</p>

### 힌트

<p>In this example, the best talent-to-weight ratio overall would be to use just the single cow with talent 11 and weight 10, but since we need at least 15 units of weight, the optimal solution ends up being to use this cow plus the cow with talent 21 and weight 20. This gives a talent-to-weight ratio of (11+21)/(10+20) = 32/30 = 1.0666666..., which when multiplied by 1000 and floored gives 1066.</p>
# [Platinum V] Fair Robbery - 24859

[문제 링크](https://www.acmicpc.net/problem/24859)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 12, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

수학

### 문제 설명

<p>Robin Hood is well-known for stealing from the rich and giving the stolen to the poor. But this time he&#39;ll have to resort to one-sided robbery since there are only rich people in the city he&#39;s currently staying in. There are $n$ rich people in this city in total, their houses are located in a row along the main street. The person living in the $i$-th house has exactly $a_i$ money.</p>

<p>Robin Hood has several gang members, so he is going to prepare a plan for the robbery in advance. The plan is described by an integer $k$ and a real number $t$ which mean that houses with numbers $k, k + 1, \ldots, n$ will be robbed, and from each of them exactly the fraction of money equal to $t$ will be stolen. In other words, after the plan is executed, the people will have $$a^\mathrm{new} = [a_1, a_2, \ldots, a_{k-1}, (1-t)a_k, (1-t)a_{k+1}, \ldots, (1-t)a_n],$$ money left respectively. And the total amount of money stolen will be equal to $$b = t\cdot(a_k+a_{k+1}+\ldots+a_{n}).$$</p>

<p>Let&#39;s denote the <em>unfairness</em> after the robbery as the value $\max(a^\mathrm{new}) - \min(a^\mathrm{new})$: the difference between the maximal and the minimal amounts of money people will have after the robbery.</p>

<p>Robin Hood&#39;s gang hasn&#39;t arrived to the city yet, so he doesn&#39;t know how many houses they&#39;ll be able to rob successfully. Help him to find out for each $k$ from $1$ to $n$, inclusive, which $t$ between $0$ and $1$, inclusive, corresponds to the minimum possible unfairness after the robbery with the plan $(k, t)$. If for a fixed $k$ the minimum unfairness can be achieved with several different values of $t$, you should choose the plan that maximizes the total amount of money stolen.</p>

### 입력

<p>The first line of input contains a single integer $n$ --- the number of people living in the city ($1 \leq n \leq 2 \cdot 10^5$).</p>

<p>The second line of input contains $n$ space-separated integers $a_i$ --- the initial amount of money each townsperson has ($1 \leq a_i \leq 10^9$).</p>

### 출력

<p>Print $n$ real numbers $t_i$ ($0 \leq t_i \leq 1$). For each $k$ between $1$ and $n$ the pair $(k, t_k)$ should denote the plan with minimal possible unfairness after the robbery among all plans with such $k$, and among those --- the plan with maximal possible total amount of stolen money.</p>

<p>Your answer is accepted if the absolute or relative error of each printed number compared to the correct answer is not greater than $10^{-9}$.</p>
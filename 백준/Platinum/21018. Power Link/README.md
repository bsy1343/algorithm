# [Platinum II] Power Link - 21018

[문제 링크](https://www.acmicpc.net/problem/21018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

그래프 이론, 자료 구조, 세그먼트 트리, 누적 합, 제곱근 분할법

### 문제 설명

<p>There are $N$ power generators and $M$ appliances. The $i$<sup>th</sup> generator produces a power of $A_i$. The $j$<sup>th</sup> appliance is connected to a set of generator $S_j$ and gets its energy from them. Let $C_j$ be the number of generators in $S_j$.</p>

<p>The energy obtained by each appliance can be calculated with the following formula.</p>

<p>$$\displaystyle\sum_{1 \le a \le b \le C_j}{A_{S_{j}[a]} \cdot A_{S_{j}[b]}}$$</p>

<p>For example, let&rsquo;s say an appliance gets its energy from 4 generators and each of them produces $10$, $5$, $20$, and $5$ of power, respectively. The energy obtained by this appliance is $10\cdot 5+10\cdot 20+10\cdot 5+5\cdot 20+5\cdot 5+20\cdot 5 = 50 + 200 + 50 + 100 + 25 + 100 = 525$.</p>

<p>For the next $Q$ days, you will perform one of these two operations.</p>

<ol>
	<li>Change the power produced by the $i$<sup>th</sup> generator to $X$.</li>
	<li>Report the energy obtained by the $j$<sup>th</sup> appliance.</li>
</ol>

<p>For each operation of the second type, output the energy obtained by the $j$<sup>th</sup> appliance.</p>

### 입력

<p>Input begins with a line containing two integers: $N$ $M$ ($1 \le N, M \le 100~000$) representing the number of power generators and the number of appliances, respectively. The next line contains $N$ integers: $A_i$ ($1 \le A_i \le 10~000$) representing the power produced by the generators initially. The next $M$ lines each begins with an integer $C_j$ ($1 \le C_j \le N$) representing the number of generators that are connected to the $j$<sup>th</sup> appliance, followed by $C_j$ integers: $S_j[k]$ ($1 \le S_j[k] \le N$) representing the connected generators. For all $j$, the generators in $S_j$ are guaranteed to be unique. The sum of all $C_j$ is not more than $200~000$.</p>

<p>The next line contains an integer: $Q$ ($1 \le Q \le 100~000$) representing the number of days. The next $Q$ lines each contains one of the following input format representing the operation you should perform.</p>

<ul>
	<li>1 $i$ $X$ ($1 \le i \le N$; $1 \le X \le 10~000$)<br />
	Change the power produced by the $i$<sup>th</sup> generator to $X$.</li>
	<li>2 $j$ ($1 \le j \le M$)<br />
	Output the energy obtained by the $j$<sup>th</sup> appliance.</li>
</ul>

<p>There will be at least one operation of the second type.</p>

### 출력

<p>For each operation of the second type in the same order as input, output in a line an integer representing the energy obtained by the $j$<sup>th</sup> appliance.</p>
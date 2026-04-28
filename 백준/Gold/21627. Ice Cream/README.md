# [Gold III] Ice Cream - 21627

[문제 링크](https://www.acmicpc.net/problem/21627)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 146, 정답: 31, 맞힌 사람: 22, 정답 비율: 18.803%

### 분류

이분 탐색, 그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>Recently Makar has got $n$ ice cream cones as a gift, the $i$-th of them contains $a_i$ grams of the ice cream. He has decided to eat all of them today.</p>

<p>Before starting to eat, Makar takes the ice cream out of the freezer, so at the same moment the ice cream in each cone starts to melt. Each cone of ice cream is continuously melting at a rate of $v$ grams per second. Makar never eats the melted ice cream, and it doesn&#39;t bothers him in any way: you can assume that the ice cream melts from the bottom, and Makar eats it from the top. Makar eats ice cream continuously at a rate of $u$ grams per second. Makar can eat only from one cone at a time. But he can start with any cone and at any moment he can switch from one cone to another, switching takes no time.</p>

<p>Once started, Makar will continue eating until there&#39;s no ice cream left. But Makar knows that eating a lot of ice cream is unhealthy! Therefore, he wants to eat ice cream in a way that minimizes the total weight of the ice cream eaten.</p>

<p>Help Makar! Output the minimum total weight of ice cream that he can eat under the given conditions.</p>

### 입력

<p>The first line contains three integers $n$, $v$, $u$ --- the number of ice cream cones, the melting rate and the rate of eating ice cream ($1\le n\le 3\cdot10^5$, $1\le v,u \le 10^9$).</p>

<p>The second lines contains $n$ integers $a_i$ ($1\le a_i \le 10^9$) --- weight of ice cream in grams in each of the cones.</p>

### 출력

<p>Output a single real number --- the minimum weight of the ice cream that can be eaten by Makar.</p>

<p>Your answer will be considered correct if its absolute or relative error doesn&#39;t exceed $10^{-6}$.</p>

### 힌트

<p>In the first test case, Makar eats ice cream for 30 seconds. During this time he manages to eat 60 grams and 30 grams melt, after that there is no ice cream left.</p>

<p>In the second test case, the optimal order is to eat from the second cone during first $\frac{10}{3}$ seconds and then eat from the first cone during next $\frac{40}{3}$ seconds.&nbsp;</p>
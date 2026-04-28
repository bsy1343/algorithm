# [Gold IV] Air Conditioner - 24833

[문제 링크](https://www.acmicpc.net/problem/24833)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 67, 정답: 58, 맞힌 사람: 57, 정답 비율: 86.364%

### 분류

구현, 그리디 알고리즘, 시뮬레이션, 두 포인터

### 문제 설명

<p>Gildong owns a bulgogi restaurant. The restaurant has a lot of customers, so many of them like to make a reservation before visiting it.</p>

<p>Gildong tries so hard to satisfy the customers that he even memorized all customers&#39; preferred temperature ranges! Looking through the reservation list, he wants to satisfy all customers by controlling the temperature of the restaurant.</p>

<p>The restaurant has an air conditioner that has 3 states: <em>off</em>, <em>heating</em>, and <em>cooling</em>. When it&#39;s <em>off</em>, the restaurant&#39;s temperature remains the same. When it&#39;s <em>heating</em>, the temperature increases by 1 in one minute. Lastly, when it&#39;s <em>cooling</em>, the temperature decreases by 1 in one minute. Gildong can change the state as many times as he wants, at any integer minutes. The air conditioner is <em>off</em>&nbsp;initially.</p>

<p>Each customer is characterized by three values: $t_i$ &mdash; the time (in minutes) when the $i$-th customer visits the restaurant, $l_i$ &mdash; the lower bound of their preferred temperature range, and $h_i$ &mdash; the upper bound of their preferred temperature range.</p>

<p>A customer is satisfied if the temperature is within the preferred range at the instant they visit the restaurant. Formally, the $i$-th customer is satisfied if and only if the temperature is between $l_i$ and $h_i$ (inclusive) in the $t_i$-th minute.</p>

<p>Given the initial temperature, the list of reserved customers&#39; visit times and their preferred temperature ranges, you&#39;re going to help him find if it&#39;s possible to satisfy all customers.</p>

### 입력

<p>Each test contains one or more test cases. The first line contains the number of test cases $q$ ($1 \le q \le 500$). Description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \le n \le 100$, $-10^9 \le m \le 10^9$), where $n$ is the number of reserved customers and $m$ is the initial temperature of the restaurant.</p>

<p>Next, $n$ lines follow. The $i$-th line of them contains three integers $t_i$, $l_i$, and $h_i$ ($1 \le t_i \le 10^9$, $-10^9 \le l_i \le h_i \le 10^9$), where $t_i$ is the time when the $i$-th customer visits, $l_i$ is the lower bound of their preferred temperature range, and $h_i$ is the upper bound of their preferred temperature range. The preferred temperature ranges are <strong>inclusive</strong>.</p>

<p>The customers are given in non-decreasing order of their visit time, and the current time is $0$.</p>

### 출력

<p>For each test case, print &quot;YES&quot;&nbsp;if it is possible to satisfy all customers. Otherwise, print &quot;NO&quot;.</p>

<p>You can print each letter in any case (upper or lower).</p>

### 힌트

<p>In the first case, Gildong can control the air conditioner to satisfy all customers in the following way:</p>

<ul>
	<li>At $0$-th minute, change the state to <em>heating</em>&nbsp;(the temperature is 0).</li>
	<li>At $2$-nd minute, change the state to <em>off</em>&nbsp;(the temperature is 2).</li>
	<li>At $5$-th minute, change the state to <em>heating</em>&nbsp;(the temperature is 2, the $1$-st customer is satisfied).</li>
	<li>At $6$-th minute, change the state to <em>off</em>&nbsp;(the temperature is 3).</li>
	<li>At $7$-th minute, change the state to <em>cooling</em>&nbsp;(the temperature is 3, the $2$-nd customer is satisfied).</li>
	<li>At $10$-th minute, the temperature will be 0, which satisfies the last customer.</li>
</ul>

<p>In the third case, Gildong can change the state to <em>heating</em>&nbsp;at $0$-th minute and leave it be. Then all customers will be satisfied. Note that the $1$-st customer&#39;s visit time equals the $2$-nd customer&#39;s visit time.</p>

<p>In the second and the fourth case, Gildong has to make at least one customer unsatisfied.</p>
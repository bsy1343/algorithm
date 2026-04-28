# [Gold IV] Shopping Fever - 22011

[문제 링크](https://www.acmicpc.net/problem/22011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 40, 맞힌 사람: 39, 정답 비율: 56.522%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Heidi is in a big store. She would like to purchase $n$ items.</p>

<p>Today is her lucky day. The store runs a special sale: on every purchase, the customer receives one of the following two promotions:</p>

<ol>
	<li>When at least $3$ items are bought together, the cheapest one is free.</li>
	<li>When fewer than $3$ items are bought together, the customer gets a $q\%$ discount on the purchase.</li>
</ol>

<p>Heidi would like to buy all $n$ items on her shopping list, each exactly once. She can make an arbitrary number of purchases. For each purchase she&#39;ll make, the appropriate promotion will apply.</p>

<p>What is the minimum total price she has to pay to buy all $n$ items?</p>

### 입력

<p>The first line contains two single space-separated integers $n$ ($1 \le n \le 100\,000$) and $q$ ($0 \le q \le 100$) &mdash; the number of items Heidi wants to buy and the percentage discount she gains for purchases of fewer than three items.</p>

<p>The following line contains $n$ single space separated integers $p_1, \dots, p_n$ &mdash; the prices of the goods ($100 \le p_i \le 100\,000$, $1 \le i \le n$).</p>

<p>Additionally, it is guaranteed that each $p_i$ will always be divisible by $100$. Hence, the discounted price of each purchase will always be an integer.</p>

### 출력

<p>Output a single integer &mdash; the minimum total price Heidi has to pay in order to buy all $n$ items.</p>

### 힌트

<p>First, Heidi can buy the three items that cost $200$ in a single transaction for $400$ (she gets one of them for free). Then she can purchase the three items that cost $300$ for $600$ (again, one is free). Finally, she can purchase the last remaining item (with cost $100$) with a $10\%$ discount.</p>

<p>In the second example test, if Heidi buys all three items in a single transaction, she receives discount of $100$. However, if she buys each item individually, her discount will be $(1000 + 500 + 100) \cdot&nbsp;20 / 100 = 320$.</p>
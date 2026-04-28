# [Gold II] Controlled Inflation - 25097

[문제 링크](https://www.acmicpc.net/problem/25097)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 120, 정답: 86, 맞힌 사람: 71, 정답 비율: 75.532%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>The lines at the air pump at your gas station are getting too long! You want to optimize the process to help customers more quickly inflate their tires, sports balls, giant parade balloon animals, and other products.</p>

<p>The pump is automatic: you set the pressure to a specific number of pascals and plug the pump into the inflatable product, and it will inflate as needed to that exact pressure. There are only two buttons on the pump: up and down. They increase and decrease the target pressure, respectively, by exactly $1$ pascal.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25097.%E2%80%85Controlled%E2%80%85Inflation/6d566d3a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25097.%E2%80%85Controlled%E2%80%85Inflation/6d566d3a.png" data-original-src="https://upload.acmicpc.net/39657b8b-fdf4-48a2-b544-51a8ada8e4e2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>There is a line of $N$ customers, each of whom brings exactly $P$ products that they need to get inflated by the pump. You know the target pressure of each product. You can inflate the products from a customer in any order you want, but you cannot change the order of the customers. Specifically, you must inflate all products from the $i$⁠-th customer before inflating any from the $(i+1)$⁠-th customer. In between handling two products, if those two products have different target pressures, you need to use the buttons on the pump.</p>

<p>The pump is initially set to $0$ pascals, and it can be left at any number after all products of all customers have been inflated. If you order the products of each customer optimally, what is the minimum number of button presses you need?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case starts with a line containing two integers, $N$ and $P$: the number of customers and the number of products each customer brings, respectively. Then, $N$ lines follow. The $i$-th of these lines contains $P$ integers $X_{i,1},X_{i,2},\dots,X_{i,P}$, representing that the $j$-th product that the $i$-th customer brings has a target pressure of $X_{i,j}$ pascals.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of button presses needed to inflate all products according to their specified pressures.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;X_{i,j}&le;10^9$, for all $i,j$.</li>
</ul>

### 힌트

<p>In Sample Case #1, an optimal way to use the pump is:</p>

<ol>
	<li>press up $10$ times, setting the pump to $10$; pump the product (from customer 1) that needs $10$ pascals,</li>
	<li>press up $30$ times, setting the pump to $40$; pump the product (from customer 1) that needs $40$ pascals,</li>
	<li>press down $10$ times, setting the pump to $30$; pump the product (from customer 1) that needs $30$ pascals,</li>
	<li>press down $10$ times, setting the pump to $20$; pump the product (from customer 2) that needs $20$ pascals,</li>
	<li>press up $30$ times, setting the pump to $50$; pump the product (from customer 2) that needs $50$ pascals,</li>
	<li>press up $10$ times, setting the pump to $60$; pump the product (from customer 2) and the two products (from customer 3) that need $60$ pascals, and finally</li>
	<li>press down $10$ times, setting the pump to $50$; pump the product (from customer 3) that needs $50$ pascals.</li>
</ol>

<p>This is a total of $110$ button presses.</p>

<p>In Sample Case #2, notice that the answer can be larger than $232$.</p>
# [Silver II] Pancake Deque - 25096

[문제 링크](https://www.acmicpc.net/problem/25096)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 202, 정답: 130, 맞힌 사람: 110, 정답 비율: 65.476%

### 분류

자료 구조, 그리디 알고리즘, 덱

### 문제 설명

<p>Pancakes are normally served in stacks, but the Infinite House of Pancakes embraces change! The restaurant&#39;s new advertising hook is to serve the pancakes from a deque, or double-ended queue.</p>

<p>You are a server at the restaurant, and your job is to serve every pancake in the deque. Customers will arrive one at a time, and each one gets a single pancake. You must serve each customer either the leftmost or rightmost pancake in the deque; the choice is yours. When a pancake is served, it disappears from the deque, exposing the pancake that was next to it. Or, once there is only one pancake left, your only choice is to serve that one, and then your job is complete!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25096.%E2%80%85Pancake%E2%80%85Deque/38e10e51.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25096.%E2%80%85Pancake%E2%80%85Deque/38e10e51.png" data-original-src="https://upload.acmicpc.net/0831487b-cdd0-446b-8092-26a1fac2657d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 471px; height: 115px;" /></p>

<p>Each pancake has a deliciousness level. Because customers do not get to choose which pancakes they get, each customer only has to pay for their pancake if it is at least as delicious as <i>each</i> of the pancakes that <i>all</i> of the previous customers got. (The first customer always pays for their pancake, since in that case there are no previous customers.)</p>

<p>How many customers will pay for their pancake, if you serve the pancakes in an order that maximizes that number?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case is described with two lines. The first line of a test case contains a single integer $N$, the number of pancakes in the pancake deque. The second line of a test case contains $N$ integers $D_1,D_2,\dots,D_N$, where $D_i$ is the deliciousness level of the $i$-th pancake from the left in the deque.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of customers who pay for their pancakes, if you serve the pancakes in an order that maximizes that number.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;D_i&le;10^6$, for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are two possible orders in which you can serve the pancakes. If you serve the pancake with deliciousness level $5$ first, only that one is paid for. If you serve the pancake with deliciousness level $1$ first, both are paid for.</p>

<p>Sample Case #2 is the image shown in the problem statement. The following are the possible orders (by deliciousness level) in which the pancakes can be served. The underlined pancakes are the ones that customers pay for.</p>

<ul>
	<li>$\underline{1}$, $\underline{4}$, $2$, $3$</li>
	<li>$\underline{1}$, $\underline{4}$, $3$, $2$</li>
	<li>$\underline{1}$, $\underline{3}$, $\underline{4}$, $2$</li>
	<li>$\underline{1}$, $\underline{3}$, $2$, $\underline{4}$</li>
	<li>$\underline{3}$, $1$, $\underline{4}$, $2$</li>
	<li>$\underline{3}$, $1$, $2$, $\underline{4}$</li>
	<li>$\underline{3}$, $2$, $1$, $\underline{4}$</li>
	<li>$\underline{3}$, $2$, $\underline{4}$, $1$</li>
</ul>

<p>As you can see, there are some orders in which $3$ pancakes are paid for, and none in which all $4$ are.</p>

<p>In Sample Case #3, all pancakes are paid for regardless of the serving order.</p>

<p>In Sample Case #4, regardless of which pancake you serve first, the two in the middle will never be paid for. The best you can do is serve the pancake with deliciousness 7 before the pancake with deliciousness 1000000.</p>
# [Gold III] Ontongdaejeon - 25115

[문제 링크](https://www.acmicpc.net/problem/25115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 452, 정답: 88, 맞힌 사람: 75, 정답 비율: 21.739%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You have to buy $N$ items to prepare RUN Spring Contest.</p>

<p>In Daejeon, there is a famous local currency, <em>Ontongdaejeon</em>.</p>

<p>Using Ontongdaejeon, you can get a cashback point when purchasing an item -&nbsp;precisely <strong>10 percent of the cash</strong>&nbsp;you have paid as a <strong>cashback point</strong>.</p>

<p>If you have already got some cashback point&nbsp;from the previous purchases, you can use it instead of any non-negative integer amount of cash you want.</p>

<p>&nbsp;Specifically, you can use the cashback point with the following steps:</p>

<ol>
	<li>Let $c$ be the amount of cashback point you already have and $p$ be the price of an item you want to purchase.</li>
	<li>You should determine the amount of cashback point to use. Let this be $x$.</li>
	<li>$x$ should satisfy following conditions:
	<ul>
		<li>$x \le p$</li>
		<li>$x \le c$</li>
		<li>$x$ must be an non-negative integer.</li>
	</ul>
	</li>
	<li>Then, you can use $x$ cashback points and $p-x$ cash to buy the item.</li>
	<li>After buying the item, the cashback point you would have is $(c-x) + \dfrac{p-x}{10}$.</li>
</ol>

<p>Find the minimum amount of cash required to buy $N$ items in a given order.</p>

<p>Before buying the first item, you have no cashback points.</p>

### 입력

<p>The first line contains one integer $N$, where $N$ denotes the number of items.</p>

<p>The second line contains $N$ space-separated integers $P_1. P_2, ..., P_N$ where $P_i$ denotes the price of $i$-th item.</p>

### 출력

<p>Find the minimum amount of cash required to buy all&nbsp;$N$ items in a given order using Ontongdaejeon.</p>

### 제한

<ul>
	<li>$1 \le N \le 200\,000$</li>
	<li>$1 \le P_i \le 10^9$ $(1 \le i \le N)$</li>
</ul>
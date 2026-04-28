# [Platinum V] Expanding STACKS! - 31755

[문제 링크](https://www.acmicpc.net/problem/31755)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 40, 맞힌 사람: 39, 정답 비율: 60.938%

### 분류

그래프 이론, 이분 그래프

### 문제 설명

<p>Tired of always waiting in lines, you invented a revolutionary restaurant concept: &ldquo;STACKS! Where the last customer is served first&rdquo;.</p>

<p>The restaurant operates as follows:</p>

<ul>
	<li>There is a single line inside the restaurant.</li>
	<li>When a customer enters, they immediately join the back of the line.</li>
	<li>Whenever a stack of glazed pancakes (the only dish at STACKS!) is ready, it&rsquo;s served to the person at the back of the line, who then immediately devours the pancakes and leaves the restaurant.</li>
</ul>

<p>This business model has been incredibly successful, so much so that STACKS! is beginning to expand.</p>

<p>In fact, you just opened the very first STACKS!+, offering two types of pancakes: glazed and savory. The new restaurant works as follows:</p>

<ul>
	<li>There are two lines, one for each type of pancake. Each customer joins the back of the line corresponding to the type of pancake they want.</li>
	<li>Whenever a stack of glazed pancakes is ready, it is served to the customer at the back of the glazed pancake line, who immediately devours it and leaves the restaurant.</li>
	<li>Whenever a stack of savory pancakes is ready, it is served to the customer at the back of the savory pancake line, who instantly gobbles it and leaves the restaurant.</li>
</ul>

<p>As the boss, you want to ensure your employees follow the concept and maintain your vision. Given the order in which customers come in and out of the restaurant, you need to determine whether there is an assignment of customers to lines such that the STACKS!+ concept is followed.</p>

<p>You can assume that whenever a customer enters the restaurant, they immediately join the back of a line, and that they leave as soon as they are served. Also, each customer visits the restaurant exactly once.</p>

### 입력

<p>The first line contains an integer $N$ ($1 &le; N &le; 1000$) indicating the number of customers who visited STACKS!+. Each customer is identified by a distinct integer from $1$ to $N$.</p>

<p>The second line contains $2N$ signed integers $X_1, X_2, \dots , X_{2N}$ ($1 &le; |X_i | &le; N$ for $i = 1, 2, \dots , 2N$) indicating, in chronological order, the entrance and departure of the customers. The value $X_i = +c$ denotes the entrance of customer $c$ into the restaurant, while $X_i = -c$ represents their departure. It is guaranteed that each customer enters and leaves the restaurant exactly once, and that they do not leave before entering.</p>

### 출력

<p>Output a single line with a string of length $N$ if there is an assignment of customers to lines such that the STACKS!+ concept can be honored. In this case the $i$-th character of the string must be the uppercase letter &ldquo;<code>G</code>&rdquo; if customer $i$ is assigned to the glazed pancake line, and the uppercase letter &ldquo;<code>S</code>&rdquo; if they are assigned to the savory line. If there are multiple solutions, output any of them.</p>

<p>If the STACKS!+ concept cannot be honored with the given input, output the character &ldquo;<code>*</code>&rdquo; (asterisk) instead.</p>
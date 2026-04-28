# [Gold IV] Milkshakes (Large) - 12726

[문제 링크](https://www.acmicpc.net/problem/12726)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 33, 맞힌 사람: 30, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>You own a milkshake shop. There are N different flavors that you can prepare, and each flavor can be prepared &quot;malted&quot; or &quot;unmalted&quot;. So, you can make 2N different types of milkshakes.</p>

<p>Each of your customers has a set of milkshake types that they like, and they will be satisfied if you have at least one of those types prepared. At most one of the types a customer likes will be a &quot;malted&quot; flavor.</p>

<p>You want to make N batches of milkshakes, so that:</p>

<ul>
	<li>There is exactly one batch for each flavor of milkshake, and it is either malted or unmalted.</li>
	<li>For each customer, you make at least one milkshake type that they like.</li>
	<li>The minimum possible number of batches are malted.</li>
</ul>

<p>Find whether it is possible to satisfy all your customers given these constraints, and if it is, what milkshake types you should make.</p>

<p>If it is possible to satisfy all your customers, there will be only one answer which minimizes the number of malted batches.</p>

### 입력

<ul>
	<li>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</li>
</ul>

<p>For each test case, there will be:</p>

<ul>
	<li>One line containing the integer&nbsp;<strong>N</strong>, the number of milkshake flavors.</li>
	<li>One line containing the integer&nbsp;<strong>M</strong>, the number of customers.</li>
	<li><strong>M</strong>&nbsp;lines, one for each customer, each containing:
	<ul>
		<li>An integer&nbsp;<strong>T</strong>&nbsp;&gt;= 1, the number of milkshake types the customer likes, followed by</li>
		<li><strong>T</strong>&nbsp;pairs of integers &quot;<strong>X Y</strong>&quot;, one for each type the customer likes, where&nbsp;<strong>X</strong>&nbsp;is the milkshake flavor between&nbsp;<strong>1</strong>&nbsp;and&nbsp;<strong>N</strong>&nbsp;inclusive, and&nbsp;<strong>Y</strong>&nbsp;is either 0 to indicate unmalted, or 1 to indicated malted. Note that:
		<ul>
			<li>No pair will occur more than once for a single customer.</li>
			<li>Each customer will have at least one flavor that they like (T &gt;= 1).</li>
			<li>Each customer will like at most one malted flavor. (At most one pair for each customer has Y = 1).</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

<p>All of these numbers are separated by single spaces.</p>

<p>Limits</p>

<ul>
	<li>C = 5&nbsp;</li>
	<li>1 &lt;= N &lt;= 2000&nbsp;</li>
	<li>1 &lt;= M &lt;= 2000</li>
	<li>The sum of all the&nbsp;<strong>T</strong>&nbsp;values for the customers in a test case will not exceed 3000.</li>
</ul>

### 출력

<ul>
	<li><strong>C</strong>&nbsp;lines, one for each test case in the order they occur in the input file, each containing the string &quot;Case #<strong>X</strong>: &quot; where&nbsp;<strong>X</strong>&nbsp;is the number of the test case, starting from 1, followed by:
	<ul>
		<li>The string &quot;<strong>IMPOSSIBLE</strong>&quot;, if the customers&#39; preferences cannot be satisfied;&nbsp;<strong>OR</strong></li>
		<li><strong>N</strong>&nbsp;space-separated integers, one for each flavor from&nbsp;<strong>1</strong>&nbsp;to&nbsp;<strong>N</strong>, which are 0 if the corresponding flavor should be prepared unmalted, and 1 if it should be malted.</li>
	</ul>
	</li>
</ul>

### 힌트

<p>In the first case, you must make flavor #1 malted, to satisfy the first customer. Every other flavor can be unmalted. The second customer is satisfied by getting flavor #2 unmalted, and the third customer is satisfied by getting flavor #5 unmalted.</p>

<p>In the second case, there is only one flavor. One of your customers wants it malted and one wants it unmalted. You cannot satisfy them both.</p>
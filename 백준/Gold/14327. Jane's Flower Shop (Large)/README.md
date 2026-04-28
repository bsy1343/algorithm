# [Gold V] Jane's Flower Shop (Large) - 14327

[문제 링크](https://www.acmicpc.net/problem/14327)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 33, 맞힌 사람: 29, 정답 비율: 54.717%

### 분류

수학, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Jane plans to open a flower shop in the local flower market. The initial cost includes the booth license, furnishings and decorations, a truck to transport flowers from the greenhouse to the shop, and so on. Jane will have to recoup these costs by earning income. She has estimated how much net income she will earn in each of the following&nbsp;Mmonths.</p>

<p>Jane wants to predict how successful her flower shop will be by calculating the&nbsp;IRR (Internal Rate of Return)&nbsp;for the&nbsp;M-month period. Given a series of (time, cash flow) pairs (i, C<sub>i</sub>), the IRR is the compound interest rate that would make total cash exactly 0 at the end of the last month. The higher the IRR is, the more successful the business is. If the IRR is lower than the inflation rate, it would be wise not to start the business in the first place.</p>

<p>For example, suppose the initial cost is \$10,000 and the shop runs for 3 months, with net incomes of \$3,000, \$4,000, and \$5,000, respectively. Then the IRR&nbsp;r&nbsp;is given by:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Gold/14327.%E2%80%85Jane's%E2%80%85Flower%E2%80%85Shop%E2%80%85(Large)/9b40b1f5.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14326/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%20(7).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In this case, there is only one rate (~=8.8963%) that satisfies the equation.</p>

<p>Help Jane to calculate the IRR for her business. It is guaranteed that -1 &lt;&nbsp;r&nbsp;&lt; 1, and there is exactly one solution in each test case.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with a positive integer&nbsp;M: the number of months that the flower shop will be open. The next line contains&nbsp;M&nbsp;+ 1 non-negative integers&nbsp;C<sub>i</sub>&nbsp;(0 &le; i &le;&nbsp;M). Note that&nbsp;C<sub>0</sub>represents the initial cost, all the remaining&nbsp;C<sub>i</sub>s are profits, the shop will always either make a positive net profit or zero net profit in each month, and will never have negative profits.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>C<sub>0</sub>&nbsp;&gt; 0.</li>
	<li>0 &le;&nbsp;C<sub>i</sub>&nbsp;&le; 1,000,000,000.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a floating-point number: the IRR of Jane&#39;s business.&nbsp;<code>y</code>will be considered correct if it is within an absolute&nbsp; or relative error of 10<sup>-9</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>In sample case #1, the IRR is 0, Jane just paid back all the money and no interest.<br />
<br />
Sample case #2 and #3 would only appear in Large dataset.</p>
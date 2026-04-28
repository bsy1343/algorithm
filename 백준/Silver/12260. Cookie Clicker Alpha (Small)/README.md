# [Silver IV] Cookie Clicker Alpha (Small) - 12260

[문제 링크](https://www.acmicpc.net/problem/12260)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 69, 맞힌 사람: 65, 정답 비율: 85.526%

### 분류

수학, 구현, 그리디 알고리즘, 사칙연산, 시뮬레이션

### 문제 설명

<p>In this problem, you start with 0 cookies. You gain cookies at a rate of 2 cookies per second, by clicking on a giant cookie. Any time you have at least <strong>C</strong> cookies, you can buy a cookie farm. Every time you buy a cookie farm, it costs you <strong>C</strong> cookies and gives you an extra <strong>F</strong> cookies per second.</p>

<p>Once you have <strong>X</strong> cookies that you haven&#39;t spent on farms, you win! Figure out how long it will take you to win if you use the best possible strategy.</p>

<p>Example</p>

<p>Suppose <strong>C</strong>=500.0, <strong>F</strong>=4.0 and <strong>X</strong>=2000.0. Here&#39;s how the best possible strategy plays out:</p>

<ol>
	<li>You start with 0 cookies, but producing 2 cookies per second.</li>
	<li>After <strong>250</strong> seconds, you will have <strong>C</strong>=500 cookies and can buy a farm that produces <strong>F</strong>=4 cookies per second.</li>
	<li>After buying the farm, you have 0 cookies, and your total cookie production is 6 cookies per second.</li>
	<li>The next farm will cost 500 cookies, which you can buy after about <strong>83.3333333</strong> seconds.</li>
	<li>After buying your second farm, you have 0 cookies, and your total cookie production is 10 cookies per second.</li>
	<li>Another farm will cost 500 cookies, which you can buy after <strong>50</strong> seconds.</li>
	<li>After buying your third farm, you have 0 cookies, and your total cookie production is 14 cookies per second.</li>
	<li>Another farm would cost 500 cookies, but it actually makes sense not to buy it: instead you can just wait until you have <strong>X</strong>=2000 cookies, which takes about <strong>142.8571429</strong> seconds.</li>
</ol>

<p>Total time: 250 + 83.3333333 + 50 + 142.8571429 = 526.1904762 seconds.</p>

<p>Notice that you get cookies continuously: so 0.1 seconds after the game starts you&#39;ll have 0.2 cookies, and &pi; seconds after the game starts you&#39;ll have 2&pi; cookies.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line contains three space-separated real-valued numbers: <strong>C</strong>, <strong>F</strong> and <strong>X</strong>, whose meanings are described earlier in the problem statement.</p>

<p><strong>C</strong>, <strong>F</strong> and <strong>X</strong> will each consist of at least 1 digit followed by 1 decimal point followed by from 1 to 5 digits. There will be no leading zeroes.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>C</strong> &le; 500.</li>
	<li>1 &le; <strong>F</strong> &le; 4.</li>
	<li>1 &le; <strong>X</strong> &le; 2000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of seconds it takes before you can have <strong>X</strong> delicious cookies.</p>

<p>We recommend outputting y to 7 decimal places, but it is not required. y will be considered correct if it is close enough to the correct number: within an absolute or relative error of 10<sup>-6</sup>.&nbsp;</p>

### 힌트

<p>Note</p>

<p><em>Cookie Clicker</em> was created by Orteil. Orteil does not endorse and has no involvement with Google Code Jam.</p>
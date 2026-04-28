# [Gold IV] Not So Random (Large) - 12047

[문제 링크](https://www.acmicpc.net/problem/12047)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 71, 맞힌 사람: 39, 정답 비율: 43.820%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>There is a certain &quot;random number generator&quot; (RNG) which takes one nonnegative integer as input and generates another nonnegative integer as output. But you know that the RNG is really not very random at all! It uses a fixed number&nbsp;<strong>K</strong>, and always performs one of the following three operations:</p>

<ul>
	<li>with probability&nbsp;<strong>A</strong>/100: return the bitwise AND of the input and&nbsp;<strong>K</strong></li>
	<li>with probability&nbsp;<strong>B</strong>/100: return the bitwise OR of the input and&nbsp;<strong>K</strong></li>
	<li>with probability&nbsp;<strong>C</strong>/100: return the bitwise XOR of the input and&nbsp;<strong>K</strong></li>
</ul>

<p>(You may assume that the RNG&nbsp;<em>is</em>&nbsp;truly random in the way that it chooses the operation each time, based on the values of&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>C</strong>.)</p>

<p>You have&nbsp;<strong>N</strong>&nbsp;copies of this RNG, and you have arranged them in series such that output from one machine will be the input for the next machine in the series. If you provide&nbsp;<strong>X</strong>&nbsp;as an input to the first machine, what will be the expected value of the output of the final machine in the series?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of one line with six integers&nbsp;<strong>N</strong>,&nbsp;<strong>X</strong>,&nbsp;<strong>K</strong>,&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>C</strong>. Respectively, these denote the number of machines, the initial input, the fixed number with which all the bitwise operations will be performed (on every machine), and 100 times the probabilities of the bitwise AND, OR, and XOR operations.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>0 &le;&nbsp;<strong>A</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>B</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100.</li>
	<li><strong>A+B+C</strong>&nbsp;= 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>0 &le;&nbsp;<strong>X</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le;&nbsp;<strong>K</strong>&nbsp;&le; 10<sup>9</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the expected value of the final output. y will be considered correct if it is within an absolute or relative error of 10<sup>-9</sup>&nbsp;of the correct answer. See the&nbsp;<a href="https://code.google.com/codejam/faq.html#floating_point" style="color: rgb(85, 26, 139);" target="_blank">FAQ</a>&nbsp;for an explanation of what that means, and what formats of real numbers we accept.</p>

### 힌트

<p>In sample test case #1, the final output will be 5 if AND or OR happens and 0 if XOR happens. So the probability of getting 5 is (0.1 + 0.5) and the probability of getting 0 is 0.4. So the expected final output is 5 * 0.6 + 0 * 0.4 = 3.</p>

<p>In sample test case #2, the final output will be 5 with probability 0.72, and 0 otherwise.</p>
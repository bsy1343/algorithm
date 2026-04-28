# [Gold V] Math Encoder - 23992

[문제 링크](https://www.acmicpc.net/problem/23992)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 342, 정답: 186, 맞힌 사람: 159, 정답 비율: 55.789%

### 분류

수학, 조합론

### 문제 설명

<p>Professor Math is working on a secret project and is facing a challenge where a list of numbers need to be encoded into a single number in the most efficient manner. After much research, Professor Math finds a 3 step process that can best encode the numbers:</p>

<ol>
	<li>The first step is to find all possible non-empty subsets of the list of numbers and then, for each subset, find the difference between the largest and smallest numbers (that is, the largest minus the smallest) in that subset. Note that if there is only one number in a subset, it is both the largest and the smallest number in that subset. The complete set itself is also considered a subset.</li>
	<li>Then add up all the differences to get the final encoded number.</li>
	<li>As the number may be large, output the number modulo 10<sup>9</sup>&nbsp;+ 7 (1000000007).</li>
</ol>

<p>The professor has shared an example and its explanation below. Given a list of numbers, can you help the professor build an efficient function to compute the final encoded number?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>. This is followed by T test cases where each test case is defined by 2 lines:</p>

<ol>
	<li>The first line gives a positive number&nbsp;<b>N</b>: the number of numbers in the list and</li>
	<li>The second line contains a list of&nbsp;<b>N</b>&nbsp;positive integers&nbsp;<b>K<sub>i</sub></b>, sorted in non-decreasing order.</li>
</ol>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the final encoded number.</p>

<p>Since the output can be a really big number, we only ask you to output the remainder of dividing the result by the prime 10<sup>9</sup>&nbsp;+ 7 (1000000007).</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 25.</li>
	<li>1 &le;&nbsp;<b>K<sub>i</sub></b>&nbsp;&le; 10000, for all i.</li>
	<li><b>K<sub>i</sub></b>&nbsp;&le;&nbsp;<b>K<sub>i+1</sub></b>, for all i &lt;&nbsp;<b>N</b>&nbsp;- 1.</li>
</ul>

### 힌트

<ol>
	<li>Find all subsets and get the difference between largest &amp; smallest numbers:
	<ul>
		<li>[3], largest-smallest = 3 - 3 = 0.</li>
		<li>[6], largest-smallest = 6 - 6 = 0.</li>
		<li>[7], largest-smallest = 7 - 7 = 0.</li>
		<li>[9], largest-smallest = 9 - 9 = 0.</li>
		<li>[3, 6], largest-smallest = 6 - 3 = 3.</li>
		<li>[3, 7], largest-smallest = 7 - 3 = 4.</li>
		<li>[3, 9], largest-smallest = 9 - 3 = 6.</li>
		<li>[6, 7], largest-smallest = 7 - 6 = 1.</li>
		<li>[6, 9], largest-smallest = 9 - 6 = 3.</li>
		<li>[7, 9], largest-smallest = 9 - 7 = 2.</li>
		<li>[3, 6, 7], largest-smallest = 7 - 3 = 4.</li>
		<li>[3, 6, 9], largest-smallest = 9 - 3 = 6.</li>
		<li>[3, 7, 9], largest-smallest = 9 - 3 = 6.</li>
		<li>[6, 7, 9], largest-smallest = 9 - 6 = 3.</li>
		<li>[3, 6, 7, 9], largest-smallest = 9 - 3 = 6.</li>
	</ul>
	</li>
	<li>Find the sum of the differences calculated in the previous step: 3+4+6+1+3+2+4+6+6+3+6 = 44.</li>
	<li>Find the answer modulo 10<sup>9</sup>&nbsp;+ 7 (1000000007): 44 % 1000000007 = 44</li>
</ol>
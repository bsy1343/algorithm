# [Platinum IV] Candies - 23908

[문제 링크](https://www.acmicpc.net/problem/23908)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 20, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Carl has an array of&nbsp;<b>N</b>&nbsp;candies. The i-th element of the array (indexed starting from 1) is&nbsp;<b>A<sub>i</sub></b>&nbsp;representing&nbsp;<i>sweetness value</i>&nbsp;of the i-th candy. He would like to perform a series of&nbsp;<b>Q</b>&nbsp;operations. There are two types of operation:</p>

<ul>
	<li>Update the sweetness value of a candy in the array.</li>
	<li>Query the&nbsp;<i>sweetness score</i>&nbsp;of a subarray.</li>
</ul>

<p>The sweetness score of a subarray from index l to r is:&nbsp;<b>A<sub>l</sub></b>&nbsp;&times; 1 -&nbsp;<b>A<sub>l+1</sub></b>&nbsp;&times; 2 +&nbsp;<b>A<sub>l+2</sub></b>&nbsp;&times; 3 -&nbsp;<b>A<sub>l+3</sub></b>&nbsp;&times; 4 +&nbsp;<b>A<sub>l+4</sub></b>&nbsp;&times; 5 ...</p>

<p>More formally, the sweetness score is the sum of (-1)<sup>i-l</sup><b>A<sub>i</sub></b>&nbsp;&times; (i - l + 1), for all i from l to r inclusive.</p>

<p>For example, the sweetness score of:</p>

<ul>
	<li>[3, 1, 6] is 3 &times; 1 - 1 &times; 2 + 6 &times; 3 = 19</li>
	<li>[40, 30, 20, 10] is 40 &times; 1 - 30 &times; 2 + 20 &times; 3 - 10 &times; 4 = 0</li>
	<li>[2, 100] is 2 &times; 1 - 100 &times; 2 = -198</li>
</ul>

<p>Carl is interested in finding out the total sum of sweetness scores of all queries. If there is no query operation, the sum is considered to be 0. Can you help Carl find the sum?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing&nbsp;<b>N</b>&nbsp;and&nbsp;<b>Q</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers describing the array. The i-th integer is&nbsp;<b>A<sub>i</sub></b>. The j-th of the following&nbsp;<b>Q</b>&nbsp;lines describe the j-th operation. Each line begins with a single character describing the type of operation (<code>U</code>&nbsp;for update,&nbsp;<code>Q</code>&nbsp;for query).</p>

<ul>
	<li>For an update operation, two integers&nbsp;<b>X<sub>j</sub></b>&nbsp;and&nbsp;<b>V<sub>j</sub></b>&nbsp;follow, indicating that the&nbsp;<b>X<sub>j</sub></b>-th element of the array is changed to&nbsp;<b>V<sub>j</sub></b>.</li>
	<li>For a query operation, two integers&nbsp;<b>L<sub>j</sub></b>&nbsp;and&nbsp;<b>R<sub>j</sub></b>&nbsp;follow, querying the sweetness score of the subarray from the&nbsp;<b>L<sub>j</sub></b>-th element to the&nbsp;<b>R<sub>j</sub></b>-th element (inclusive).</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the total sum of sweetness scores of all the queries.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 100, for all i.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 2 &times; 10<sup>5</sup>&nbsp;and 1 &le;&nbsp;<b>Q</b>&nbsp;&le; 10<sup>5</sup>&nbsp;for at most 6 test cases.</li>
	<li>For the remaining cases, 1 &le;&nbsp;<b>N</b>&nbsp;&le; 300 and 1 &le;&nbsp;<b>Q</b>&nbsp;&le; 300.</li>
	<li>If the j-th operation is an update operation, 1 &le;&nbsp;<b>X<sub>j</sub></b>&nbsp;&le;&nbsp;<b>N</b>&nbsp;and 1 &le;&nbsp;<b>V<sub>j</sub></b>&nbsp;&le; 100.</li>
	<li>If the j-th operation is a query operation, 1 &le;&nbsp;<b>L<sub>j</sub></b>&nbsp;&le;&nbsp;<b>R<sub>j</sub></b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In sample case #1:</p>

<ul>
	<li>The first query asks for the sweetness score of [3, 9, 8] which is 3 &times; 1 - 9 &times; 2 + 8 &times; 3 = 9.</li>
	<li>The second query asks for the sweetness score of [2] which is 2 &times; 1 = 2.</li>
	<li>The third query asks for the sweetness score of [1, 10] which is 1 &times; 1 - 10 &times; 2 = -19.</li>
</ul>

<p>Thus, the final output should be 9 + 2 - 19 = -8.</p>

<p>In sample case #2:</p>

<ul>
	<li>The first and only query asks for the sweetness score of [7, 5] which is 7 &times; 1 - 5 &times; 2 = -3.</li>
</ul>

<p>Thus, the final output should be -3.</p>
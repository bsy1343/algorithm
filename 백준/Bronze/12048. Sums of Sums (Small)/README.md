# [Bronze I] Sums of Sums (Small) - 12048

[문제 링크](https://www.acmicpc.net/problem/12048)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 231, 정답: 140, 맞힌 사람: 89, 정답 비율: 53.614%

### 분류

구현

### 문제 설명

<p>Alice presented her friend Bob with an array of&nbsp;<strong>N</strong>&nbsp;positive integers, indexed from 1 to&nbsp;<strong>N</strong>. She challenged Bob with many queries of the form &quot;what is the sum of the numbers between these two indexes?&quot; But Bob was able to solve the problem too easily.</p>

<p>Alice took her array and found all&nbsp;<strong>N</strong>*(<strong>N</strong>+1)/2 non-empty subarrays of it. She found the sum of each subarray, and then sorted those values (in nondecreasing order) to create a new array, indexed from 1 to&nbsp;<strong>N</strong>*(<strong>N</strong>+1)/2. For example, for an initial array [2, 3, 2], Alice would generate the subarrays [2], [3], [2], [2, 3], [3, 2], and [2, 3, 2] (note that [2, 2], for example, is&nbsp;<strong>NOT</strong>&nbsp;a subarray). Then she&#39;d take the sums -- 2, 3, 2, 5, 5, 7 -- and sort them to get a new array of [2, 2, 3, 5, 5, 7].</p>

<p>Alice has given the initial array to Bob, along with&nbsp;<strong>Q</strong>&nbsp;queries of the form &quot;what is the sum of the numbers from index&nbsp;<strong>L<sub>i</sub></strong>&nbsp;to&nbsp;<strong>R<sub>i</sub></strong>, inclusive, in the new array?&quot; Now Bob&#39;s in trouble! Can you help him out?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with one line with two space-separated integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>Q</strong>, denoting the number of elements in the initial array and the number of Alice&#39;s queries. Then, there is one line with&nbsp;<strong>N</strong>&nbsp;space-separated integers, denoting the elements of Alice&#39;s initial array. Finally, there are&nbsp;<strong>Q</strong>&nbsp;more lines with two space-separated integers each:&nbsp;<strong>L<sub>i</sub></strong>&nbsp;and&nbsp;<strong>R<sub>i</sub></strong>, the inclusive index bounds for the i-th query.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 20.</li>
	<li>1 &le; each element of the initial array &le; 100.</li>
	<li>1 &le;&nbsp;<strong>L<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>R<sub>i</sub></strong>&nbsp;&le; N*(N+1)/2.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>3</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line with&nbsp;<code>Case #x:</code>, where&nbsp;<strong>x</strong>&nbsp;is the test case number (starting from 1). Then output&nbsp;<strong>Q</strong>&nbsp;more lines, each with one integer, representing the answers to the queries (in the order they were asked).</p>

### 힌트

<p>In sample case #1, Alice&#39;s new array would be: [1, 2, 3, 3, 4, 5, 5, 6, 7, 9, 9, 10, 12, 14, 15].</p>
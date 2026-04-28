# [Bronze II] Store Credit (Large) - 12604

[문제 링크](https://www.acmicpc.net/problem/12604)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 306, 정답: 236, 맞힌 사람: 202, 정답 비율: 78.295%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>You receive a credit&nbsp;<code>C</code>&nbsp;at a local store and would like to buy two items. You first walk through the store and create a list&nbsp;<code>L</code>&nbsp;of all available items. From this list you would like to buy two items that add up to the entire value of the credit. The solution you provide will consist of the two integers indicating the positions of the items in your list (smaller number first).</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the value&nbsp;<strong>C</strong>, the amount of credit you have at the store.</li>
	<li>One line containing the value&nbsp;<strong>I</strong>, the number of items in the store.</li>
	<li>One line containing a space separated list of&nbsp;<strong>I</strong>&nbsp;integers. Each integer&nbsp;<strong>P</strong>&nbsp;indicates the price of an item in the store.</li>
	<li>Each test case will have exactly one solution.</li>
</ul>

<p>Limits</p>

<ul>
	<li>5 &le;&nbsp;<strong>C</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 1000</li>
	<li><strong>N</strong>&nbsp;= 50</li>
	<li>3 &le;&nbsp;<strong>I</strong>&nbsp;&le; 2000</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed by the indices of the two items whose price adds up to the store credit. The lower index should be output first.</p>
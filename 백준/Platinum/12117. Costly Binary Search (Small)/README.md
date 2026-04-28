# [Platinum IV] Costly Binary Search (Small) - 12117

[문제 링크](https://www.acmicpc.net/problem/12117)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 87, 맞힌 사람: 43, 정답 비율: 53.086%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You were asked to implement arguably the most important algorithm of all: binary search. More precisely, you have a sorted array of objects, and a new object that you want to insert into the array. In order to find the insertion position, you can compare your object with the objects in the array. Each comparison can return either &quot;greater&quot;, meaning that your object should be inserted to the right of the compared object, or &quot;less&quot;, meaning that your object should be inserted to the left of the compared object. For simplicity, comparisons never return &quot;equal&quot; in this problem. It is guaranteed that when your object is greater than some object in the array, it is also greater than all objects to the left of that object; similarly, when your object is less than some object of the array, it is also less than all objects to the right of that object. If the array has&nbsp;<strong>n</strong>&nbsp;elements, there are&nbsp;<strong>n</strong>+1 possible outcomes for your algorithm.</p>

<p>In this problem, not all comparisons have the same cost. More precisely, comparing your object with&nbsp;<strong>i</strong>-th object in the array costs&nbsp;<strong>a</strong><sub><strong>i</strong></sub>, an integer between 1 and 9, inclusive.</p>

<p>What will be the total cost, in the worst case, of your binary search? Assume you follow an optimal strategy and try to minimize the total cost in the worst case.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each of those lines contains one sequence of digits describing the comparison costs&nbsp;<strong>a</strong><sub><strong>i</strong></sub>&nbsp;for one testcase. The size of the array&nbsp;<strong>n</strong>&nbsp;is given by the length of this sequence.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>All digits are between 1 and 9, inclusive.</li>
	<li>There are no spaces between digits on one line.</li>
	<li>1 &le;&nbsp;<strong>n</strong>&nbsp;&le; 10<sup>4</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>:&nbsp;<strong>y</strong>&quot;, where&nbsp;<strong>x</strong>&nbsp;is the test case number (starting from 1) and&nbsp;<strong>y</strong>&nbsp;is the total binary search cost in the worst case.</p>
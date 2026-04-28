# [Gold I] Expensive Dinner (Large) - 12488

[문제 링크](https://www.acmicpc.net/problem/12488)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 18, 정답 비율: 85.714%

### 분류

그리디 알고리즘, 수학, 정수론

### 문제 설명

<p>Your friends are all going to a restaurant for dinner tonight. They&#39;re all very good at math, but they&#39;re all very strange: your&nbsp;<strong>a</strong><sup>th</sup>&nbsp;friend (starting from 1) will be&nbsp;<em>unhappy</em>&nbsp;unless the total cost of the meal is a positive integer, and is divisible by&nbsp;<strong>a</strong>.</p>

<p>Your friends enter the restaurant one at a time. As soon as someone enters the restaurant, if that person is unhappy then the group will&nbsp;<em>call</em>&nbsp;a waiter immediately.</p>

<p>As long as there is at least one unhappy person in the restaurant, one of those unhappy people will buy the lowest-cost item that will make him or her happy. This will continue until nobody in the restaurant is unhappy, and then the waiter will leave. Fortunately, the restaurant sells food at every integer price. See the explanation of the first test case for an example.</p>

<p>Your friends could choose to enter the restaurant in any order. After the waiter has been called, if there is more than one unhappy person in the restaurant, any one of those unhappy people could choose to buy something first. The way in which all of those choices are made could have an effect on how many times the group calls a waiter.</p>

<p>As the owner of the restaurant, you employ some very tired waiters. You want to calculate the&nbsp;<strong>spread</strong>&nbsp;of your friends: the difference between the maximum number of times they might call a waiter and the minimum number of times they might call a waiter.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, each on its own line. Each test case will contain one integer&nbsp;<strong>N</strong>, the number of friends you have.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>12</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the spread for that test case.</p>

### 힌트

<p>In Case #2, suppose your friends arrive in the order [1, 2, 3]. Then #1 arrives; is unhappy; calls a waiter; and buys something costing 1. Now nobody is unhappy. #2 arrives next; is unhappy; calls a waiter; and buys something costing 1 (for a total of 2). Now nobody is unhappy. #3 arrives next; is unhappy; calls a waiter; and buys something costing 1 (for a total of 3). Now #2 is unhappy, and buys something costing 1 (for a total of 4). Now #3 is unhappy, and buys something costing 2 (for a total of 6). Finally nobody is unhappy, and a waiter was called three times.</p>

<p>Suppose instead that your friends arrived in the order [3, 1, 2]. Then #3 arrives; is unhappy; calls a waiter; and buys something costing 3. Now nobody is unhappy. #1 arrives next; nobody is unhappy. #2 arrives next; is unhappy; calls a waiter; and buys something costing 1 (for a total of 4). Now #3 is unhappy, and buys something costing 2 (for a total of 6). Now nobody is unhappy, and a waiter was called two times. The spread is 1.</p>
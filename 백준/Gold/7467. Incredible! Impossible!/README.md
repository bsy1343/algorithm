# [Gold III] Incredible! Impossible! - 7467

[문제 링크](https://www.acmicpc.net/problem/7467)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>&ldquo;Give me the sums of each column and of each row of the rectangular table n &times; m&rdquo;, &mdash; Alex said, &mdash; &ldquo;and I will tell you whether such a table exists, and if exists for a small fee I can create an example of such table&rdquo;. &ldquo;Incredible! Impossible!&rdquo;, &mdash; say all his classmates, &mdash; &ldquo;So many numbers! You must be a true genius!&rdquo;.</p>

<p>But Basil does not like that Alex becomes the most known person at the school.</p>

<ul>
	<li>&ldquo;I say! I am Basil the greatest! Given a rectangular table n &times; m and the sums of rows and columns I will tell you a number of possible tables with non-negative integers satisfying these conditions&rdquo;.</li>
	<li>&ldquo;You boast! I bet five dollars you can&rsquo;t do it even for n &times; 3&rdquo;, &mdash; Alex says.</li>
	<li>&ldquo;I bet five that I can!&rdquo;, &mdash; says Basil.</li>
</ul>

<p>Tomorrow is the contest. Alex will create some tables with size n &times; 3, and tell Basil the sums and the dimensions. All boys and girls do the stakes who will be the winner!</p>

<p>You are the friend of Alex. He wants to create some hard data sets for Basil, and he needs to have a method to calculate the answer. Because Alex can&rsquo;t solve such kind of tasks, he asked you to write a program that will do it for him.</p>

<p>Alex needs only last seventeen digits to check the answers. So you must calculate the number of possible tables taken modulo 10<sup>17</sup>.</p>

### 입력

<p>The first line contains four numbers: n, c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, where n is the number of rows, c<sub>i</sub> are the sums of columns. n numbers follow, each is the sum of the corresponding row. n and all sums are non-negative integers. They are not greater than 125.</p>

### 출력

<p>On the first line output the number of possible tables taken modulo 10<sup>17</sup>.</p>
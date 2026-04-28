# [Gold IV] First Last Sorting - 25876

[문제 링크](https://www.acmicpc.net/problem/25876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 21, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Arup has just created a data structure that makes the two following list transformations in constant O(1) time:</p>

<ol style="list-style-type: lower-alpha;">
	<li>Take any element in the list and move it to the front.</li>
	<li>Take any element in the list and move it to the back.</li>
</ol>

<p>You&#39;ve realized that sorting speed can be improved using these transformations. For example, consider the input list:</p>

<ul>
	<li>8, 3, 6, 7, 4, 1, 5, 2</li>
</ul>

<p>We can do the following sequence of transformations to sort this list:</p>

<ul>
	<li>8, 3, 7, 4, 1, 5, 2, 6 (move 6 to end)</li>
	<li>8, 3, 4, 1, 5, 2, 6, 7 (move 7 to end)</li>
	<li>2, 8, 3, 4, 1, 5, 6, 7 (move 2 to front)</li>
	<li>1, 2, 8, 3, 4, 5, 6, 7 (move 1 to front)</li>
	<li>1, 2, 3, 4, 5, 6, 7, 8 (move 8 to end)</li>
</ul>

<p>You are now curious. Given an input array of distinct values, what is the fewest number of these first/last operations necessary to sort the array?</p>

<p>Given an initial permutation of the integers 1, 2, ..., n, determine the fewest number of first/last operations necessary to get the list of values sorted in increasing order.</p>

### 입력

<p>The first line of input will contain a single positive integer, n (n &le; 10<sup>5</sup>), representing the number of values to be sorted. The next n lines contain one integer each. All of these integers will be distinct values in between 1 and n (inclusive), representing the original order of the data to sort for the input case.</p>

### 출력

<p>On a line by itself, output the fewest number of first/last operations necessary to sort the input list.</p>
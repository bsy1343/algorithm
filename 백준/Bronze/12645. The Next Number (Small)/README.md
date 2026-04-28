# [Bronze I] The Next Number (Small) - 12645

[문제 링크](https://www.acmicpc.net/problem/12645)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 326, 정답: 125, 맞힌 사람: 102, 정답 비율: 38.202%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>You are writing out a list of numbers. Your list contains all numbers with exactly&nbsp;<strong>D<sub>i</sub></strong>&nbsp;digits in its decimal representation which are equal to&nbsp;<strong>i</strong>, for each&nbsp;<strong>i</strong>&nbsp;between 1 and 9, inclusive. You are writing them out in ascending order.</p>

<p>For example, you might be writing every number with two &#39;1&#39;s and one &#39;5&#39;. Your list would begin 115, 151, 511, 1015, 1051.</p>

<p>Given&nbsp;<strong>N</strong>, the last number you wrote, compute what the next number in the list will be.</p>

### 입력

<p>The first line of input contains an integer&nbsp;<strong>T</strong>, the number of test cases in the input.&nbsp;<strong>T</strong>&nbsp;lines follow, one for each test case, each containing a single integer&nbsp;<strong>N</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; T &le; 50</li>
	<li>1 &le; N &le; 10<sup>6</sup></li>
</ul>

### 출력

<p>For each test case, output&nbsp;</p>

<pre>
Case #<strong>X</strong>: <strong>K</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>K</strong>&nbsp;is the next integer in the list.</p>
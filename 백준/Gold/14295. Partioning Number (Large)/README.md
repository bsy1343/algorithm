# [Gold II] Partioning Number (Large) - 14295

[문제 링크](https://www.acmicpc.net/problem/14295)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 24, 맞힌 사람: 19, 정답 비율: 63.333%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Shekhu has N balls. She wants to distribute them among one or more buckets in a way that satisfies all of these constraints:</p>

<ol>
	<li>The numbers of balls in the buckets must be in non-decreasing order when read from left to right.</li>
	<li>The leftmost bucket must be non-empty and the number of balls in the leftmost bucket must be divisible by D.</li>
	<li>The difference (in number of balls) between <em>any</em> two buckets (not just any two adjacent buckets) must be less than or equal to 2.</li>
</ol>

<p>How many different ways are there for Shekhu to do this? Two ways are considered different if the lists of numbers of balls in buckets, reading left to right, are different.</p>

### 입력

<p>The first line of the input gives the number of test cases, T.</p>

<p>T test cases follow. Each test case consists of one line with two integers N and D, as described above.</p>

<p>Limits</p>

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; D &le; 100.</li>
	<li>1 &le; N &le; 10<sup>5</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the answer, as described above.</p>

### 힌트

<p>In sample case #1, the possible distributions are:</p>

<ul>
	<li>1 1 1 1 1 1 1</li>
	<li>1 1 1 1 1 2</li>
	<li>1 1 1 1 3</li>
	<li>1 1 1 2 2</li>
	<li>1 2 2 2</li>
	<li>1 1 2 3</li>
	<li>1 3 3</li>
	<li>2 2 3</li>
	<li>3 4</li>
	<li>7</li>
</ul>

<p>Note that 1 2 4 is not a valid distribution, since the difference between 1 and 4 is more than 2.</p>

<p>In sample case #2, the possible distributions are:</p>

<ul>
	<li>2 2 3</li>
</ul>

<p>3 4 is not possible, since the first term is not divisible by 2.</p>

<p>In sample case #3, no possible arrangement exists.</p>
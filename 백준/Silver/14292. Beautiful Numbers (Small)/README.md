# [Silver IV] Beautiful Numbers (Small) - 14292

[문제 링크](https://www.acmicpc.net/problem/14292)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 85, 맞힌 사람: 72, 정답 비율: 72.000%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>We consider a number to be <em>beautiful</em> if it consists only of the digit 1 repeated one or more times. Not all numbers are beautiful, but we can make any base 10 positive integer beautiful by writing it in another base.</p>

<p>Given an integer N, can you find a base <em>B</em> (with <em>B</em> &gt; 1) to write it in such that all of its digits become 1? If there are multiple bases that satisfy this property, choose the one that maximizes the number of 1 digits.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of one line with an integer N.</p>

<p>Limits</p>

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>3 &le; N &le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the base described in the problem statement.</p>

### 힌트

<p>In case #1, the optimal solution is to write 3 as 11 in base 2.</p>

<p>In case #2, the optimal solution is to write 13 as 111 in base 3. Note that we could also write 13 as 11 in base 12, but neither of those representations has as many 1s.</p>
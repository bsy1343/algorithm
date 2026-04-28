# [Gold IV] Numbers (Small) - 12727

[문제 링크](https://www.acmicpc.net/problem/12727)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 773, 정답: 336, 맞힌 사람: 293, 정답 비율: 51.585%

### 분류

수학, 임의 정밀도 / 큰 수 연산, 런타임 전의 전처리

### 문제 설명

<p>In this problem, you have to find the last three digits before the decimal point for the number (3 + &radic;5)<sup><strong>n</strong></sup>.</p>

<p>For example, when&nbsp;<strong>n</strong>&nbsp;= 5, (3 + &radic;5)<sup>5</sup>&nbsp;= 3935.73982... The answer is 935.</p>

<p>For&nbsp;<strong>n</strong>&nbsp;= 2, (3 + &radic;5)<sup>2</sup>&nbsp;= 27.4164079... The answer is 027.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, each on a separate line. Each test case contains one positive integer&nbsp;<strong>n</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &lt;=&nbsp;<strong>T</strong>&nbsp;&lt;= 100</li>
	<li>2 &lt;=&nbsp;<strong>n</strong>&nbsp;&lt;= 30</li>
</ul>

### 출력

<p>For each input case, you should output:</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the last three integer digits of the number (3 + &radic;5)<sup><strong>n</strong></sup>. In case that number has fewer than three integer digits, add leading zeros so that your output contains exactly three digits.</p>
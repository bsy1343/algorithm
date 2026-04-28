# [Gold III] Table - 9716

[문제 링크](https://www.acmicpc.net/problem/9716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 39, 맞힌 사람: 23, 정답 비율: 53.488%

### 분류

자료 구조, 정렬, 애드 혹, 집합과 맵

### 문제 설명

<p>Let us consider an array of size n &times; m filled with pair wise different integers. The following operations are allowed on the array:</p>

<ol>
	<li>Interchanging two rows,</li>
	<li>Interchanging two columns.</li>
</ol>

<p>We call two arrays alike if one of them can be obtained from the other by a sequence of the above two operations. Write a program that for a given set of pairs of arrays tells which pairs are alike.</p>

### 입력

<p>The first line of the standard input contains an integer t (1&lt;=t&lt;=10) denoting the number of test cases which represent the number of pairs of arrays. The first line of each test case holds two integers n and m (1 &lt;= n &lt;= 1000 and 1 &lt;= m &lt;= 1000), separated by a single space. n and m denote the number of rows and columns of the arrays, respectively. The next n lines represent n rows of the first array and the following n lines represent n rows of the second array. Each line holds m array items where each values between &nbsp;‐1000000 and 1000000 inclusive. All numbers occurring in either of the arrays are pair wise different.</p>

### 출력

<p>Your program should print out t lines to the standard output. The k‐th of these should hold one word: &rdquo;YES&rdquo; if the arrays of the k‐th pair are alike, or &rdquo;NO&rdquo; otherwise (in capital letter only).</p>
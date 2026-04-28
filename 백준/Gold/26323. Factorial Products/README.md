# [Gold II] Factorial Products - 26323

[문제 링크](https://www.acmicpc.net/problem/26323)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 16, 맞힌 사람: 11, 정답 비율: 25.000%

### 분류

수학

### 문제 설명

<p>Factorial is just a game of multiplications. Formally, it can be defined as a recurrence relation:</p>

<ul>
	<li>Fact (0) = 1</li>
	<li>Fact (n) = n * Fact(n-1), for all integers n &gt; 0</li>
</ul>

<p>This problem is all about multiplications, more and more multiplications. It is a game of multiplications of factorials.</p>

<p>You will be given three lists of numbers: A, B and C. You have to take the factorials of all the numbers in each list and multiply them to get ProFact(A), ProFact(B), ProFact(C). Then report which product is the largest.</p>

<p>For example, consider the lists A = {2, 4, 7}, B = {0, 1, 9} and C = {2, 3, 5, 5}. Then,</p>

<ul>
	<li>ProFact(A) = 2! * 4! * 7! = 241, 920</li>
	<li>ProFact(B) = 0! * 1! * 9! = 362, 880</li>
	<li>ProFact(C) = 2! * 3! * 5! * 5! = 172,800</li>
</ul>

<p>So, the largest product for this example is ProFact(B).</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of test cases. Each test case consists of four input lines. The first line consists of three positive integers providing, respectively, the size for the lists A, B and C. The last three lines contain, respectively, the elements (non-negative integers) in lists A, B and C.</p>

<p>All the values in the input file will be less than 2,501.</p>

### 출력

<p>For each test case, output &ldquo;Case #t: h&rdquo; in a line, where t is the case number (starting with 1) and h is the list name with the highest product. If two or three lists are tied for the highest product, print &ldquo;TIE&rdquo;. Follow the format illustrated in Sample Output.</p>

<p>Assume that, if the pairwise product values differ, then the relative difference of these products will differ by at least 0.01% of the largest product.</p>
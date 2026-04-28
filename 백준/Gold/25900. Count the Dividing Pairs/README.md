# [Gold I] Count the Dividing Pairs - 25900

[문제 링크](https://www.acmicpc.net/problem/25900)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 18, 맞힌 사람: 14, 정답 비율: 32.558%

### 분류

수학, 정수론, 조합론, 조화수

### 문제 설명

<p>Number Theory provides many fascinating properties. You have most likely written programs dealing with different groups of numbers such as Prime, Perfect, Amicable, Happy, Powerful, and Untouchable numbers, just to name a few. In this problem, you&rsquo;ll attack yet another fascinating property of numbers, one dealing with pairs of numbers.</p>

<p>An integer D is said to be a proper divisor of an integer N if D &ne; N and there exist an integer Q such that N = Q * D. For example, 4 is a proper divisor of 8 and 5 is a proper divisor of 15, but 9 is not a proper divisor of 9 and 6 is not a proper divisor of 8. Note that zero is not a proper divisor of any number but all numbers (except zero) are proper divisors of zero.</p>

<p>We will call (D, N) as defined above &ldquo;proper dividing pairs&rdquo;.</p>

<p>Given a list of integers A = {A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>p</sub>}, you are to determine (count) the number of proper dividing pairs (A<sub>i</sub>, A<sub>j</sub>), where 1 &le; i, j &le; p.</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of test cases to process. Each test case starts with an integer, p (2 &le; p &le; 10<sup>6</sup>), indicating the number of integers in the list. The following input line will provide p integers, A<sub>i</sub> (0 &le; A<sub>i</sub> &le; 10<sup>7</sup>).</p>

### 출력

<p>For each test case, print &ldquo;Test case #t: m&rdquo;, where t indicates the case number starting with 1 and m indicates the number of proper dividing pairs. Leave a blank line after the output for each test case.</p>

<p>Note that, as illustrated in Sample Input/Output, duplicate values in the input list are considered as different elements in the list and they each contribute to the total count (proper dividing pairs).</p>
# [Gold III] Quick growth - 27716

[문제 링크](https://www.acmicpc.net/problem/27716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>The memory of Bob&rsquo;s computer contains two interesting things: an array of integers and a virus.</p>

<p>Each midnight the virus becomes active. It takes each array in memory and replaces it with a bunch of new arrays: one for each contiguous subarray of the original array.</p>

<p>For example, if today the memory contains a single array (1,2,1,3), tomorrow it will contain the following arrays: (1), (2), (1), (3), (1,2), (2,1), (1,3), (1,2,1), (2,1,3), and (1,2,1,3).</p>

<p>You are given the length N of Bob&rsquo;s original array, its contents and the number of days D.</p>

<p>Compute the sum of all elements of all arrays that will be in the memory of Bob&rsquo;s computer after D days. As this number can be huge, it is sufficient to compute the remainder it gives when divided by 10<sup>9</sup> + 9.</p>

<p>Assume that the memory of Bob&rsquo;s computer is sufficiently large to accommodate all the arrays.</p>

### 입력

<p>The first line of the input file contains an integer T specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of two lines. The first line contains the two integers N and D. The second line consists of N non-negative integers that are all less than 20: the contents of the original array.</p>

### 출력

<p>For each test case output a single line with a single integer: the sum of all elements in all arrays after D days, modulo 1,000,000,009.</p>
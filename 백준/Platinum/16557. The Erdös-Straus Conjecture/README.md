# [Platinum III] The Erdös-Straus Conjecture - 16557

[문제 링크](https://www.acmicpc.net/problem/16557)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 15, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

수학, 브루트포스 알고리즘, 정수론, 유클리드 호제법, 소인수분해

### 문제 설명

<p>The Brocard Erd&ouml;s-Straus conjecture is that for any integer n &gt; 2, there are positive integers a &le; b &le; c, so that:</p>

<p style="text-align: center;">(1) 4/n = 1/a + 1/b + 1/c</p>

<p>There may be multiple solutions. For example:</p>

<p style="text-align: center;">4/18 = 1/9 + 1/10 + 1/90 = 1/5 + 1/90 + 1/90 = 1/5 + 1/46 + 1/2470</p>

<p>Since it is still a conjecture, there are obviously no counterexamples for n &le; 50,000. For this problem, you will write a program which takes as input an integer n between 2 and 50000 inclusive and returns the smallest triple of integers a, b, c in lexicographic order which satisfies equation (1) above. That is, if a1, b1, c1 is any other solution to (1) for the given input, then either (a &lt; a1) or (a = a1 and b &le; b1).</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by a single space, followed by the decimal integer n, (2 &le; n &le; 50000).</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the data set number, K, followed by a single space followed by the decimal integer values a, b and c in that order, separated by single spaces.</p>
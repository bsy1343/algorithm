# [Gold V] m-ary Partitions - 13879

[문제 링크](https://www.acmicpc.net/problem/13879)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 51, 맞힌 사람: 46, 정답 비율: 85.185%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A partition of an integer n is a set of positive integers which sum to n, typically written in descending order. For example:</p>

<pre>
<code>10 = 4+3+2+1 </code></pre>

<p>A partition is m-ary if each term in the partition is a power of m. For example, the 3-ary partitions of 9 are:</p>

<pre>
<code>9
3+3+3
3+3+1+1+1
3+1+1+1+1+1+1
1+1+1+1+1+1+1+1+1 </code></pre>

<p>Write a program to find the number of m-ary partitions of an integer n.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. The line contains the data set number, K, followed by the base of powers, m, (3 &lt;= m &lt;= 100), followed by a space, followed by the integer, n, (3 &lt;= n &lt;= 10000), for which the number of m-ary partitions is to be found.</p>

### 출력

<p>For each data set there is one line of output. The output line contains the data set number, K, a space, and the number of m-ary partitions of n. The result should fit in a 32-bit unsigned integer.</p>
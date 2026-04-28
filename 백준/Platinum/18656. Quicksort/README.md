# [Platinum II] Quicksort - 18656

[문제 링크](https://www.acmicpc.net/problem/18656)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Bob has written a fake QuickSort implementation as below. Can you figure out, if he randomly chooses a permutation p = [p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>] obtained from 1, 2, . . . , n with equal probability, the expected number of inversions of p after calling <code>QuickSort(p, 1, n, k)</code>?</p>

<pre>
a fake QuickSort implementation
 1: function QuickSort(A, l, r, h)     ▷ Elements in A would be modified
 2:   if h &gt; 1 and l &lt; r then
 3:     m &larr; Partition(A, l, r)
 4:     QuickSort(A, l, m - 1, h - 1)
 5:     QuickSort(A, m + 1, r, h - 1)
 6: function Partition(A, l, r)        ▷ Elements in A would be modified
 7:   i &larr; l
 8:   j &larr; r
 9:   m &larr; &lfloor;(l+r)/2&rfloor; 
10:   pivot &larr; A<sub>m</sub>
11:   A<sub>m</sub> &larr; A<sub>i</sub>
12:   while i &lt; j do
13:     while i &lt; j and A<sub>j</sub> &ge; pivot do
14:       j &larr; j - 1
15:     if i &lt; j then
16:       A<sub>i</sub> &larr; A<sub>j</sub>
17:     while i &lt; j and A<sub>i</sub> &lt; pivot do
18:       i &larr; i + 1
19:     if i &lt; j then
20:       A<sub>j</sub> &larr; A<sub>i</sub>
21:   A<sub>i</sub> &larr; pivot
22:   return i
</pre>

<p>The number of inversions of a permutation [p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>] is the number of integer pairs (u, v) such that 1 &le; u &lt; v &le; n and p<sub>u</sub> &gt; p<sub>v</sub>.</p>

<p>To avoid any precision issue, you are asked to report the product of n!, the factorial of n, and the expected number in modulo 998244353, which ought to be an integer.</p>

### 입력

<p>The input contains several test cases. The first line contains an integer T indicating the number of test cases. The following describes all test cases. For each test case:</p>

<p>The only line contains two integers n and k.</p>

### 출력

<p>For each test case, output a line containing &ldquo;Case #x: y&rdquo; (without quotes), where x is the test case number starting from 1, and y is the answer to this test case.</p>

### 제한

<ul>
	<li>1 &le; T &le; 3 &times; 10<sup>5</sup></li>
	<li>1 &le; n, k &le; 6000</li>
</ul>
# [Silver V] gMatrix (Small) - 12064

[문제 링크](https://www.acmicpc.net/problem/12064)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 45, 맞힌 사람: 27, 정답 비율: 79.412%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>You have a square&nbsp;<strong>N</strong>&nbsp;by&nbsp;<strong>N</strong>&nbsp;matrix M of nonnegative integers. We would like to make a list of the maximum values in every sub-matrix of size&nbsp;<strong>K</strong>&nbsp;by&nbsp;<strong>K</strong>&nbsp;within M, and then find the sum of those values together. (Note that the same entry of M might be the maximum value in more than one sub-matrix, in which case it will show up multiple times in the list.) Can you find that sum?</p>

<p>To simplify the input of the matrix, you are given two arrays&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;of length&nbsp;<strong>N</strong>, and two integers&nbsp;<strong>C</strong>&nbsp;and&nbsp;<strong>X</strong>. Then the entry M<sub>ij</sub>&nbsp;(for the ith row and jth column of the matrix) equals (<strong>A<sub>i</sub></strong>*i+<strong>B<sub>j</sub></strong>*j +&nbsp;<strong>C</strong>) mod&nbsp;<strong>X</strong>, where i and j are in the range [1,&nbsp;<strong>N</strong>].</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with one line with four integers,&nbsp;<strong>N</strong>,&nbsp;<strong>K</strong>,&nbsp;<strong>C</strong>&nbsp;and&nbsp;<strong>X</strong>. Then there are two lines with&nbsp;<strong>N</strong>&nbsp;integers each, representing the arrays&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the sum of the maximum values in all sub-matrices of size&nbsp;<strong>K</strong>&nbsp;by&nbsp;<strong>K</strong>.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&le; 100000.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100000.</li>
	<li>1 &le;&nbsp;<strong>X</strong>&nbsp;&le; 1000000007.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50.</li>
</ul>

### 힌트

<p>In the first test case, the matrix is:</p>

<pre>
<code>3</code></pre>

<p>So the sum of maximum values is 3. In the second test case, the matrix is:</p>

<pre>
<code>9 3</code>
<code>1 6</code></pre>

<p>So the sum of maximum values is 19. In the third test case, the matrix is:</p>

<pre>
<code>11 11 24</code>
<code>13 13 26</code>
<code>14 14 27</code></pre>
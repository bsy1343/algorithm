# [Platinum I] Sherlock and Permutation Sorting (Large) - 14321

[문제 링크](https://www.acmicpc.net/problem/14321)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

수학, 조합론

### 문제 설명

<p>Sherlock and Watson have already been introduced to sorting in their computer programming course. Now, Watson has always been curious about parallel computing and wants to sort a permutation of the integers 1 through&nbsp;N&nbsp;by breaking it into chunks, sorting the chunks individually, and then concatenating them.&nbsp;</p>

<p>For a permutation&nbsp;<code>p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>N</sub></code>, a chunk is a contiguous subarray of the permutation: i.e., a sequence of elements&nbsp;<code>p<sub>i</sub>, p<sub>i + 1</sub>, ..., p<sub>j</sub></code>, for the elements at indexes i and j such that 1 &le;&nbsp;<code>i</code>&nbsp;&le;&nbsp;<code>j</code>&nbsp;&le;&nbsp;N.&nbsp;</p>

<p>Watson wants to partition his permutation into an ordered list of one or more chunks, without changing the order that the elements are in, in such a way that each element of the permutation is in exactly one chunk, and all elements in a chunk are smaller than all elements in any later chunk. For example, for the permutation [2, 1, 3, 5, 4], these are the only four legal ways for Watson to break it into chunks: [[2, 1, 3], [5, 4]] or [[2, 1], [3, 5, 4]] or [[2, 1], [3], [5, 4]] or [[2, 1, 3, 5, 4]]. Watson is happiest when there are as many chunks as possible; we denote the maximum number of chunks for a permutation p as f(p). In this example, the maximum number of chunks is 3.</p>

<p>Watson wants to consider all permutations p of the numbers 1 through&nbsp;N, and find the&nbsp;sum of squares&nbsp;of f(p). Watson knows Sherlock might come in handy and comes to him for help, but Sherlock is as clueless as Watson and asks you for help. As the sum of squares can be large, please find it modulo&nbsp;M.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of one line with two integers&nbsp;N&nbsp;and&nbsp;M.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the sum of squares of&nbsp;<code>f(p)</code>&nbsp;for all permutations&nbsp;<code>p</code>&nbsp;of size&nbsp;N, modulo&nbsp;M.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;M&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;T&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 5000.</li>
</ul>

### 힌트

<p>In Case 1, there is only one permutation.&nbsp;<code>f([1]) * f([1]) % 2</code>&nbsp;= 1.&nbsp;</p>

<p>In Case 2, there are two permutations.</p>

<pre>
<code>f([1, 2])</code> = 2.
<code>f([2, 1])</code> = 1.
<code>(2<sup>2</sup> + 1<sup>2</sup>) % 4</code> = 1.</pre>

<p>In Case 3, there are six permutations.</p>

<pre>
<code>f([1, 2, 3])</code> = 3.
<code>f([1, 3, 2])</code> = 2.
<code>f([2, 1, 3])</code> = 2.
<code>f([2, 3, 1])</code> = 1.
<code>f([3, 1, 2])</code> = 1.
<code>f([3, 2, 1])</code> = 1.
<code>(3<sup>2</sup> + 2<sup>2</sup> + 2<sup>2</sup> + 1<sup>2</sup> + 1<sup>2</sup> + 1<sup>2</sup>) % 7</code> = 6.</pre>
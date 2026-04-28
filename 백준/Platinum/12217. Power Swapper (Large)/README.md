# [Platinum IV] Power Swapper (Large) - 12217

[문제 링크](https://www.acmicpc.net/problem/12217)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

수학, 구현, 브루트포스 알고리즘, 조합론, 재귀

### 문제 설명

<p>In a parallel universe, people are crazy about using numbers that are powers of two, and they have defined an exciting sorting strategy for permutations of the numbers from 1 to 2<strong><sup>N</sup></strong>. They have defined a swapping operation in the following way:</p>

<ul>
	<li>A range of numbers to be swapped is valid if and only if it is a range of adjacent numbers of size 2<sup>k</sup>, and its starting position (position of the first element in the range) is a multiple of 2<sup>k</sup> (where positions are 0-indexed).</li>
	<li>A valid swap operation of <em>size-k</em> is defined by swapping two distinct, valid ranges of numbers, each of size 2<sup>k</sup>.</li>
</ul>

<p>To sort the given permutation, you are allowed to use at most one swap operation of each size k, for k in [0, <strong>N</strong>). Also, note that swapping a range with itself is not allowed.</p>

<p>For example, given the permutation [3, 6, 1, 2, 7, 8, 5, 4] (a permutation of the numbers from 1 to 2<sup>3</sup>), the permutation can be sorted as follows:</p>

<ul>
	<li>[3, 6, 1, 2, 7, 8, 5, 4]: make a <em>size-2</em> swap of the ranges [3, 6, 1, 2] and [7, 8, 5, 4].</li>
	<li>[7, 8, 5, 4, 3, 6, 1, 2]: make a <em>size-0</em> swap of [5] and [3].</li>
	<li>[7, 8, 3, 4, 5, 6, 1, 2]: make a <em>size-1</em> swap of [7, 8] and [1, 2].</li>
	<li>[1, 2, 3, 4, 5, 6, 7, 8]: done.</li>
</ul>

<p>The previous steps used every swap size (0, 1, and 2) at most once. Also, notice that all the swaps were valid because both ranges for each size k started at indices that were multiples of 2<sup>k</sup>.</p>

<p>Count how many ways there are to sort the given permutation by using the rules above. A way is an ordered sequence of swaps, and two ways are the same only if the sequences are identical.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of each test case contains a single integer <strong>N</strong>. The following line contains <strong>2</strong><strong><sup>N</sup></strong> space-separated integers: a permutation of the numbers 1, 2, ..., 2<strong><sup>N</sup></strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 200.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 12.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of ways to sort the given permutation using the rules above.</p>
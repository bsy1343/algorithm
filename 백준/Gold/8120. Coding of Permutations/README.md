# [Gold III] Coding of Permutations - 8120

[문제 링크](https://www.acmicpc.net/problem/8120)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 212, 정답: 123, 맞힌 사람: 95, 정답 비율: 58.642%

### 분류

구현, 자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>Every permutation A = (a<sub>1</sub>, ..., a<sub>n</sub>)&nbsp;of numbers 1, ..., n&nbsp;can be coded by a sequence B = (b<sub>1</sub>, ..., b<sub>n</sub>)&nbsp;in which b<sub>i</sub>&nbsp;equals the number of all a<sub>j</sub>&nbsp;such that (j &lt; i &amp; a<sub>j</sub> &gt; a<sub>i</sub>), for i = 1, ..., n.</p>

<p>The sequence B = (0, 0, 1, 0, 2, 0, 4)&nbsp;is the code of the permutation A = (1, 5, 2, 6, 4, 7, 3).</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input the length n&nbsp;and successive elements of the sequence B,</li>
	<li>examines whether it is a code of some permutation of numbers 1, ..., n,</li>
	<li>if so, it finds that permutation and writes it in the standard output,</li>
	<li>otherwise it writes in the standard output one word&nbsp;<code>NIE</code>&nbsp;(&quot;<i>no</i>&quot;).</li>
</ul>

### 입력

<ul>
	<li>In the first line of the standard input there is a positive integer n &le; 30,000. It is the number of elements of the sequence B.</li>
	<li>In each of the following n&nbsp;lines there is one nonnegative integer not greater than 30,000. It is the successive element of the sequence B.</li>
</ul>

### 출력

<p>The standard output should contain:</p>

<ul>
	<li>in each of n&nbsp;consecutive lines - one element of the permutation A, whose code is the sequence B&nbsp;written in the standard input,</li>
	<li>one word&nbsp;<code>NIE</code>, if the sequence B&nbsp;is not a code of any permutation.</li>
</ul>
# [Platinum V] Inversions - 8388

[문제 링크](https://www.acmicpc.net/problem/8388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 114, 정답: 37, 맞힌 사람: 33, 정답 비율: 34.375%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>A sequence <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>&nbsp;of different integers is called a permutation of size <em>n</em>&nbsp;if 1 &le; <em>x<sub>i</sub></em> &le; <em>n</em>&nbsp;for every 1 &le; <em>i</em> &le; <em>n</em>. For every permutation we define its inversions as pairs of indices 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>&nbsp;such that <em>x<sub>i</sub></em> &gt; <em>x<sub>j</sub></em>. Your task is to count the number of permutations of size <em>n</em>, having a given number of inversions.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the size of the permutation and the number of inversions,</li>
	<li>counts the number of permutations of the given size and having the given number of inversions,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first and only line of input contains two integers <em>n</em>&nbsp;and <em>k</em>&nbsp;(1 &le; <em>n</em> &le; 500, 0 &le; <em>k</em> &le; <em>n</em>(<em>n</em> - 1)/2), separated by a single space and representing the size of permutation and the number of inversions we are interested in.</p>

### 출력

<p>The first and only line of output should contain the remainder of the division of the number of the permutations we are interested in by 30 011.</p>

### 힌트

<p>The permutations of size 3&nbsp;which have 2&nbsp;inversions are 2, 3, 1&nbsp;and 3, 1, 2.</p>
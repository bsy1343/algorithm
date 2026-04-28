# [Platinum V] medians - 5256

[문제 링크](https://www.acmicpc.net/problem/5256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 187, 정답: 78, 맞힌 사람: 64, 정답 비율: 46.715%

### 분류

자료 구조, 그리디 알고리즘, 애드 혹, 세그먼트 트리

### 문제 설명

<p>Let A be a permutation of 1, 2, 3 ..., 2*N - 1.</p>

<p>We define the prefix medians of A as an array B with N elements: where B[i] is the median of A[1], A[2], ..., A[2*i-1].</p>

<p>Note: The median of a list of M numbers (where M is odd) can be found by sorting the numbers and picking the middle one.</p>

<p>You are given N and the array B. You are asked to determine a permutation A whose prefix medians are precisely B.</p>

### 입력

<p>The input file contains 2 lines. The first line contains one integer, N. The second line describes B: N integers, separated by space.</p>

### 출력

<p>The output file should contain A: one line with 2*N-1 integers separated by space. If there are multiple permutations A leading to the same input array B, you may output any one. In all test data, there will always be at least one solution.</p>

### 제한

<ul>
	<li>1 &le; A[i] &le; 2*N - 1, for every i from 1 to 2*N - 1</li>
	<li>1 &le; B[i] &le; 2*N - 1, for every i from 1 to N</li>
	<li>1 &le; N &le; 100 000</li>
</ul>
# [Platinum III] Permutation Transformation - 20692

[문제 링크](https://www.acmicpc.net/problem/20692)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 30, 맞힌 사람: 29, 정답 비율: 46.774%

### 분류

수학, 정수론, 소수 판정, 순열 사이클 분할, 소인수분해

### 문제 설명

<p>A permutation of 1 . . . N is an array of integers P[1...N] such that each integer from 1 to N appears exactly once in P[1...N]. A <strong>transformation</strong> to P[1...N] is defined as changing P[1...N] into another permutation P&#39;[1...N] where P&#39;[i] = P[P[i]] for all 1 &le; i &le; N.</p>

<p>You are given a permutation P[1...N]. Your task in this problem is to count the number of distinct permutations you can get by doing a transformation to the given permutation for zero or more times.</p>

<p>For example, let P[1...N] = [3, 5, 1, 2, 4].</p>

<ul>
	<li>By doing a transformation, you will change P into [1, 4, 3, 5, 2].</li>
	<li>By doing another transformation, you will change P into [1, 5, 3, 2, 4].</li>
	<li>By doing another transformation, you will change P into [1, 4, 3, 5, 2] again.</li>
</ul>

<p>Therefore, there are 3 distinct permutations you can get by doing a transformation for zero or more times.</p>

<ol>
	<li>[3, 5, 1, 2, 4]</li>
	<li>[1, 4, 3, 5, 2]</li>
	<li>[1, 5, 3, 2, 4]</li>
</ol>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the number of elements in the given permutation. The next line contains N integers: P[i] (1 &le; P[i] &le; N) representing the permutation. The elements in P[1...N] are guaranteed to be unique.</p>

### 출력

<p>Output in a line an integer representing the number of distinct permutations you can get by doing a transformation to the given permutation for zero or more times, modulo 998 244 353.</p>
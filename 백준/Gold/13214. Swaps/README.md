# [Gold IV] Swaps - 13214

[문제 링크](https://www.acmicpc.net/problem/13214)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 162, 정답: 70, 맞힌 사람: 54, 정답 비율: 53.465%

### 분류

그리디 알고리즘, 순열 사이클 분할

### 문제 설명

<p>You have two arrays A and B, each contains numbers 1, 2, ... , N, though not necessarily in this order.</p>

<p>In each operation, you can swap any two numbers in A.</p>

<p>Your task is to determine the least number of operations needed to transform A to B.</p>

### 입력

<ul>
	<li>The first line of the input contains an integer N, representing the size of arrays A and B. (1 &le; N &le; 1,000,000)</li>
	<li>The second line contains the elements of the array A, where consecutive elements are separated by a single space.</li>
	<li>The third line contains the elements of the array B, where consecutive elements are separated by a single space.</li>
</ul>

### 출력

<p>Output the minimum number of operations needed to transform A to B.</p>

### 힌트

<p>Sample Input 1</p>

<p>The 3 swap operations to transform [1,4,2,3] into [4,3,1,2] are:</p>

<ul>
	<li>Swap 1, 4</li>
	<li>Swap 2, 3</li>
	<li>Swap 1, 3</li>
</ul>

<p>Sample Input 2</p>

<p>The 4 swap operations to transform [3,6,4,7,1,2,5] into [4,3,7,6,1,5,2] are:</p>

<ul>
	<li>Swap 2, 5</li>
	<li>Swap 3, 6</li>
	<li>Swap 4, 6</li>
	<li>Swap 6, 7</li>
</ul>
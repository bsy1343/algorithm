# [Platinum III] CPR (Cut-Paste-Reverse) - 27407

[문제 링크](https://www.acmicpc.net/problem/27407)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Consider the list of integers 1, 2, ..., N. On this list you can perform a series of cut-paste operations. A cut-paste operation &lt;x, y, z&gt; consists of cutting the sequence between the values x and y and inserting the sequence immediately after the value z (z can also be 0 to designate an insertion at the beginning of the list). A triplet &lt;x, y, z&gt; constitutes a correct cut-paste operation if</p>

<ul>
	<li>x appears before y in the list, or x = y;</li>
	<li>z appears outside the sequence from x to y, or z = 0.</li>
</ul>

<p>Find a series of correct operations that reverses the list, so that after performing the operations the list becomes N, N - 1, ..., 2, 1. The fewer operations you require, the higher your score will be.</p>

### 입력

<p>The input contains a single integer number N, representing the length of the list.</p>

### 출력

<p>The outpu must contain a number M on the first line, representing the number of cut-paste operations. Each of the following M lines must contain three numbers x y z representing an operation.</p>

### 제한

<ul>
	<li>1 &le; N &le; 5,000</li>
</ul>

### 힌트

<p>The initial list is 1 2 3 4 5 6</p>

<p>After the first operation, the list becomes 2 3 4 5 6 1 (The operation 1 1 6 would have had the same result.)</p>

<p>After the second operation, the list becomes 4 5 2 3 6 1</p>

<p>After the third operation, the list becomes 4 3 6 5 2 1</p>

<p>After the fourth operation, the list becomes 6 5 4 3 2 1</p>

<p>This solution earns full points as 4 = 6 / 2 + 1.</p>
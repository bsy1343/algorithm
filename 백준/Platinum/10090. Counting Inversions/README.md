# [Platinum V] Counting Inversions - 10090

[문제 링크](https://www.acmicpc.net/problem/10090)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 5837, 정답: 2781, 맞힌 사람: 2028, 정답 비율: 47.229%

### 분류

자료 구조, 정렬, 세그먼트 트리, 분할 정복

### 문제 설명

<p>A permutation of integers from 1 to n is a sequence a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>, such that each integer from 1 to n is appeared in the sequence exactly once.</p>

<p>Two integers in а permutation form an inversion, when the bigger one is before the smaller one.</p>

<p>As an example, in the permutation 4 2 7 1 5 6 3, there are 10 inversions in total. They are the following pairs: 4&ndash;2, 4&ndash;1, 4&ndash;3, 2&ndash;1, 7&ndash;1, 7&ndash;5, 7&ndash;6, 7&ndash;3, 5&ndash;3, 6&ndash;3.</p>

<p>Write program invcnt that computes the number of the inversions in a given permutation.</p>

### 입력

<p>The value for the number n is written on the first line of the standard input. The permutation is written on the second line: n numbers, delimited by spaces.</p>

### 출력

<p>Write the count of inversions on the standard output.</p>

### 제한

<ul>
	<li>2 &le; n &le; 1000000</li>
</ul>
# [Platinum V] A Sorting Problem - 23336

[문제 링크](https://www.acmicpc.net/problem/23336)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 385, 정답: 296, 맞힌 사람: 263, 정답 비율: 78.507%

### 분류

자료 구조, 세그먼트 트리, 분할 정복

### 문제 설명

<p>You are given an array [p[1], p[2], ..., p[n]] where all the numbers in the array are distinct. In addition, the numbers are positive integers between 1 and n. You can only perform the following operations on the array: Pick two indices x and y such that |p[x]&minus;p[y]| = 1, and then swap the values of p[x] and p[y]. We now want to sort this array in ascending order. That is, to make p[i] = i for all i &isin; {1, 2, ..., n}. For example, we can sort the array [p[1] = 2, p[2] = 3, p[3] = 1] in two operations:</p>

<ol>
	<li>Swap p[1] and p[3]. The array becomes [p[1] = 1, p[2] = 3, p[3] = 2].</li>
	<li>Swap p[2] and p[3]. The array becomes [p[1] = 1, p[2] = 2, p[3] = 3] which is sorted in ascending order.</li>
</ol>

<p>Please write a program to compute the minimum number of operations to sort a given array in ascending order.</p>

### 입력

<p>The input contain two lines. The first line contains one integer n. The second lines contain n space-saparated numbers p[1], p[2], ..., p[n] representing the array [p[1], p[2], ..., p[n]].</p>

### 출력

<p>Output only one number that denotes the minimum number of operations required to sort the given array.</p>

### 제한

<ul>
	<li>1 &lt; n &le; 200000.</li>
	<li>1 &le; p[i] &le; n.</li>
	<li>All p[i] are distinct.</li>
</ul>
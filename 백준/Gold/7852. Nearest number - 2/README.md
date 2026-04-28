# [Gold IV] Nearest number - 2 - 7852

[문제 링크](https://www.acmicpc.net/problem/7852)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 152, 정답: 22, 맞힌 사람: 19, 정답 비율: 24.359%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Input is the matrix A of N by N non-negative integers.</p>

<p>A distance between two elements A<sub>i,j</sub> and A<sub>p,q </sub>is defined as |i &minus; p| + |j &minus; q|.</p>

<p>Your program must replace each zero element in the matrix with the nearest non-zero one. If there are two or more nearest non-zeroes, the zero must be left in place.&nbsp;</p>

### 입력

<p>Input file contains the number N followed by N<sup>2</sup>&nbsp;integers, representing the matrix rowby-row.&nbsp;</p>

### 출력

<p>Output file must contain N<sup>2</sup>&nbsp;integers, representing the modified matrix row-by-row.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; N &le; 200, 0 &le; A<sub>i</sub> &le; 1000000&nbsp;</li>
</ul>
# [Platinum II] One is good, but two is better - 7855

[문제 링크](https://www.acmicpc.net/problem/7855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 3, 맞힌 사람: 1, 정답 비율: 6.250%

### 분류

누적 합, 스위핑

### 문제 설명

<p>Given the N by M matrix with elements equal either 0, 1 or 2, There is at least one element equal to 2. Your program must find such two (perhaps overlapping or even identical) rectangles, that they would contain all the 2s which are in matrix, but none of the 1s. If several solutions exist, the program must find a solution with minimal area of joined rectangles. For example, in the matrix&nbsp;</p>

<pre>
1 2 1 0
2 0 2 2
1 2 1 0</pre>

<p>these rectangles are (2,1)-(2,3) and (1,2)-(4,2), with the combined area of 6.</p>

### 입력

<p>Input file contains integers N and M followed by N * M matrix elements.&nbsp;</p>

### 출력

<p>Output file must contain a single integer &mdash; the minimal area, or -1 if no solution exists.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 50&nbsp;</li>
</ul>
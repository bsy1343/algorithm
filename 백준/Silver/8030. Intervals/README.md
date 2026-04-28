# [Silver I] Intervals - 8030

[문제 링크](https://www.acmicpc.net/problem/8030)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 62, 맞힌 사람: 58, 정답 비율: 61.053%

### 분류

정렬, 스위핑

### 문제 설명

<p>There is given the series of n closed intervals [a<sub>i</sub>: b<sub>i</sub>], where i = 1, 2, ..., n. The sum of those intervals may be represented as a sum of closed pairwise non-intersecting intervals. The task is to find such representation with the minimal number of intervals. The intervals of this representation should be written in the output file in asceding order. We say that the intervals [a: b] and [c: d] are in ascending order if, and only if a &le; b &lt; c &le; d.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the series of intervals,</li>
	<li>computes pairwise non-intersecting intervals satisfying the conditions given above,</li>
	<li>writes the computed intervals in ascending order to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n, 3 &le; n &le; 50 000. This is the number of intervals. In the (i+1)-st line, 1 &le; i &le; n, there is a description of the interval [a<sub>i</sub>: b<sub>i</sub>] in the form of two integers ai and bi separated by a single space, which are respectively the beginning and the end of the interval, 1 &le; a<sub>i</sub> &le; b<sub>i</sub> &le; 1 000 000.</p>

### 출력

<p>The standard output should contain descriptions of all computed pairwise non-intersecting intervals. In each line should be written a description of one interval. It should be composed of two integers, separated by a single space, the beginning and the end of the interval respectively. The intervals should be written into the output file in ascending order.</p>
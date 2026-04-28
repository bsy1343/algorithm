# [Bronze I] Longest Arithmetic - 23913

[문제 링크](https://www.acmicpc.net/problem/23913)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 93, 맞힌 사람: 75, 정답 비율: 60.000%

### 분류

구현

### 문제 설명

<p>An arithmetic array is an array that contains at least two integers and the differences between consecutive integers are equal. For example, [9, 10], [3, 3, 3], and [9, 7, 5, 3] are arithmetic arrays, while [1, 3, 3, 7], [2, 1, 2], and [1, 2, 4] are not arithmetic arrays.</p>

<p>Sarasvati has an array of&nbsp;<b>N</b>&nbsp;non-negative integers. The i-th integer of the array is&nbsp;<b>A<sub>i</sub></b>. She wants to choose a contiguous arithmetic subarray from her array that has the maximum length. Please help her to determine the length of the longest contiguous arithmetic subarray.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;<b>N</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>A<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the length of the longest contiguous arithmetic subarray.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the integers inside the bracket in the following represent the longest contiguous arithmetic subarray: 10 7 [4 6 8 10] 11</p>

<p>In Sample Case #2, the whole array is an arithmetic array, thus the longest contiguous arithmetic subarray is the whole array.</p>

<p>In Sample Case #3, the longest contiguous arithmetic subarray is either [5, 5, 5] (a subarray from the fourth integer to the sixth integer) or [4, 5, 6] (a subarray from the seventh integer to the ninth integer).</p>

<p>In Sample Case #4, the longest contiguous arithmetic subarray is the last six integers.</p>
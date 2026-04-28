# [Gold I] Longest Progression - 23004

[문제 링크](https://www.acmicpc.net/problem/23004)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 88, 정답: 37, 맞힌 사람: 32, 정답 비율: 48.485%

### 분류

다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>In <a href="https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ff47/00000000003bf4ed">Kick Start 2020 Round E</a> (you do not need to know anything about the previous problem to solve this one) Sarasvati learned about arithmetic arrays. An arithmetic array is an array that contains at least two integers and the differences between consecutive integers are equal. For example, [9,10], [3,3,3], and [9,7,5,3] are arithmetic arrays, while [1,3,3,7], [2,1,2], and [1,2,4] are not.</p>

<p>Sarasvati again has an array of N non-negative integers. The i-th integer of the array is Ai. She can replace at most one element in the array with any (possibly negative) integer she wants.</p>

<p>For an array A, Sarasvati defines a subarray as any contiguous part of A. Please help Sarasvati determine the length of the longest possible arithmetic subarray she can create by replacing at most one element in the original array.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with a line containing the integer N. The second line contains N integers. The i-th integer is A<sub>i</sub>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x is the test case number (starting from 1) and&nbsp;y&nbsp;is the length of the longest arithmetic subarray.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100</li>
	<li>0 &le; A<sub>i</sub> &le; 10<sup>9</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the whole array is an arithmetic array, thus the longest arithmetic subarray is the whole array.</p>

<p>In Sample Case #2, if Sarasvati changes the number at third position to 5, the array will become [5,5,5,5,5,5,4,5,6]. The subarray from first position to sixth position is the longest arithmetic subarray.</p>

<p>In Sample Case #3, Sarasvati can change the number at the last position to &minus;1, to get [8,5,2,&minus;1]. This resulting array is arithmetic.</p>
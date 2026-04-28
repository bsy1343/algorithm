# [Silver IV] Yogurt - 23967

[문제 링크](https://www.acmicpc.net/problem/23967)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 51, 맞힌 사람: 41, 정답 비율: 75.926%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Yogurt can be a nutritious part of an appetizer, main course, or dessert, but it must be consumed before it expires, and it might expire quickly! Moreover, different cups of yogurt might expire on different days.</p>

<p>Lucy loves yogurt, and she has just bought&nbsp;<b>N</b>&nbsp;cups of yogurt, but she is worried that she might not be able to consume all of them before they expire. The i-th cup of yogurt will expire&nbsp;<b>A<sub>i</sub></b>&nbsp;days from today, and a cup of yogurt cannot be consumed on the day it expires, or on any day after that.</p>

<p>As much as Lucy loves yogurt, she can still only consume at most&nbsp;<b>K</b>&nbsp;cups of yogurt each day. What is the largest number of cups of yogurt that she can consume, starting from today?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with one line containing two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>, as described above. Then, there is one more line with&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>A<sub>i</sub></b>, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of cups of yogurt that Lucy can consume, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>K</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>, for all i.</li>
</ul>
# [Platinum II] Build-A-Pair - 22913

[문제 링크](https://www.acmicpc.net/problem/22913)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 68, 정답: 18, 맞힌 사람: 15, 정답 비율: 25.862%

### 분류

백트래킹, 그리디 알고리즘

### 문제 설명

<p>You want to build a pair of positive integers. To do that, you are given a list of decimal digits to use. You must use every digit in the list exactly once, but you get to choose which ones to use for the first integer and which ones to use for the second integer. You also get to choose the order of the digits within each integer, except you cannot put a zero as the most significant (leftmost) digit in either integer. Note that you cannot choose just a zero for one integer either, because it would not be positive.</p>

<p>For example, you could be given the list [1,0,2,0,4,3]. Two of the valid pairs you can build are (200,143) and (3,12400). The following pairs, on the other hand, are not valid:</p>

<ul>
	<li>(0102,34): has a leading zero.</li>
	<li>(0,12340): has a non-positive integer.</li>
	<li>(10,243) and (12300,47): the list of digits in each of these pairs is not exactly equal to the given list of digits.</li>
</ul>

<p>Given the list of digits to use, what is the minimum absolute difference between the two built integers that can be achieved?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with a single string of digits D. Each character of D is a digit you must use.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from&nbsp;1) and&nbsp;y&nbsp;is the minimum possible absolute difference between the two integers built from&nbsp;D&nbsp;according to the rules above.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>Each character of D&nbsp;is a decimal digit.</li>
	<li>At least two characters of D&nbsp;are not&nbsp;<code>0</code>.</li>
</ul>

### 힌트

<p>The optimal pair of integers to build are 31 and 24 for Sample Case #1, 10 and 10 for Sample Case #2, 700 and 80 for Sample Case #3, and 89 and 90 for Sample Case #4.</p>
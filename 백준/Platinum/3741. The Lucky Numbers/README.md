# [Platinum IV] The Lucky Numbers - 3741

[문제 링크](https://www.acmicpc.net/problem/3741)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 정렬, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>John and Brus are freshmen at the primary school. Their first home task is to learn some integer numbers. It is not so hard for the guys and they decide to impress their teacher by learning all lucky numbers between A and B, inclusive.</p>

<p>As you already know from the previous year contest 4 and 7 are lucky digits, and all the other digits are not lucky. A lucky number is a number that contains only lucky digits in decimal notation.</p>

<p>After learning all lucky numbers in [A, B] range John and Brus still have some free time and now they decide to learn additionally each lucky number N that is out of [A, B] range, but the reversed number of N is in this range. Here reversed number of N is the number N written in decimal notation, but the order of digits is reversed. For example, the reversed number of 447 is 744 and reversed number of 774474444 is 444474477.</p>

<p>You are given integers A and B and your task is to find the total number of lucky numbers learned by John and Brus.</p>

### 입력

<p>The first line contains single integer T &ndash; the number of test cases. Each test case consists of a single line containing two integers A and B separated by a single space.</p>

### 출력

<p>For each test case print a single line containing the total number of lucky numbers learned by John and Brus.</p>

### 제한

<ul>
	<li>1 &le; T &le; 74</li>
	<li>1 &le; A &le; B &le; 100000000000000000000000000000000000000000000000 (10<sup>47</sup>)</li>
</ul>
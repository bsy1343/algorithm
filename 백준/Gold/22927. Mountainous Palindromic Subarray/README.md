# [Gold IV] Mountainous Palindromic Subarray - 22927

[문제 링크](https://www.acmicpc.net/problem/22927)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 120, 정답: 67, 맞힌 사람: 58, 정답 비율: 59.794%

### 분류

브루트포스 알고리즘, 두 포인터

### 문제 설명

<p>An array is <em>Mountainous</em> if it is strictly increasing, then strictly decreasing. Note that <em>Mountainous</em> arrays must therefore be of length three or greater.</p>

<p>A <em>Subarray</em> is defined as an array that can be attained by deleting some prefix and suffix (possibly empty) from the original array.&nbsp;</p>

<p>An array or subarray is a <em>Palindrome</em> if it is the same sequence forwards and backwards.</p>

<p>Given an array of integers, compute the length of the longest <em>Subarray</em> that is both <em>Mountainous</em> and a <em>Palindrome</em>.&nbsp;</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 10^6$), which is the number of integers in the array.</p>

<p>Each of the next $n$ lines contains a single integer $x$ ($1 \le x \le 10^9$). These values form the array. They are given in order.</p>

### 출력

<p>Output a single integer, which is the length of the longest <em>Mountainous Palindromic Subarray</em>, or $-1$ of no such array exists.</p>
# [Platinum V] Zrinka - 27548

[문제 링크](https://www.acmicpc.net/problem/27548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 35, 맞힌 사람: 29, 정답 비율: 61.702%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are given two arrays of length $n$ and $m$ respectively, which consist only of $0$&rsquo;s and $1$&rsquo;s.</p>

<p>Your task is to replace every zero with an even positive integer and every one with an odd positive integer. After replacements both arrays should be increasing and you can use each postive integers at most once.</p>

<p>As this would be to easy, you are asked to do it such that the largest number you use is as small as possible.</p>

<p>Given two arrays, output the minimum possible largest number that needs to be used.</p>

### 입력

<p>The first array is of length $n$ ($0 &le; n &le; 5\,000$), the second is of length $m$ ($1 &le; m &le; 5\,000$).</p>

<p>The first line consists of $n + 1$ integers, first being $n$, and others describing the first array.</p>

<p>The second line consists of $m + 1$ integers, first being $m$, and others describing the second array.</p>

### 출력

<p>The first and only line should contain a positive integer, the answer to the question above.</p>

### 힌트

<p>Clarification of the second example: One of the possible solutions is $(2, 3, 4, 5)$ and $(1, 6, 8, 9)$.</p>

<p>Clarification of the third example: One of the possible solutions is $(2, 3, 6, 8, 9)$ and $(4, 10, 12, 13)$.</p>
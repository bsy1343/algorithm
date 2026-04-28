# [Gold I] Maximum GCD - 28176

[문제 링크](https://www.acmicpc.net/problem/28176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 316, 정답: 115, 맞힌 사람: 84, 정답 비율: 33.333%

### 분류

수학, 애드 혹, 정수론

### 문제 설명

<p>Grammy has an array of length $n$. She recently learned about the concept of greatest common divisor(GCD). Recall that the GCD of an array is the maximum integer $d$ such that every element in the array is divisible by $d$. Grammy thinks that the GCD of an array should be as large as possible so that the array can be beautiful. </p>

<p>You want to help Grammy to make her array beautiful, so you decided to do some (possibly zero) modulo operations on each of the elements in the array. In other words, for each operation, you can choose a number $a_i$ ($1 \leq i \leq n$) in the array and choose another integer $x$, and then replace $a_i$ with $(a_i\bmod x)$. Since Grammy does not want $0$ to appear in her array, you cannot change $a_i$ into $0$ by doing the modulo operation. </p>

<p>Now, your task is to calculate the maximum GCD of the array after several (possibly zero) modulo operations. </p>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 10^5$), denoting the number of elements in the array. </p>

<p>The second line contains $n$ positive integers $a_i$ ($1 \leq a_i \leq 10^9$), denoting the initial elements of Grammy&#39;s array. </p>

### 출력

<p>Output a single integer, denoting the maximum GCD of the array after any number of modulo operations. </p>
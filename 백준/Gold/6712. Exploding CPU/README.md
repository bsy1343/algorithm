# [Gold I] Exploding CPU - 6712

[문제 링크](https://www.acmicpc.net/problem/6712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 17, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

수학, 정수론, 이분 탐색, 소수 판정, 런타임 전의 전처리, 에라토스테네스의 체

### 문제 설명

<p>The well known hardware manufacturing company Processors for Professors is about to release a highly specialized CPU with exceptional functionality in, amongst other areas, number theory. It has, for example, an instruction PFACT that takes one parameter and returns all prime factors of that parameter, with an outstanding execution speed. It has, however, one considerable problem. The scientists at the testing lab has just found out that the PFACT instruction for some special input values freaks out and makes the entire processor explode. Even though this could be an amusing effect, it is not the way it was intended to work. The skilled mathematicians have, by trial and error, found that the explosive numbers all share the same interesting number theoretic properties, which might be of help when troubleshooting.</p>

<p>An explosive number is a number x = p<sub>0</sub> p<sub>1</sub> p<sub>2</sub> ... p<sub>n</sub> where all pis are distinct prime numbers such that p<sub>i</sub> = A<sub>p<sub>i&minus;1</sub></sub> + B for i = 1, 2, . . . , n. n &ge; 3, p<sub>0</sub> &equiv; 1. A and B are always integers, and might be different for different explosive numbers.</p>

<p>For example, the processor will explode when factorizing the number 4505, because 4505 = 1 &middot; 5 &middot; 17 &middot; 53 and 5 = 3 &middot; 1 + 2, 17 = 3 &middot; 5 + 2 and 53 = 3 &middot; 17 + 2 and the numbers 5, 17 and 53 are all prime numbers. In this case A = 3 and B = 2.</p>

<p>You are kindly asked to write a computer program that will aid this company in estimating the impact of the errors, by calculating the amount of explosive numbers that exists within a given range of integers.</p>

### 입력

<p>The input starts with a row containing the number 0 &le; N &le; 100 of test cases that will follow. For each test case, there will be one row containing two integers, x<sub>L</sub> and x<sub>H</sub> separated by a single space. These numbers are such that 0 &le; x<sub>L</sub> &le; x<sub>H</sub> &le; 2, 000, 000, 000.</p>

### 출력

<p>For each test case, output the number of explosive numbers that exist in the range x<sub>L</sub> &le; x &le; x<sub>H</sub>.</p>
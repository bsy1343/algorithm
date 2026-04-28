# [Gold II] Yes, Prime Minister - 23148

[문제 링크](https://www.acmicpc.net/problem/23148)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 9, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Mr. Hacker&#39;s Department of Administrative Affairs (DAA) has an infinite amount of civil servants. Every integer is used as an ID (identification number) by exactly one civil servant. Mr. Hacker is keen on reducing overmanning in civil service, so he will only keep people with consecutive IDs in $[l, r]$, and dismiss all the others.</p>

<p>However, permanent secretary Sir Humphrey&#39;s ID is $x$, and he cannot be kicked out, so $l \leq x \leq r$ must hold. Mr. Hacker wants to be Prime Minister, so he demands that the sum of people&#39;s IDs $\sum_{i = l}^{r} i$ must be a prime number.&nbsp;</p>

<p>You, Bernard, need to make the reduction plan which meets the demands of both bosses. Otherwise, Mr. Hacker or Sir Humphrey will fire you.&nbsp;</p>

<p>Mr. Hacker would be happy to keep as few people as possible. Please calculate the minimum number of people left to meet their requirements.</p>

<p>A prime number $p$ is an integer greater than $1$ that has no positive integer divisors other than $1$ and $p$.</p>

### 입력

<p>The first line contains an integer $T$ ($1 \leq T \leq 10^6$), the number of test cases. Then $T$ test cases follow.</p>

<p>The first and only line of each test case contains one integer $x_i$ ($-10^7 \leq x_i \leq 10^7$), the ID of Sir Humphrey.</p>

### 출력

<p>For each test case, print a line with one integer: the minimal number of people kept if such a plan exists, or $-1$ otherwise.</p>
# [Platinum II] Special Numbers - 30861

[문제 링크](https://www.acmicpc.net/problem/30861)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 2048 MB

### 통계

제출: 529, 정답: 185, 맞힌 사람: 105, 정답 비율: 26.582%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Number theorist Dr. J is attracted by the beauty of numbers. When we are given a natural number $a = a_1a_2 \cdots a_n$ of $n$ digits and a natural number $k$, $a$ is called $k$-<em>special</em> if the product of all the digits of $a$, i.e. $a_1 \cdot a_2 \cdot a_3 \cdots a_n$ is divisible by $k$. Note that the number $0$ is always divisible by a natural number.</p>

<p>For example, if $a = 2349$ and $k = 12$, then the product of all the digits of $a$, $2 \cdot 3 \cdot 4 \cdot 9 = 216$ is divisible by $k = 12$, so the number $2349$ is $12$-special. If $a = 2349$ and $k = 16$, then the product of all the digits of $a$, $2 \cdot 3 \cdot 4 \cdot 9 = 216$ is not divisible by $k = 16$, so the number $2349$ is not $16$-special.</p>

<p>Given three natural numbers $k$, $L$, and $R$, write a program to output $z \bmod (10^9 + 7)$ where $z$ is the number of $k$- special numbers among numbers in the range $[L, R]$.</p>

### 입력

<p>Your program is to read from standard input. The input has one line containing three integers, $k$, $L$, and $R$ ($1 &le; k &le; 10^{17}$, $1 &le; L &le; R &le; 10^{20}$).</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain $z \bmod (10^9 + 7)$ where $z$ is the number of $k$-special numbers among the numbers in the range $[L, R]$, where both $L$ and $R$ are inclusive in the range.</p>
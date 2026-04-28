# [Platinum III] Double Up - 30529

[문제 링크](https://www.acmicpc.net/problem/30529)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 27, 정답 비율: 69.231%

### 분류

구현, 다이나믹 프로그래밍

### 문제 설명

<p>A Double Up game consists of a sequence of $n$ numbers $a_1, \ldots, a_n$, where each $a_i$ is a power of two. In one move one can either remove one of the numbers, or merge two identical adjacent numbers into a single number of twice the value. For example, for sequence $4,2,2,1,8$, we can merge the $2$s and obtain $4,4,1,8$, then merge the $4$s and obtain $8,1,8$, then remove the $1$, and, finally, merge the $8$s, obtaining a single final number, $16$. We play the game until a single number remains. What is the largest number we can obtain?</p>

### 입력

<p>The input consists of two lines. The first line contains $n$ ($1 \leq n \leq 1000$). The second line contains numbers $a_1, \ldots, a_n$, where $1\leq a_i\leq 2^{100}$ for each $i$.</p>

### 출력

<p>The ouput consists of a single line containing the largest number that can be obtained from the input sequence $a_1, \ldots, a_n$.</p>
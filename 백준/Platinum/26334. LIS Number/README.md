# [Platinum IV] LIS Number - 26334

[문제 링크](https://www.acmicpc.net/problem/26334)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 13, 맞힌 사람: 11, 정답 비율: 28.205%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리

### 문제 설명

<p>Let A be a sequence of integers. The LIS Number of A is the smallest positive integer L such that A can be obtained by concatenating L strictly increasing sequences. For example, the LIS Number of A = {1, 4, 4, 2, 6, 3} is 4, since we can obtain A as {1, 4} + {4} + {2, 6} + {3}, and there is no way to create A by concatenating 3 (or fewer) strictly increasing sequences. The LIS Number of a strictly increasing sequence is 1.</p>

<p>You are given a sequence of length N and an integer K. You want to transform the given sequence into a sequence with LIS Number K. The only operation you are allowed to do is to delete 0 or more numbers from the original sequence. Count how many ways you can do that. Two ways are different if the set of removed numbers (their indices/positions) are different.</p>

### 입력

<p>The first input line contains a positive integer, t, indicating the number of test cases. First line of each test case consists of two integers N (1 &le; N &le; 50,000) and K (1 &le; K &le; 10). The second line contains N integers of the sequence (separated by a single space). These integers will be between 0 and 100000, inclusive.</p>

### 출력

<p>For each test case, output the number of ways you can transform the given sequence of length N into a sequence with LIS Number K. Since the number of ways can be too large, output the result modulo 1,000,000,007.</p>
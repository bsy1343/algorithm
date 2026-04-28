# [Platinum IV] No Change - 9569

[문제 링크](https://www.acmicpc.net/problem/9569)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 303, 정답: 109, 맞힌 사람: 80, 정답 비율: 39.604%

### 분류

이분 탐색, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Farmer John is at the market to purchase supplies for his farm.  He has in his pocket K coins (1 &lt;= K &lt;= 16), each with value in the range 1..100,000,000.  FJ would like to make a sequence of N purchases (1 &lt;= N &lt;= 100,000), where the ith purchase costs c(i) units of money (1 &lt;= c(i) &lt;= 10,000).  As he makes this sequence of purchases, he can periodically stop and pay, with a single coin, for all the purchases made since his last payment (of course, the single coin he uses must be large enough to pay for all of these).  Unfortunately, the vendors at the market are completely out of change, so whenever FJ uses a coin that is larger than the amount of money he owes, he sadly receives no changes in return!</p><p>Please compute the maximum amount of money FJ can end up with after making his N purchases in sequence.  Output -1 if it is impossible for FJ to make all of his purchases.</p>

### 입력

<ul><li>Line 1: Two integers, K and N.</li><li>Lines 2..1+K: Each line contains the amount of money of one of FJ&apos;s coins.</li><li>Lines 2+K..1+N+K: These N lines contain the costs of FJ&apos;s intended purchases.</li></ul>

### 출력

<ul><li>Line 1: The maximum amount of money FJ can end up with, or -1 if FJ cannot complete all of his purchases.</li></ul>

### 힌트

<h4>Input Details</h4><p>FJ has 3 coins of values 12, 15, and 10.  He must make purchases in sequence of value 6, 3, 3, 2, 3, and 7.</p><h4>Output Details</h4><p>FJ spends his 10-unit coin on the first two purchases, then the 15-unit coin on the remaining purchases.  This leaves him with the 12-unit coin.</p>
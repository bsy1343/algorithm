# [Platinum II] Fibonaccis’ vouchers - 23603

[문제 링크](https://www.acmicpc.net/problem/23603)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 61, 정답: 16, 맞힌 사람: 16, 정답 비율: 29.630%

### 분류

수학, 다이나믹 프로그래밍, 매개 변수 탐색

### 문제 설명

<p>The school organizes a fair to commemorate Fibonaccis. Johnny is responsible for a gift shop, in which you can pay only using special vouchers, whose face values are Fibonacci numbers. Johnny has difficulty with processing such strange values and has decided to accept only exact payments with exactly $k$ vouchers, not necessarily of different face values. Now he needs to set the prices -- there are $n$ different items at the gift shop and Johhny wants to put a different price on each of them. Sometimes there are many ways to pay one price, in such a case Johnny counts this price only once. He calculated all the prices and now he wants to verify his calculations. To make it quick, it is enough to name the last, $n$-th price. Help Johnny -- write a program that, given $n$ and $k$, computes the $n$-th smallest price that can be paid using exactly $k$ vouchers.</p>

### 입력

<p>The first and only line of the input contains two integers $k$ and $n$ ($1\leq k \leq 100, 1 \leq n \leq 10^{18}$), separated by a single space.</p>

### 출력

<p>You should write a single integer in the first and only line of the output -- the $n$-th smallest number that can be paid with $k$ (not necessarily different) vouchers whose face values are Fibonacci numbers, assuming that this number is at most $10^{18}$, or &quot;<code>NIE</code>&quot; (Polish for &quot;no&quot;), if it is larger than $10^{18}$.</p>

### 힌트

<p>In Sample 1, using exactly $2$ vouchers it is not possible to pay the prices $1$ and $12$.</p>

<p>In Sample 2, the 100-th Fibonacci number is (much) greater than $10^{18}$.</p>
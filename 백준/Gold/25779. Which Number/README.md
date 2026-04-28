# [Gold I] Which Number - 25779

[문제 링크](https://www.acmicpc.net/problem/25779)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 110, 정답: 46, 맞힌 사람: 35, 정답 비율: 43.750%

### 분류

수학, 정수론, 이분 탐색, 포함 배제의 원리

### 문제 설명

<p>Natasha likes counting, but she has been told that a certain set of prime numbers are bad luck. Thus, she skips those numbers and all of their multiples entirely. For example, if 3, 5 and 11 are the primes she is avoiding, then when she starts counting, she&#39;ll list the following integers:</p>

<p>1, 2, 4, 7, 8, 13, 14, 16, 17, 19, 23, &hellip;</p>

<p>You are curious, what is the n th number Natasha will say?</p>

<p>Given the prime numbers whose multiples Natasha avoids, determine the n th number she will say when she starts counting from 1.</p>

### 입력

<p>The first input line contains two integers: n (1 &le; n &le; 10<sup>17</sup>), indicating the number for the query, and k (1 &le; k &le; 14), indicating the number of distinct prime numbers that Natasha avoids when counting (again, the multiples of these primes are avoided as well when counting). The second input line has k distinct prime numbers on it, representing the numbers (and multiples) which Natasha avoids. Assume that the product of all these primes will not exceed 10<sup>17</sup>, e.g., the list of prime numbers can be {2, 3, 5, 11} since their product (330) does not exceed 10<sup>17</sup> but the list of prime numbers will not be {1000000007, 1000000009} since their product exceeds 10<sup>17</sup>. Note that, as illustrated in the Sample Input, the primes can be listed in any order (i.e., they are not necessarily listed in increasing order).</p>

### 출력

<p>Print the n th number Natasha will say.</p>
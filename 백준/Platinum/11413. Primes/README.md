# [Platinum IV] Primes - 11413

[문제 링크](https://www.acmicpc.net/problem/11413)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 6, 맞힌 사람: 5, 정답 비율: 23.810%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 백트래킹, 확률론, 소수 판정, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p>Define a mass split operation for the multiset of positive integers K: for each integer k<sub>i</sub> in the multiset we will replace it with the pair d<sub>i</sub> and k<sub>i</sub>/d<sub>i</sub>, where d<sub>i</sub> is the random integer divisor of k<sub>i</sub>, which is greater than 1, and less than k<sub>i</sub>. If k<sub>i</sub> is prime, it remains untouched. All divisors can be chosen equiprobably.</p>

<p>For example, let&rsquo;s take the multiset {2, 10, 12, 12}. Then {2, 2, 3, 3, 4, 4, 5}, {2, 2, 2, 3, 4, 5, 6} and {2, 2, 2, 2, 5, 6, 6} will be the possible outcomes of the first mass split (first and third with probability 0.25, second with probability 0.5), and {2, 2, 2, 2, 2, 2, 3, 3, 5} will be the only possible outcome of the second mass split.</p>

<p>If we start with a multiset containing one integer N, find the expected number of mass splits needed to obtain a multiset with prime numbers only, where the expected number is the probability-weighted average of all possible values.</p>

### 입력

<p>First line of the input contains integer T (1 &le; T &le; 10<sup>4</sup>) &ndash; number of test cases. Each test case consists of one integer N &ndash; the starting multiset (2 &le; N &le; 10<sup>10</sup>).</p>

### 출력

<p>For each test case, print one number &ndash; the expected number of mass splits, with absolute or relative error not worse than 10<sup>-6</sup>.</p>
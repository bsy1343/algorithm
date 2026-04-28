# [Platinum III] Primorial vs LCM - 11790

[문제 링크](https://www.acmicpc.net/problem/11790)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 439, 정답: 112, 맞힌 사람: 86, 정답 비율: 25.444%

### 분류

수학, 정렬, 정수론, 이분 탐색, 소수 판정, 오프라인 쿼리, 에라토스테네스의 체

### 문제 설명

<p>Given N (2&lt;=N&lt;=10<sup>14</sup>), what is the quotient of LCM(1,2,3,....,N) divided by multiple of all primes up to N. As the result might be too big, output it&#39;s modulo by 1000000007.</p>

<p>For example, when N=5, the result is LCM(1,2,3,4,5)/(2*3*5)=60/30=2.</p>

<p>Note that LCM stands for Lowest or Least Common Multiple.&nbsp;</p>

### 입력

<p>The first line of the input is T(T &le; 50000), then T test cases follows in next T lines. Each line contains an integer N (2 &le; N &le; 100000000000000 or 10<sup>14</sup>). The meaning of N is given in the problem statement.&nbsp;</p>

### 출력

<p>For each test case print a line in &ldquo;Case x: S&rdquo; format where x is case number and S is the quotient modulo by 1000000007.&nbsp;</p>
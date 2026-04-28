# [Silver I] Repeating Goldbachs - 16424

[문제 링크](https://www.acmicpc.net/problem/16424)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 169, 정답: 115, 맞힌 사람: 101, 정답 비율: 67.785%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>The Goldbach Conjecture states that any even number greater than 3 can be expressed as the sum of two primes (primes are numbers that have exactly two factors: themselves and 1). It has never been proven for all even numbers, but it has been demonstrated to be true for all of the numbers that we&rsquo;ll use for this problem.</p>

<p>Consider any even integer x&gt;3. There may be many pairs of primes which sum to x. Take the pair with the largest difference. That difference must be even, and less than x. So, repeat the trick. How many steps does it take until you reach an even number less than 3 (2 or 0)?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will consist of a single line with a single integer x (0 &le; x &le; 10<sup>6</sup>, x is even).</p>

### 출력

<p>Output a single integer, which is the count of Repeating Goldbach steps until the number is less than 3.</p>
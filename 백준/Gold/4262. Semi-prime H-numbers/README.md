# [Gold IV] Semi-prime H-numbers - 4262

[문제 링크](https://www.acmicpc.net/problem/4262)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 39, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

수학, 정수론, 누적 합, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>This problem is based on an exercise of David Hilbert, who pedagogically suggested that one study the theory of 4n+1 numbers. Here, we do only a bit of that.</p>

<p>An H-number is a positive number which is one more than a multiple of four: 1, 5, 9, 13, 17, 21,... are the H-numbers. For this problem we pretend that these are the only numbers. The H-numbers are closed under multiplication.</p>

<p>As with regular integers, we partition the H-numbers into units, H-primes, and H-composites. 1 is the only unit. An H-number h is H-prime if it is not the unit, and is the product of two H-numbers in only one way: 1 &times; h. The rest of the numbers are H-composite.</p>

<p>For examples, the first few H-composites are: 5 &times; 5 = 25, 5 &times; 9 = 45, 5 &times; 13 = 65, 9 &times; 9 = 81, 5 &times; 17 = 85.</p>

<p>Your task is to count the number of H-semi-primes. An H-semi-prime is an H-number which is the product of exactly two H-primes. The two H-primes may be equal or different. In the example above, all five numbers are H-semi-primes. 125 = 5 &times; 5 &times; 5 is not an H-semi-prime, because it&#39;s the product of three H-primes.</p>

### 입력

<p>Each line of input contains an H-number &le; 1,000,001. The last line of input contains 0 and this line should not be processed.</p>

### 출력

<p>For each inputted H-number h, print a line stating h and the number of H-semi-primes between 1 and h inclusive, separated by one space in the format shown in the sample.</p>
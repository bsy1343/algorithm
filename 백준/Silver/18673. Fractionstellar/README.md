# [Silver I] Fractionstellar - 18673

[문제 링크](https://www.acmicpc.net/problem/18673)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 31, 맞힌 사람: 28, 정답 비율: 43.077%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>It&rsquo;s 2050. Humans have already colonized Mars and other planets long time ago and there are already some programs for travelling to the other galaxies using wormholes. Scientists are currently studying the mysteries of the black holes. Their observations concluded that everything we know about physics and mathematics is completely different inside the black hole. For example, do you remember the greatest common divisor (GCD) and the lowest common multiple (LCM)? These functions are normally defined only on integers. The situation is different inside the black hole; GCD and LCM are also defined on rational numbers. For two rational numbers a/b and c/d: their GCD is the greatest rational number that divides both numbers to an integer, and their LCM is the lowest rational number that both numbers divide to an integer. For example, GCD(1/2, 1/3) = 1/6 and LCM(1/2, 1/3) = 1/1. Can you help the scientists in their missions solving out the mysteries of the black holes? Given two rational numbers, find their GCD and LCM inside the black hole.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 1000). Followed by T test cases. Each test case contains four integers a, b, c, and d (1 &le; a, b, c, d &le; 2 &times; 10<sup>9</sup>) representing the two rational numbers a/b and c/d.</p>

### 출력

<p>For each test case, print a single line containing two rational numbers &lsquo;m/n&rsquo; and &lsquo;x/y&rsquo;, the GCD and the LCM of the two given rational numbers. m/n and x/y must be in their simplest form. In other words, the GCD(m, n) and GCD(x, y) must be 1.</p>
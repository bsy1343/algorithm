# [Platinum IV] Faulty Factorial - 15263

[문제 링크](https://www.acmicpc.net/problem/15263)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 329, 정답: 68, 맞힌 사람: 62, 정답 비율: 26.160%

### 분류

많은 조건 분기, 수학, 정수론

### 문제 설명

<p>The factorial of a natural number is the product of all positive integers less than or equal to it. For example, the factorial of 4 is 1 &middot; 2 &middot; 3 &middot; 4 = 24. A faulty factorial of length n is similar to the factorial of n, but it contains a fault: one of the integers is strictly smaller than what it should be (but still at least 1). For example, 1 &middot; 2 &middot; 2 &middot; 4 = 16 is a faulty factorial of length 4.</p>

<p>Given the length n, a prime modulus p and a target remainder r, find some faulty factorial of length n that gives the remainder r when divided by p.</p>

### 입력

<p>The first line contains three integers n, p and r (2 &le; n &le; 10<sup>18</sup>, 2 &le; p &lt; 10<sup>7</sup>, 0 &le; r &lt; p) &mdash; the length of the faulty factorial, the prime modulus and the target remainder as described in the problem statement</p>

### 출력

<p>If there is no faulty factorial satisfying the requirements output &ldquo;-1 -1&rdquo;. Otherwise, output two integers &mdash; the index k of the fault (2 &le; k &le; n) and the value v at that index (1 &le; v &lt; k). If there are multiple solutions, output any of them.</p>

### 힌트

<p>In the first example, the output describes the faulty factorial 1 &middot; 2 &middot; 2 &middot; 4 = 2<sup>4</sup> &equiv; 1(mod 5).</p>
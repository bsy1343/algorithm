# [Platinum V] Sum of a Function - 25853

[문제 링크](https://www.acmicpc.net/problem/25853)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 39, 맞힌 사람: 22, 정답 비율: 44.898%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Everyone knows that Arup loves prime numbers! This is why he teaches the cryptography course at UCF. Recently, Arup defined the following function on positive integers, n, greater than 1:</p>

<p>f(n) = the smallest prime factor of n</p>

<p>For example, f(14) = 2, f(15) = 3, f(16) = 2 and f(17) = 17.</p>

<p>Using this function, we can generate a sequence of terms f(s), f(s+1), f(s+2), &hellip;, f(e), where s designates the starting function input and e designates the ending function input.</p>

<p>Arup thinks these sequences are interesting, but what he&rsquo;s really curious about is finding the sum of the k minimum elements in one of these sequences. Can you write a program to help him?</p>

<p>Given s, e, and k, find the sum of the k minimum values in the sequence f(s), f(s+1), f(s+2), &hellip;, f(e).</p>

### 입력

<p>The first and only input line will contain three positive integers, s (2 &le; s &le; 10<sup>18</sup>), e (s+100 &le; e &le; s+10<sup>6</sup>), and k (1 &le; k &le; 0.9 * (e &ndash; s + 1)), representing (respectively) the starting function input, the ending function input, and the number of minimum terms to sum.</p>

### 출력

<p>On a line by itself, print the sum of the k minimum terms of the designated sequence.</p>

### 힌트

<p>Note: Even though the input specification does not allow &ldquo;<code>14 17 3</code>&rdquo; as an input case (i.e., this case will not be in the judge data), it is a simple case that you may want to use for testing purposes &ndash; the output (<code>7</code>) can be verified easily on paper. (BTW, the intended solution should solve this case properly anyway.)</p>
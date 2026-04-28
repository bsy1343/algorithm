# [Gold III] Palindromic Primes Category in Jeopardy! - 4495

[문제 링크](https://www.acmicpc.net/problem/4495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

브루트포스 알고리즘, 수학, 정수론, 런타임 전의 전처리, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Prime numbers are defined as follows: a number is prime if it is greater than 1 and is evenly divisible only by itself and 1. Note that by definition neither zero nor one is a prime number.</p>

<p>A palindromic number is one whose string representation is a palindrome, that is, a string that reads the same backwards and forwards.</p>

<p>You are on the clue crew preparing questions for the category &ldquo;Palindromic Primes&rdquo; and are to write a program to generate the answer and responding question in Jeopardy! style.</p>

### 입력

<p>The input file contains a series of number pairs (with white space separating them) specifying individual problems, ending with a pair of zeroes. The first number gives the number of digits for the numbers to be considered, the second number gives the base in which the numbers are to be generated. The numbers are separated by a single space. You are assured that all palindromic primes for this problem can be represented in the range of a standard 32-bit signed integer. The bases allowed are integer bases between 2 and 36 &mdash; with bases above base ten handled as extensions of hexadecimal. This means that the valid numeric digits are in the range [&lsquo;0&rsquo;..&lsquo;9&rsquo;] and [&lsquo;a&rsquo;..&lsquo;z&rsquo;].</p>

### 출력

<p>For each number, generate one line giving the number of digits and the base as the answer and then on the next line the number of palindromic primes found as the question as shown in the sample output. Each output pair should be separated by a blank line.</p>
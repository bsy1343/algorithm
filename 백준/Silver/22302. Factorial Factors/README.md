# [Silver III] Factorial Factors - 22302

[문제 링크](https://www.acmicpc.net/problem/22302)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 55, 맞힌 사람: 52, 정답 비율: 55.319%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p>The factorial of a number&nbsp;<code>N</code>, written&nbsp;<code>N!</code>, is the product of all integers between 1 and&nbsp;<code>N</code>, inclusively. For example, 5! = 120.</p>

<p>Every integer greater than 1 can be written as the product of 1 or more prime numbers, some of which may repeat. For example, 120 = 2 * 2 * 2 * 3 * 5.</p>

<p>For this problem, we are interested in the prime factorization of the factorial of a number. You will need to determine the number of total and distinct prime factors. For the example above, there are 5 total prime factors (2, 2, 2, 3, 5) and 3 distinct prime factors (2, 3, 5).</p>

### 입력

<p>The first line of input will contain the number of test cases,&nbsp;<code>C</code>&nbsp;(<code>1 &le; C &le; 50</code>). Each test case will consist of a single line containing an integer&nbsp;<code>N</code>&nbsp;(<code>2 &le; N &le; 100,000</code>).</p>

### 출력

<p>Each test case will result in a single line of output&nbsp;<code>D T</code>&nbsp;where&nbsp;<code>D</code>&nbsp;is the number of distinct prime factors of&nbsp;<code>N!</code>&nbsp;and&nbsp;<code>T</code>&nbsp;is the total number of prime factors of&nbsp;<code>N!</code>.</p>
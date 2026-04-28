# [Gold I] Divisor Function - 22718

[문제 링크](https://www.acmicpc.net/problem/22718)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 25, 맞힌 사람: 16, 정답 비율: 55.172%

### 분류

수학, 정수론, 런타임 전의 전처리

### 문제 설명

<p>Teiji is a number theory lover. All numbers are his friends - so long as they are integers. One day, while preparing for the next class as a teaching assistant, he is interested in a number-theoretical function called the&nbsp;<i>divisor function</i>. The divisor function&nbsp;<i>&sigma;</i>(<i>n</i>) is defined as the sum of all positive divisors of&nbsp;<i>n</i>. &ldquo;How fast does this&nbsp;<i>&sigma;</i>(<i>n</i>) grow?&rdquo; he asked himself. Apparently,&nbsp;<i>&sigma;</i>(<i>n</i>) grows fast as&nbsp;<i>n</i>&nbsp;increases, but it is hard to estimate the speed of the growth. He decided to calculate the maximum value of&nbsp;<i>&sigma;</i>(<i>n</i>)/<i>n</i>&nbsp;on 1 &le;&nbsp;<i>n</i>&nbsp;&le;&nbsp;<i>k</i>, for various&nbsp;<i>k</i>.</p>

<p>While it is easy for small numbers, it is tough to calculate many values of the divisor function by hand. Tired of writing thousands of digits, he decided to solve the problem with the help of a computer. But there is a problem: he is not familiar with computer programming. He asked you, a talented programmer, for help.</p>

<p>Please write a program to help him.</p>

### 입력

<p>The input contains a series of test cases. Each test case is described by a line, which contains a single integer&nbsp;<i>k</i>&nbsp;(1 &le;&nbsp;<i>k</i>&nbsp;&le; 10<sup>15</sup>&nbsp;). The input ends with a line containing a zero, which should not be processed.</p>

### 출력

<p>For each test case, output the maximum value of&nbsp;<i>&sigma;</i>(<i>n</i>)/<i>n</i>&nbsp;where 1 &le;&nbsp;<i>n</i>&nbsp;&le;&nbsp;<i>k</i>&nbsp;in a line. Each value should be printed with six digits after the decimal point, and should not contain an absolute error greater than 10<sup>-6</sup>.</p>
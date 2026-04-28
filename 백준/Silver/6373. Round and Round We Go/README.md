# [Silver III] Round and Round We Go - 6373

[문제 링크](https://www.acmicpc.net/problem/6373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 516, 정답: 150, 맞힌 사람: 132, 정답 비율: 34.109%

### 분류

수학, 구현, 문자열, 사칙연산, 시뮬레이션, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>A cyclic number is an integer n digits in length which, when multiplied by any integer from 1 to n, yields a &ldquo;cycle&rdquo; of the digits of the original number. That is, if you consider the number after the last digit to &ldquo;wrap around&rdquo; back to the first digit, the sequence of digits in both numbers will be the same, though they may start at different positions.</p>

<p>For example, the number 142857 is cyclic, as illustrated by the following table:</p>

<ul>
	<li>142857 &times; 1 = 142857</li>
	<li>142857 &times; 2 = 285714</li>
	<li>142857 &times; 3 = 428571</li>
	<li>142857 &times; 4 = 571428</li>
	<li>142857 &times; 5 = 714285</li>
	<li>142857 &times; 6 = 857142</li>
</ul>

<p>Write a program which will determine whether or not numbers are cyclic.</p>

### 입력

<p>The input file is a list of integers from 2 to 60 digits in length. (Note that preceding zeros should not be removed, they are considered part of the number and count in determining n. Thus, &ldquo;01&rdquo; is a two-digit number, distinct from &ldquo;1&rdquo; which is a one-digit number.)</p>

### 출력

<p>For each input integer, write a line in the output indicating whether or not it is cyclic.</p>
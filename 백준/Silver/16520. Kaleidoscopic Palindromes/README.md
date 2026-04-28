# [Silver III] Kaleidoscopic Palindromes - 16520

[문제 링크](https://www.acmicpc.net/problem/16520)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 104, 정답: 69, 맞힌 사람: 45, 정답 비율: 67.164%

### 분류

애드 혹, 구현, 수학, 정수론

### 문제 설명

<p>Nicholas Neverson was a student at Northlings Neverland Academy. As with any daydreaming student, Nicholas was playing around with a Kaleidoscope one day instead of paying attention to the teacher. Since this was math class, his daydreams quickly turned to palindromic numbers. A palindromic number is any number which reads the same forwards and backwards.</p>

<p>He describes his vision to you at lunch: numbers which are palindromic in several bases at once. Nicholas wonders how many such numbers exist. You decide you can quickly code up a program that given a range and a number k, outputs the number of numbers palindromic in all bases j, 2 &le; j &le; k, in that range.</p>

### 입력

<p>Input consists of three space-separated integers: a, b, and k. The input satisfies the following constraints:</p>

<ul>
	<li>0 &le; a &le; b &le; 2 000 000,</li>
	<li>2 &le; k &le; 100 000.</li>
</ul>

### 출력

<p>Output the quantity of numbers between a and b inclusive which are palindromes in every base j, for 2 &le; j &le; k.</p>
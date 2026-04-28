# [Gold III] ! - 22693

[문제 링크](https://www.acmicpc.net/problem/22693)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 42, 맞힌 사람: 33, 정답 비율: 35.870%

### 분류

수학, 정수론, 소인수분해

### 문제 설명

<p>You are one of ICPC participants and in charge of developing a library for multiprecision numbers and radix conversion. You have just finished writing the code, so next you have to test if it works correctly. You decided to write a simple, well-known factorial function for this purpose:</p>

<p>$$M! = \prod_{i=1}^{M}{i} = M \times (M - 1) \times \cdots \times 2 \times 1, 0! = 1\text{.}$$</p>

<p>Your task is to write a program that shows the number of trailing zeros when you compute&nbsp;<i>M</i>! in base&nbsp;<i>N</i>, given&nbsp;<i>N</i>&nbsp;and&nbsp;<i>M</i>.</p>

### 입력

<p>The input contains multiple data sets. Each data set is described by one line in the format below:</p>

<pre>
<i>N M</i>
</pre>

<p>where&nbsp;<i>N</i>&nbsp;is a decimal number between 8 and 36 inclusive, and&nbsp;<i>M</i>&nbsp;is given in the string repre- sentation in base&nbsp;<i>N</i>. Exactly one white space character appears between them.</p>

<p>The string representation of&nbsp;<i>M</i>&nbsp;contains up to 12 characters in base&nbsp;<i>N</i>. In case&nbsp;<i>N</i>&nbsp;is greater than 10, capital letters A, B, C, ... may appear in the string representation, and they represent 10, 11, 12, ..., respectively.</p>

<p>The input is terminated by a line containing two zeros. You should not process this line.</p>

### 출력

<p>For each data set, output a line containing a decimal integer, which is equal to the number of trailing zeros in the string representation of&nbsp;<i>M</i>! in base&nbsp;<i>N</i>.</p>
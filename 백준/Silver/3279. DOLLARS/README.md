# [Silver V] DOLLARS - 3279

[문제 링크](https://www.acmicpc.net/problem/3279)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 206, 정답: 155, 맞힌 사람: 119, 정답 비율: 81.507%

### 분류

그리디 알고리즘

### 문제 설명

<p>Dave somehow acquired exchange rates of US dollar to German marks for several days in the future. Write a program that will suggest Dave when to buy or sell marks or dollars so that, starting with 100 dollars he ends up with the highest possible amount of dollars at the end of the last day.</p>

### 입력

<p>The first line of input file contains a natural number N, 1 &le; N &le; 100, the number of future days for which Dave knows exchange rates.</p>

<p>Each of N following lines contains a natural number A, 1 &le; A &le; 100. Number A in the (i+1)th line denotes the medium exchange rate of ith day in advance. It tells Dave that on that day he will be able to either buys A marks for 100 USD or buy 100 USD for A marks.</p>

### 출력

<p>The first and only line of output file should contain a desired amount written to two decimal places.</p>

<p>Remark: Due to real arithmetic round off errors, results within error of 0.05 marks of correct value will be regarded as correct.</p>
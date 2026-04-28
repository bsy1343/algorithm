# [Gold I] Farey Sequence Length - 11525

[문제 링크](https://www.acmicpc.net/problem/11525)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 407, 정답: 263, 맞힌 사람: 244, 정답 비율: 69.318%

### 분류

수학, 정수론, 누적 합, 오일러 피 함수

### 문제 설명

<p>Given a positive integer, N, the sequence of all fractions a / b with (0 &lt; a  b), (1 &lt; b  N) and a and b relatively prime, listed in increasing order, is called the Farey Sequence of order N.</p>

<p>For example, the Farey Sequence of order 6 is:</p>

<p style="text-align: center;">0/1, 1/6, 1/5, 1/4, 1/3, 2/5, 1/2, 3/5, 2/3, 3/4, 4/5, 5/6, 1/1</p>

<p>For this problem, you will write a program to compute the length of the Farey sequence of order N (input).&nbsp;</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by the order N, N (2 &le; N &le; 10000), of the Farey Sequence whose length is to be found.</p>

### 출력

<p>For each data set there is a single line of output. The single output line consists of the data set number, K, followed by a single space followed by the length of the Farey Sequence as a decimal integer.</p>
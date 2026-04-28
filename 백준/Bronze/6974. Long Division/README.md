# [Bronze III] Long Division - 6974

[문제 링크](https://www.acmicpc.net/problem/6974)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 902, 정답: 566, 맞힌 사람: 489, 정답 비율: 67.541%

### 분류

수학, 사칙연산, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>In days of yore (circa 1965), mechanical calculators performed division by shifting and repeated subtraction. For example, to divide 987654321 by 3456789, the numbers would first be aligned by their leftmost digit (see (1) below), and the divisor subtracted from the dividend as many times as possible without yielding a negative number. The number of successful subtractions (in this example, 2) is the first digit of the quotient. The divisor, shifted to the right (see (2) below), is subtracted from the remainder several times to yield the next digit, and so on until the remainder is smaller than the divisor.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/6974.%E2%80%85Long%E2%80%85Division/d0bb9dec.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6974/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-13%20%EC%98%A4%ED%9B%84%204.01.00.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:310px; width:375px" /></p>

<p>Write a program to implement this method of division.</p>

### 입력

<p>The first line of the input file contains a positive integer n, n &le; 20, which represents the number of test cases which follow. Each test case is provided on a pair of lines, with the number on the first line being the dividend, and the number on the second line being the divisor. Each line will contain a positive integer of up to 80 digits in length.</p>

### 출력

<p>For each pair of input lines, your output file should contain a pair of lines representing the quotient followed by the remainder. Output for different test cases should be separated by a single blank line. Your output should omit unnecessary leading zeros.</p>

### 힌트

<p>If the dividend is n digits long and the divisor is m digits long, derive a formula in terms of n and m that approximates the maximum number of single-digit subtractions performed by your program.</p>
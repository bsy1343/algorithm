# [Bronze III] Decimal XOR - 25786

[문제 링크](https://www.acmicpc.net/problem/25786)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 432, 정답: 283, 맞힌 사람: 246, 정답 비율: 65.600%

### 분류

구현, 문자열

### 문제 설명

<p>The binary operation XOR accepts two binary digits as input and outputs a binary digit: if both input digits are 0 (or both are 1), the output is 0; otherwise the output is 1. We can look at this as: if both input values are low (or both are high), the output is 0; otherwise the output is 1.</p>

<p>Decimal numbers have several digits and each digit can be one of 10 values (0-9). We define the operation DEXOR (XOR of two decimal numbers) as follows: we DEXOR two decimal digits at a time; the two decimal digits at 1st position are DEXOR&rsquo;ed, the two decimal digits at 10th position are DEXOR&rsquo;ed, the two digits at 100th position are DEXOR&rsquo;ed, etc. When DEXOR&rsquo;ing two decimal digits, the result digit is 0 if both digits are too small (&le; 2) or both digits are too large (&ge; 7); the result digit is 9 otherwise.</p>

<p>Given two decimal numbers, compute their DEXOR.</p>

### 입력

<p>There are two input lines, each line providing a decimal number between 0 and 999,999 (inclusive). Assume that there will not be extra leading zeroes in an input number, i.e., there will not be extra zeroes at the beginning of a number in the input.</p>

### 출력

<p>Print the DEXOR of the two decimal numbers. When DEXOR&rsquo;ing two decimal numbers, if one has fewer digits, it should be considered as having zeros on the left to make both numbers having the same number of digits. The result should have as many digits as the larger number.</p>

### 힌트

<p>Note that, in the second Sample, 29 should be treated as 00029 so that it will have the same number of digits as the second number (so that they can be DEXOR&rsquo;ed digit-by-digit).</p>
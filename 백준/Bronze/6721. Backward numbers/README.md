# [Bronze III] Backward numbers - 6721

[문제 링크](https://www.acmicpc.net/problem/6721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 712, 정답: 539, 맞힌 사람: 489, 정답 비율: 76.050%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p><strong>Backward numbers</strong> are numbers written in ordinary Arabic numerals but the order of the digits is reversed. The first digit becomes the last, and vice versa. For example, the number 1245 becomes 5421. Note that all leading zeroes are omitted. This means that if the number ends with a zero, the zero is lost by the reversal; e.g., 1200 gives 21. Also note that the reversed numbers never have any trailing zeroes.</p>

<p>We need to calculate with backward numbers and your task is to write a program that can add two backward numbers and output their sum as a backward number. Of course, the result is not unique (e.g., 21 could be 12, 120, or 1200 before the reversal). Thus, we assume that no zeroes were lost in the reversal (e.g., we assume that the original number was 12).</p>

### 입력

<p>The input consists of N cases. The first input line contains only the integer N, and we assume that N &gt; 0. The follow the cases. Each case consists of exactly one line with two non-negative integers separated by a space. These are the reversed numbers you are to add.</p>

<p>We assume that all numbers are in the range 0 &le; n &lt; 10<sup>9</sup>.</p>

### 출력

<p>For each case, print exactly one line containing only one integer&mdash;the backward sum of the two backward numbers. Omit any leading zeroes in the output.</p>
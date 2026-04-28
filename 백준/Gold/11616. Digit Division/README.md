# [Gold III] Digit Division - 11616

[문제 링크](https://www.acmicpc.net/problem/11616)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 318, 정답: 152, 맞힌 사람: 129, 정답 비율: 47.080%

### 분류

수학, 정수론, 조합론

### 문제 설명

<p>We are given a sequence of n decimal digits. The sequence needs to be partitioned into one or more contiguous subsequences such that each subsequence, when interpreted as a decimal number, is divisible by a given integer m.</p>

<p>Find the number of different such partitions modulo 10<sup>9</sup> + 7. When determining if two partitions are different, we only consider the locations of subsequence boundaries rather than the digits themselves, e.g. partitions 2|22 and 22|2 are considered different.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n &le; 300 000, 1 &le; m &le; 1 000 000) &ndash; the length of the sequence and the divisor respectively. The second line contains a string consisting of exactly n digits.</p>

### 출력

<p>Output a single integer &ndash; the number of different partitions modulo 10<sup>9</sup> + 7.</p>
# [Platinum III] Number Sorting - 13793

[문제 링크](https://www.acmicpc.net/problem/13793)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

자료 구조, 다이나믹 프로그래밍, 세그먼트 트리, 정렬

### 문제 설명

<p>Consider sets of natural numbers. Some sets can be sorted in the same order numerically and lexicographically. {2, 27, 3125, 9000} is one example of such sets; {2, 27, 243} is not since lexicographic sorting would yield {2, 243, 27}.</p>

<p>Your task is to write a program that, for the set of integers in a given range [A, B] (i.e. between A and B inclusive), counts the number of non-empty subsets satisfying the above property. Since the resulting number is expected to be very huge, your program should output the number in modulo P given as the input.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset consists of a line with three integers A, B, and P separated by a space. These numbers satisfy the following conditions: 1 &le; A &le; 1,000,000,000, 0 &le; B &minus; A &lt; 100,000, 1 &le; P &le; 1,000,000,000.</p>

<p>The end of input is indicated by a line with three zeros.</p>

### 출력

<p>For each dataset, output the number of the subsets in modulo P.</p>
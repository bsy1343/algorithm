# [Gold I] Non-negative Partial Sums - 3841

[문제 링크](https://www.acmicpc.net/problem/3841)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 189, 정답: 67, 맞힌 사람: 52, 정답 비율: 40.625%

### 분류

자료 구조, 덱, 누적 합

### 문제 설명

<p>You are given a sequence of n numbers a<sub>0</sub>, . . . , a<sub>n&minus;1</sub>. A cyclic shift by k positions (0 &le; k &le; n &minus; 1) results in the following sequence: a<sub>k</sub>, a<sub>k+1</sub>, . . . , a<sub>n&minus;1</sub>, a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>k&minus;1</sub>. How many of the n cyclic shifts satisfy the condition that the sum of the first i numbers is greater than or equal to zero for all i with 1 &le; i &le; n?</p>

### 입력

<p>Each test case consists of two lines. The first contains the number n (1 &le; n &le; 10<sup>6</sup>), the number of integers in the sequence. The second contains n integers a<sub>0</sub>, . . . , a<sub>n&minus;1</sub> (&minus;1000 &le; a<sub>i</sub> &le; 1000) representing the sequence of numbers. The input will finish with a line containing 0.</p>

### 출력

<p>For each test case, print one line with the number of cyclic shifts of the given sequence which satisfy the condition stated above.</p>
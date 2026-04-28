# [Platinum II] Equal Numbers - 15135

[문제 링크](https://www.acmicpc.net/problem/15135)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 42, 맞힌 사람: 35, 정답 비율: 47.297%

### 분류

수학, 그리디 알고리즘, 정렬, 정수론

### 문제 설명

<p>You are given a list of n integers a<sub>1</sub>, . . . , a<sub>n</sub>. You can perform the following operation: choose some a<sub>i</sub> and multiply it by any positive integer.</p>

<p>Your task is to compute the minimum number of different integers that could be on the list after k operations for all 0 &le; k &le; n.</p>

### 입력

<p>The first line of the input contains single integer n (1 &le; n &le; 3&middot;10<sup>5</sup>). The second line of the input contains n integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>).</p>

### 출력

<p>Output a single line that contains n + 1 integers. The i-th integer should be the minimum possible number of different integers in the list after i &minus; 1 operations.</p>
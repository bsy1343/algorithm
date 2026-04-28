# [Silver II] Binary String - 12808

[문제 링크](https://www.acmicpc.net/problem/12808)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 64, 정답: 36, 맞힌 사람: 21, 정답 비율: 47.727%

### 분류

애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Peter had written a string of length n composed of 0-s and 1-s on a blackboard. After that he looked at all pairs of adjacent characters and found out that there are a pairs 00, b pairs 01, c pairs 10 and d pairs 11 (a + b + c + d = n - 1).</p>

<p>Bad boy Gregory has erased the string. After some sad thoughts Peter now wants to restore some string that has the same number for all types of adjacent pairs of characters. Help him!</p>

### 입력

<p>There are several tests in one input. The first line contains an integer t (1 &le; t &le; 10 000) &mdash; the number of tests.</p>

<p>Each test is described in one line that contains four integers: a, b, c and d (0 &le; a, b, c, d &le; 20) &mdash; the number of adjacent pairs 00, 01, 10 and 11, respectively.</p>

<p>It is guaranteed that a + b + c + d &ge; 1.</p>

### 출력

<p>Output t lines. For each test output the string that satisfies the conditions, or impossible if there is no such string.</p>

<p>&nbsp;</p>
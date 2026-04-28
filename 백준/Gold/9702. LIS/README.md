# [Gold I] LIS - 9702

[문제 링크](https://www.acmicpc.net/problem/9702)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 679, 정답: 250, 맞힌 사람: 188, 정답 비율: 39.662%

### 분류

가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Mr. C is interested with Longest Increasing Subsequence problem. Given a sequence S = s<sub>1</sub>, s<sub>2</sub>, &hellip;, s<sub>N</sub>. The Longest Increasing Subsequence is the subsequence L = l<sub>1</sub>, l<sub>2</sub>, &hellip;, l<sub>k</sub> of S such that l<sub>1</sub> &lt; l<sub>2</sub> &lt; &hellip; &lt; l<sub>k</sub>.&nbsp;</p>

<p>Given a sequence S, find the total length of LIS of every consecutive subsequence (subsequence which elements are consecutive in the original sequence) of S with non zero length!</p>

### 입력

<p>The first line of input consists of an integer T denotes the number of cases. It is followed by T blocks, each representing a case.</p>

<p>The first line of each case contains an integers: N (1 &le; N &le; 500), the length of S.</p>

<p>The next N lines each consists of an integer s<sub>i</sub> (1 &le; s<sub>i</sub> &le; N) denoting the i-th element of S. Each element of S is unique.</p>

### 출력

<p>Output consists of T lines, each describes the solution for each case with the same order as in input.</p>

<p>Each case consists of a single line with the format &ldquo;Case #i: S&rdquo;, where i represents the case number and S represents the total length of LIS of every consecutive subsequence of S.</p>
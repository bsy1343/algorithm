# [Platinum I] Hills And Valleys - 18564

[문제 링크](https://www.acmicpc.net/problem/18564)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Tauren has an integer sequence A of length n (1-based). He wants you to invert an interval [l, r] (1 &le; l &le; r &le; n) of A (that is, replace A<sub>l</sub>, A<sub>l+1</sub>, . . . , A<sub>r</sub> with A<sub>r</sub>, A<sub>r&minus;1</sub>, . . . , A<sub>l</sub>) to maximize the length of the longest non-decreasing subsequence of A. Find that maximal length and any inverting way to accomplish that mission.</p>

<p>A non-decreasing subsequence of A with length m could be represented as A<sub>x<sub>1</sub></sub>, A<sub>x<sub>2</sub></sub>, . . . , A<sub>x<sub>m</sub></sub> with 1 &le; x<sub>1</sub> &lt; x<sub>2</sub> &lt; . . . &lt; x<sub>m</sub> &le; n and A<sub>x<sub>1</sub></sub> &le; A<sub>x<sub>2</sub></sub> &le; . . . &le; A<sub>x<sub>m</sub></sub>.</p>

### 입력

<p>The first line contains one integer T, indicating the number of test cases.</p>

<p>The following lines describe all the test cases. For each test case:</p>

<p>The first line contains one integer n.</p>

<p>The second line contains n integers A<sub>1</sub>, A<sub>2</sub>, . . . , A<sub>n</sub> without any space.</p>

<p>1 &le; T &le; 100, 1 &le; n &le; 10<sup>5</sup>, 0 &le; A<sub>i</sub> &le; 9 (i = 1, 2, . . . , n).</p>

<p>It is guaranteed that the sum of n in all test cases does not exceed 2 &middot; 10<sup>5</sup>.</p>

### 출력

<p>For each test case, print three space-separated integers m, l and r in one line, where m indicates the maximal length and [l, r] indicates the relevant interval to invert.</p>

### 힌트

<p>In the first example, 864852302 after inverting [1, 8] is 032584682, one of the longest non-decreasing subsequences of which is 03588.</p>

<p>In the second example, 203258468 after inverting [1, 2] is 023258468, one of the longest non-decreasing subsequences of which is 023588.</p>
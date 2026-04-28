# [Platinum II] Difference - 8208

[문제 링크](https://www.acmicpc.net/problem/8208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 356, 정답: 96, 맞힌 사람: 76, 정답 비율: 30.645%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 누적 합

### 문제 설명

<p>A word consisting of n lower-case letters of the English alphabet (&#39;a&#39;-&#39;z&#39;) is given. We would like to choose a non-empty contiguous (i.e. one-piece) fragment of the word so as to maximise the difference in the number of occurrences of the most and the least frequent letter in the fragment. We are assuming that the least frequent letter has to occur at least once in the resulting fragment. In particular, should the fragment contain occurrences of only one letter, then the most and the least frequent letter in it coincide.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the standard input holds one integer n (1 &le; n &le; 1,000,000) that denotes the length of the word. The second line holds a word consisting of n lower-case letters of the English alphabet.</p>

<p>&nbsp;</p>

### 출력

<p>The first and only line of the standard output is to hold a single integer, equal to the maximum difference in the number of occurrences of the most and the least frequent letter that is attained in some non-empty contiguous fragment of the input word.</p>

<p>&nbsp;</p>

### 힌트

<p>The fragment that attains the difference of 3 in the number of occurrences of a and b is aaaba.&nbsp;</p>

<p>&nbsp;</p>
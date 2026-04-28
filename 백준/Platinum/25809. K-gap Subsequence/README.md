# [Platinum III] K-gap Subsequence - 25809

[문제 링크](https://www.acmicpc.net/problem/25809)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 16, 정답 비율: 64.000%

### 분류

이분 탐색, 값 / 좌표 압축, 자료 구조, 분할 정복, 다이나믹 프로그래밍, 세그먼트 트리

### 문제 설명

<p>A subsequence of a given sequence of integers is a subset of the values in the sequence in the same order. A k-gap subsequence of a sequence of integers is a subsequence such that consecutive elements in the subsequence differ by at least k. For example, the sequence</p>

<p><strong>3</strong>, <strong>12</strong>, <strong>8</strong>, <strong>4</strong>, 2, 5, 1, <strong>9</strong>, 8, 6, <strong>5</strong>, <strong>1</strong>, <strong>7</strong></p>

<p>has a 4-gap subsequence of 3, 12, 8, 4, 9, 5, 1 and 7 (highlighted in bold above) since</p>

<p>|3 - 12|, |12 - 8|, |8 - 4|, |4 - 9|, |9 - 5|, |5 - 1| and |1 - 7| are all 4 or greater.</p>

<p>Given a sequence and a value of k, determine the length of the longest k-gap subsequence.</p>

### 입력

<p>The first input line contains two space separated integers: n (1 &le; n &le; 300,000), indicating the length of the sequence, and k (1 &le; k &le; 10<sup>9</sup>), indicating the value of k for the input case.</p>

<p>The following input line contains n space separated integers. The ith of these integers is a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>), the ith value of the input sequence.</p>

### 출력

<p>Print the length of the longest k-gap subsequence of the input sequence.</p>
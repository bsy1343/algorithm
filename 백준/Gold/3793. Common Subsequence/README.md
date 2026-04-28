# [Gold V] Common Subsequence - 3793

[문제 링크](https://www.acmicpc.net/problem/3793)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 889, 정답: 282, 맞힌 사람: 232, 정답 비율: 41.727%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A subsequence of a given sequence is the given sequence with some elements (possible none) left out. Given a sequence X = &lt;x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>m</sub>&gt; another sequence Z = &lt;z<sub>1</sub>, z<sub>2</sub>, ..., z<sub>k</sub>&gt; is a subsequence of X if there exists a strictly increasing sequence &lt;i<sub>1</sub>, i<sub>2</sub>, ..., i<sub>k</sub>&gt; of indices of X such that for all j = 1,2,...,k, x<sub>i<sub>j</sub></sub> = z<sub>j</sub>. For example, Z = &lt;a, b, f, c&gt; is a subsequence of X = &lt;a, b, c, f, b, c&gt; with index sequence &lt;1, 2, 4, 6&gt;. Given two sequences X and Y the problem is to find the length of the maximum-length common subsequence of X and Y.</p>

### 입력

<p>The program input is from a text file. Each data set in the file contains two strings representing the given sequences. The sequences are separated by any number of white spaces.&nbsp;The length of string does not exceed 200.</p>

<p>The input data are correct.</p>

### 출력

<p>For each set of data the program prints on the standard output the length of the maximum-length common subsequence from the beginning of a separate line.</p>
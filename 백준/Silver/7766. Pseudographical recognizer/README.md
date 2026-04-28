# [Silver V] Pseudographical recognizer - 7766

[문제 링크](https://www.acmicpc.net/problem/7766)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 28, 맞힌 사람: 26, 정답 비율: 54.167%

### 분류

구현

### 문제 설명

<p>Let us define a pseudographical image to be a rectangular matrix of the characters &rsquo;<code>.</code>&rsquo;, &rsquo;<code>-</code>&rsquo;, &rsquo;<code>|</code>&rsquo;, &rsquo;<code>\</code>&rsquo;, and &rsquo;<code>/</code>&rsquo;.</p>

<p>The character &rsquo;<code>.</code>&rsquo; denotes empty space on the image. A horizontal line segment is given as a set of &rsquo;<code>-</code>&rsquo; characters in adjacent cells in the same row of the matrix. A vertical line segment is given as a set of &rsquo;<code>|</code>&rsquo; characters in adjacent cells in the same column of the matrix. Similarly, a diagonal line segment is given as a set of &rsquo;<code>/</code>&rsquo; or &rsquo;<code>\</code>&rsquo; characters in adjacent cells in the same diagonal of the matrix. Of course, a line segment going from Northwest to Southeast has to be given using the &rsquo;<code>\</code>&rsquo; characters and a line segment going from Southwest to Northeast using the &rsquo;<code>/</code>&rsquo; characters.</p>

<p>Write a program that, given a pseudographical image, determines if it contains exactly one line segment &ndash; horizontal, vertical, or diagonal.&nbsp;</p>

### 입력

<p>The input contains several test cases. The first line contains the number of test cases T (1 &le; T &le; 100). Next follow the descriptions of each test case. The first line of the test case description contains two integers N and M (1 &le; N, M &le; 10), the number of rows and columns of the matrix, respectively. Each of the following N lines of the description contains exactly M symbols &lsquo;<code>.</code>&rsquo;, &lsquo;<code>-</code>&rsquo;, &lsquo;<code>|</code>&rsquo;, &lsquo;<code>\</code>&rsquo;, or &lsquo;<code>/</code>&rsquo;.</p>

### 출력

<p>The output consists of T lines, one line per each test case. This line should contain the word CORRECT if the input image contains exactly one line segment, or the word INCORRECT otherwise.</p>
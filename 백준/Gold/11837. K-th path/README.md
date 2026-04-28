# [Gold II] K-th path - 11837

[문제 링크](https://www.acmicpc.net/problem/11837)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 13, 맞힌 사람: 11, 정답 비율: 57.895%

### 분류

다이나믹 프로그래밍, 그래프 이론, 애드 혹, 해 구성하기

### 문제 설명

<p>Suppose you have a table of N rows and M columns. Each cell of the table contains a single lowercase english letter. Consider any path from the top-left to the bottom-right cell of the table, if you are only allowed to move right and down. Letters in the cells met along the path form a string. This string is said to be the value of the path. Now consider all such possible paths and sort them by their values in alphabetical order. Your task is to find the value of the K-th path in this sorted list.</p>

### 입력

<p>The first line of the input file contains two integer numbers N &mdash; the number of rows and M &mdash; the number of columns of the given table (1 &le; N, M &le; 30). Each of the next N lines contains exactly M lowercase english letters. The last line of the input file contains a single integer K (1 &le; K &le; 10<sup>18</sup>). It is guaranteed that the answer exists for the given K.</p>

### 출력

<p>The first and only line of the output file must contain a single string &ndash; the answer to the problem.</p>
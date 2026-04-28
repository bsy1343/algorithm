# [Bronze I] Baza - 12115

[문제 링크](https://www.acmicpc.net/problem/12115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 211, 정답: 194, 맞힌 사람: 168, 정답 비율: 90.811%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Mirko got a summer internship in a big IT company. This company builds a large database consisting of N rows and M columns.</p>

<p>On his first day, Mirko received a total of Q queries. Each query consists of M numbers. However, some numbers got lost during transition, so they are denoted with -1. Mirko wants to know how many rows of the database correspond to the query, i.e., how many rows of t he database have identical numbers as the query, excluding -1.</p>

<p>For example, if the query is in the form of -1 3 2 ​, then we need to count the rows of the database that have any number ​in the first column, have the number 3 in the second column, and have the number 2​ in the third​ column.</p>

<p>Since he just started with his internship, Mirko needs your help. Help him and answer the queries!</p>

### 입력

<p>The first line of input contains N (1 &le; N &le; 10<sup>3</sup>) and M (1 &le; M &le; 10<sup>3</sup>), the size of the database.<br />
Each of the following N lines contains M numbers A<sub>ij</sub> (1 &le; A<sub>ij</sub> &le; 10<sup>6</sup>), the content of the database.<br />
The following line contains Q (1 &le; Q &le; 50), the number of queries.<br />
Each of the following Q lines contains M numbers B<sub>ij</sub> (B<sub>ij</sub> = -1 or 1 &le; B<sub>ij</sub> &le; 10<sup>6</sup>), the description of the i th query.</p>

### 출력

<p>The output must contain Q lines, each line containing X, the answer to the i th query from the task.</p>

### 힌트

<p>The first query asks how many rows have the number 2 in the third column. These are rows number 1 (1 5 2) and number 3 (4 3 2).<br />
The second query asks how many rows have the numbers 3 and 2 in the second and third column. This is only row number 3 (4 3 2).<br />
The third query asks how many rows are there in total, and the answer is obviously 4.</p>
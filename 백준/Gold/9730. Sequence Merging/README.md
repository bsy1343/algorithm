# [Gold IV] Sequence Merging - 9730

[문제 링크](https://www.acmicpc.net/problem/9730)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 110, 정답: 78, 맞힌 사람: 47, 정답 비율: 71.212%

### 분류

구현, 자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Initially, we have a given sequence a<sub>1</sub>,a<sub>2</sub>,a<sub>3</sub>,...,an. In each step, we can take any two adjacent integers a<sub>i</sub> and a<sub>i+1</sub> and replace them with max(a<sub>i</sub>,a<sub>i+1</sub>), thus resulting in a shorter sequence. The cost of this operation is max(a<sub>i</sub>,a<sub>i+1</sub>). After n-1 such steps, the sequence length becomes 1. Given a sequence, your task is to calculate the minimal cost required to make that sequence of length 1.&nbsp;</p>

### 입력

<p>The first line has a positive integer T, T &lt;= 100,000, denoting the number of test cases. This is followed by each test case per line.&nbsp;</p>

<p>Each test case consists of two lines. The first line contains a single integer N as the length of the sequence. N is between 2 and 5000 inclusive The next line contains N integers separated by a single space. Each of the numbers in the sequence is between 1 and 100,000 inclusive.&nbsp;</p>

### 출력

<p>For each test case, the output contains a line in the format Case #x: R, where x is the case number (starting from 1) and R is minimal cost to reduce the given sequence to a sequence of length 1.&nbsp;</p>
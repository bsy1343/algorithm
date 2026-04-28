# [Gold II] A Leapfrog in the Array - 30743

[문제 링크](https://www.acmicpc.net/problem/30743)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

수학

### 문제 설명

<p>Dima is a beginner programmer. During his working process, he regularly has to repeat the following operation again and again: to remove every second element from the array. One day he has been bored with easy solutions of this problem, and he has come up with the following extravagant algorithm.</p>

<p>Let&#39;s consider that initially array contains $n$ numbers from $1$ to $n$ and the number $i$ is located in the cell with the index $2i - 1$ (Indices are numbered starting from one) and other cells of the array are empty. Each step Dima selects a non-empty array cell with the maximum index and moves the number written in it to the nearest empty cell to the left of the selected one. The process continues until all $n$ numbers will appear in the first $n$ cells of the array. For example if $n = 4$, the array is changing as follows:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/95468ed3-e773-4fcf-ae55-89106342e5c5/-/preview/" style="width: 391px; height: 120px;" /></p>

<p>You have to write a program that allows you to determine what number will be in the cell with index $x$ ($1 \leq x \leq n$) after Dima&#39;s algorithm finishes.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($1 \leq n \leq 10^{18}$, $1 \leq q \leq 200\,000$), the number of elements in the array and the number of queries for which it is needed to find the answer.</p>

<p>Next $q$ lines contain integers $x_i$ ($1 \leq x_i \leq n$), the indices of cells for which it is necessary to output their content after Dima&#39;s algorithm finishes.</p>

### 출력

<p>For each of $q$ queries output one integer number, the value that will appear in the corresponding array cell after Dima&#39;s algorithm finishes.</p>
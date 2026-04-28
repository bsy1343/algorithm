# [Platinum III] Sub Matrix Sum - 26337

[문제 링크](https://www.acmicpc.net/problem/26337)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 누적 합

### 문제 설명

<p>You have written many programs to search mazes so matrix search shouldn&rsquo;t be any different, or will it?</p>

<p>An integer matrix with R rows and C columns has R(R-1)/2 &times; C(C-1)/2 sub matrices. We want to select a sub matrix with sum (the sum of all integers in it) greater than or equal to a given integer S. We want the size of the sub matrix to be the least possible. The size of a sub matrix is defined as the number of elements in that sub matrix (i.e., number of rows * number of columns in that sub matrix).</p>

### 입력

<p>The first input line contains a positive integer, t, indicating the number of test cases. The first line of each test case consists of three integers R, C (1 &le; R &le; 100,000; 1 &le; C &le; 100,000; 1 &le; R*C &le; 100,000) and S. Next R lines contain the description of the matrix. Each of these R lines contains C integers separated by a single space. All integers (other than R and C) are between -10<sup>9</sup> and +10<sup>9</sup>, inclusive.</p>

### 출력

<p>For each test case, output the size of the minimum sub matrix whose sum is greater or equal to the given S. If there is no such sub matrix, output -1.</p>
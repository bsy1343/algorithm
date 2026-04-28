# [Platinum I] Nonsense Time - 18587

[문제 링크](https://www.acmicpc.net/problem/18587)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 25, 맞힌 사람: 23, 정답 비율: 35.938%

### 분류

가장 긴 증가하는 부분 수열 문제, 수학, 확률론

### 문제 설명

<p>You a given a permutation p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> of size n. Initially, all elements in p are frozen. There will be n stages that these elements will become available one by one. On stage i, the element p<sub>k<sub>i</sub></sub> will become available.</p>

<p>For each i, find the longest increasing subsequence among available elements after the first i stages.</p>

### 입력

<p>The first line of the input contains an integer T (1 &le; T &le; 3), denoting the number of test cases.</p>

<p>In each test case, there is one integer n (1 &le; n &le; 50 000) on the first line, denoting the size of permutation.</p>

<p>In the second line of each test case, there are n distinct integers p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> (1 &le; p<sub>i</sub> &le; n), denoting the permutation.</p>

<p>In the third line of each test case, there are n distinct integers k<sub>1</sub>, k<sub>2</sub>, . . . , k<sub>n</sub> (1 &le; ki &le; n), describing each stage.</p>

<p>It is guaranteed that p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> and k<sub>1</sub>, k<sub>2</sub>, . . . , k<sub>n</sub> are generated uniformly at random among all possible permutations of the given size.</p>

### 출력

<p>For each test case, print a single line containing n integers, where the i-th integer denotes the length of the longest increasing subsequence among available elements after the first i stages.</p>
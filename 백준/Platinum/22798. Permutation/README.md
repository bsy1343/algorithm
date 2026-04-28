# [Platinum IV] Permutation - 22798

[문제 링크](https://www.acmicpc.net/problem/22798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 19, 맞힌 사람: 16, 정답 비율: 80.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Given a permutation of n elements (1, 2, ..., n): A = (a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>). We define a sequence P(A) = (p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n&minus;1</sub>) where p<sub>i</sub> = 0 if a<sub>i</sub> &gt; a<sub>i+1</sub> and p<sub>i</sub> = 1 if a<sub>i</sub> &lt; a<sub>i+1</sub>. Given a permutation B, find the number of all permutations C where P(C) = P(B) including the permutation B itself.</p>

### 입력

<p>The input text file contains several tests, each on a separate line. The first number in the test is n (0 &lt; n &le; 1024) followed by n numbers representing the permutation all of them separated by a single space. The last line in the input contains only 0 and should not be processed.</p>

### 출력

<p>The output should be written on the standard output. For each line in the input (excluding the last one, 0) you should write the result i.e. the number of the permutations having the same value for P(A) when given the permutation A.</p>

<p>You may assume the result is less than 2<sup>32</sup>.</p>
# [Platinum III] Best Tree - 18459

[문제 링크](https://www.acmicpc.net/problem/18459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 40, 맞힌 사람: 35, 정답 비율: 53.030%

### 분류

트리, 해 구성하기, 차수열

### 문제 설명

<p>You are given the degree sequence of a tree (degrees of all its vertices, in arbitrary order).</p>

<p>Among all trees with the given degree sequence, find a tree with the largest maximum matching.</p>

### 입력

<p>The first line of input contains one integer t (1 &le; t &le; 100 000): the number of testcases.</p>

<p>Next lines contain t descriptions of a test case.</p>

<p>The first line of each test case contains one integer n (2 &le; n &le; 200 000): the number of vertices.</p>

<p>The next line contains n integers d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>n</sub> (1 &le; d<sub>i</sub> &le; n &minus; 1), the degree sequence of a tree.</p>

<p>It is guaranteed that &Sigma;d<sub>i</sub> = 2(n &minus; 1) and that there is at least one tree with the given degree sequence.</p>

<p>Also, it is guaranteed that the total sum of n in all test cases is at most 200 000.</p>

### 출력

<p>For each test case, print one integer: the largest maximum matching among all trees with the given degree sequence.</p>

### 힌트

<p>In the first test case, you can construct a path with 10 vertices, it will have the same degree sequence and the largest possible maximum matching.</p>

<p>In the second test case, the only possible tree is a star (one vertex connected with all others), and the largest matching for it is 1.</p>
# [Platinum I] A Math Problem - 18731

[문제 링크](https://www.acmicpc.net/problem/18731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 22, 맞힌 사람: 21, 정답 비율: 27.632%

### 분류

조합론, 수학, 정수론

### 문제 설명

<p>Zenyk is given a sequence of n integers a<sub>1</sub>, . . . , a<sub>n</sub> and a sequence of m integers b<sub>1</sub>, . . . , b<sub>m</sub>. Both sequences contain only positive integers. You built a matrix of size n &times; m such that an element at the i-th row and the j-th column has value of LCM (least common multiple) of values a<sub>i</sub> and b<sub>j</sub>.</p>

<p>Now he wants to know how many pairs of sequences c and d are there that produce the same matrix.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 10<sup>5</sup>). The second line contains n integers a<sub>1</sub>, . . . , a<sub>n</sub>. The third line contains m integers b<sub>1</sub>, . . . , b<sub>m</sub> (1 &le; a<sub>i</sub>, b<sub>j</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>The number of pairs modulo 1 000 000 007 (10<sup>9</sup> + 7).</p>
# [Platinum V] Increasing subsequences - 7761

[문제 링크](https://www.acmicpc.net/problem/7761)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 런타임 전의 전처리

### 문제 설명

<p>A sequence p(1), p(2), &hellip;, p(N) consisting of numbers 1, 2, &hellip; , N is called a permutation if all elements in the sequence are different.</p>

<p>It is said that a permutation p contains increasing subsequence of k elements when there are numbers 1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &lt; &hellip; &lt; i<sub>k</sub> &le; N such that p(i<sub>1</sub>) &lt; p(i<sub>2</sub>) &lt; &hellip; &lt; p(i<sub>k</sub>).</p>

<p>When a permutation p contains an increasing subsequence consisting of B elements and does not contain an increasing subsequence consisting of B+1 elements then the number B is called the degree of increase of this permutation.</p>

<p>You need to write a program which being given a number N calculates the number of permutations whose degree of increase is B. Since the number of such permutations might be quite big, it is necessary to calculate its remainder of integer division by 1 000 000 000.&nbsp;</p>

### 입력

<p>The input consists of one line. The line contains two integer numbers N and B (1 &le; N &le; 40, 1 &le; B &le; 5) separated by one or more spaces.</p>

### 출력

<p>The output contains one integer number which is the remainder of integer division by 1 000 000 000 of the number of permutations whose degree of increase is B.&nbsp;</p>
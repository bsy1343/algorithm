# [Platinum II] Party - 8214

[문제 링크](https://www.acmicpc.net/problem/8214)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 328, 정답: 128, 맞힌 사람: 111, 정답 비율: 42.857%

### 분류

그래프 이론, 애드 혹, 해 구성하기

### 문제 설명

<p>Byteasar intends to throw up a party. Naturally, he would like it to be a success. Furthermore, Byteasar is quite certain that to make it so it suffices if all invited guests know each other. He is currently trying to come up with a list of his friends he would like to invite.</p>

<p>Byteasar has n friends, where n is divisible by 3. Fortunately, most of Byteasar&#39;s friends know one another. Furthermore, Byteasar recalls that he once attended a party where there were \( \frac {2}{3}n \) of his friends, and where everyone knew everyone else. Unfortunately, Byteasar does not quite remember anything else from that party... In particular, he has no idea which of his friends attended it.</p>

<p>Byteasar does not feel obliged to throw a huge party, but he would like to invite at least &nbsp;\( \frac {n}{3} \) of his friends. He has no idea how to choose them, so he asks you for help.</p>

### 입력

<p>In the first line of the standard input two integers, n and m (3 &le; n &le; 3,000, \( \frac {\frac {2}{3}n(\frac {2}{3}n - 1)}{2} &le; m &le; \frac {n(n-1)}{2} \)), are given, separated by a single space. These denote the number of Byteasar&#39;s friends and the number of pairs of his friends who know each other, respectively. Byteasar&#39;s friends are numbered from 1 to n. Each of the following m lines holds two integers separated by a single space. The numbers in line no. i+1 (for i=1,2,&hellip;,m) are a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; n), separated by a single space, which denote that the persons a<sub>i</sub> and b<sub>i</sub> know each other. Every pair of numbers appears at most once on the input.</p>

### 출력

<p>In the first and only line of the standard output your program should print \( \frac {n}{3} \) numbers, separated by single spaces, in increasing order. These number should specify the numbers of Byteasar&#39;s friends whom he should invite to the party. As there are multiple solutions, pick one arbitrarily.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8214/1.gif" style="height:108px; width:100px" /></p>

<p>Byteasar&#39;s friends numbered 1, 3, 4, 5 know one another. However, any pair of Byteasar&#39;s friends who know each other, like 2 and 4 for instance, constitutes a correct solution, i.e., such a pair needs not be part of aforementioned quadruple.</p>
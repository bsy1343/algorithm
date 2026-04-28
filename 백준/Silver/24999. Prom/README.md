# [Silver II] Prom - 24999

[문제 링크](https://www.acmicpc.net/problem/24999)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 48, 맞힌 사람: 37, 정답 비율: 67.273%

### 분류

이분 탐색, 정렬

### 문제 설명

<p>Johnny is getting ready for prom, which traditionally begins with a polonnaise dance. Any mixed pair (boy and girl) can lead the polonnaise, as long as they do not differ too much in height. More precisely, the difference in their heights cannot exceed $k$ byteometers. Jimmy wants to find out how many ways there are to choose the leading pair.</p>

<p>Write a program which reads the heights of all girls and boys, computes the number of possible leading pairs, and writes the result to standard output.</p>

### 입력

<p>The first line of input contains three space-separated integers $n$, $m$ and $k$ ($1 \le n, m \le 250\,000$, $0 \le k \le 1 \,000\,000\,000$), denoting the number of girls, the number of boys and the maximum possible difference of height in the leading pair, respectively.</p>

<p>The second line of input contains a sequence of $n$ space-separated integers $a_i$ ($1 \le a_i \le 1\,000\,000\,000$): the heights of girls, given in byteometers.</p>

<p>The third line of input contains a sequence of $m$ space-separated integers $b_i$ ($1 \le b_i \le 1\,000\,000\,000$): the heights of boys, given in byteometers.</p>

### 출력

<p>The first and only line of output should contain a single integer --- the number of possible leading pairs.</p>

### 힌트

<p>There are $11$ possible leading pairs: $(15,10)$, $(15,15)$, $(1,1)$, $(1,5)$, $(1,1)$, $(5,1)$, $(5,5)$, $(5,10)$, $(5,1)$, $(7,5)$ and $(7,10)$.</p>
# [Silver I] Network Saboteur - 7859

[문제 링크](https://www.acmicpc.net/problem/7859)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 23, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>A university network is composed of N computers. System administrators gathered information on the traffic between nodes, and carefully divided the network into two subnetworks in order to minimize traffic between parts.</p>

<p>A disgruntled computer science student Vasya, after being expelled from the university, decided to have his revenge. He hacked into the university network and decided to reassign computers to maximize the traffic between two subnetworks.</p>

<p>Unfortunately, he found that calculating such worst subdivision is one of those problems he, being a student, failed to solve. So he asks you, a more successful CS student, to help him.</p>

<p>The traffic data are given in the form of matrix C, where C<sub>ij</sub> is the amount of data sent between ith and jth nodes (C<sub>ij</sub> = C<sub>ji</sub>, C<sub>ii</sub> = 0). The goal is to divide the network nodes into the two disjointed subsets A and B so as to maximize the sum&nbsp;&sum;C<sub>ij</sub>&nbsp;(i&nbsp;&isin; A, j&nbsp;&isin; B).</p>

### 입력

<p>The first line of input file contains a number of nodes N (2 &le; N &le; 20). The following N lines, containing N space-separated integers each, represent the traffic matrix C (0 &le; C<sub>ij</sub> &le; 10000).</p>

### 출력

<p>Output file must contain a single integer &mdash; the maximum traffic between the subnetworks.</p>
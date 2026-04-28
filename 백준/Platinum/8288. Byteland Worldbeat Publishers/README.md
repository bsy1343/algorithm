# [Platinum II] Byteland Worldbeat Publishers - 8288

[문제 링크](https://www.acmicpc.net/problem/8288)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 13, 맞힌 사람: 13, 정답 비율: 23.636%

### 분류

그래프 이론, 애드 혹

### 문제 설명

<p>Byteasar is a manager in Byteland Worldbeat Publishers (BWP). There are n composers and m lyricists employed there. The artists work in pairs consisting of one composer and one lyricist.</p>

<p>Byteasar knows the skills of BWP employees. Thus he can assess how effective a composer-lyricist pair is going to be. The efficiency of each potential pair is measured as the number of songs written per week.</p>

<p>Byteasar wants to arrange the employees in min(n, m) disjoint pairs such that the number of songs produced is as high as possible. Unpaired artists will not work.</p>

<p>After the analysis of the whole data Byteasar suspects that the total number of songs produced in BWP during a week is independent of the paring. Byteasar is surprised, therefore he asks you to write a program to verify this observation.</p>

### 입력

<p>The first line of input contains one integer t (1 &le;&nbsp;t &le;&nbsp;10), i.e., the number of test cases that follow.</p>

<p>Each test case starts with a line with three integers n, m and k (1 &le; n, m &le;&nbsp;100,000, 1 &le;&nbsp;k &le; 300,000) that are the number of composers, the number of lyricists and the number of lines describing the efficiency of pairs. Composers are numbered from 1 to n, while lyricists are numbered from 1 to m.</p>

<p>Each of the next k subsequent lines contains four integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub> and p<sub>i</sub> (1 &le;&nbsp;a<sub>i</sub> &le; n, 1 &le; b<sub>i</sub> &le; c<sub>i</sub> &le; m, 1 &le;&nbsp;p<sub>i</sub> &le; 10<sup>9</sup>) with the meaning that a pair of composer a<sub>i</sub> and any lyricist from the range b<sub>i</sub> to c<sub>i</sub> (inclusive) will produce p<sub>i</sub> songs per week.</p>

<p>Each composer-lyricist pair will be described at most once. If a pair is not mentioned in the input, its members will be assumed to be skilled in incompatible music genres, thus the efficiency of their work will be 0 songs a week. Nevertheless such a pair can be formed in BWP.</p>

### 출력

<p>Your program should output t lines with answers for subsequent test cases. For each test case the answer is TAK (i.e., yes in Polish) if for each arrangement of min(n, m) pairs, the total efficiency is the same. Otherwise, the answer is NIE (no in Polish).</p>
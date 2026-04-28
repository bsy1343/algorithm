# [Platinum I] Lightning Conductor - 8204

[문제 링크](https://www.acmicpc.net/problem/8204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 180, 정답: 46, 맞힌 사람: 33, 정답 비율: 22.603%

### 분류

자료 구조, 이분 탐색, 집합과 맵, 분할 정복, 차분 배열 트릭

### 문제 설명

<p>Progressive climate change has forced the Byteburg authorities to build a huge lightning conductor that would protect all the buildings within the city. These buildings form a row along a single street, and are numbered from 1 to n.</p>

<p>The heights of the buildings and the lightning conductor are non-negative integers. Byteburg&#39;s limited funds allow construction of only a single lightning conductor. Moreover, as you would expect, the higher it will be, the more expensive.</p>

<p>The lightning conductor of height p located on the roof of the building i (of height hi) protects the building j (of height hj) if the following inequality holds:</p>

<p>\[&nbsp;h_j &le; h_i + p - \sqrt{|i-j|} \]</p>

<p>where |i-j| denotes the absolute value of the difference between i and j.</p>

<p>Byteasar, the mayor of Byteburg, asks your help. Write a program that, for every building i, determines the minimum height of a lightning conductor that would protect all the buildings if it were put on top of the building i.</p>

### 입력

<p>In the first line of the standard input there is a single integer n (1 &le; n &le; 500,000) that denotes the number of buildings in Byteburg. Each of the following n lines holds a single integer h<sub>i</sub> (0 &le; h<sub>i</sub> &le; 1,000,000) that denotes the height of the i-th building.</p>

### 출력

<p>Your program should print out exactly n lines to the standard output. The i-th line should give a non-negative integer p<sub>i</sub> denoting the minimum height of the lightning conductor on the i-th building.</p>
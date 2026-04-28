# [Platinum I] Bank - 11855

[문제 링크](https://www.acmicpc.net/problem/11855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 122, 정답: 51, 맞힌 사람: 48, 정답 비율: 52.174%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>N people came to some bank to get their salary of a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>N</sub> tenge. There are total M banknotes left in the bank with values b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>M</sub> tenge correspondently.</p>

<p>You need to determine whether bank is able to give exact salary to all people using given banknotes or not.</p>

### 입력

<p>First line of input file contains two integers N and M &mdash; number of people and number of banknotes. Second line contains N integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>N</sub> (1 &le; a<sub>i</sub> &le; 1000) &mdash; salary values. Third line contains M integer numbers b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>M</sub> (1 &le; b<sub>i</sub> &le; 1000) &mdash; values of banknotes .</p>

### 출력

<p>The output file must contain one word &laquo;YES&raquo;, if bank is able to pay salary. In opposite case output &laquo;NO&raquo;.</p>
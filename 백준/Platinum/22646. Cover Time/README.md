# [Platinum IV] Cover Time - 22646

[문제 링크](https://www.acmicpc.net/problem/22646)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그래프 이론, 휴리스틱

### 문제 설명

<p>Let&nbsp;<i>G</i>&nbsp;be a connected undirected graph where&nbsp;<i>N</i>&nbsp;vertices of&nbsp;<i>G</i>&nbsp;are labeled by numbers from 1 to&nbsp;<i>N</i>.&nbsp;<i>G</i>&nbsp;is simple, i.e.&nbsp;<i>G</i>&nbsp;has no self loops or parallel edges.</p>

<p>Let&nbsp;<i>P</i>&nbsp;be a particle walking on vertices of&nbsp;<i>G</i>. At the beginning,&nbsp;<i>P</i>&nbsp;is on the vertex 1. In each step,&nbsp;<i>P</i>&nbsp;moves to one of the adjacent vertices. When there are multiple adjacent vertices, each is selected in the same probability.</p>

<p>The&nbsp;<i>cover time</i>&nbsp;is the expected number of steps necessary for&nbsp;<i>P</i>&nbsp;to visit all the vertices.</p>

<p>Your task is to calculate the cover time for each given graph G.</p>

### 입력

<p>The input has the following format.</p>

<pre>
<i>N M</i>
<i>a</i><sub>1</sub> <i>b</i><sub>1</sub>
.
.
.
<i>a<sub>M</sub> b<sub>M</sub></i></pre>

<p><i>N</i>&nbsp;is the number of vertices and&nbsp;<i>M</i>&nbsp;is the number of edges. You can assume that 2 &le;&nbsp;<i>N</i>&nbsp;&le; 10.&nbsp;<i>a<sub>i</sub></i>&nbsp;and&nbsp;<i>b<sub>i</sub></i>&nbsp;(1 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>M</i>) are positive integers less than or equal to&nbsp;<i>N</i>, which represent the two vertices connected by the&nbsp;<i>i</i>-th edge. You can assume that the input satisfies the constraints written in the problem description, that is, the given graph&nbsp;<i>G</i>&nbsp;is connected and simple.</p>

### 출력

<p>There should be one line containing the cover time in the output.</p>

<p>The answer should be printed with six digits after the decimal point, and should not have an error greater than 10<sup>-6</sup>.</p>
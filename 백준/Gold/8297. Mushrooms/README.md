# [Gold IV] Mushrooms - 8297

[문제 링크](https://www.acmicpc.net/problem/8297)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 39, 맞힌 사람: 38, 정답 비율: 30.894%

### 분류

그리디 알고리즘

### 문제 설명

<p>A heavy rain has come to the Bytean Forest. Byteman - an eager mushroom hunter - has decided to take his chance and go mushrooming.</p>

<p>Byteman knows a nice path leading through the forest which contains several glades containing a lot of mushrooms. Every two consecutive glades in the path are equidistant - Byteman needs 15 minutes to walk between any pair of adjacent glades. Having arrived at a glade, Byteman - like any other self-respecting mushroom hunter - collects all mushrooms in this glade in no time. It is a well-known fact that mushrooms... spring up like a mushroom and it takes them only half an hour to grow back after they are collected.</p>

<p>Knowing the numbers of mushrooms growing on respective glades, the duration of Byteman&#39;s walk and assuming that he takes a route that maximizes his crops, find the number of mushrooms he will collect. Byteman can finish his walk at any point of the path.</p>

### 입력

<p>The first line of the standard input contains two integers <em>n</em>&nbsp;and <em>t</em>&nbsp;(1 &le; <em>n</em>, <em>t</em> &le; 1 000 000) which denote the number of glades in the path and the duration of Byteman&#39;s walk, in quarters. The second line contains a sequence of <em>n</em>&nbsp;integers <em>a<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 1 000 000), representing the numbers of mushrooms in consecutive glades of the path. Byteman starts his walk at the first of these glades. We assume that Byteman can collect mushrooms both just before the first and just after the <em>i</em>-th quarter of mushrooming.</p>

### 출력

<p>In the first and only line of the standard output your program should output one integer: the maximal number of mushrooms that can be collected by Byteman during his walk.</p>

### 힌트

<p>In the optimal Byteman&#39;s route, which takes him 60 minutes, he collects 18 mushrooms: 3 at time 0, 4 after 15 minutes, 3 after 30 minutes, 5 after 45 minutes and, finally, 3 after 60 minutes.</p>
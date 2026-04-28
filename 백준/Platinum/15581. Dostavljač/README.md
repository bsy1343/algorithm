# [Platinum II] Dostavljač - 15581

[문제 링크](https://www.acmicpc.net/problem/15581)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 38, 정답: 18, 맞힌 사람: 14, 정답 비율: 42.424%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 배낭 문제, 트리

### 문제 설명

<p>Ever since Kre&scaron;o started growing chili peppers, N restaurants all over Croatia showed interest in his peppers so they could enrich their dishes with real spice. Because of high demand, Kre&scaron;o decided to start working as a delivery guy of chili peppers.</p>

<p>The restaurants are denoted with numbers from 1 to N and are mutually connected with N - 1 roads such that traveling between any two restaurants is possible. Kre&scaron;o begins his journey in the restaurant denoted with 1. In one unit of time, he can either drive to the adjacent restaurant or deliver the peppers to the current restaurant. For each restaurant, we know the required amount of peppers A<sub>i</sub>.</p>

<p>Since delivering goods is tiring, Kre&scaron;o decided to spend a total of M units of time on delivery and travel, after which he plans to take a break.</p>

<p>Determine the maximal amount of peppers Kre&scaron;o can deliver in the given timeframe. You can assume that Kre&scaron;o always carries an unlimited supply of peppers.</p>

### 입력

<p>The first line of input contains two integers N and M (1 &le; N, M &le; 500), the number of restaurants and the time Kre&scaron;o plans to spend delivering peppers.</p>

<p>The second line of input contains N integers A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>6</sup>), the required amount of peppers for restaurants denoted with i (1 &le; i &le; N).</p>

<p>Each of the following N - 1 lines contains two integers U and V (1 &le; U, V &le; N, U &ne; V) that represent the road between restaurants U and V.</p>

### 출력

<p>You must output the maximal amount of peppers Kre&scaron;o can deliver in the given timeframe.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>In the first step, Kre&scaron;o will deliver the peppers to restaurant 1.</p>

<p>In the second step, Kre&scaron;o will travel to restaurant 3.</p>

<p>In the third step, Kre&scaron;o will deliver the peppers to restaurant 3.</p>

<p>He is left with 2 units of time, in which he can drive to restaurant 2, but he lacks one unit of time to deliver the peppers to that restaurant.</p>
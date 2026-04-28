# [Platinum III] Vera and Engineering Buildings - 15448

[문제 링크](https://www.acmicpc.net/problem/15448)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

다이나믹 프로그래밍, 트리, 비트마스킹, 게임 이론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>There are N engineering buildings at the University of Waterloo numbered from 1 to N. For i &ge; 2, there is a two-way bridge from building i to building xi. Two buildings are called neighbours if there is a bridge between them.</p>

<p>Each building has a unique aesthetic value which can be any integer. It is difficult to determine the exact aesthetic value of a building, so Vera would like to find a nice building, one that has higher aesthetic value than all of its neighbours. It takes Vera t<sub>i</sub> seconds to inspect building i and the bridges to all of its neighbours. After the inspection, for each neighbour j of building i, Vera will know which of building i or j has higher aesthetic value.</p>

<p>What is the minimum total seconds such that it is guaranteed that Vera can find a nice building in that time no matter what the aesthetic values are? Vera can decide which building to inspect next based on the results of previous inspections. Ignore the time needed to travel between buildings.</p>

### 입력

<p>Line 1 contains integer N (2 &le; N &le; 16).</p>

<p>Line 2 contains N integers t<sub>1</sub>, . . . , t<sub>N</sub> (1 &le; t<sub>i</sub> &le; 10<sup>8</sup>).</p>

<p>Line 3 contains N &minus; 1 integers x<sub>2</sub>, . . . , x<sub>N</sub> (1 &le; x<sub>i</sub> &lt; i).</p>

### 출력

<p>Print one line with one integer, the minimum total seconds that guarantees a nice building can be found.</p>

### 힌트

<p>For the first example, inspecting buildings 1 and 3 guarantees a nice building will be found.</p>

<p>For the second example, one optimal strategy is to always inspect building 3 first.</p>
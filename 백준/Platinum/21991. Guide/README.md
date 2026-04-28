# [Platinum IV] Guide - 21991

[문제 링크](https://www.acmicpc.net/problem/21991)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 33, 맞힌 사람: 28, 정답 비율: 50.000%

### 분류

구현, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Mister Gooti is the world-famous guide of The Freezing Isles. The topology of the Isles can be represented as a tree with cities at the vertices and two-way roads between them. Gooti prepares a new sightseeing tour over the Isles. He wants to find the shortest path that starts in the capital and visits $k$ different cities, including the capital. Please, help him.</p>

### 입력

<p>The first line of the input contains the number of tests $T$ ($1 \leq T \leq 100$). Each test consists of two lines. The first line contains the overall number of cities $n$ in the Isles and the requested number of cities $k$ for the tour ($1 \leq k \leq n \leq 100$). The second line contains the description of the tree in a rooted manner: $n - 1$ integers where the $i$-th integer, $p_i$, is the parent of the city $i + 1$ ($1 \leq p_i \leq i$). The capital is the city with the number $1$ --- the root of the tree.</p>

### 출력

<p>For each test, the first line of the output shall contain the length of the path $l$. The second line shall contain $l + 1$ integers --- the cities that lie on the path in the order of the traversal.</p>

### 힌트

<p>The following pictures illustrate all the three tests from the example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21991.%E2%80%85Guide/93755118.png" data-original-src="https://upload.acmicpc.net/d09966a7-f429-4d4e-ba76-0813dcd22352/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 518px; height: 175px;" /></p>
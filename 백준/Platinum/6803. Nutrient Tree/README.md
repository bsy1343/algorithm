# [Platinum IV] Nutrient Tree - 6803

[문제 링크](https://www.acmicpc.net/problem/6803)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 5, 맞힌 사람: 5, 정답 비율: 26.316%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 파싱, 문자열, 트리

### 문제 설명

<p>There is a binary tree with l leaves (1 &le; l &le; 50) where each leaf k has an amount of nutrients nk (1 &le; n<sub>k</sub> &le; 10, 000) that it produces.</p>

<p>The branches (which you can think of as edges) of this binary tree limit the maximum amount of nutrients that can flow to the root of the tree. You have X growth agents (1 &le; X &le; 2500) that can be used to increase the thickness of an edge or increase the nutrient production of a leaf node. Initially, each edge has a weight of 1 and if you give it w growth agents then it can transport (1 + w)<sup>2</sup> nutrients. Increasing the nutrient production of a leaf with initial value n<sub>k</sub> by s raises the nutrient production of that leaf to n<sub>k</sub> + s.</p>

<p>Notice that when edges meet, the amount of nutrient that flows is the sum of nutrients flowing along the incoming edges.</p>

<p>Find the maximum amount of nutrients you can transport to the root.</p>

### 입력

<p>The first line of input will be a description of the tree. This description can be defined recursively as either an integer n<sub>k</sub> (1 &le; n<sub>k</sub> &le; 10, 000) or as (T<sub>L</sub>T<sub>R</sub>) where T<sub>L</sub> and T<sub>R</sub> are descriptions of the left and right subtrees, respectively. The second line of input will be the integer X, the amount of growth agents you have.</p>

### 출력

<p>On one line, output the maximum amount of nutrients that can flow into the root of the tree.</p>
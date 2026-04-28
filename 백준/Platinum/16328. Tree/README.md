# [Platinum IV] Tree - 16328

[문제 링크](https://www.acmicpc.net/problem/16328)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 58, 맞힌 사람: 55, 정답 비율: 52.885%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>You are given a tree of n vertices, each with a unique number from 1 to n. A vertex has a color, black or white. Choose exactly m black vertices so that the length of the longest path between any of them is minimal.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; m &le; n &le; 100) &mdash; the number of vertices and the number of black vertices you have to choose.</p>

<p>The fourth line contains n integers p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> (0 &le; p<sub>i</sub> &le; 1). If the p<sub>i</sub> = 1, then the i-th vertex is black; otherwise, it is white. It is guaranteed that the number of black vertices is at least m. Each of the next n &minus; 1 lines contains two integers v<sub>i</sub> and u<sub>i</sub> (1 &le; v<sub>i</sub> , u<sub>i</sub> &le; n) meaning that there is an edge between v<sub>i</sub> and u<sub>i</sub>.</p>

<p>It is guaranteed that the input graph is a tree.</p>

### 출력

<p>Print a single integer &mdash; the answer to the task.</p>

### 힌트

<p>In the first example, the only option is to choose 1, 2, and 4. The maximum distance will be 2.</p>

<p>In the second example, you can choose 1, 3, 8, and 9. The maximum distance will be between 3 and 9.</p>
# [Gold IV] Bi‐coloring - 9719

[문제 링크](https://www.acmicpc.net/problem/9719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 49, 맞힌 사람: 42, 정답 비율: 67.742%

### 분류

그래프 이론, 그래프 탐색, 이분 그래프

### 문제 설명

<p>Given a graph determine how many ways you can color the graph with at most two colors. There cannot be an edge containing two vertices of the same color.</p>

### 입력

<p>First line of the input contains T the number of test cases. Each test case starts with a line containing two integers V(1&le;V&le;30) and E(0&le;E&le;1000). Each of the next E line contains two integers a, b (0&le;a&le;V‐1, 0&le;b&le;V‐1) denoting that there is a bidirectional edge between a and b. There will not be any self loop or duplicate edges. The last line of the input will be a blank.</p>

### 출력

<p>For each test case, output the number of ways you can color the graph with only two colors. If you cannot color the graph with at most two colors output ‐1.</p>
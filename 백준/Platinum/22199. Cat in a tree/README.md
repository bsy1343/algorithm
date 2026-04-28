# [Platinum I] Cat in a tree - 22199

[문제 링크](https://www.acmicpc.net/problem/22199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 41, 맞힌 사람: 32, 정답 비율: 34.409%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리

### 문제 설명

<p>A cat lives in a tree that has N nodes. She will demarcate her territory by &ldquo;marking&rdquo; some of the tree nodes. Marked nodes may not be closer to each other than distance D. Find the maximum number of nodes that the cat can mark.</p>

### 입력

<p>First line has two integers, N and D. The 0&rsquo;th node is the root node of the tree. Then follows N &minus; 1 lines, the i-th of which contain a single integer x<sub>i</sub> with 0 &le; x<sub>i</sub> &lt; i (starting with i = 1). This means that node x<sub>i</sub> is connected to node i.</p>

### 출력

<p>Output should contain one integer: the maximum number of nodes that can be marked.</p>

### 제한

<p>We always have 1 &le; N, D &le; 2 &middot; 10<sup>5</sup>. For subcases, the inputs have these further restrictions.</p>
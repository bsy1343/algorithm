# [Gold III] Burning Blocks - 35167

[문제 링크](https://www.acmicpc.net/problem/35167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

누적 합, 다이나믹 프로그래밍

### 문제 설명

<p>William and his friends are on a camping trip and have gathered some wooden blocks. Before nightfall, they stack these wooden blocks into $N$ stacks from left to right. The $i$-th stack has $W_i$ wooden blocks stacked on top of each other.</p>

<p>Each wooden block takes exactly one minute to burn. Once a wooden block is completely burnt, the fire will spread to all wooden blocks adjacent to it (the blocks immediately to its left, right, above, and below) and start burning them.</p>

<p>William starts burning from the outermost blocks, i.e. the blocks whose either left, right, or above side contains no blocks. Determine the total number of minutes required for all of the wood blocks to be completely burnt.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \le N \le 200000$). The second line contains $N$ integers representing $W_i$ ($0 \le W_i \le 10^9$), the number of wooden blocks in each stack.</p>

### 출력

<p>A single line representing the number of minutes required for all blocks to be completely burnt.</p>
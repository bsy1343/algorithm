# [Platinum IV] Bricks in the Wall - 26864

[문제 링크](https://www.acmicpc.net/problem/26864)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 26, 맞힌 사람: 26, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Bob is decorating a loft-style rectangular wall with bricks. The wall consists of $n \times m$ unit cells. Some cells are already occupied by bricks, while the remaining cells are empty.</p>

<p>Bob wants to add up to two more bricks to this wall. New bricks must have a width equal to $1$ unit and can have any positive integer length. Each brick can only be placed horizontally or vertically, so each new brick will occupy several consecutive empty cells in one row or in one column. Also, these two bricks must not intersect, i.e. occupy the same cell.</p>

<p>What is the maximum possible sum of lengths of at most two new bricks that Bob can add to this wall?</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$ and $m$ --- the height and the width of the wall ($1 \le n, m$; $n \cdot m \le 10^6$).</p>

<p>The next $n$ lines contain $m$ characters each, describing the wall. An occupied cell is denoted by &#39;<code>\#</code>&#39;, an empty cell is denoted by &#39;<code>.</code>&#39;.</p>

<p>It is guaranteed that the sum of $n \cdot m$ over all test cases does not exceed $10^6$.</p>

### 출력

<p>For each test case, print a single integer --- the maximum possible sum of lengths of at most two new bricks.</p>
# [Platinum III] Domino Swap - 32742

[문제 링크](https://www.acmicpc.net/problem/32742)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

구현, 애드 혹, 해 구성하기

### 문제 설명

<p>There is an $n$ by $m$ grid of black and white squares. In one operation, you can pick any two adjacent squares of the same color and swap the colors of both. For example, here is a valid sequence of two operations on a grid with $n=4$, $m=3$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32742.%E2%80%85Domino%E2%80%85Swap/fcc351ce.png" data-original-src="https://boja.mercury.kr/assets/problem/32742-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 150px; width: 715px;"></p>

<p>You are also given a target grid of $n$ by $m$ black and white squares. Perform at most $200nm$ operations on the starting grid to reach the target grid, or state that it is impossible to do so. You do not need to minimize the number of operations.</p>

<p>It can be shown that if there is a solution, there is one that uses at most $200nm$ operations.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 500$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \le n, m \le 50$) --- the number of rows and columns in the grid, respectively.</p>

<p>The $i$-th of the next $n$ lines contains $m$ characters describing the $i$-th row of the starting grid. The $j$-th of these is '\#' if the square at position $(i, j)$ is black, and '<code>.</code>' if the square at position $(i, j)$ is white.</p>

<p>The next $n$ lines describe the target grid in the same format as the starting grid.</p>

<p>It is guaranteed that the sum of $n\cdot m$ over all test cases does not exceed $2500$.</p>

### 출력

<p>For each test case, if there is no solution, output a single integer $-1$.</p>

<p>Otherwise, the first line of output for each test case should contain a single integer $k$ ($0 \le k \le 200nm$) --- the number of operations you will perform.</p>

<p>The next $k$ lines of output should each contain four integers $i_1$, $j_1$, $i_2$, and $j_2$ ($1 \le i_1, i_2 \le n$, $1 \le j_1, j_2 \le m$) --- the two adjacent squares $(i_1, j_1)$ and $(i_2, j_2)$ that are part of this operation.</p>

<p>If there are multiple solutions, print any.</p>

### 힌트

<p>Here is the sequence of $3$ operations described by the output of the first test case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32742.%E2%80%85Domino%E2%80%85Swap/e6f850b3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32742-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 90px;"></p>

<p>It is impossible to perform any operations in the second test case, so it is not possible to reach the target grid.</p>
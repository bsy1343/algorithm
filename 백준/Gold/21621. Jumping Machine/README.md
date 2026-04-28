# [Gold II] Jumping Machine - 21621

[문제 링크](https://www.acmicpc.net/problem/21621)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 37, 맞힌 사람: 25, 정답 비율: 65.789%

### 분류

다이나믹 프로그래밍, 배낭 문제, 수학

### 문제 설명

<p>Young inventor has created a new jumping machine. In order to test it, he brought it to the testing polygon. The polygon is an infinite square grid.</p>

<p>Initially, the machine is located in the cell $(0, 0)$. The machine has $n$ springs, the $i$-th spring has the force of $l_i$ and allows the machine to jump $l_i$ cells up or $l_i$ cells to the right. Therefore this spring allows the machine to get from cell $(x, y)$ either to cell $(x + l_i, y)$, or to cell $(x, y + l_i)$. After jumping, the spring is thrown back and cannot be reused. The machine can use the springs in any order.</p>

<p>During the tests the cells, that the machine will fly over, will be stained with machine oil. In order not to clean the grid after himself, the inventor has decided to put a protective mat on each cell the machine could potentially fly over.</p>

<p>Now the inventor is wondering how many protective mats he needs to bring to the test with him.</p>

### 입력

<p>The first line of input contains $n$ --- the number of springs that the machine has ($1 \le n \le 100$). The second line contains $n$ integers $l_i$ --- the springs forces ($l_i \ge 1$; $1 \le l_1 + l_2 + \dots + l_n \le {10}^6$).</p>

### 출력

<p>Output a single integer: the number of mats that inventor needs to bring.</p>

### 힌트

<p>All the cells that can get dirty when the machine jumps in the example test are colored orange one the figure below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c3175b28-a5da-4803-9e3e-72e99e7fafe2/-/preview/" style="width: 125px; height: 120px;" /></p>

<p style="text-align: center;">Cells that the machine can stain.</p>
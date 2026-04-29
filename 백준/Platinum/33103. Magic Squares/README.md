# [Platinum IV] Magic Squares - 33103

[문제 링크](https://www.acmicpc.net/problem/33103)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

매개 변수 탐색, 이분 탐색

### 문제 설명

<p>You have $N$ magic squares (numbered from $1$ to $N$). For each magic square, you can set the length of its side to any <strong>non-negative integers</strong>. The cost of each magic square is proportional to its area; magic square $i$ has a cost of $C_i$ per unit area. In other words, if the length of magic square $i$ is set to $k$, then it will cost you $k^2 \cdot C_i$.</p>

<p>You want to build a wall with a length of $D$ using these magic squares. You have to line up all your magic squares next to each other, and their total length has to be exactly $D$. The base of each magic square must fully touch the floor, i.e. you are not allowed to rotate the magic squares.</p>

<p>Determine the minimum total cost to build the wall.</p>

### 입력

<p>This problem has multiple test cases. The first line consists of an integer $T$ ($1 ≤ T ≤ 20$), which represents the number of test cases.</p>

<p>Each test case consists of two lines. The first line consists of two integers $N$ $D$ ($1 ≤ N ≤ 10\, 000$; $1 ≤ D ≤ 10^7$). The second line consists of $N$ integers $C_i$ ($1 ≤ C_i ≤ 10\, 000$).</p>

### 출력

<p>For each test case, output an integer in a single line representing the minimum total cost to build the wall.</p>
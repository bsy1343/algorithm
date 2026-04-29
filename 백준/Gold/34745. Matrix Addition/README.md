# [Gold III] Matrix Addition - 34745

[문제 링크](https://www.acmicpc.net/problem/34745)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 27, 맞힌 사람: 23, 정답 비율: 92.000%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>You are given an $N \times N$ matrix $A$ initialized with arbitrary values. You will receive $Q$ operations, each defined by five values: $R_1, C_1, R_2, C_2, V$. For each operation, you need to update the matrix by adding $V$ to all elements in the submatrix defined by the rows from $R_1$ to $R_2$ and the columns from $C_1$ to $C_2$.</p>

### 입력

<p>The first line contains two integers $N$ and $Q$, the matrix size and the number of operations. $(1 \leq N \leq 1\,000, 1 \leq Q \leq 200\,000)$</p>

<p>The next $N$ lines each contain $N$ integers, forming the initial matrix $A$. $(0 \leq A_{ij} \leq 100)$</p>

<p>Each of the next $Q$ lines contains five integers $R_1, C_1, R_2, C_2, V$, describing an operation to add $V$ to every element in the submatrix with rows $R_1$ to $R_2$ and columns $C_1$ to $C_2$ (1-based indices, and $1 \leq R_1 \leq R_2 \leq N, 1 \leq C_1 \leq C_2 \leq N, 0 \leq V \leq 100)$.</p>

### 출력

<p>Print the resulting matrix after performing all $Q$ operations: $N$ lines, each with $N$ integers<b><strong> </strong></b>separated by spaces.</p>
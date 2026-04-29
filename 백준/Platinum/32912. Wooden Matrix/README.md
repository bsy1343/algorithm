# [Platinum V] Wooden Matrix - 32912

[문제 링크](https://www.acmicpc.net/problem/32912)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 58, 정답: 32, 맞힌 사람: 25, 정답 비율: 60.976%

### 분류

그래프 이론, 애드 혹, 최소 스패닝 트리, 트리

### 문제 설명

<p>Consider a square matrix of size $n \times n$ consisting of non-negative integers. The matrix is symmetric with respect to the main diagonal, and the main diagonal itself contains only zeroes. Such a matrix is called <em>wooden</em> if there is an undirected tree $T$ on $n$ vertices with edges of positive lengths such that each cell $(i, j)$ of the matrix contains the distance between vertices $i$ and $j$ in this tree.</p>

<p>You are given a matrix. Check if it is wooden.</p>

### 입력

<p>The first line contains an integer $n$: the size of the matrix ($1 \le n \le 1000$). Each of the following $n$ lines contains $n$ integers $d_{i,j}$: the elements of the matrix ($0 \le d_{i,j} \le 10^9$). The matrix is symmetric with respect to the main diagonal. There are zeros on the main diagonal and strictly positive integers outside it.</p>

### 출력

<p>Print "<code>Yes</code>" or "<code>No</code>" depending on whether the matrix is wooden. Letter case does not matter.</p>
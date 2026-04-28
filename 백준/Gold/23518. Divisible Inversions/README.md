# [Gold IV] Divisible Inversions - 23518

[문제 링크](https://www.acmicpc.net/problem/23518)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 35, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

수학, 정수론

### 문제 설명

<p>Recently, Vasya learned how to calculate the number of inversions in a given permutation using Fenwick tree. However, Petya considers it an easy problem, so he decided to make a harder one. Petya asked Vasya to calculate the number of inversions such that the elements divide one another evenly. Formally, for the given permutation $(p_{1}, p_{2}, \ldots, p_{n})$, the task is to find the number of pairs of indices $(i, j)$ such that $i &lt; j$ and $p_{i}$ is a multiple of $p_{j}$.</p>

<p>Help Vasya solve this problem.</p>

### 입력

<p>The first line contains an integer $n$, the length of the permutation ($1 \le n \le 100\,000$). The second line contains $n$ space-separated integers $p_{i}$. It is guaranteed that the given integers form a permutation of integers from $1$ to $n$.</p>

### 출력

<p>Print one integer: the number of divisible inversions in the given permutation.</p>
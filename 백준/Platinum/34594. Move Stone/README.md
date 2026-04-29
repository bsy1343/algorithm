# [Platinum I] Move Stone - 34594

[문제 링크](https://www.acmicpc.net/problem/34594)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 97, 정답: 34, 맞힌 사람: 32, 정답 비율: 40.000%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>You are given an $n \times n$ grid. Each cell initially contains some number of stones, such that the total number of stones is exactly $n^2$.</p>

<p>In one move, you may take a single stone and move it to any other cell in the same row or the same column.</p>

<p>Your goal is to minimize the number of moves needed to make each cell contain exactly one stone.</p>

### 입력

<p>The first line contains an integer $n$, representing the size of the grid.</p>

<p>Followed by $n$ lines, the $i$-th of which contains $n$ integers, the $j$-th integer $a_{i,j}$ represents the number of stones in cell $(i, j)$.</p>

### 출력

<p>Output a single integer, the minimum number of moves required to make each cell contain exactly one stone.</p>

### 제한

<ul>
<li>$1 ≤ n ≤ 500$</li>
<li>$0 ≤ a_{i,j} ≤ n^2$</li>
<li>The initial number of stones is exactly equal to the number of cells on the board.</li>
</ul>
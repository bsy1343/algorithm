# [Platinum II] Bin Packing - 19343

[문제 링크](https://www.acmicpc.net/problem/19343)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 153, 정답: 42, 맞힌 사람: 25, 정답 비율: 32.051%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>You&#39;re given a collection of $n$ objects of weights $w_1, w_2, \ldots, w_n$. You have to pack all $n$ objects into the minimum number of bins under the constraint that the total weight of all the objects in any bin is bounded by $S$.</p>

### 입력

<p>The first line contains a pair of integers $n$ and $S$, where $1 \leq n \leq 24$ and $1 \leq S \leq 10^8$. &nbsp;The second line contains $w_1, w_2, \ldots, w_n$, where $1 \leq w_i \leq S$.</p>

### 출력

<p>The output is just the minimum number of bins required to pack the given objects.</p>

### 힌트

<p>The objects can be packed into three bins of size 10 as follows: [5,3], [6], [7]. It is impossible to pack them into two bins because their total size is 21.</p>
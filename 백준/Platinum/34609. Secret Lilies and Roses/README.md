# [Platinum I] Secret Lilies and Roses - 34609

[문제 링크](https://www.acmicpc.net/problem/34609)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 58, 정답: 31, 맞힌 사람: 29, 정답 비율: 51.786%

### 분류

수학, 애드 혹, 이분 탐색

### 문제 설명

<p>There are $n$ flowers arranged in a line from left to right, which are numbered from $1$ to $n$ in that order. Each flower is either a lily or a rose. For an integer $j$ between $0$ and $n$, inclusive, let $l_j$ denote the number of lilies among the leftmost $j$ flowers, and let $r_j$ denote the number of roses among the rightmost $n − j$ flowers.</p>

<p>Initially, only the number of flowers $n$ is provided to you. The types of the flowers are hidden. You can obtain information on the flowers by making queries. In one query, you can perform one of the following.</p>

<p><strong>Type query</strong>: Specify an integer $i$ between $1$ and $n$, inclusive. You will then receive the type of flower $i$.</p>

<p><strong>Multiply query</strong>: Specify an integer $j$ between $0$ and $n$, inclusive. You will then receive the value of $l_j \times r_j$.</p>

<p>Your task is to find an integer $k$ between $0$ and $n$, inclusive, for which $l_k = r_k$ by making a limited number of queries. You can assume that at least one such integer exists for the arrangement of the flower types. Note that you do not need to identify the type of each flower.</p>

### 입력



### 출력


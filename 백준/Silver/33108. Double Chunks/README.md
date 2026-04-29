# [Silver III] Double Chunks - 33108

[문제 링크](https://www.acmicpc.net/problem/33108)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 20, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

그리디 알고리즘, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>You have a chocolate bar consisting of $N$ chunks (numbered from $1$ to $N$). Chunk $i$ contains $A_i$ peanut bits. You can divide the chocolate bar into several pieces, with each piece consisting of one or more consecutive chunks. Each chunk can only be part of one piece. The total number of peanut bits in a piece is simply the sum of the peanut bits from each of its chunks.</p>

<p>A piece is considered a <em>double chunk</em> if and only if it consists of exactly two chunks. You are required to divide the chocolate bar into as many double chunks as possible, all having the same total number of peanut bits. Determine the maximum number of double chunks you can get while satisfying this requirement.</p>

### 입력

<p>The first line consists of an integer $N$ ($2 ≤ N ≤ 100\, 000$).</p>

<p>The second line consists of $N$ integers $A_i$ ($1 ≤ A_i ≤ 10^9$).</p>

### 출력

<p>Output a single integer representing the maximum number of double chunks you can get while satisfying the requirement.</p>
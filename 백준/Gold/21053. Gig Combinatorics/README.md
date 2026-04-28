# [Gold V] Gig Combinatorics - 21053

[문제 링크](https://www.acmicpc.net/problem/21053)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 178, 정답: 105, 맞힌 사람: 89, 정답 비율: 76.068%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Your friend T&oacute;ti is an aspiring musician. He has written $n$ songs, each of which has a <em>hype rating</em> of either $1$, $2$, or $3$. A higher hype rating means the song has more energy. T&oacute;ti is planning his first live performance and needs your help. He wants to know how many <em>setlists</em> he can make. A setlist consist of at least three songs, the first song must have hype rating $1$, the last song must have hype rating $3$, and all other songs must have hype rating $2$. T&oacute;ti also wants to play the songs in the same order he wrote them.</p>

<p>Given the hype rating of each of T&oacute;ti&#39;s songs in the order he wrote them, how many setlists can he make?</p>

### 입력

<p>The first line of input consists of an integer $n$ ($1 \leq n \leq 10^6$), the number of songs T&oacute;ti has written. The second line consists of $n$ integers, each in $\{1, 2, 3\}$, giving the hype ratings of the $n$ songs in the order they were written.</p>

### 출력

<p>Output the number of setlists T&oacute;ti can make. Since this number can be large, print it modulo $10^9 + 7$.</p>
# [Gold I] Flight Routes - 31057

[문제 링크](https://www.acmicpc.net/problem/31057)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 183, 정답: 125, 맞힌 사람: 99, 정답 비율: 65.132%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프

### 문제 설명

<p>Bessie recently discovered that her favorite pop artist, Elsie Swift, is performing in her new Eras Tour! Unfortunately, tickets are selling out fast, so Bessie is thinking of flying to another city to attend the concert. The Eras tour is happening in $N$ ($2\le N\le 750$) cities labeled $1\dots N$, and for each pair of cities $(i,j)$ with $i&lt;j$ there either exists a single direct flight from $i$ to $j$ or not.</p>

<p>A <em>flight route</em> from city $a$ to city $b$ ($a&lt;b$) is a sequence of $k\ge 2$ cities $a=c_1&lt;c_2&lt;\dots&lt;c_k=b$ such that for each $1\le i&lt;k$, there is a direct flight from city $c_i$ to city $c_{i+1}$. For every pair of cities $(i,j)$ with $i&lt;j$, you are given the parity of the number of flight routes between them (0 for even, 1 for odd).</p>

<p>While planning her travel itinerary, Bessie got distracted and now wants to know how many pairs of cities have direct flights between them. It can be shown that the answer is uniquely determined.</p>

### 입력

<p>The first line contains $N$.</p>

<p>Then follow $N-1$ lines. The $i$th line contains $N-i$ integers. The $j$th integer of the $i$th line is equal to the parity of the number of flight routes from $i$ to $i+j$.</p>

### 출력

<p>Output the number of pairs of cities with direct flights between them.</p>
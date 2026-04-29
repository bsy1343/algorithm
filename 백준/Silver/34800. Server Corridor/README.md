# [Silver IV] Server Corridor - 34800

[문제 링크](https://www.acmicpc.net/problem/34800)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 44, 정답: 33, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

그리디 알고리즘

### 문제 설명

<p>Audrey is system administrator for miHoYo! It is her job to manage the server room and keep her favorite video game, Honkai: Star Rail, up and running.</p>

<p>The miHoYo server room is broken up into a single corridor of sections, some of which have servers installed. Some of the servers are already turned on.</p>

<p>Audrey urgently needs to turn on more servers. However, the server room has bad ventilation, so if two servers in adjacent sections are both on, then the room will overheat.</p>

<p>Audrey cannot turn off servers that are already on. Compute the maximum number of servers Audrey can turn on from the ones that are currently off without causing the room to overheat.</p>

### 입력

<p>The first line of input contains a single integer, $n$ ($1 \le n \le 3 \cdot 10^5$).</p>

<p>The second line of input contains a ternary string $s$ of length $n$, representing the room. A character of <code>0</code> represents a section with no server, a character of <code>1</code> represents a section with a server that is off, and a character of <code>2</code> represents a section with a server that is on.</p>

<p>It is guaranteed that the server room is not currently overheating.</p>

### 출력

<p>Output a single number, the number of additional servers Audrey can turn on from the ones that are currently off.</p>
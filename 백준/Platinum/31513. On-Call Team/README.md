# [Platinum I] On-Call Team - 31513

[문제 링크](https://www.acmicpc.net/problem/31513)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 22, 맞힌 사람: 20, 정답 비율: 57.143%

### 분류

비트마스킹, 브루트포스 알고리즘, 홀의 결혼 정리

### 문제 설명

<p>An IT company has formed an on-call team of software engineers who will manage their backend services and make sure that these services run without interruption. When services go down, for each service that is down the on-call team must dispatch one member who is familiar with that service to take care of its issue. One team member can handle at most one service at a time. The company wants to evaluate the <em>robustness level</em> of the on-call team, which is defined as the maximum value $k$ such that any $k$ services that go down simultaneously can be handled by the on-call team.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \leq n \leq 3 \cdot 10^4$) and $m$ ($1\leq m \leq 20$), where $n$ is the number of engineers and $m$ is the number of backend services.</p>

<p>Each of the next $n$ lines contains a string of binary digits of length $m$, describing the $n$ software engineers&#39; familiarity with the $m$ services. The $j^{\text{th}}$ digit on the $i^{\text{th}}$ line is $1$ if software engineer $i$ is familiar with service $j$, and $0$ otherwise.</p>

<p>It is guaranteed that for each of the $m$ services there exists at least one software engineer who is familiar with it.</p>

### 출력

<p>Output a single integer, which is the robustness level of the on-call team.</p>
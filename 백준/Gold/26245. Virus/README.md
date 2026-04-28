# [Gold III] Virus - 26245

[문제 링크](https://www.acmicpc.net/problem/26245)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>The immune system of Sponge Bob is a rectangle $n\times m$ consisting of immune cells. Sponge Bob doesn&#39;t want to go to school tomorrow, so he needs to get sick.</p>

<p>In order to get sick he is ready to infect some of his immune cells with the ARVI virus. After initial infection, the virus propagation process takes place: every millisecond all healthy cells which have two or more infected neighbors become infected, and nothing happens with already infected cells. Here we consider two cells as neighbors if they share an edge. Sponge Bob will get sick only if all his immune cells will be infected. Since the infecting immune cells is quite painful, Sponge Bob wants to minimize the number of initially infected cells.</p>

<p>Find and output any example of the initial infection with the minimum possible number of infected cells, which leads to Sponge Bob&#39;s illness.</p>

### 입력

<p>The single line contains two integers $n$ and $m$ ($1\leq n, m\leq 10^3$) --- the size of Sponge Bob&#39;s immune system.</p>

### 출력

<p>Print a description of any initial infection with the minimum possible number of infected cells, which leads to Sponge Bob&#39;s illness. Output must contain $n$ lines of $m$ characters: $1$ if the corresponding cell of the immune system is initially infected, and $0$ otherwise. Do not separate the characters with spaces or other delimiters.</p>
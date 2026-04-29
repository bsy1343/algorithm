# [Bronze I] Golden Tickets - 33093

[문제 링크](https://www.acmicpc.net/problem/33093)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 74, 정답: 59, 맞힌 사람: 52, 정답 비율: 81.250%

### 분류

구현, 문자열, 브루트포스 알고리즘, 자료 구조, 집합과 맵

### 문제 설명

<p>There are $N$ teams participating in INC 2023. The team ranked in the $i$<sup>th</sup> position is team $S_i$, representing institution $T_i$. It is known that the top $M$ teams in INC 2023 are eligible to participate in The ICPC Asia Jakarta 2023.</p>

<p>Apart from the top $M$ teams, <em>Golden Tickets</em> are given to at most top $K$ teams for which their institutions are not in the top $M$ of INC 2023. However, only <strong>at most one</strong> Golden Ticket will be given to each institution, and only the team with the highest rank in INC 2023 from each institution qualifies for the Golden Ticket. These Golden Tickets will allow them to participate in The ICPC Asia Jakarta 2023.</p>

<p>Determine the number of teams that will receive the Golden Tickets. Then, output the name of the teams that receive those Golden Tickets, sorted by the rank of the teams.</p>

### 입력

<p>The first line consists of three integers $N$ $M$ $K$ ($1 ≤ M, K ≤ N ≤ 100$).</p>

<p>Each of the next $N$ lines consists of two string $S_i$ $T_i$ ($1 ≤ |S_i |, |T_i | ≤ 10$) separated by a whitespace. All strings consist of upper case letters. There are no teams with the same name. Formally, $S_i \ne S_j$ for $1 ≤ i &lt; j ≤ N$.</p>

### 출력

<p>The first line consists of an integer, representing the number of teams that will receive the Golden Tickets. Denote this number as $X$.</p>

<p>Then, output $X$ lines, each consisting of the name of the teams that receive those Golden Tickets, sorted by their rank. If $X = 0$, then you do not need to print any names.</p>

### 힌트

<p>Disclaimer</p>

<p>All team names and institution names in the samples are fictional. Any similarities with actual participants in INC 2023 are purely coincidental.</p>
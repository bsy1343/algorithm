# [Gold II] Calendar - 19169

[문제 링크](https://www.acmicpc.net/problem/19169)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 30, 맞힌 사람: 28, 정답 비율: 30.769%

### 분류

애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Handy Smurf created his newest invention: nanobot calendar. &nbsp;It obviously consists of nanobots showing current date. Every day in order to switch current date they have to perform a cyclic rotation by $k$ places (so that nanobot that was initially at position $i$ is now at position $(i+k) \bmod n$, nanobots are indexed from $0$). &nbsp;However, nanobots can only understand one command:&nbsp;<code>reverse</code>&nbsp;$l r$ which reverses positions of all nanobots at positions between $l$ and $r$ (so that nanobot that was initially at position $l$ is now at $r$, the one that was at $l+1$ is now at $r-1$ and so on). &nbsp;Help Handy write an algorithm for updating the date with minimum number of commands issued.</p>

### 입력

<p>First and only line of input contains two integers $n$ and $k$ ($1 \leq n \leq 10^9$, $0 \leq k &lt; n$), specifying the number of nanobots and number of places to rotate.</p>

### 출력

<p>First line of output should contain integer $m$ -- the number of <code>reverse</code>&nbsp;commands used. On each of the next $m$ lines output two integers $a$ and $b$ ($0 \leq a \leq b &lt; n$) which means that the next command is <code>reverse</code>&nbsp;$a b$.</p>
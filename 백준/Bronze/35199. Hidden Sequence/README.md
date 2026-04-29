# [Bronze I] Hidden Sequence - 35199

[문제 링크](https://www.acmicpc.net/problem/35199)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 25, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

구현

### 문제 설명

<p>Three players are having a game night, playing a long sequence of different games. In each game, one of the three players wins. In order to keep track of the order of winners, each of the three players decides to keep a list of all winners in order. However, due to the dopamine rush as the result of winning a game, everyone always forgets to write themselves on their own list of winners. Thus, the list of player $1$ only contains the order in which players $2$ and $3$ won the different games, the list of player $2$ only contains the order in which players $1$ and $3$ won, and the list of player $3$ only contains the order in which players $1$ and $2$ won.</p>

<p>Given these three lists, determine the actual order in which all three players won their games.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>Three lines, the $i$th of which contains a string $s_i$ ($1 \leq |s_i| \leq 10^5$), the order in which the two players different from $i$ won their games.</li>
</ul>

<p>It is guaranteed that it is always possible to determine the unique order in which all three players won their games.</p>

### 출력

<p>Output a single string containing the order in which all three players won their games.</p>
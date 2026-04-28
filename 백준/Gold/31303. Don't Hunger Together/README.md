# [Gold III] Don't Hunger Together - 31303

[문제 링크](https://www.acmicpc.net/problem/31303)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 83, 정답: 18, 맞힌 사람: 16, 정답 비율: 35.556%

### 분류

이분 탐색, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Ashley and Brandon are designing a survival video game called Don&#39;t Hunger Together. The game works as follows:</p>

<p>The game proceeds as a number of turns. Each turn consists of a day followed by a night. Several players have to survive for many turns in the wilderness. They collect food in the daytime and eat at night. During the daytime, they can scavenge up to a maximum amount of food, and the food found on that day must be eaten by some night in the future. Any leftover such food goes bad and is inedible. Each night, every player must eat a certain quantity of food, otherwise they will die of hunger. They win if every player is able to eat enough food on each of the nights.</p>

<p>Ashley and Brandon have designed a scenario and the last thing they need to do is pick the quantity of food that each player must eat every night. They wish to know the maximum possible value of this quantity, which must be positive. However, if the game is not winnable for any positive value, please let Ashley and Brandon know the scenario is impossible!</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 10^6$) and $k$ ($1 \le k \le 39$), where $n$ is the number of turns in the game, and $k$ is the number of players. The turns are numbered from $1$ to $n$.</p>

<p>Each of the next $n$ lines contains two integers $q$ ($0 \le q \le 10^9$) and $f$ ($i \le f \le n$), where $q$ is the quantity of food that can be scavenged on that turn&#39;s day, $f$ is the future turn&#39;s night after which the food goes bad, where $i$ is the turn number. The turns are listed in order from $1$ to $n$. </p>

### 출력

<p>Output a single real number, which is the maximum positive quantity of food each player can eat on each night and still survive the scenario, or $-1$ if the situation is not winnable for any positive value. Any answer within an absolute or relative error of $10^{-9}$ will be accepted.</p>
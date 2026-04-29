# [Gold III] Floor is Lava - 34469

[문제 링크](https://www.acmicpc.net/problem/34469)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 46, 정답: 21, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>You’re trapped in a scorching dungeon with $N$ rooms numbered from 1$ $to $N$ connected by $M$ tunnels. The i$$-th tunnel connects rooms $a_i$ and $b_i$ in both directions, but the floor of the tunnel is covered in lava with temperature $c_i$.</p>

<p>To help you navigate the lavatic tunnels, you are wearing a pair of heat-resistant boots that initially have a chilling level of $0$. In order to step through lava with temperature $\ell$, your boots must have the same chilling level $\ell$; if the chilling level is too low then the lava will melt your boots, and if it’s too high then your feet will freeze as you cross the tunnel.</p>

<p>Luckily, when you’re standing in a room, you can increase or decrease the chilling level of your boots by $d$ for a cost of $d$ coins. You start in room $1$ and would like to reach the exit which you know is located in room $N$. What is the minimum cost to do so?</p>

### 입력

<p>The first line of input contains two integers $N$ and $M$ ($1 ≤ N, M ≤ 200\, 000$).</p>

<p>The next $M$ lines each contain three integers $a_i$, $b_i$, and $c_i$ ($1 ≤ a_i , b_i ≤ N$, $a_i \ne b_i $, $1 ≤ c_i ≤ 10^9$), describing the $i$-th tunnel.</p>

<p>There is at most one tunnel connecting any pair of rooms, and it is possible to reach all other rooms from room $1$.</p>

### 출력

<p>Output the minimum cost (in coins) to reach room $N$ from room $1$.</p>
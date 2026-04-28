# [Platinum I] Hotels - 20783

[문제 링크](https://www.acmicpc.net/problem/20783)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

수학, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 확률론, 포함 배제의 원리, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>Located at the easternmost tip of Shandon Peninsula, Weihai is one of the most famous tourist destinations all over China. There are beautiful hills, seas, bays, springs, islands, and beautiful beaches in Weihai. It is also a coastal city abundant in seafood, including prawn, sea cucumber, abalone, shellfish, and algae.</p>

<p>Attracted by the distinctive scenery and pleasant environment, three theoretical computer scientists plan to have a trip to Weihai. However, they cannot reach a consensus on accommodation, since some people prefer some hotels while other people like others. They decide to stay in possibly different hotels at night and meet in one hotel the next day. The hotel they meet may not necessarily be one of the hotels they stay in.</p>

<p>There are some roads connecting the hotels in Weihai. The roads are specially designed such that there is a unique path between every pair of hotels. Every theoretical computer scientist has prepared a list of candidate hotels before their trip starts. When they arrive in Weihai, each of them will uniformly and independently choose one hotel from the candidate hotel list. Also, they will meet in a hotel such that the total length of their routes is minimized. As a member of the theoretical computer science group, can you tell the expected total length of their routes?</p>

### 입력

<p>The first line of the input contains a single integer $n$ $(1 \leq n \leq 200\;000)$, denoting the number of hotels in Weihai. Then follow $n-1$ lines, describing the roads connecting the hotels. Each of the $n-1$ lines contains three integers $u, v, w$ $(1 \leq u, v \leq n, u \neq v, 1 \leq w \leq 1000)$, denoting a road of length $w$ connecting the hotels numbered $u$ and $v$. It is guaranteed that there is a unique path between every pair of hotels.</p>

<p>The last three lines of the input specify the candidate hotel lists, one for each theoretical computer scientist. Each line begins with a single integer $m$ $(1 \leq m \leq n)$ and $m$ distinct integers $a_1, a_2, \cdots, a_m$ $(1 \leq a_i \leq n)$, meaning that the candidate hotel list contains the hotels numbered $a_1, a_2, \cdots, a_m$.</p>

### 출력

<p>Print the expected total length of their routes within an absolute or relative error of no more than $10^{-6}$.</p>
# [Gold IV] Minas Gerais’ walls - 34781

[문제 링크](https://www.acmicpc.net/problem/34781)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>Due to their privileged location and favorable terrain, only frontal walls were usually necessary to protect medieval cities in Minas Gerais. Even today, it is possible to find traces of these constructions when admiring the beautiful horizon of the region.</p>

<p>Each of these walls was composed of a number of consecutive segments, each with an initial height measured in units, corresponding to the number of blocks used to build it.</p>

<p>From time to time, the builders reinforced the walls by choosing a segment and stacking extra blocks in a staircase pattern: the chosen segment received $K$ additional blocks, the previous one $K − 1$, and so on until only $1$ block was added or there were no more segments to the left.</p>

<p>The defense was considered as strong as its lowest segment.</p>

<p>Given the initial description of a wall, your objective is to determine the <em>largest possible minimum height</em> after applying a single reinforcement.</p>

### 입력

<p>The first line contains two integers $N$ ($1 ≤ N ≤ 10^5$), the number of wall segments, and $K$ ($1 ≤ K ≤ N$), the number of blocks added to the chosen segment.</p>

<p>The second line contains $N$ integers $x_1, x_2, \dots , x_N$ ($1 ≤ x_i ≤ 10^9$), representing the initial heights of the segments.</p>

### 출력

<p>Your program should print a single line, containing a single integer: the largest possible minimum height of the wall after a single reinforcement.</p>
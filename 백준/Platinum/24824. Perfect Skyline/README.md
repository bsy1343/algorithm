# [Platinum V] Perfect Skyline - 24824

[문제 링크](https://www.acmicpc.net/problem/24824)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Zara, an aspiring architect and urban planner, has drawn out what she considers to be the perfect skyline. As Zara is still aspiring she must use her young daughter, Pippa, to test out her designs. In order to test out the designs Pippa must build them out of her building blocks! The building blocks Pippa has have a uniform width and depth, but come in different heights $h$. Zara&#39;s description for Pippa will consist of a list of buildings, each with a target height $b$.</p>

<p>Pippa must then use some (not necessarily all) of her blocks to stack together such that the sum of the heights of the blocks in each stack corresponds to the height of the building in the skyline. Since Pippa prefers building instead of solving puzzles she wants you to determine how she must stack the blocks so that she must only do the stacking!</p>

### 입력

<p>The input consists of a single test case. The first line of this test case contains two integers $N,S$ ($1 \le N \le 15$ and $1 \le S \le 15$), where $N$ is the number of blocks Pippa has and $S$ is the number of buildings in the skyline Zara made. &nbsp;</p>

<p>The next line contains $N$ integers ($1 \le h_i \le 10^{9}$) representing the heights of each block. &nbsp;The last line contains $S$ integers ($1 \le b_i \le 10^{9}$) representing the height of each building.</p>

### 출력

<p>If it is possible for Pippa to build Zara&#39;s skyline then output $S$ lines. On each line output a single number $s_i$ representing the number of blocks needed to build building $i$ where $i$ corresponds to the $i^{\text{th}}$ building listed in the input. &nbsp;This should be followed (on the same line) by $s_i$ numbers $j$ representing the blocks of the input used in building $i$, where $j$ represents the $j^{\text{th}}$ block appearing the input. &nbsp;</p>

<p>If no combination of the blocks can build the desired skyline then output <code>-1</code>.</p>
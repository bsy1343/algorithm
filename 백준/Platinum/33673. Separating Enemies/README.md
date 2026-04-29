# [Platinum I] Separating Enemies - 33673

[문제 링크](https://www.acmicpc.net/problem/33673)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

다이나믹 프로그래밍, 두 포인터, 세그먼트 트리, 자료 구조

### 문제 설명

<p>In the town of Unity Avenue Peace Centre (UAPC), there are $N$ houses all on the same side of a single road. There is a single citizen living in each house. Some pairs of citizens are <em>enemies</em>, and are prone to fighting if they can reach each other’s house via the road.</p>

<p>To prevent these fights, the town council has decided to destroy portions of the road between certain houses. The goal is to ensure that no pair of enemies can reach each other, while minimizing the cost of destruction. The cost to destroy the portion of the road between the $i$th and $(i+1)$th house is $c_i$ dollars. Your task is to tell the town council how much this destruction will cost.</p>

### 입력

<p>The first line of input contains an integer $N$ ($1≤N≤10^5$) representing the number of houses in UAPC. The second line of input contains $N-1$ integers $c_1,c_2,\dots ,c_{N-1}$ ($1≤c_i≤10^4$), where $c_i$ is the cost to destroy the portion of the road between the $i$th and $(i+1)$th house. The third line of input contains an integer $M$ ($1≤M≤10^5$), the number of pairs of enemies. The following $M$ lines each contain two integers $u$ and $v$ ($1≤u&lt;v≤N$), indicating that the residents of houses $u$ and $v$ are enemies.</p>

### 출력

<p>Output a single integer representing the minimum total cost required to destroy portions of the road to ensure that each pair of enemies are separated.</p>
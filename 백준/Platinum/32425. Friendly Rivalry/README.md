# [Platinum V] Friendly Rivalry - 32425

[문제 링크](https://www.acmicpc.net/problem/32425)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 10, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

배낭 문제, 역추적, 이분 탐색

### 문제 설명

<p>The leaders of the International Coalition for Planetary Change (ICPC), a non-profit fighting for environmental awareness, are worried that their regional chapters are not doing enough to make a real impact on climate change. Inspired by the latest studies that competition is one of the best motivators, they have decided to start a competition between their chapters.</p>

<p>At the same time, the ICPC does not want to slow the spread of ideas. To encourage chapters to share effective climate change methods, the ICPC has decided to assign their $2n$ chapters into two teams, the green team and the blue team. For balance, each team should consist of exactly $n$ chapters.</p>

<p>To ensure the teams are not getting in each other’s way, the ICPC wants the two teams to be as far apart as possible. Specifically, the Euclidean distance between the closest pair of chapters belonging to different teams should be as large as possible.</p>

<p>Help the ICPC set up the teams according to these rules.</p>

### 입력

<p>The first line contains an integer $n$ ($1 ≤ n ≤ 500$), the size of each team. Chapters are numbered from $1$ to $2n$. Each of the remaining $2n$ lines contains two integers $x_i$ and $y_i$ ($-10^9 ≤ x_i, y_i ≤ 10^9$), the Cartesian coordinates of the location of the $i$th chapter. All chapters are at distinct locations.</p>

### 출력

<p>Output $n + 1$ numbers. The first number is the distance between the two closest chapters belonging to different teams. The next $n$ numbers are the chapters belonging to the blue team. If there are multiple ways to divide the teams with the same minimal distance, output any of them. The distance should have an absolute or relative error of at most $10^{-6}$.</p>
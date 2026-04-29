# [Gold IV] Bouquet of Balloons - 34782

[문제 링크](https://www.acmicpc.net/problem/34782)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 29, 정답: 17, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

그리디 알고리즘, 이분 탐색, 정렬

### 문제 설명

<p>On their journey to World Finals, Team Shuchiin Academy needs to first conquer the North America Championship. They have $n$ problems in the problemset, with problem $i$ taking $s_i$ minutes to solve. Team Shuchiin Academy can solve problems in any order but cannot work on problems in parallel. This means they must solve the problem they are currently working on before moving onto solving another problem. For each problem solved, the judges instantly bring a fully-inflated balloon to the team.</p>

<p>Chika Fujiwara, the troll of the team, decides to tie all of the balloons to the team's lucky dice so that it floats. Each balloon starts at $1$ liter of helium at the time the team receives it, allowing it to lift $1$ gram. All balloons have lifetime $d$. Balloons deflate at a constant rate of $\frac{1}{d}$ liters per minute, with lifting capacity in grams decreasing at the same rate; for example, a balloon after $\frac{d}{3}$ minutes can lift $\frac{2}{3}$ grams, and stopping at $0$ grams after $d$ minutes. The dice floats if, at any time, the sum of the lifting capacities of all the team's balloons is greater than or equal to the dice's mass $m$. The mass of the balloon itself is negligible.</p>

<p>Given a problemset of $n$ problems with the time to solve the $i^\text{th}$ problem as $s_i$, along with deflation rate $d$ and dice mass $m$, output the minimum number of problems Team Shuchiin Academy needs to solve to float the dice! If the dice cannot be floated, output $-1$.</p>

### 입력

<p>The first line of input contains three integers $n$, $d$, and $m$ ($1 \le n, d, m \le 10^5$): the length of the problemset, the balloons' lifespan, and the mass of the dice.</p>

<p>The second line of input contains $n$ integers: problem solve times $s_1$ through $s_n$ ($1 \le s_i \le 10^5$).</p>

### 출력

<p>Output a single integer: the minimum number of problems Team Shuchiin Academy needs to solve to float the dice, or $-1$ if impossible.</p>
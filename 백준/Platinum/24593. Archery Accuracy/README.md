# [Platinum I] Archery Accuracy - 24593

[문제 링크](https://www.acmicpc.net/problem/24593)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 16, 맞힌 사람: 12, 정답 비율: 36.364%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 가우스 소거법, 선형대수학, 수학, 확률론

### 문제 설명

<p>You are managing an archery team for a competition. Each team member has their own fixed probability of hitting a target.</p>

<p>The tournament works in a series of rounds. Your team has the same number of members as there are rounds in the tournament. In each round, exactly one of your team members will participate. Each team member will participate in exactly one round. You, being the manager, get to decide in what order the team members will compete. You must submit the order to the judges before the first round starts.</p>

<p>The competition has a scoreboard, which shows the total number of hits minus misses. The scoreboard starts at zero at the beginning of the competition, and is cumulative; it does not get reset across rounds. A hit will increase the score by $1$ while a miss will decrease it by $1$. The scoreboard can go below zero.</p>

<p>The competition organizers have specified a list of strictly increasing positive thresholds, one per round. In each round, the chosen team member will repeatedly shoot at a target until the scoreboard has absolute value equal to the threshold. Remember that the scoreboard does not get reset across rounds.</p>

<p>Given that you know the thresholds as well as all of your team members&#39; abilities, find the maximum possible probability that you will end the tournament with a positive number of hits.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2 \le n \le 17$), which is both the number of team members on your team, and the number of rounds of the tournament.</p>

<p>Each of the next $n$ lines contains a single real number $p$ ($0.0 &lt; p &lt; 1.0$), which is the probability that the given team member will hit a target. The probabilities will have at most two digits after the decimal point.</p>

<p>Each of the next $n$ lines contains a single integer $s$ ($1 \le s \le 100$), which is the threshold score chosen by the competition organizers for the given round. These values are in strictly increasing order.</p>

### 출력

<p>Output a single real number, which is the maximum probability that you will end the tournament with a positive number of hits. This value must be accurate to within an absolute or relative error of $10^{-6}$.</p>
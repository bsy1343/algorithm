# [Platinum I] Problem Set Construction - 24594

[문제 링크](https://www.acmicpc.net/problem/24594)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 29, 맞힌 사람: 21, 정답 비율: 80.769%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 수학, 확률론

### 문제 설명

<p>You are a judge, constructing a problem set for a contest. You have a pool of candidate problems. For each problem, you&#39;ve found the probability that a team is able to solve the problem, and the time it will take them to implement the solution if they are able to solve it. All implementation times are distinct.</p>

<p>You know the strategy that all teams will take when confronted with a problem set. First, they will determine the set of problems they can solve (assume they can do this instantly at the beginning of the contest). Then, they will solve as many of those problems as they can under the time limit. If there are many subsets of problems they can solve under the time limit, they will first break ties by the number of problems they can solve, next they will break ties by minimizing the total time it will take to solve all of those problems.</p>

<p>Define the <em>Difficulty</em> of a problem to be the probability that a team will solve the problem if it is included in a problem set of size $k$ along with $k-1$ other problems chosen uniformly at random from the pool. Find the <em>Difficulties</em> of all the problems.</p>

### 입력

<p>The first line of input contains three integers $n$, $k$ ($1 \le k \le n \le 50$) and $t$ ($1 \le t \le 2500$), where $n$ is the number of problems in the pool, $k$ is the number of problems to be chosen for the set, and $t$ is the time limit of the contest.</p>

<p>Each of the next $n$ lines contains a real number $p$ ($0.0 \le p \le 1.0$) and an integer $s$ ($1 \le s \le t$) describing a problem, where $p$ is the probability that a team is able to solve it, and $s$ is the time to solve. The probabilities will have at most four decimal digits. All times to solve will be distinct.</p>

### 출력

<p>Output $n$ lines, each containing a real number which is the <em>Difficulty</em> of the given problem in the order of the input. Each value must be accurate to within an absolute or relative error of $10^{-6}$.</p>
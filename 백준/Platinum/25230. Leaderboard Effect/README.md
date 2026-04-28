# [Platinum I] Leaderboard Effect - 25230

[문제 링크](https://www.acmicpc.net/problem/25230)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 32, 맞힌 사람: 29, 정답 비율: 56.863%

### 분류

수학, 다이나믹 프로그래밍, 비트마스킹, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are in charge of a programming contest with a number of distinct problems and an overall time limit. The judges provide for each problem a reading time, a coding time, and a solution probability.</p>

<p>During the contest, teams can view a leaderboard that shows the accepted submissions for each team. Seeing the leaderboard can have an effect on teams&#39; strategies! All teams will follow the following strategy when solving problems in the contest:</p>

<ol>
	<li>Choose to read a problem. To choose which problem to read, they first gather all the problems they haven&#39;t yet read (if they have read all problems, they will spend the rest of the contest doing nothing). If none of these problems have any solutions, they will choose to read one uniformly at random. Otherwise, they will choose a problem to read, randomly weighted by the number of solutions that it has. For example, if there are three problems <strong>A</strong>, <strong>B</strong>, <strong>C</strong> with $3$, $1$, and $0$ solutions respectively, they will choose to read problem <strong>A</strong> with probability $\frac{3}{4}$, problem <strong>B</strong> with probability $\frac{1}{4}$, and problem <strong>C</strong> with probability $\frac{0}{4}$.</li>
	<li>After choosing any given problem, they first read it. This always takes the given reading time for that problem. After they finish reading the problem, they will know if they can solve it or not. The team will be able to solve the problem with the given probability (and this takes no time to decide). If they can&#39;t solve the problem, the team goes back to step $1$ and chooses another problem to read. Otherwise, they spend the given time coding the problem (even if there is not enough time left in the contest to finish) before going back to step $1$ to choose another problem to read. Once a team finishes coding the chosen problem, the problem is solved (receiving judgement takes no time); each problem solution affects the leaderboard, and therefore the problems other teams will attempt.</li>
</ol>

<p>At all moments of time, the leaderboard will first update with all the solutions that happened at that time, then teams will see the updated leaderboard.</p>

<p>Let $f(m,i)$ be the expected number of teams that will solve problem $i$ if there are $m$ teams participating in the contest. Let $g(i) = lim_{m \rightarrow \infty}[\frac{f(m,i)}{m}]$, which is the expected proportion of teams that will solve problem $i$ for a large enough number of teams. Output $g(i)$ for all problems $i$ in the set.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 17$) and $t$ ($1 \le t \le 100$), where $n$ is the number of problems in the contest, and $t$ is the time limit in minutes.</p>

<p>Each of the next $n$ lines contains two integers $r$ and $c$ ($1 \le r,c \le t$) and one real number $p$ ($0.0 \le p \le 1.0$). Each line describes a problem, where $r$ is reading time in minutes, $c$ is coding time in minutes, and $p$ is the probability of solving the problem. </p>

### 출력

<p>Output $n$ lines. Each line contains a single real number, which is the expected proportion of teams that will solve that particular problem, given a large number of teams. Output these proportions for the problems in the same order as the input. The answers are accepted with absolute or relative error at most $10^{-6}$.</p>
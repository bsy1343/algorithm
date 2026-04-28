# [Gold I] How to Fail at Programming Contest - 19731

[문제 링크](https://www.acmicpc.net/problem/19731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 10, 맞힌 사람: 8, 정답 비율: 29.630%

### 분류

다이나믹 프로그래밍, 정렬, 배낭 문제

### 문제 설명

<p>Gennady is the best in competitive programming. He can solve any problem, so he has never lost a contest. But today he has decided to lose a contest because winning all contests is not interesting.</p>

<p>But Gennady can&#39;t abandon solving problems because it is unsportsmanlike behavior. So he has decided to just choose a bad strategy that minimizes his total points for the contest.</p>

<p>There are $n$ problems in the contest numbered from $1$ to $n$. If a contestant solves problem $i$ he gets $p_i$ points. Gennady has read all problems and came up with a solution for each one. He knows that for the problem $i$ he needs exactly $t_i$ minutes to write a solution. The final thing to do is to choose the order to write the solutions for the problems. Gennady noticed that he had $T$ minutes remaining until the end of the contest.</p>

<p>Gennady wants to use the following strategy. He chooses a problem that he hasn&#39;t solved yet and writes a solution for it. He never chooses the problem that he can&#39;t finish in time. When the solution is ready, Gennady submits it and gets $p_i$ points for this problem. Submitting and testing doesn&#39;t take any time. Then he moves to another problem. When Gennady understands that he can&#39;t solve any of the remaining problems in time he stops coding.</p>

<p>Now Gennady wants to choose the order of solving problems that minimizes his score for the contest. Help him to find out the smallest number of points that he can get following the rules above.</p>

### 입력

<p>The first line of input contains two integers $n$ and $T$ denoting the number of problems and the time until the end of the contest ($1 \leq n, T \leq 2000$).</p>

<p>The following $n$ lines describe the problems: the $i$-th line contains two integers $t_i$, $p_i$ denoting the time needed for Gennady to solve this problem and the number of points this problem costs ($1 \leq t_i \leq 2000$, $1 \leq p_i \leq 10^6$).</p>

### 출력

<p>Output one number --- the minimal number of points that Gennady can get.</p>
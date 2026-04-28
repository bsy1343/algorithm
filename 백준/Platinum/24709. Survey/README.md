# [Platinum II] Survey - 24709

[문제 링크](https://www.acmicpc.net/problem/24709)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 15, 맞힌 사람: 12, 정답 비율: 21.818%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p>You are doing a survey and want to find respondents in your social group. Your social group has size $n$, and you have a budget of $m$ dollars. You need to divide the $m$ dollars into $ n$ shares. Each group member will get one of the shares uniformly at random. Note that the money contained in each share can be <strong>any non-negative real number</strong>.</p>

<p>Luckily, you know the <em>reward threshold</em> of each group member. If a person has a reward threshold of $x$, they will participate in the survey if and only if they have received a share of at least $x$ dollars, otherwise they will just accept the payment and not participate in the survey. Since you want as many group members as possible to participate in the survey, you need to design a plan to divide the $m$ dollars into $n$ shares in order to maximize the expected number of members who will participate in the survey.</p>

### 입력

<p>The first line contains two integers $n$ ($1\leq n\leq 1000$) and $m$ ($1\leq m\leq 5000$), denoting the number of group members and your budget.</p>

<p>The next line contains $n$ integers $x_1, x_2, \ldots, x_n$ ($0 \le x_i \le m$), denoting the reward threshold of each member.</p>

### 출력

<p>Print a single real number: the maximum expected number of members to participate in the survey.</p>

<p>The answer will be considered correct if the absolute or relative error between the output and the jury&#39;s answer is at most $10^{-9}$.</p>
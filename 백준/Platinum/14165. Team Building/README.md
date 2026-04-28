# [Platinum IV] Team Building - 14165

[문제 링크](https://www.acmicpc.net/problem/14165)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 641, 정답: 294, 맞힌 사람: 216, 정답 비율: 43.725%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Every year, Farmer John brings his N cows to compete for &quot;best in show&quot; at the state fair. His arch-rival, Farmer Paul, brings his M cows to compete as well (1&le;N&le;1000,1&le;M&le;1000).</p>

<p>Each of the N+M cows at the event receive an individual integer score. However, the final competition this year will be determined based on teams of K cows (1&le;K&le;10), as follows: Farmer John and Farmer Paul both select teams of K of their respective cows to compete. The cows on these two teams are then paired off: the highest-scoring cow on FJ&#39;s team is paired with the highest-scoring cow on FP&#39;s team, the second-highest-scoring cow on FJ&#39;s team is paired with the second-highest-scoring cow on FP&#39;s team, and so on. FJ wins if in each of these pairs, his cow has the higher score.</p>

<p>Please help FJ count the number of different ways he and FP can choose their teams such that FJ will win the contest. That is, each distinct pair (set of KK cows for FJ, set of KK cows for FP) where FJ wins should be counted. Print your answer modulo 1,000,000,009.</p>

### 입력

<p>The first line of input contains N, M, and K. The value of K will be no larger than N or M.</p>

<p>The next line contains the N scores of FJ&#39;s cows.</p>

<p>The final line contains the M scores of FP&#39;s cows.</p>

<p>Each score is an integer from 1 to 100000.</p>

### 출력

<p>Print the number of ways FJ and FP can pick teams such that FJ wins, modulo 1,000,000,009.</p>
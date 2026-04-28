# [Gold IV] Game Show - 32067

[문제 링크](https://www.acmicpc.net/problem/32067)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 32, 맞힌 사람: 31, 정답 비율: 77.500%

### 분류

누적 합

### 문제 설명

<p>You are hosting a game show. In your game show, there is a circular disk divided into $N$ regions, numbered from $1$ to $N$ in clockwise order. For each region $i$ ($1 &le; i &le; N - 1$), region $i + 1$ is located to the next of region $i$, and region $1$ is located to the next of region $N$.</p>

<p>There are $Q$ independent rounds. In each round, the player starts from region $S$ and the target is at region $T$. For each $i$ such that $1 &le; i &le; N$, the player can move from region $i$ to region $i + 1$ (or to region $1$ if $i = N$) with a penalty of $A_i$. Similarly, the player can move from region $i + 1$ (or from region $1$ if $i = N$) to region $i$ with a penalty of $B_i$. Note that the penalty can be negative.</p>

<p>The goal of each round is to find the minimum total penalty required to reach the target. However, you noticed that it is possible for the player to abuse the game to reach the target with a penalty of $-&infin;$. Such round is called <em>flawed</em>.</p>

<p>For each round, determine if the round is flawed or not. If the round is not flawed, determine the minimum penalty to reach the target.</p>

### 입력

<p>Input begins with two integers $N$ $Q$ ($3 &le; N &le; 200\, 000$; $1 &le; Q &le; 200\, 000$) representing the number of regions and the number of rounds, respectively.</p>

<p>The next line contains $N$ integers $A_i$ ($-10^9 &le; A_i &le; 10^9$) representing the penalty to move from region $i$ to region $i + 1$, or to region $1$ if $i = N$. The next line contains $N$ integers $B_i$ ($-10^9 &le; B_i &le; 10^9$) representing the penalty to move from region $i + 1$, or from region $1$ if $i = N$, to region $i$.</p>

<p>Each of the next $Q$ lines contains two integers $S$ $T$ ($1 &le; S, T &le; N$) representing the start region and target region of each round, respectively.</p>

### 출력

<p>For each round, if the round is flawed, then output <code>flawed</code> in a single line. Otherwise, output an integer in a single line, representing the minimum penalty to reach the target.</p>
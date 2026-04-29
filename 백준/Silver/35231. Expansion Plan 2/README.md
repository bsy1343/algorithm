# [Silver III] Expansion Plan 2 - 35231

[문제 링크](https://www.acmicpc.net/problem/35231)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 49, 정답: 30, 맞힌 사람: 20, 정답 비율: 54.054%

### 분류

누적 합, 수학

### 문제 설명

<p>You are dealing with side quests in the video game Expansion Plan 2.</p>

<p>There is an infinite grid of <strong>bonus levels</strong>, with coordinates $(x, y)$ (specifically, the cell immediately above $(0, 0)$ is $(0, 1)$, and the cell immediately on the right of $(0, 0)$ is $(1, 0)$). Initially, only the bonus level at $(0, 0)$ is <strong>unlocked</strong>.</p>

<p>Given a string $a_1a_2 \dots a_l$ of length $l$ consisting of characters "<code>4</code>" and "<code>8</code>", you play $l$ times in a row; at the $i$-th play you obtain a <strong>score</strong> equal to $s_i ∈ \{$"<code>4</code>", "<code>8</code>"$\}$. For each $i$ from $1$ to $l$:</p>

<ul>
<li>if $s_i = $"<code>4</code>": for each bonus level, if it is orthogonally adjacent (i.e., it shares a side) to a level which was already <strong>unlocked</strong> before the $i$-th play, it becomes unlocked; otherwise, its state remains the same;</li>
<li>if $s_i = $"<code>8</code>": for each bonus level, if it is orthogonally or diagonally adjacent (i.e, it shares a side or a corner) to a level which was already <strong>unlocked</strong> before the $i$-th play, it becomes unlocked; otherwise, its state remains the same.</li>
</ul>

<p>You are given a string $s$ of length $n$ consisting of characters "<code>4</code>" and "<code>8</code>".</p>

<p>You have to answer $q$ queries. In each query, you start with an infinite grid where only the bonus level $(0, 0)$ is unlocked, and you are given four integers $l$, $r$, $x$, $y$. You have to determine whether the bonus level $(x, y)$ is unlocked after getting the scores in the substring $[l, r]$ of $s$.</p>

### 입력

<p>The first line contains two integers $n$, $q$ ($1 ≤ n, q ≤ 2 \cdot 10^5$) — the length of the string and the number of queries, respectively.</p>

<p>The second line contains a string $s$ of length $n$ consisting of characters "<code>4</code>" and "<code>8</code>".</p>

<p>Each of the next $q$ lines contains four integers $l$, $r$, $x$, $y$ ($1 ≤ l ≤ r ≤ n$, $−10^9 ≤ x, y ≤ 10^9$), representing a query on the substring $[l, r]$ and the bonus level $(x, y)$.</p>

### 출력

<p>For each query, output <code>YES</code> if the bonus level $(x, y)$ is unlocked after getting the scores in the substring $[l, r]$ of $s$, and <code>NO</code> otherwise.</p>
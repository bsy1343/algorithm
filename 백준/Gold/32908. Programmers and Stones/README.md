# [Gold III] Programmers and Stones - 32908

[문제 링크](https://www.acmicpc.net/problem/32908)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 106, 정답: 51, 맞힌 사람: 42, 정답 비율: 50.602%

### 분류

게임 이론, 애드 혹, 홀짝성

### 문제 설명

<p>Programmers Alice and Dmitry invented a new game. In this game, there are $n$ piles of stones on the table. The players take turns starting from Alice. On their turn, a player picks an arbitrary non-empty set of non-empty piles, and then remove one stone from each of them. The player who can't make a move loses. Who will win the game if both play optimally?</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 100\,000$).</p>

<p>The second line contains $n$ numbers $a_1, a_2, \ldots, a_n$: the initial sizes of the piles of stones ($1 \le a_i \le 10^9$).</p>

### 출력

<p>Print "<code>Alice</code>" or "<code>Dmitry</code>", depending on who wins the game. In the names, letter case <strong>does</strong> matter.</p>
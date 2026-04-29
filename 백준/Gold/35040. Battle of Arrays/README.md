# [Gold V] Battle of Arrays - 35040

[문제 링크](https://www.acmicpc.net/problem/35040)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 22, 맞힌 사람: 21, 정답 비율: 95.455%

### 분류

구현, 그리디 알고리즘, 시뮬레이션, 우선순위 큐, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Alice and Bob play a turn-based game. Initially, Alice has an array $a$ of $n$ positive integers, and Bob has an array $b$ of $m$ positive integers. The players take turns, with Alice moving first.</p>

<p>On a player's turn, they must choose one element $x$ from their own array and <strong>the maximal</strong> element $y$ from their opponent's array. Then they perform the following operation:</p>

<ul>
<li>If $y \leq x$: the element $y$ is destroyed (removed from the opponent's array).</li>
<li>If $y &gt; x$: the element $y$ is decreased by $x$ (the value of $y$ becomes $y - x$).</li>
</ul>

<p>A player wins if, after their move, the opponent's array becomes empty.</p>

<p>Assuming both players play optimally, determine the winner.</p>

### 입력

<p>Each input contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^5$).</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($1 \le n,m \le 10^5$) --- the sizes of Alice's and Bob's arrays respectively.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 10^9$) --- Alice's array.</p>

<p>The third line contains $m$ integers $b_1, b_2, \ldots, b_m$ ($1 \le b_i \le 10^9$) --- Bob's array.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$ and the sum of $m$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print the name of the winner of the game if both players follow the optimal strategy: "<code>Alice</code>" or "<code>Bob</code>".</p>

### 힌트

<p>In the first test Alice moves and decreases Bob's element by $70$, so it becomes $20$. Then Bob moves and decreases Alice's element by $20$, so it becomes $50$. Finally, Alice moves, destroys Bob's element, and wins.</p>
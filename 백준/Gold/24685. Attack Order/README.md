# [Gold I] Attack Order - 24685

[문제 링크](https://www.acmicpc.net/problem/24685)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 13, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>In a certain game, you control a board of $n$ minions numbered from $1$ to $n$. Each minion $i$ is characterized by an integer $a_i$, called its <em>attack</em>.</p>

<p>For the upcoming fight, you will arrange the minions in a line from left to right.</p>

<p>After that, some of the minions&#39; attacks will get <em>buffed</em>. The ability of each minion $i$ reads &quot;Before the fight, increase the attack of <em>another</em> random minion by $b_i$&quot;. Formally, for each $i$, an arbitrary minion $j \ne i$ will be chosen and its attack $a_j$ will be increased by $b_i$.</p>

<p>Note that the buff choices are independent and happen simultaneously. In particular, the attack of any minion can get buffed multiple times.</p>

<p>You want the attacks of the minions to be <em>non-increasing</em> from left to right after all the buffs happen. Determine whether it&#39;s possible for you to arrange the minions in a way that guarantees that, regardless of buff choices.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 1000$). Description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 \le n \le 100$).</p>

<p>The $i$-th of the next $n$ lines contains two integers $a_i$ and $b_i$ ($0 \le a_i, b_i \le 10^6$).</p>

### 출력

<p>For each test case, print &quot;<code>Yes</code>&quot; if it is possible to arrange the minions in such a way that their attacks will be non-increasing regardless of buff choices, and &quot;<code>No</code>&quot; otherwise.</p>

### 힌트

<p>In the first example test case, the minions buff each other. The attacks of minions $1$ and $2$ during the fight will always be $20$ and $35$, respectively. You can arrange the minions in order $\langle 2, 1 \rangle$.</p>

<p>In the second example test case, only minion $2$ buffs someone else. One valid ordering is $\langle 3, 1, 2 \rangle$. If minion $2$ buffs minion $1$, the attacks of the minions, from left to right, will be $\langle 10, 10, 7 \rangle$. If minion $2$ buffs minion $3$, the attacks of the minions will be $\langle 13, 7, 7 \rangle$. Both sequences are non-increasing.</p>
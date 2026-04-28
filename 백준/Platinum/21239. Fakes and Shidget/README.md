# [Platinum III] Fakes and Shidget - 21239

[문제 링크](https://www.acmicpc.net/problem/21239)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

수학, 그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Pavel loves the game Fakes and Shidget very much. The game literally consists of the following process. The player uniformly randomly meets one of $n$ characters. Every character offers the player to choose one of two quests. The first quest of the $i$-th character requires $a_i$ minutes to complete and brings $b_i$ gold, and the second quest requires $c_i$ minutes and brings $d_i$ gold. The player chooses one of these quests, completes it and immediately meets another random character, and so on.</p>

<p>Pavel will play this game infinitely long. How fast can he earn gold if he will play optimally?</p>

<p>More formally, let $t$ is the time Pavel plays this game, and $g(t)$ is the amount of gold he earns for the time $t$. You should find the limit $\lim \limits_{t \to \infty} \frac{g\left(t\right)}{t}$.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 200000$) --- the number of characters in the game.</p>

<p>Each of the next $n$ lines contains four integers $a_i$, $b_i$, $c_i$ and $d_i$ ($1 \le a_i, b_i, c_i, d_i \le 10^{9}$) --- the duration of the first quest, the reward for the first quest, the duration of the second quest, the reward for the second quest of the $i$-th character.</p>

### 출력

<p>Output one floating point number --- the maximal possible speed of earning gold.</p>

<p>The absolute or relative error of the answer shouldn&#39;t exceed $10^{-9}$.</p>
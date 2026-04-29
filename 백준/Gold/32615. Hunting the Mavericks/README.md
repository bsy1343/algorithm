# [Gold III] Hunting the Mavericks - 32615

[문제 링크](https://www.acmicpc.net/problem/32615)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

누적 합, 스위핑, 차분 배열 트릭

### 문제 설명

<p>The year is 21XX, and finally, after a century of patiently waiting, you are excited to play the new Mega Man X game on your Xbox 1024. As usual, there are $n$ levels, numbered $1$ to $n$, each of which ends with a fight against a corrupted robot known as a Maverick. Upon defeating a Maverick, you are able to use its weapon throughout the rest of the game. Every Maverick is weak to the weapon you find in the previous level numerically (the Maverick in level $2$ is only weak to the weapon in level $1$, and the Maverick in level $n$ is weak to the weapon in level $n - 1$). The only exception to this is that the Maverick in level $1$ is weak to the weapon in level $n$.</p>

<p>Additionally, some levels contain one or more armour upgrades, with there being $m$ armour upgrades in total. Every armour upgrade $i$ requires the weapon in level $w_i$ to be unlocked and can be found in level $l_i$, where $w_i \neq l_i$. In one run through a level, you can collect any number of armour upgrades, as long as you have the weapons that unlock them.</p>

<p>You really hate backtracking, so you will only go through each level once, leaving behind any armour upgrade you cannot obtain immediately. In order to make the game easier, you decide that will do the levels in an order where you only pick levels where the Maverick is weak to to a weapon you have. You can pick any level to start with, you don't require to have the weakness weapon yet. After picking the starting level, you will finish the levels in order (going from level $n$ to level $1$ still counts as in order) until you have beaten all levels exactly once. The problem with your approach is that it misses potentially a lot of armour upgrades, which is not good considering the final boss is <em>very</em> tough. Since you want to beat the game as efficiently as possible, you decide to write a program that determines the minimum number of armour upgrades you will have to miss.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with two integers $n$ and $m$ ($2 \leq n \leq 10^5$, $1 \leq m \leq 10^5$), the number of levels in the game and the number of armour upgrades.</li>
	<li>$m$ lines, containing two integers $w_i$ and $l_i$ ($1 \leq w_i, l_i \leq n$, $w_i \neq l_i$), the level in which the weapon needed to unlock armour upgrade $i$ is, and the level containing armour upgrade $i$.</li>
</ul>

### 출력

<p>Output the minimum number of armour upgrades you will miss.</p>
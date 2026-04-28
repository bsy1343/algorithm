# [Platinum I] Japanese Lottery - 28378

[문제 링크](https://www.acmicpc.net/problem/28378)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 18, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

자료 구조, 세그먼트 트리, 순열 사이클 분할

### 문제 설명

<p>Amida-kuji is a lottery popular in Japan, which can be used to assign $w$ prizes to $w$ people. The game consists of $w$ vertical lines, called <em>legs</em>, and some horizontal bars that connect adjacent legs. The tops of the legs are the starting positions of the $w$ people, and the prizes are at the bottom of the legs. To determine the prize of the $i$th person, one has to move down on the $i$th leg, starting at the top, and switch the leg whenever a horizontal bar is encountered. You can see such a game and how to trace a path in Figure J.1.</p>

<p>You want to manipulate the lottery in such a way that the $i$th person gets the $i$th prize, for every $i$, by removing some horizontal bars. Since you do not want to get caught, you want to remove as few bars as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28378.%E2%80%85Japanese%E2%80%85Lottery/e61a37d0.png" data-original-src="https://upload.acmicpc.net/a31d21c6-ee03-487b-b658-735efe6616bc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 189px;" /></p>

<p style="text-align: center;">Figure J.1: Visualization of an Amida-kuji game. The first person is connected to the third prize. This is also Sample Input 2 after all connections are added and before any connection is removed. To connect the $i$th person to the $i$th prize, it suffices to remove both horizontal bars between legs $2$ and $3$ and the topmost horizontal bar between legs $3$ and $4$. This is the only minimal solution.</p>

<p>For this problem, the initial game configuration has no horizontal bars. Then, horizontal bars are added one by one or are removed again. After each change, you want to know the minimum number of horizontal bars that need to be removed such that the $i$th prize is assigned to the $i$th person for each $i$. Note that this is always possible by removing all horizontal bars.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $w, h$ and $q$ ($2 \leq w \leq 20$, $1\leq h,q \leq 2\cdot10^5$), the number of legs, the height of the legs, and the number of changes.</li>
	<li>$q$ lines, each containing three integers $y, x_{1}$ and $x_{2}$ ($1\leq y \leq h$, $1\leq x_{1}, x_{2} \leq w$), describing a change where a horizontal bar is added or removed at height $y$ between legs $x_1$ and $x_2$. If there is already a horizontal bar at this position, it will be removed. Otherwise the bar will be added. It is guaranteed that the two legs are adjacent, i.e. $|x_{1}-x_{2}|=1$.</li>
</ul>

<p>It is guaranteed that all horizontal bars have different heights at every moment.</p>

### 출력

<p>After each change, output a single integer, the minimum number of horizontal bars that need to be removed in the game with the currently existing bars such that the $i$th prize is assigned to the $i$th person for each $i$.</p>
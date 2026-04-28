# [Platinum V] Potion Farming - 31556

[문제 링크](https://www.acmicpc.net/problem/31556)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 220, 정답: 85, 맞힌 사람: 75, 정답 비율: 39.474%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>You are playing your favorite mobile game and you are trying to farm potions so that you may have a chance at defeating the legendary cow boss. The game map is a series of $N$ $(2 \leq N \leq 10^5)$ rooms labeled $1\dots N$ connected by $N-1$ edges that form a tree.</p>

<p>You can explore the map by making a series of &quot;traversals&quot;. A traversal is a simple path from room $1$ to any other room in the tree. Once you finish one traversal, you can start another traversal from room $1$. The map is complete once every one of its rooms is visited by at least one traversal. Your main goal is to complete the map in the minimum number of traversals.</p>

<p>Your secondary goal is to farm as many potions as possible. Before a traversal begins, a potion will spawn at some room in the map. You can pick up the potion by visiting the room that the potion spawned at in the current traversal. If you do not pick up the potion, then it will disappear once the current traversal ends, so you cannot pick it up in future traversals.</p>

<p>As you are a smart programmer, after looking at the game files, you were able to figure out where the potions will appear before your next $N$ traversals. If you complete the map in the minimum number of traversals, what is the maximum amount of potions that you can farm from the map?</p>

### 입력

<p>The first line of the input contains an integer $N$, denoting the number of rooms in the map.</p>

<p>Then follow $N$ space-separated integers $p_1 \: p_2 \: \ldots \: p_N$ where $1 \leq p_i \leq N$, where $p_i$ is the room that a potion will appear at before the $i$th traversal.</p>

<p>Finally, $N-1$ lines follow with two space-separated integers $a \: b$ $(1 \leq a, b \leq N)$ representing an edge between rooms $a$ and $b$. It is guaranteed that these edges form a tree.</p>

### 출력

<p>Output one line containing a single integer, the maximum amount of potions that you can farm from the map in the minimum number of traversals.</p>
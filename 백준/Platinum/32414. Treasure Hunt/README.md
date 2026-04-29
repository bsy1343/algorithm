# [Platinum IV] Treasure Hunt - 32414

[문제 링크](https://www.acmicpc.net/problem/32414)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 60, 맞힌 사람: 52, 정답 비율: 71.233%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>Perry the Pirate is sailing the seven seas! He has a map consisting of $N$ islands connected by a network of $M$ sea routes. The $i$-th sea route connects islands $a_i$ and $b_i$ and costs $c_i$ coins to traverse in either direction. As it turns out, fighting off sea monsters can be quite expensive. In search of his next big plunder, Perry has scouted out each of the $N$ islands and has determined that the $i$-th island contains a treasure chest with $v_i$ coins inside.</p>

<p>It remains for him to plan out his next journey. He decides that he will sail through some (possibly empty) path of sea routes starting at island $x$ and ending at island $y$. At the end of his journey, he will open the chest at island $y$ and collect his well-earned booty.</p>

<p>There is one small problem though: Perry doesn’t know what island he’s currently on! Thus, for every possible starting island $x$, he would like to know the maximum possible number of coins he can earn out of all journeys starting at island $x$. Can you help him compute these values? You may assume Perry has enough coins to traverse any path of sea routes he chooses; he only cares about the net profit of his next journey.</p>

### 입력

<p>The first line of input contains two space-separated integers $N$ and $M$.</p>

<p>The second line of input contains $N$ space-separated integers $v_1, v_2, \dots , v_N$ ($0 ≤ v_i ≤ 10^9$).</p>

<p>The next $M$ lines each contain three space-separated integers $a_i$, $b_i$ ($1 ≤ a_i , b_i ≤ N$), and $c_i$ ($0 ≤ c_i ≤ 10^9$).</p>

<p>It is guaranteed that there is at most one sea route between any pair of islands and each sea route connects two distinct islands.</p>

### 출력

<p>Output $N$ lines, where the $x$-th line contains the maximum possible net profit (in coins) of any journey starting at island $x$.</p>
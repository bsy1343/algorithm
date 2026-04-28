# [Platinum I] Tree Game - 7729

[문제 링크](https://www.acmicpc.net/problem/7729)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 98, 정답: 11, 맞힌 사람: 9, 정답 비율: 13.043%

### 분류

애드 혹, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 게임 이론, 트리

### 문제 설명

<p>MaĹĽko and Kubko, both wery enjoyed playing games, have discovered new type of game: tree game. In this game first player chooses vertex of a tree. Then players (beginning with second player) alternately choose neighboor of last choosed vertex which was not choosed before, until one player can&rsquo;t make a move. This player is then determined as a looser and the other one is the winner. MaĹĽko is beginning the game but unforutnatelly Kubko is very experienced player and he will never make a mistake. Therefore MaĹĽko has asked you for help.</p>

<p>Our tree has N vertices conventionally numbered 1..N and exactly N &minus; 1 edges connecting them. Write a program, which determines all vertieces in which MaĹĽko can begin the game and will win altrough Kubko will be playing perfectly.</p>

### 입력

<p>On the first line, there is one single number N, (1 &le; N &le; 2 000 000), which is equal to the number of nodes in the tree. N &minus; 1 lines follows, on the i-th line is a single integer ai, which means there is edge in the tree connecting (i + 1)-th vertex with vertex ai. (Moreover you can suppose ai &le; i).</p>

### 출력

<p>Output consists of several lines, on each one there is single number of node, where MaĹĽko can begin the game and can win, regardless how is Kubko playing. Numbers on the ouput are sorted in ascending order.</p>
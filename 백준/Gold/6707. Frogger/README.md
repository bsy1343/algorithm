# [Gold III] Frogger - 6707

[문제 링크](https://www.acmicpc.net/problem/6707)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

(분류 없음)

### 문제 설명

<p>&ldquo;Frogger&rdquo; was one of the first really popular arcade games after it was introduced by SEGA in 1981. The game consists of helping a frog cross a multi-lane motorway without getting run over by a car. You are given a view of an n-lane motorway where each lane consists of m different spaces that can either be empty or be occupied by a car. On each side of the motorway is a curb on which the frog can move freely. In the traffic lanes the frog can only move on the spaces not occupied by cars. The motorway is constructed in such a way that the direction in which the cars travel alternates between the lanes, with cars in the first lane (the one closest to the starting point of the frog) moving to the right. The cars never switch lanes and only move one step forward in each turn. To ensure a steady supply of traffic, a car that reaches the boundary of its lane is reentered at the opposite end of its lane.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6707.%E2%80%85Frogger/414fde64.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6707.%E2%80%85Frogger/414fde64.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6707/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:182px; width:307px" /></p>

<p>In one turn of the game all the cars move one step in their assigned direction while the frog can either move one step to the right or to the left, or one step up or down (between lanes or between the curb and the adjoining lane), or it can stand still. Contrary to the cars the frog cannot &ldquo;wrap-around&rdquo; i.e. move in one step between the first and last position of a lane or a curb.</p>

<p>The frog and the cars move simultaneously. Thus the frog can move to a space given that there will be no car on it in the next round. If the frog is on the same space at the same time as a car it is run over and dies. Note that the frog can jump over an adjacent approaching car in the same lane as itself.</p>

<p>Your job is to write a computer program that will calculate the minimum number of turns needed for the frog to get from its starting position on the curb to its final position on the curb on the other side of the road or to determine that this is not possible within a given number of rounds.</p>

### 입력

<p>First there will be a line containing the number of scenarios you are asked to help the frog in. For each scenario there will first be a line containing a positive integer x &le; 10<sup>5</sup> giving the maximum number of rounds that can be used. The next line contains the number of lanes n, 1 &le; n &le; 20, and the length of each lane m, 1 &le; m &le; 50. Each of the next n + 2 lines will contain a string of m characters. The character X indicates a car, the character O (letter O) indicates a free space, the character F gives the starting position of the frog, and the character G gives the final destination of the frog. The first line indicates the destination curb, consisting of O&rsquo;s and exactly one G while the last line gives the starting curb consisting of O&rsquo;s and exactly one F, while the intermediate lines each represent one lane of the motorway</p>

### 출력

<p>The output will be one line per scenario, either giving the minimum number of turns needed before the frog can get from its starting position to the final position without getting run over by a car or a statement indicating that this was not possible within the maximum number of allowed turns.</p>
# [Platinum I] Jumbled Journey - 17551

[문제 링크](https://www.acmicpc.net/problem/17551)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 그래프 이론, 위상 정렬

### 문제 설명

<p>Together with some friends you are planning a holiday to the Beautiful Authentic Parks Centre. While there, you want to visit the parks as much as you can. As part of the preparation you, together with your best friend, decided to make an extensive map of the parks, the roads between them, and the lengths of these roads. To ensure that the visitors to the Parks Centre do not circle endlessly through the gorgeous parks, the routes between the parks are one-way only and are made such that it is impossible to visit a park more than once (that is, the corresponding graph is acyclic). Together you spend the entire day to create an incredibly detailed and admittedly rather large map of the Parks Centre.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17551.%E2%80%85Jumbled%E2%80%85Journey/c11a9dca.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17551.%E2%80%85Jumbled%E2%80%85Journey/c11a9dca.png" data-original-src="https://upload.acmicpc.net/14c106f8-6582-49db-ad20-ab3c5e9f8bdb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 267px; height: 117px;" /></p>

<p style="text-align: center;">Figure J.1: The map of the parks corresponding to sample input 1.</p>

<p>The next day disaster strikes: your friend happily announces that he got rid of the cumbersome map! Instead, he decided to replace it with a simple table containing only the average distances between the parks, weighing each route equally. Thus, he would give you an average distance of 8 between park 1 and park 4 as in figure J.1, because there are 3 paths and their average length is (6 + 8 + 10)/3 = 8. You feel defeated, and you dread the thought of making the map all over again. Perhaps it might be easier to try and use the table of average distances your friend made in order to reconstruct the original map. One thing you remember, is that the roads on the map were never inefficient. If there was a direct road between two parks, then every path via at least one other park was strictly longer. This condition holds for the first sample input because, for example, the road from 1 to 4 has length 6, which is shorter than the length of any other path from 1 to 4.</p>

<p>Given an input of average distances between parks, output the original map: a weighted directed acyclic graph for which these average distances hold.</p>

### 입력

<ul>
	<li>The first line contains an integer 1 &le; n &le; 100, the number of vertices (parks).</li>
	<li>The next n lines contain the average distance from vertex i to vertex j as the jth number on the ith line, or &minus;1 in case there is no path from vertex i to vertex j. All distances are either &minus;1 or non-negative integers, at most 10<sup>15</sup>.</li>
</ul>

<p>You know the following facts about the map (the original graph):</p>

<ul>
	<li>There is no way to follow the roads and return to a park once you have left it. That is, the graph is acyclic.</li>
	<li>The lengths of the roads in the original graph are all integers.</li>
	<li>Between any two parks, there are at most 1000 distinct paths you can take from one to the other.</li>
	<li>Direct roads are always efficient: if there is a direct road from park i to park j, every other path from i to j is strictly longer than that direct road.</li>
</ul>

### 출력

<p>Print n lines each containing n integers. The jth number on the ith line should be the positive length of the edge from vertex i to vertex j, or &minus;1 if there is no such edge. It is guaranteed that a solution exists.</p>
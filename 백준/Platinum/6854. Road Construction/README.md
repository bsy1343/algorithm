# [Platinum III] Road Construction - 6854

[문제 링크](https://www.acmicpc.net/problem/6854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>It&rsquo;s almost summer time, and that means that it&rsquo;s almost summer construction time! This year, the good people who are in charge of the roads on the tropical island paradise of Remote Island would like to repair and upgrade the various roads that lead between the various tourist attractions on the island.</p>

<p>rious tourist attractions on the island. The roads themselves are also rather interesting. Due to the strange customs of the island, the roads are arranged so that they never meet at intersections, but rather pass over or under each other using bridges and tunnels. In this way, each road runs between two specific tourist attractions, so that the tourists do not become irreparably lost.</p>

<p>Unfortunately, given the nature of the repairs and upgrades needed on each road, when the construction company works on a particular road, it is unusable in either direction. This could cause a problem if it becomes impossible to travel between two tourist attractions, even if the construction company works on only one road at any particular time.</p>

<p>So, the Road Department of Remote Island has decided to call upon your consulting services to help remedy this problem. It has been decided that new roads will have to be built between the various attractions in such a way that in the final configuration, if any one road is undergoing construction, it would still be possible to travel between any two tourist attractions using the remaining roads. Your task is to find the minimum number of new roads necessary.</p>

### 입력

<p>The first line of input will consist of positive integers n and r, separated by a space, where 3 &le; n &le; 1000 is the number of tourist attractions on the island, and 2 &le; r &le; 1000 is the number of roads. The tourist attractions are conveniently labelled from 1 to n.</p>

<p>Each of the following r lines will consist of two integers, v and w, separated by a space, indicating that a road exists between the attractions labelled v and w. Note that you may travel in either direction down each road, and any pair of tourist attractions will have at most one road directly between them. Also, you are assured that in the current configuration, it is possible to travel between any two tourist attractions.</p>

### 출력

<p>One line, consisting of an integer, which gives the minimum number of roads that we need to add.</p>
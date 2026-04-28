# [Platinum III] Hotels - 10122

[문제 링크](https://www.acmicpc.net/problem/10122)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 368, 정답: 158, 맞힌 사람: 127, 정답 비율: 47.566%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 조합론, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>There are n towns in Byteotia, connected with only n-1 roads. Each road directly links two towns. All the roads have the same length and are two way. It is known that every town can be reached from every other town via a route consisting of one or more (direct-link) roads. In other words, the road network forms a tree.</p>

<p>Byteasar, the king of Byteotia, wants three luxury hotels erected to attract tourists from all over the world. The king desires that the hotels be in different towns and at the same distance one from each other.</p>

<p>Help the king out by writing a program that determines the number of possible locations of the hotel triplet in Byteotia.</p>

### 입력

<p>The first line of the standard input contains a single integer n(1 &le; n &le; 5,000), the number of towns in Byteotia. The towns are numbered from 1 to n.</p>

<p>The Byteotian road network is then described in n-1 lines. Each line contains two integers&nbsp;a and b (1 &le; a &le; b &le; n) , separated by a single space, that indicate there is a direct road between the towns a and b.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer equal to the number of possible placements of the hotels.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10122.%E2%80%85Hotels/06711b90.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10122.%E2%80%85Hotels/06711b90.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10122/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:146px; width:224px" /></p>

<p>The triplets (unordered) of towns where the hotels can be erected are: {1,3,5}, {2,4,6}, {2,4,7}, {2,6,7}, {4,6,7}.</p>
# [Platinum I] Surely You Congest - 8879

[문제 링크](https://www.acmicpc.net/problem/8879)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 256 MB

### 통계

제출: 312, 정답: 101, 맞힌 사람: 67, 정답 비율: 29.258%

### 분류

데이크스트라, 최대 유량, 그래프 이론, 최단 경로

### 문제 설명

<p>You are in charge of designing an advanced centralized trafﬁc management system for smart cars. The goal is to use global information to instruct morning commuters, who must drive downtown from the suburbs, how best to get to the city center while avoiding trafﬁc jams.</p>

<p>Unfortunately, since commuters know the city and are selﬁsh, you cannot simply tell them to travel routes that take longer than normal (otherwise they will just ignore your directions). You can only convince them to change to different routes that are equally fast.</p>

<p>The city&rsquo;s network of roads consists of intersections that are connected by bidirectional roads of various travel times. Each commuter starts at some intersection, which may vary from commuter to commuter. All commuters end their journeys at the same place, which is downtown at intersection 1. If two commuters attempt to start travelling along the same road in the same direction at the same time, there will be congestion; you must avoid this. However, it is ﬁne if two commuters pass through the same intersection simultaneously or if they take the same road starting at different times.</p>

<p>Determine the maximum number of commuters who can drive downtown without congestion, subject to all commuters starting their journeys at exactly the same time and without any of them taking a suboptimal route.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8879.%E2%80%85Surely%E2%80%85You%E2%80%85Congest/7e38a0e0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8879.%E2%80%85Surely%E2%80%85You%E2%80%85Congest/7e38a0e0.png" data-original-src="https://www.acmicpc.net/upload/images/commute.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:237px; width:261px" /></p>

<p>Figure C.1: Illustration of Sample Input.</p>

<p>In Figure C.1, cars are shown in their original locations. One car is already downtown. Of the cars at intersection 4, one can go along the dotted route through intersection 3, and another along the dashed route through intersection 2. But the remaining two cars cannot reach downtown while avoiding congestion. So a maximum of 3 cars can reach downtown with no congestion.</p>

### 입력

<p>The input consists of a single test case. The ﬁrst line contains three integers n, m, and c, where n (1 &le; n &le; 25 000) is the number of intersections, m (0 &le; m &le; 50 000) is the number of roads, and c (0 &le; c &le; 1 000) is the number of commuters. Each of the next m lines contains three integers x<sub>i</sub>, y<sub>i</sub>, and t<sub>i</sub> describing one road, where x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; n) are the distinct intersections the road connects, and t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10 000) is the time it takes to travel along that road in either direction. You may assume that downtown is reachable from every intersection. The last line contains c integers listing the starting intersections of the commuters.</p>

### 출력

<p>Display the maximum number of commuters who can reach downtown without congestion.</p>
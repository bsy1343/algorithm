# [Platinum II] Highway Hassle - 10326

[문제 링크](https://www.acmicpc.net/problem/10326)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 20, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

데이크스트라, 그래프 이론, 그리디 알고리즘, 최단 경로

### 문제 설명

<p><a href="https://xkcd.com/951/"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10326.%E2%80%85Highway%E2%80%85Hassle/b20d7a22.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10326.%E2%80%85Highway%E2%80%85Hassle/b20d7a22.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/images2/working.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:395px; width:339px" /></a>A transport company has come to you for help. One of the biggest expenses that they have is the petrol for the trucks. They would like to minimize the money they need to spend on petrol.</p>

<p>Because of the long trips, a truck driver typically needs to stop multiple times at a petrol station to tank up. What complicates matters is that the price of petrol is not the same at every station. The differences could in fact be so significant that it pays to take a detour in order to visit a station with a low price. Yet another complication is that the price is not the same every day (but it does not change during the day).</p>

<p>The good news is that they can find out, every morning, what the price of petrol is at every station for that day. They also have, for every destination, a simple graph representing the relevant part of the road network, containing only the major intersections and petrol stations as nodes. Furthermore, they know for every road exactly how much petrol is needed to go from one node to the other, down to the milliliter; it does not depend on the direction or the amount of petrol in the tank. The truck drivers also have the ability to tank with milliliter precision.</p>

<p>It is perfectly fine for a truck to run out of petrol at the exact moment it arrives at a petrol station or at the destination; there is in fact a spare tank to allow for small fluctuations in fuel consumption, but that petrol is not supposed to be used. You may therefore ignore its existence.</p>

<p>A final thing to take into consideration is that the trucks have a fuel tank of limited size. With all that information, can you work out what the optimal path to the destination is, along with the optimal tanking strategy?</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with three space-separated integers n, m and s (2 &le; n &le; 1 000 and 1 &le; m &le; 10 000 and 1 &le; s &le; 120): the number of nodes, edges and petrol stations, respectively.</li>
	<li>one line with a single integer t (1 &le; t &le; 100 000): the maximum amount of petrol that the fuel tank can hold in milliliters.</li>
	<li>m lines, each with three space-separated integers a, b and f (1 &le; a, b &le; n and a &ne;&nbsp;b and 1 &le; f &le; 100 000), indicating that there is a road between nodes a and b which takes f milliliters of petrol (fuel) to traverse.</li>
	<li>s lines, each with two space-separated integers x and p (1 &le; x &le; n and 1 &le; p &le; 100): the node x where each petrol station is located and the price p per milliliter of petrol at that station, respectively.</li>
	<li>one line with two space-separated integers c and d (1 &le; c, d &le; n and c &ne; d): the nodes where the company and the destination are located, respectively.</li>
</ul>

<p>Every road is bidirectional. There is at most one road between any pair of nodes. There is always a petrol station at node c (it is right next to the company). The truck starts with an empty tank. The destination is guaranteed to be reachable.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with a single integer: the minimum amount of money that needs to be spent on petrol.</li>
</ul>
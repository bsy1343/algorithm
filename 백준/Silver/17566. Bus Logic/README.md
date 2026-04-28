# [Silver V] Bus Logic - 17566

[문제 링크](https://www.acmicpc.net/problem/17566)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 186, 정답: 94, 맞힌 사람: 85, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>A core part of the decision of where to live in a city like Nottingham is the availability of transport links to interesting places. This is particularly intersting to Max, who enlivens his stressful life as organiser of UKIEPC by making frequent sightseeing travels around town in a bright orange bus.</p>

<p>Max&rsquo;s idea of a good time is a visit to a spot that takes exactly one bus journey to get to. He is considering moving house to be near to one specific spot along his favourite bus route&mdash;how many such other scenic spots can he reach from there (assuming that on a given trip he can choose a new bus route each time)?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/17566.%E2%80%85Bus%E2%80%85Logic/1f602db4.png" data-original-src="https://upload.acmicpc.net/88169d21-0b5e-4acd-97e3-ceebab42baeb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 193px; height: 200px;" /></p>

<p style="text-align: center;">Figure B.1: A bus route map illustrating Sample Input 1. Max, as usual, is drawn as a white dot in the centre of each bus stop he can start from.</p>

### 입력

<ul>
	<li>The first line of input contains three integers: Max&rsquo;s starting stop, m (1 &le; m &le; s). the number of buses, b (1 &le; b &le; 50), and the number of stops, s (1 &le; s &le; 50).</li>
	<li>The next b lines contain the bus routes, each written as a string of s characters where having the ith character as &rsquo;1&rsquo; denotes that this bus route has a stop at i, and &rsquo;0&rsquo; denotes that it does not.</li>
</ul>

### 출력

<p>Output the maximum number of other stops Max can reach from the starting stop by taking exactly one bus.</p>
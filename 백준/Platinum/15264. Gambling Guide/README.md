# [Platinum I] Gambling Guide - 15264

[문제 링크](https://www.acmicpc.net/problem/15264)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 154, 정답: 64, 맞힌 사람: 56, 정답 비율: 43.077%

### 분류

데이크스트라, 그래프 이론, 수학, 확률론, 최단 경로

### 문제 설명

<p>A railroad network in a nearby country consists of n cities numbered 1 through n, and m two-way railroad tracks each connecting two different cities. Tickets can only be purchased at automated machines installed at every city. Unfortunately, hackers have tampered with the ticket machines and now they all work as follows: when a single coin is inserted in the machine installed at city a, the machine dispenses a single one-way ticket from a to a random neighboring city. More precisely, the destination city is chosen uniformly at random among all cities directly connected to a with a railroad track. Destinations on different tickets originating in the same city are independent.</p>

<p>A computer science student needs to travel from city 1 (where she lives) to city n (where a regional programming contest has already started). She knows how the machines work (but of course cannot predict the random choices) and has a map of the railway network. In each city, when she purchases a ticket, she can either immediately use it and travel to the destination city on the ticket, or discard the ticket and purchase a new one. She can keep purchasing tickets indefinitely. The trip is finished as soon as she reaches city n.</p>

<p>After doing some calculations, she has devised a traveling strategy with the following properties:</p>

<ul>
	<li>The probability that the trip will eventually finish is 1.</li>
	<li>The expected number of coins spent on the trip is the smallest possible.</li>
</ul>

<p>Find the expected number of coins she will spend on the trip.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 300 000) &mdash; the number of cities and the number of railroad tracks. Each of the following m lines contains two different integers a and b (1 &le; a, b &le; n) which describe a railroad track connecting cities a and b. There will be at most one railroad track between each pair of cities. It will be possible to reach city n starting from city 1.</p>

### 출력

<p>Output a single number &mdash; the expected number of coins spent. The solution will be accepted if the absolute or the relative difference from the judges solution is less than 10<sup>&minus;6</sup>.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15264.%E2%80%85Gambling%E2%80%85Guide/9f988257.png" data-original-src="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15264/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:150px; width:158px" /></p>
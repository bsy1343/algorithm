# [Gold III] Travel (Small) - 12066

[문제 링크](https://www.acmicpc.net/problem/12066)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 16, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>There are&nbsp;<strong>N</strong>&nbsp;cities in Chelsea&#39;s state (numbered starting from 1, which is Chelsea&#39;s city), and&nbsp;<strong>M</strong>&nbsp;bidirectional roads directly connect them. (A pair of cities may even be directly connected by more than one road.) Because of changes in traffic patterns, it may take different amounts of time to use a road at different times of day, depending on when the journey starts. (However, the direction traveled on the road does not matter -- traffic is always equally bad in both directions!) All trips on a road start (and end) exactly on the hour, and a trip on one road can be started instantaneously after finishing a trip on another road.</p>

<p>Chelsea loves to travel and is deciding where to go for her winter holiday trip. She wonders how quickly she can get from her city to various other destination cities, depending on what time she leaves her city. (Her route to her destination may include other intermediate cities on the way.) Can you answer all of her questions?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>The first line of each test case contains three integers: the number&nbsp;<strong>N</strong>&nbsp;of cities, the number&nbsp;<strong>M</strong>&nbsp;of roads, and the number&nbsp;<strong>K</strong>&nbsp;of Chelsea&#39;s questions.</p>

<p>2<strong>M</strong>&nbsp;lines --&nbsp;<strong>M</strong>&nbsp;pairs of two lines -- follow. In each pair, the first line contains two different integers x and y that describe one bidirectional road between the x-th city and the y-th city. The second line contains 24 integers Cost[t] (0 &le; t &le; 23) that indicate the time cost, in hours, to use the road when departing at t o&#39;clock on that road. It is guaranteed that Cost[t] &le; Cost[t+1]+1 (0 &le; t &le; 22) and Cost[23] &le; Cost[0]+1.</p>

<p>Then, an additional&nbsp;<strong>K</strong>&nbsp;lines follow. Each contains two integers&nbsp;<strong>D</strong>&nbsp;and&nbsp;<strong>S</strong>&nbsp;that comprise a question: what is the fewest number of hours it will take to get from city 1 to city&nbsp;<strong>D</strong>, if Chelsea departs city 1 at&nbsp;<strong>S</strong>&nbsp;o&#39;clock?</p>

<h3>Limits</h3>

<ul>
	<li>1 &le; x, y &le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le; all Cost values &le; 50.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>0 &le;&nbsp;<strong>S</strong>&nbsp;&le; 23.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot;, where x is the case number (starting from 1), followed by&nbsp;<strong>K</strong>&nbsp;distinct space-separated integers that are the answers to the questions, in order. If Chelsea cannot reach the destination city for a question, no matter which roads she takes, then output -1 for that question.</p>
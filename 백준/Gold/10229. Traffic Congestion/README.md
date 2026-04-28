# [Gold III] Traffic Congestion - 10229

[문제 링크](https://www.acmicpc.net/problem/10229)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 60, 정답: 25, 맞힌 사람: 24, 정답 비율: 43.636%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10229.%E2%80%85Traffic%E2%80%85Congestion/de66417e.png" data-original-src="https://upload.acmicpc.net/62bc9a03-2d33-4c17-a2b4-0bb2b4f10176/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 267px; float: right;" />Although Canada is a large country, many areas are uninhabited, and most of the population lives near the southern border. The Trans-Canada Highway, completed in 1962, connects the people living in this strip of land, from St. John&#39;s in the East to Victoria in the West, a distance of 7&thinsp;821 km.</p>

<p>Canadians like hockey. After a hockey game, thousands of fans get in their cars and drive home from the game, causing heavy congestion on the roads. A wealthy entrepreneur wants to buy a hockey team and build a new hockey arena. Your task is to help him select a location for the arena to minimize the traffic congestion after a hockey game.</p>

<p>The country is organized into cities connected by a network of roads. All roads are bidirectional, and there is exactly one&nbsp;<i>route</i>&nbsp;connecting any pair of cities. A&nbsp;<i>route</i>&nbsp;connecting the cities c<sub>0</sub>&nbsp;and c<sub>k</sub>&nbsp;is a sequence of distinct cities c<sub>0</sub>, ..., c<sub>k</sub>&nbsp;such that there is a road from c<sub>i-1</sub>&nbsp;to c<sub>i</sub>&nbsp;for each i. The new arena must be built in one of the cities, which we will call the arena city.&nbsp;After a hockey game, all of the hockey fans travel from the arena city to their home city, except those who already live in the arena city. The amount of congestion on each road is proportional to the number of hockey fans that travel along the road. You must locate the arena city such that the amount of congestion on the most congested road is as small as possible. If there are several equally good locations, you may choose any one.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10229.%E2%80%85Traffic%E2%80%85Congestion/f6d16ac9.png" data-original-src="https://upload.acmicpc.net/6af09938-5290-43d8-9246-161b3a6830ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 362px; height: 491px; float: right;" />You are to implement a procedure&nbsp;<b>LocateCentre(N,P,S,D)</b>.&nbsp;<b>N</b>&nbsp;is a positive integer, the number of cities. The cities are numbered from 0 to N-1.&nbsp;<b>P</b>&nbsp;is an array of N positive integers; for each i, P[i] is the number of hockey fans living in the city numbered i. The total number of hockey fans in all the cities will be at most 2&thinsp;000&thinsp;000&thinsp;000.&nbsp;<b>S</b>&nbsp;and&nbsp;<b>D</b>&nbsp;are arrays of N-1 integers each, specifying the locations of roads. For each i, there is a road connecting the two cities whose numbers are S[i] and D[i]. The procedure must return an integer, the number of the city that should be the arena city.</p>

### 입력



### 출력



### 힌트

<p>We remind contestants that with the given constraints, it is possible to submit a solution that passes Subtask 3 and fails Subtask 2. However, remember that your final score for the entire task is determined by&nbsp;<i>only one</i>&nbsp;of your submissions.</p>
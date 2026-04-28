# [Gold III] Big Truck - 13290

[문제 링크](https://www.acmicpc.net/problem/13290)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 66, 맞힌 사람: 59, 정답 비율: 68.605%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Your boss has hired you to drive a big truck, transporting items between two locations in a city. You&rsquo;re given a description of the city, with locations of interest and the lengths of roads between them. Your boss requires that you take a shortest path between the starting and ending location, and she&rsquo;ll check your odometer when you&rsquo;re done to make sure you didn&rsquo;t take any unnecessary side trips. However, your friends know you have plenty of unused space in the truck, and they&nbsp;have asked you to stop by several locations in town, to pick up items for them. You&rsquo;re happy to do this for them. You may not be able to visit every location to pick up everything your friends want, but you&rsquo;d like to pick up as many items as possible on your trip, as long as it doesn&rsquo;t make the path any longer than necessary.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13290.%E2%80%85Big%E2%80%85Truck/f2fec36a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13290/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-30%20%EC%98%A4%ED%9B%84%206.48.18.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:170px; width:440px" /></p>

<p>The two graphs above show examples of what the city may look like, with nodes representing locations, edges representing roads and dots inside the nodes epresenting items your friends have asked you to pick up. Driving through a location allows you to pick up all the items there; it&rsquo;s a big truck, with no limit on the items it can carry. In the graph on the left, for example, you have to drive the big truck from location 1 to location 6. If you follow the path 1 &rarr; 2 &rarr; 3 &rarr; 6, the length is 9, and you&rsquo;ll get to pick up 4 items. Of course, it would be better to drive 1 &rarr; 4 &rarr; 5 &rarr; 6; that&rsquo;s still a length of 9, but going this way instead lets you pick up an additional item. Driving 1 &rarr; 4 &rarr; 3 &rarr; 6 would let you pick up even more items, but it would make your trip longer, so you can&rsquo;t go this way.</p>

### 입력

<p>The first line of input contains an integer, n (2 &le; n &le; 100), giving the number of locations in the city. Locations are numbered from 1 to n, with location 1 being the starting location and n being the destination. The next input line gives a sequence of n integers, t<sub>1</sub> . . . t<sub>n</sub>, where each t<sub>i</sub> indicates the number of items your friends have asked you to pick up from location i. All the t<sub>i</sub> values are between 0 and 100, inclusive. The next input line contains a non-negative integer, m, giving the number of roads in the city. Each of the following m lines is a description of a road, given as three integers, a b d. This indicates that there is a road of length d between location a and location b. The values of a and b are in the range 1 . . . n, and the value of d is between 1 and 100, inclusive. All roads can be traversed in either direction, there is at most one road between any two locations, and no road starts and ends at the same location.</p>

### 출력

<p>If it&rsquo;s not possible to travel from location 1 to location n, just output out the word &ldquo;impossible&rdquo;. Otherwise, output the length of a shortest path from location 1 to location n, followed by the maximum number of items you can pick up along the way.</p>
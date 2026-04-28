# [Platinum V] Ship Traffic - 10792

[문제 링크](https://www.acmicpc.net/problem/10792)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 123, 정답: 44, 맞힌 사람: 38, 정답 비율: 33.043%

### 분류

수학, 정렬, 스위핑

### 문제 설명

<p>Ferries crossing the Strait of Gibraltar from Morocco to Spain must carefully navigate to avoid the heavy ship traffic along the strait. Write a program to help ferry captains find the largest gaps in strait traffic for a safe crossing.</p>

<p>Your program will use a simple model as follows. The strait has several parallel shipping lanes in eastwest direction. Ships run with the same constant speed either eastbound or westbound. All ships in the same lane run in the same direction. Satellite data provides the positions of the ships in each lane. The ships may have different lengths. Ships do not change lanes and do not change speed for the crossing ferry.</p>

<p>The ferry waits for an appropriate time when there is an adequate gap in the ship traffic. It then crosses the strait heading northbound along a north-south line at a constant speed. From the moment a ferry enters a lane until the moment it leaves the lane, no ship in that lane may touch the crossing line. Ferries are so small you can neglect their size. Figure I.1 illustrates the lanes and ships for Sample Input 1. Your task is to find the largest time interval within which the ferry can safely cross the strait.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10792.%E2%80%85Ship%E2%80%85Traffic/e77b35d4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10792/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:137px; width:471px" /></p>

<p style="text-align: center;">Figure I.1: Sample Input 1.</p>

### 입력

<p>The first line of input contains six integers: the number of lanes n (1 &le; n &le; 10<sup>5</sup>), the width w of each lane (1 &le; w &le; 1 000), the speed u of ships and the speed v of the ferry (1 &le; u, v &le; 100), the ferry&rsquo;s earliest start time t<sub>1</sub> and the ferry&rsquo;s latest start time t<sub>2</sub> (0 &le; t<sub>1</sub> &lt; t<sub>2</sub> &le; 10<sup>6</sup>). All lengths are given in meters, all speeds are given in meters/second, and all times are given in seconds.</p>

<p>Each of the next n lines contains the data for one lane. Each line starts with either E or W, where E indicates that ships in this lane are eastbound and W indicates that ships in this lane are westbound. Next in the line is an integer m<sub>i</sub>, the number of ships in this lane (0 &le; m<sub>i</sub> &le; 10<sup>5</sup> for each 1 &le; i &le; n). It is followed by m<sub>i</sub> pairs of integers l<sub>ij</sub> and p<sub>ij</sub> (1 &le; l<sub>ij</sub> &le; 1 000 and &minus;10<sup>6</sup> &le; p<sub>ij</sub> &le; 10<sup>6</sup>). The length of ship j in lane i is l<sup>ij</sup> , and p<sup>ij</sup> is the position at time 0 of its forward end, that is, its front in the direction it moves.</p>

<p>Ship positions within each lane are relative to the ferry&rsquo;s crossing line. Negative positions are west of the crossing line and positive positions are east of it. Ships do not overlap or touch, and are sorted in increasing order of their positions. Lanes are ordered by increasing distance from the ferry&rsquo;s starting point, which is just south of the first lane. There is no space between lanes. The total number of ships is at least 1 and at most 10<sup>5</sup>.</p>

### 출력

<p>Display the maximal value d for which there is a time s such that the ferry can start a crossing at any time t with s &le; t &le; s + d. Additionally the crossing must not start before time t<sub>1</sub> and must start no later than time t<sub>2</sub>. The output must have an absolute or relative error of at most 10<sup>&minus;3</sup>. You may assume that there is a time interval with d &gt; 0.1 seconds for the ferry to cross.</p>
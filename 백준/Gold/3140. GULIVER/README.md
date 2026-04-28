# [Gold I] GULIVER - 3140

[문제 링크](https://www.acmicpc.net/problem/3140)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 88, 정답: 29, 맞힌 사람: 24, 정답 비율: 48.980%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Once upon a time, on the island inhabited by Lilliput, a great traveler Gulliver was woken up by the cheering of the above mentioned people. After the initial struggle, Lilliputans started telling him about their war with the inhabitants of the neighboring island, Blefuscu.&nbsp;</p>

<p>It is little known that Blefuscu and Lilliput once lived on the same island. After someone had baked an egg, the two nations couldn&rsquo;t agree which side they should start eating the egg on. The war escalated so much that they decided to split the island in two. The South side was taken by Blefuscu, and the Northside was taken by Lilliput.&nbsp;</p>

<p>Miraculously, the island&rsquo;s shape was rectangular, composed of R&times;C square parcels. Some of the parcels were already underwater, and the citizens decided to flood some other parcels. The island was to be divided into at least two parts, one of which would contain the entire top row (the North side) and the other part the entire bottom row (the South side). Two parcels that aren&rsquo;t underwater belong to the same part of the island if one can get from one to the other by moving up, down, left and right.&nbsp;</p>

<p>For example, if the left image below shows the island before the incident (the black parcels were already underwater), then to separate the island, only two more parcels need to be divided, as in the right image.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3140.%E2%80%85GULIVER/f8b4af50.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3140.%E2%80%85GULIVER/f8b4af50.png" data-original-src="https://upload.acmicpc.net/ec7b6f3a-2baa-4dd7-8a65-2d89a239c6f1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 364px; height: 124px;" /></p>

<p>The historic problem that people have been talking about for generations is: what was the least number of parcels that had to be flooded to completely separate the two parts of the island? Your task is to write the program which computes that number.&nbsp;</p>

### 입력

<p>The first line of input consists of two numbers, R and C (3 &le; R, C &le; 1 000), the number of rows and columns the island consists of.&nbsp;</p>

<p>Each of the following R lines contains C characters, either &#39;.&#39; or &#39;#&#39;. The &#39;#&#39; sign represent underwater parcels. The input will be such that all of the parcels that aren&rsquo;t underwater are connected and no parcels are flooded in the top and bottom rows.&nbsp;</p>

### 출력

<p>Output the number of parcels that need to be flooded to separate the two parts of the island.</p>
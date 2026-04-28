# [Platinum II] The Captain - 15623

[문제 링크](https://www.acmicpc.net/problem/15623)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 11, 정답 비율: 61.111%

### 분류

값 / 좌표 압축, 데이크스트라, 그래프 이론, 최단 경로, 정렬

### 문제 설명

<p>Captain Byteasar compasses the waters of Byteic Sea together with his irreplaceable First Officer Bytec. There are n&nbsp;islands in the Byteic Sea, which we numbered from 1 to n. Captain&#39;s ship has docked at the island number 1. Captain&#39;s expedition plan is to sail to the island number n.</p>

<p>During the voyage, the ship always moves in one of four directions of the world: north, south, east or west. At any time it is either the Captain or the First Officer standing at the helm. Every time the ship will perform 90&deg;&nbsp;turn, they would change at the helm.</p>

<p>Along its way, the vessel may stop at other islands. After each stop, the Captain can decide whether he takes control of the helm first, or not. In other words, for each route leg, leading from an island to another one, one of the sailors stands at the helm while the ship is travelling north or south, and the other controls it while it is moving east or west. In particular, if a given fragment of the route runs exactly in one of the four directions of the world, the ship is controlled by only one of the sailors.</p>

<p>The captain is now considering how to plan a route of the forthcoming voyage and how to divide labour in such a way to spend as little time at the helm. At the same time the Captain does not care how long the calculated route would be. It is assumed that the vessel is sailing at a constant rate of one unit per hour.</p>

### 입력

<p>The first line of input contains a single integer n&nbsp;(2 &le; n &le; 200,000) denoting the number of islands in the sea. For simplicity, we introduce a coordinate system onto Byteic Sea with axes parallel to the directions of the world. Every island is represented as a single point. Subsequent n&nbsp;lines contain descriptions of the islands: i-th line contains two integers x<sub>i</sub>, y<sub>i</sub>&nbsp;(0 &le; x<sub>i</sub> &le; y<sub>i</sub> &le; 1,000,000,000) denoting the coordinates of i-th island in the sea. Each island bears different coordinates.</p>

### 출력

<p>Your program should output a single integer denoting the least number of hours the Captain will have to steer the ship on the route from the island number 1 to the number n.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15623.%E2%80%85The%E2%80%85Captain/b685fbfe.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15623.%E2%80%85The%E2%80%85Captain/b685fbfe.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15623/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float: right; width: 288px; height: 277px;" />The Captain may designate a route that is indicated in the figure. During the voyage from island 1&nbsp;(coordinates: (2, 2)) to the island 4&nbsp;(coordinates: (7, 1)) the Captain controls the ship only for an hour, while the ship is sailing south. During the second leg of the trip the Captain controls the vessel only when it is moving east.</p>
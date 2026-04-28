# [Gold II] Fishermen - 16330

[문제 링크](https://www.acmicpc.net/problem/16330)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 67, 맞힌 사람: 62, 정답 비율: 70.455%

### 분류

자료 구조, 정렬, 이분 탐색, 누적 합

### 문제 설명

<p>The ocean can be represented as the first quarter of the Cartesian plane.</p>

<p>There are n fish in the ocean. Each fish has its own coordinates. There may be several fish at one point. There are also m fishermen.</p>

<p>Each fisherman has its own x-coordinate. The y-coordinate of each fisherman is equal to 0.Each fisherman has a fishing rod of length l. Therefore, he can catch a fish at a distance less than or equal to l. The distance between a fisherman in position x and a fish in position (a, b) is |a &minus; x| + b.</p>

<p>Find for each fisherman how many fish he can catch.</p>

### 입력

<p>The first line contains three integers n, m, and l (1 &le; n, m &le; 2 &middot; 10<sup>5</sup>, 1 &le; l &le; 10<sup>9</sup>) &mdash; the number of fish, the number of fishermen, and the length of the fishing rod, respectively.</p>

<p>Each of the next n lines contains two integers x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub>&nbsp;&le; 10<sup>9</sup>) &mdash; the fish coordinates.</p>

<p>Next line contains m integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the fishermen coordinates.</p>

### 출력

<p>For each fisherman, output the number of fish that he can catch, on a separate line.</p>

### 힌트

<p>The picture illustrates for the above example the area on which the third fisherman can catch fish.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16330.%E2%80%85Fishermen/bebc4760.png" data-original-src="https://upload.acmicpc.net/678ef55b-676a-4f61-b0dc-3591461e7f6b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 449px; height: 307px;" /></p>
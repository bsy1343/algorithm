# [Gold IV] Honeycomb Problem - 3394

[문제 링크](https://www.acmicpc.net/problem/3394)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p><em>Figure 1</em> shows a honeycomb of numbers (side length of the honeycomb is 3). A route starts from some node in the uppermost row and ends at some node in the lowest row. From a node, the route can continue only diagonally down to the left or diagonally down to the right. When creating a route through the honeycomb, you are allowed to make <em>at most</em> one swap of two numbers on <em>at most</em> one horizontal row of the honeycomb. (Swapping essentially means that in one chosen row you are allowed to place the greatest number of that row to any position on the same row.) Your task is to write a program that calculates the highest sum of numbers on any route using the ability of swapping two numbers on a chosen row.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3394.%E2%80%85Honeycomb%E2%80%85Problem/550653f7.png" data-original-src="https://upload.acmicpc.net/72c4c636-3e14-4294-8576-4dac19f0f077/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 194px; height: 198px;" /></p>

<p style="text-align: center;">Figure 1. A honeycomb of side length 3.</p>

### 입력

<p>The side length of the honeycomb is in the first row of the input. If the side length is n, the honeycomb consists of 2n &minus; 1 rows. Numbers on the rows of the honeycomb are on the following 2n &minus; 1 rows as follows.</p>

### 출력

<p>The highest sum is written as an integer in the output.</p>

### 제한

<ul>
	<li>The numbers in the nodes are integers between 0 and 99.</li>
	<li>The side length of the honeycomb is an integer between 1 and 99.</li>
</ul>

### 힌트

<p>In the Figure 1 the correct solution (3 + 2 + 8 + 5 + 4 = 22) is gray shaded. Notice that number &rsquo;5&rsquo; on the 4 th row (from the top) is swapped to the 3 rd position (from the left) on that row.</p>
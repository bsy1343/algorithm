# [Gold IV] Collecting Mushrooms - 19689

[문제 링크](https://www.acmicpc.net/problem/19689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 23, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

누적 합

### 문제 설명

<p>Lim Li the Crab is running a mushroom plantation in her backyard. Her mushroom plantation can be modelled as a grid of R rows and C columns, and each grid square of her mushroom plantation can either be empty, contain a mushroom, or contain a sprinkler. For example, her mushroom plantation could look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19689.%E2%80%85Collecting%E2%80%85Mushrooms/347e0436.png" data-original-src="https://upload.acmicpc.net/e1c10968-b990-49fc-a6c3-a71ed719b07d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 253px; height: 235px;" /></p>

<p style="text-align: center;">Figure 1: A mushroom farm with R = 5 and C = 5.</p>

<p>The distance between a sprinkler and a mushroom is defined as the maximum of their separation in the two axes. In other words, if the mushroom is located at row X<sub>m</sub> and column Y<sub>m</sub> while the sprinkler is located at row X<sub>s</sub> and column Y<sub>s</sub>, their distance will be max(|X<sub>s</sub> &minus; X<sub>m</sub>|, |Y<sub>s</sub> &minus; Y<sub>m</sub>|). Sprinklers only have a limited range, so a sprinkler can only water a mushroom if the distance between them is at most D. For example, if D = 1, the areas reachable by the two sprinklers will be:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19689.%E2%80%85Collecting%E2%80%85Mushrooms/0a22bf62.png" data-original-src="https://upload.acmicpc.net/20794d3f-a507-4f27-aa39-c4bb5d8ca3dc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 253px; height: 233px;" /></p>

<p style="text-align: center;">Figure 2: Diagram showing the range of the sprinklers.</p>

<p>Mushrooms can only grow and be harvested if enough sprinklers are watering it. Specifically, a mushroom will be harvestable if at least K sprinklers are watering it. Count the number of harvestable mushrooms Lim Li can collect in her plantation.</p>

### 입력

<p>The first line of input will contain four integers: R, the number of rows, C, the number of columns, D, the maximum distance between a sprinkler and a watered mushroom, and K, the&nbsp;minimum number of sprinklers required for a mushroom to be harvestable.</p>

<p>The next R lines of input will contain C characters each, containing a grid representing the mushroom plantation. Each character will represent the contents of a particular grid square, in the following way:</p>

<ul>
	<li>&lsquo;.&rsquo; represents an empty grid square,</li>
	<li>&lsquo;M&rsquo; represents a grid square containing a mushroom,</li>
	<li>&lsquo;S&rsquo; represents a grid square containing a sprinkler.</li>
</ul>

### 출력

<p>The output should contain one line with one integer, the maximum number of mushrooms Lim Li can harvest.</p>

### 제한

<ul>
	<li>2 &le; RC &le; 500000,</li>
	<li>1 &le; D &le; max(R, C),</li>
	<li>1 &le; K &le; RC,</li>
	<li>there will be at least one mushroom,</li>
	<li>there will be at least one sprinkler.</li>
</ul>
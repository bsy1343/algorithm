# [Gold II] Delft Distance - 26177

[문제 링크](https://www.acmicpc.net/problem/26177)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 124, 정답: 74, 맞힌 사람: 68, 정답 비율: 60.177%

### 분류

다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>You are currently in your hotel at the north-west corner of Delft, and want to go to the contest site at the university in the south-east corner of Delft. To get there, you have to go right through the historical centre of the city. Like Manhattan, the city consists of a grid of $h \times w$ buildings. But unlike Manhattan, the city does not only contain square residential buildings but also some round medieval towers. All the square buildings are axis aligned with a side length of $10 \text{m}$ and all round towers have a diameter of $10 \text{m}$. There is just enough space for a small alley of negligible width between two neighbouring buildings.</p>

<p>Since you are already late for the contest start, you need to find a shortest path from your hotel to the contest site. Fortunately, you have a map of the city. See Figure D.1 for an example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26177.%E2%80%85Delft%E2%80%85Distance/b8d8590a.png" data-original-src="https://upload.acmicpc.net/58448207-8f65-4266-98b7-2c064efb926f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 183px;" /></p>

<p style="text-align: center;">Figure D.1: Illustration of Sample Input 1, with a shortest path shown in red.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $h$ and $w$ ($1 \leq h,w \leq 700$), the number of rows and the number of columns of buildings shown on the map of the city.</li>
	<li>$h$ lines, each with $w$ characters which are either &#39;<code>O</code>&#39; (for round towers) or &#39;<code>X</code>&#39; (for square buildings) describing the shapes of the buildings.</li>
</ul>

<p>The map is oriented with the north side up.</p>

### 출력

<p>Output the length of a shortest path from the north-west corner to the south-east corner of Delft in metres. Your answer may have a relative or absolute error of at most $10^{-6}$.</p>
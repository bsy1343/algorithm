# [Gold IV] Just Passing Through - 17856

[문제 링크](https://www.acmicpc.net/problem/17856)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 32, 맞힌 사람: 31, 정답 비율: 60.784%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Justin and Fred are taking a road trip, traveling from West to East across their state. They have a few Road Trip Rules:</p>

<ol>
	<li>They must have an awesome time!</li>
	<li>The trip must begin somewhere along the Western edge of the state and finish somewhere along the Eastern edge of the state.</li>
	<li>Each step in their trip must move them either directly East, diagonally Northeast, or diagonally Southeast.</li>
	<li>They want to travel through exactly n &ldquo;passes&rdquo; (defined below).</li>
	<li>Due to Fred&rsquo;s sensitivity to higher elevations, they wish to minimize the cumulative sum of elevations during the trip.</li>
	<li>They must have an awesome time!</li>
</ol>

<p>Because Justin and Fred are traveling Eastward, a &ldquo;pass&rdquo; is any location with strictly lower elevations to its East and West and strictly higher elevations to its North and South. Consider the elevation map shown in Figure E.1. Undrivable locations (either due to water or stubborn insistence on staying in-state) are shown in black, while passes are shown as gray. Locations adjacent to the border or to undrivable locations are not eligible for considerations as passes.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17856.%E2%80%85Just%E2%80%85Passing%E2%80%85Through/b9afa8d0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17856.%E2%80%85Just%E2%80%85Passing%E2%80%85Through/b9afa8d0.png" data-original-src="https://upload.acmicpc.net/e123435d-8695-4416-b975-b3462d4e1995/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 209px; height: 149px;" /></p>

<p style="text-align: center;">Figure E.1: A sample elevation map</p>

### 입력

<p>The input begins with three integers r c n representing the number of rows and columns in the representation of the state&rsquo;s topography (3 &le; r, c &le; 500) and the exact number of passes to be crossed (0 &le; n &le; 10). The next r lines each contain c elevation entries. Undrivable locations are represented by &minus;1, and all other elevations are between 0 and 1 000. There is guaranteed to be at least one drivable location on both the Eastern and Western borders.</p>

### 출력

<p>Output the sum of the elevations along the optimal path which satisfies the Road Trip Rules. If no such path exists, output impossible.</p>
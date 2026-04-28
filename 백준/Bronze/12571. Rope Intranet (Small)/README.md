# [Bronze III] Rope Intranet (Small) - 12571

[문제 링크](https://www.acmicpc.net/problem/12571)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 450, 정답: 292, 맞힌 사람: 257, 정답 비율: 68.533%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>A company is located in two very tall buildings. The company intranet connecting the buildings consists of many wires, each connecting a window on the first building to a window on the second building.</p>

<p>You are looking at those buildings from the side, so that one of the buildings is to the left and one is to the right. The windows on the left building are seen as points on its right wall, and the windows on the right building are seen as points on its left wall. Wires are straight segments connecting a window on the left building to a window on the right building.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Bronze/12571.%E2%80%85Rope%E2%80%85Intranet%E2%80%85(Small)/65b893cc.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12571/images-29.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; vertical-align:middle" /></p>

<p>You&#39;ve noticed that no two wires share an endpoint (in other words, there&#39;s at most one wire going out of each window). However, from your viewpoint, some of the wires intersect midway. You&#39;ve also noticed that exactly two wires meet at each intersection point.</p>

<p>On the above picture, the intersection points are the black circles, while the windows are the white circles.</p>

<p>How many intersection points do you see?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with a line containing an integer&nbsp;<strong>N</strong>, denoting the number of wires you see.</p>

<p>The next&nbsp;<strong>N</strong>&nbsp;lines each describe one wire with two integers&nbsp;<strong>A<sub>i</sub></strong>&nbsp;and&nbsp;<strong>B<sub>i</sub></strong>. These describe the windows that this wire connects:&nbsp;<strong>A<sub>i</sub></strong>&nbsp;is the height of the window on the left building, and&nbsp;<strong>B<sub>i</sub></strong>is the height of the window on the right building.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 15.</li>
	<li>1 &le;&nbsp;<strong>A<sub>i</sub></strong>&nbsp;&le; 10<sup>4</sup>.</li>
	<li>1 &le;&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&le; 10<sup>4</sup>.</li>
	<li>Within each test case, all&nbsp;<strong>A<sub>i</sub></strong>&nbsp;are different.</li>
	<li>Within each test case, all&nbsp;<strong>B<sub>i</sub></strong>&nbsp;are different.</li>
	<li>No three wires intersect at the same point.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of intersection points you see.</p>
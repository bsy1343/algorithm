# [Platinum V] Don't Break The Nile (Small) - 12238

[문제 링크](https://www.acmicpc.net/problem/12238)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 17, 맞힌 사람: 14, 정답 비율: 63.636%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Aliens have landed. These aliens find our Earth&#39;s rivers intriguing because their home planet has no flowing water at all, and now they want to construct their alien buildings in some of Earth&#39;s rivers. You have been tasked with making sure their buildings do not obstruct the flow of these rivers too much, which would cause serious problems. In particular, you need to determine what the maximum flow that the river can sustain is, given the placement of buildings.</p>

<p>The aliens prefer to construct their buildings on stretches of river that are straight and have uniform width. Thus you decide to model the river as a rectangular grid, where each cell has integer coordinates (<strong>X</strong>, <strong>Y</strong>; 0 &le; <strong>X</strong> &lt; <strong>W</strong> and 0 &le; <strong>Y</strong> &lt; <strong>H</strong>). Each cell can sustain a flow of 1 unit through it, and the water can flow between edge-adjacent cells. All the cells on the south side of the river (that is with y-coordinate equal to 0) have an implicit incoming flow of 1. All buildings are rectangular and are grid-aligned. The cells that lie under a building cannot sustain any flow. Given these constraints, determine the maximum amount of flow that can reach the cells on the north side of the river (that is with y-coordinate equal to <strong>H</strong>-1).</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case will begin with a single line containing three integers, <strong>W</strong>, the width of the river, <strong>H</strong>, the height of the river, and <strong>B</strong>, the number of buildings being placed in the river. The next <strong>B</strong> lines will each contain four integers, <strong>X0</strong>, <strong>Y0</strong>, <strong>X1</strong>, and <strong>Y1</strong>. <strong>X0</strong>, <strong>Y0</strong> are the coordinates of the lower-left corner of the building, and <strong>X1</strong>, <strong>Y1</strong> are the coordinates of the upper-right corner of the building. Buildings will not overlap, although two buildings can share an edge.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>0 &le; <strong>X0</strong> &le; <strong>X1</strong> &lt; <strong>W</strong>.</li>
	<li>0 &le; <strong>Y0</strong> &le; <strong>Y1</strong> &lt; <strong>H</strong>.</li>
	<li><span style="line-height:1.6em">3 &le; </span><strong style="line-height:1.6em">W</strong><span style="line-height:1.6em"> &le; 100.</span></li>
	<li>3 &le; <strong>H</strong> &le; 500.</li>
	<li>0 &le; <strong>B</strong> &le; 10.</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: m&quot;, where x is the test case number (starting from 1) and m is the maximum flow that can pass through the river.</p>

### 힌트

<p>Here are visual representations of the two test cases in the sample input:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12238.%E2%80%85Don't%E2%80%85Break%E2%80%85The%E2%80%85Nile%E2%80%85(Small)/a4d7a38a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12238.%E2%80%85Don't%E2%80%85Break%E2%80%85The%E2%80%85Nile%E2%80%85(Small)/cd1ac408.png" data-original-src="https://boja.mercury.kr/assets/problem/12238-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:202px; width:202px" />&nbsp; &nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12238.%E2%80%85Don't%E2%80%85Break%E2%80%85The%E2%80%85Nile%E2%80%85(Small)/3a02283a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12238.%E2%80%85Don't%E2%80%85Break%E2%80%85The%E2%80%85Nile%E2%80%85(Small)/23a35eed.png" data-original-src="https://boja.mercury.kr/assets/problem/12238-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:352px; width:302px" /></p>
# [Gold II] Cliff Climbing - 4977

[문제 링크](https://www.acmicpc.net/problem/4977)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 19, 맞힌 사람: 19, 정답 비율: 57.576%

### 분류

데이크스트라, 그래프 이론, 구현, 최단 경로

### 문제 설명

<p>At 17:00, special agent Jack starts to escape from the enemy camp. There is a cliff in between the camp and the nearest safety zone. Jack has to climb the almost vertical cliff by stepping his feet on the blocks that cover the cliff. The cliff has slippery blocks where Jack has to spend time to take each step. He also has to bypass some blocks that are too loose to support his weight. Your mission is to write a program that calculates the minimum time to complete climbing.</p>

<p>Figure D-1 shows an example of cliff data that you will receive. The cliff is covered with square blocks. Jack starts cliff climbing from the ground under the cliff, by stepping his left or right foot on one of the blocks marked with &#39;S&#39; at the bottom row. The numbers on the blocks are the &quot;slippery levels&quot;. It takes t time units for him to safely put his foot on a block marked with t, where 1 &le; t &le; 9. He cannot put his feet on blocks marked with &#39;X&#39;. He completes the climbing when he puts either of his feet on one of the blocks marked with &#39;T&#39; at the top row.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4977.%E2%80%85Cliff%E2%80%85Climbing/33783cda.png" data-original-src="https://www.acmicpc.net/upload/images3/D-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:313px; width:324px" /></p>

<p style="text-align:center">Figure D-1: Example of Cliff Data</p>

<p>Jack&#39;s movement must meet the following constraints. After putting his left (or right) foot on a block, he can only move his right (or left, respectively) foot. His left foot position (lx, ly) and his right foot position (rx, ry) should satisfy lx &lt; rx and | lx - rx | + | ly - ry | &le; 3. This implies that, given a position of his left foot in Figure D-2 (a), he has to place his right foot on one of the nine blocks marked with blue color. Similarly, given a position of his right foot in Figure D-2 (b), he has to place his left foot on one of the nine blocks marked with blue color.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4977.%E2%80%85Cliff%E2%80%85Climbing/39e0dff4.png" data-original-src="https://www.acmicpc.net/upload/images3/D-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:238px; width:406px" /></p>

<p style="text-align:center">Figure D-2: Possible Placements of Feet</p>

### 입력

<p>The input is a sequence of datasets. The end of the input is indicated by a line containing two zeros separated by a space. Each dataset is formatted as follows:</p>

<pre>
w h
s(1,1) ... s(1,w)
s(2,1) ... s(2,w)
...
s(h,1) ... s(h,w)</pre>

<p>The integers w and h are the width and the height of the matrix data of the cliff. You may assume 2 &le; w &le; 30 and 5 &le; h &le; 60. Each of the following h lines consists of w characters delimited by a space. The character s(y, x) represents the state of the block at position (x, y) as follows:</p>

<ul>
	<li>&#39;S&#39;: Jack can start cliff climbing from this block.</li>
	<li>&#39;T&#39;: Jack finishes climbing when he reaches this block.</li>
	<li>&#39;X&#39;: Jack cannot put his feet on this block.</li>
	<li>&#39;1&#39; - &#39;9&#39; (= t): Jack has to spend t time units to put either of his feet on this block.</li>
</ul>

<p>You can assume that it takes no time to put a foot on a block marked with &#39;S&#39; or &#39;T&#39;.</p>

### 출력

<p>For each dataset, print a line only having a decimal integer indicating the minimum time required for the cliff climbing, when Jack can complete it. Otherwise, print a line only having &quot;-1&quot; for the dataset. Each line should not have any characters other than these numbers.</p>
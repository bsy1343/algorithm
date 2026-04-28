# [Gold III] Frogger - 4499

[문제 링크](https://www.acmicpc.net/problem/4499)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 13, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

구현, 그래프 이론, 최단 경로, 데이크스트라, 격자 그래프, 0-1 너비 우선 탐색

### 문제 설명

<p>Philip J. Frog just wanted to go for a mid-afternoon swim, but in typical frog fashion he&#39;s ended up in the middle of a busy street. Help Phil figure out how long he&#39;ll be hopping on hot asphalt before he finds his way to the nice cool water.</p>

<p>Phil may hop one square horizontally or vertically per second. He may only hop onto road, grass, or water. Additionally, he cannot occupy any square occupied by a car. Phil and the cars move at the same time, meaning Phil can &ldquo;hop over&rdquo; an oncoming car. Phil can also remain in the same square if he wishes. All horizontal movement wraps (e.g., a rightward hop from the rightmost column places Phil in the leftmost column). Cars move horizontally in the direction indicated on the map (&#39;&lt;&#39; means leftward, &#39;&gt;&#39; means rightward) at a rate of one square per second and never collide with anything.</p>

### 입력

<p>Input begins with a single integer specifying the number of test maps. Each map begins with two integers R and C (0 &lt; R, C &lt;= 30) specifying the number of rows and columns, respectively, followed by R lines each C characters long, specifying the map. The possible map characters are:</p>

<ul>
	<li>Phil (&#39;&amp;&#39;) - Phil&#39;s starting location. Each map contains exactly one. Always indicates road underneath.&nbsp;</li>
	<li>Tree (&#39;T&#39;) - Impassable.</li>
	<li>Grass (&#39;.&#39;) - Phil can move freely in the grass.</li>
	<li>Road (&#39;-&#39;) - Hot!</li>
	<li>Car (&#39;&lt;&#39;, &#39;&gt;&#39;) - Always indicates road underneath.&nbsp;</li>
	<li>Water (&#39;~&#39;) - Phil&#39;s goal.</li>
</ul>

### 출력

<p>For each map, output a line containing the fewest number of seconds Phil must spend on the road in order to reach the water, or the string &ldquo;Impassable&rdquo;, if no path to water exists.</p>

<p>&nbsp;</p>
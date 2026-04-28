# [Platinum III] Drop Zone - 9427

[문제 링크](https://www.acmicpc.net/problem/9427)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 7, 맞힌 사람: 7, 정답 비율: 19.444%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>Evacuation missions and supply gathering missions are conducted on a regular basis by special teams. One of the first objectives of these missions is to set up a perimeter with barricades. Barricades are costly and take time to set up, so it is important to reduce the number of barricades necessary to block off an area.</p>

<p>You will be provided with several maps of high-interest drop zones. It is your job to write a program that will output the minimum number of barricades required for each drop zone.</p>

<p>Zombies will begin their approach from outside the map, thus any open area on the border is accessible to zombies. Barricades can be placed between any two adjacent open areas (including the drop zone) to block zombie movement. All zones outside of the map should be considered open areas.</p>

<p>Here is an example of one of the maps you will be provided:</p>

<pre>
XXX..XXX
XXX..XXX
.....XXX
XXX..XXX
XDDDD.XX
XDDDD...
XXXXXXXX
</pre>

<p>Legend:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Symbol</th>
			<th>Description</th>
		</tr>
		<tr>
			<td><code>X</code></td>
			<td>Impassible, zombies cannot move through these areas</td>
		</tr>
		<tr>
			<td><code>.</code> (period)</td>
			<td>Open area, zombies can move through these zones, but not diagonally. Barricades may be placed between these areas.</td>
		</tr>
		<tr>
			<td><code>D</code></td>
			<td>Drop zone, this zone must be protected at all costs. Barricades must effectively block zombie movement from the edges of the map to this zone. This area is treated like an open area for zombie movement and barricade placement. There will be exactly one contiguous drop zone in every map. Drop zones may be on the edges of the map.</td>
		</tr>
	</tbody>
</table>

<p>Example barricade configuration:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9427.%E2%80%85Drop%E2%80%85Zone/cba7988b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9427.%E2%80%85Drop%E2%80%85Zone/cba7988b.png" data-original-src="https://www.acmicpc.net/upload/images2/dropzone.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:99px; width:97px" /></p>

<p>Solution: 3</p>

### 입력

<p>The first number, N (1 &lt;= N &lt;= 20), will be the number of maps. For each map, there will be two parameters, R and C (1 &lt;= R, C &lt;= 150), denoting the number of rows and columns in the map, followed by the map itself as described above. Each row will be on its own line and all rows will have the same number of characters equal to C.</p>

### 출력

<p>For each map, print a single line containing the minimum number of barricades required to block off the drop zone.</p>
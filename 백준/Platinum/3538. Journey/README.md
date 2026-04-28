# [Platinum I] Journey - 3538

[문제 링크](https://www.acmicpc.net/problem/3538)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 8, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 최단 경로, 깊이 우선 탐색, 데이크스트라, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>The army of Rzeczpospolita is moving from the city Kostroma to the village Domnino. Two hetmans, Stefan and Konstantin, lead the army.</p>

<p>Stefan procured the roadmap of Kostroma province, and every night he routes the army from one village to the other along some road. Konstantin bought the map of secret trails between villages in advance, and every day he leads the march along the one of such trails. Each hetman asks their guide Ivan Susanin for a route before each march.</p>

<p>The length of each road is indicated on Stefan&rsquo;s map. So Stefan knows the minimal distance from each village to the Domnino village according to his map. Similarly Konstantin knows the minimal distance from each village to Domnino village along trails on his map.</p>

<p>Ivan Susanin does not want to be disclosed as a secret agent, so each time he chooses a road (for Stefan) or a trail (for Konstantin) so that the minimal distance to the Domnino village according to the map owned by the asking hetman is strictly decreasing.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/1ee8b009-66d2-4016-85ce-bde6475235a6/-/preview/" style="width: 212px; height: 181px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/af3fabcd-9d7f-41d2-9e8f-c9499fc620c9/-/preview/" style="width: 213px; height: 181px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/d4467aa5-5037-4c9a-ba32-f0798341cce9/-/preview/" style="width: 211px; height: 181px;" /></td>
		</tr>
		<tr>
			<td>Stefan&rsquo;s map</td>
			<td>Konstantin&rsquo; map</td>
			<td>Susanin&rsquo;s route</td>
		</tr>
	</tbody>
</table>

<p>Help Ivan to find the longest possible route to the Domnino village.</p>

### 입력

<p>The first line of the input file contains three integer numbers n, s and t &mdash; number of villages in Kostroma province, and numbers of start and Domnino village (2 &le; n &le; 1000; 1 &le; s, t &le; n). Villages are numbered from 1 to n. Start and Domnino villages are distinct.</p>

<p>Two blocks follow, the first one describing Stefan&rsquo;s map, and the second one describing Konstantin&rsquo;s map.</p>

<p>The first line of each block contains an integer number m &mdash; the number of roads/trails between villages (n &minus; 1 &le; m &le; 100 000). Each of the following m lines contains three integer numbers a, b, and l &mdash; describing the road/trail between villages a and b of length l (1 &le; a, b &le; n; 1 &le; l &le; 10<sup>6</sup>).</p>

<p>Rzeczpospolita army can move in any direction along a road or a trail. It&rsquo;s guaranteed that one can travel from any village to any other using each of the maps. The army starts its movement in the evening from the village number s and moves one road each night and one trail each day.</p>

### 출력

<p>Output the total length of the longest route that Ivan Susanin can arrange for Rzeczpospolita army before reaching the Domnino village (along the roads and trails). If Ivan Susanin can route the army forever without reaching the Domnino village, output the number &ldquo;-1&rdquo;.</p>
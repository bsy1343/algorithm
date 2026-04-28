# [Gold IV] Wormholes - 10568

[문제 링크](https://www.acmicpc.net/problem/10568)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 196, 정답: 77, 맞힌 사람: 60, 정답 비율: 39.735%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>With our time on Earth coming to an end, Cooper and Amelia have volunteered to undertake what could be the most important mission in human history: travelling beyond this galaxy to discover whether mankind has a future among the stars. Fortunately, astronomers have identified several potentially inhabitable planets and have also discovered that some of these planets have wormholes joining them, which effectively makes the travel distance between these wormhole connected planets zero. For all other planets, the travel distance between them is simply the Euclidean distance between the planets. Given the location of Earth, planets, and wormholes, find the shortest travel distance between any pairs of planets.</p>

### 입력

<ul>
	<li>The first line of input is a single integer, T (1 &le; T &le; 10) the number of test cases.</li>
	<li>Each test case consists of planets, wormholes, and a set of distance queries.</li>
	<li>The planets list for a test case starts with a single integer, p (1 &le; p &le; 60), the number of planets. Following this are p lines, where each line contains a planet name along with the planet&rsquo;s integer coordinates, i.e. name x y z (0 &le; x, y, z &le; 2 &middot; 10<sup>6</sup>) The names of the planets will consist only of ASCII letters and numbers, and will always start with an ASCII letter. Planet names are case-sensitive (Earth and earth are distinct planets). The length of a planet name will never be greater than 50 characters. All coordinates are given in parsecs.</li>
	<li>The wormholes list for a test case starts with a single integer, w (0 &le; w &le; 40), the number of wormholes, followed by the list of w wormholes. Each wormhole consists of two planet names separated by a space. The first planet name marks the entrance of wormhole, and the second planet name marks the exit from the wormhole. The planets that mark wormholes will be chosen from the list of planets given in the preceding section. Note: you can&rsquo;t enter a wormhole at its exit.</li>
	<li>The queries list for a test case starts with a single integer, q (1 &le; q &le; 20), the number of queries. Each query consists of two planet names separated by a space. Both planets will have been listed in the planet list.</li>
</ul>

### 출력

<p>For each test case, output a line, &ldquo;Case i:&rdquo;, the number of the ith test case. Then, for each query in that test case, output a line that states &ldquo;The distance from planet<sub>1</sub> to planet<sub>2</sub> is d parsecs.&rdquo;, where the planets are the names from the query and d is the shortest possible travel distance between the two planets. Round d to the nearest integer.</p>
# [Gold II] Cut Tiles (Large) - 12213

[문제 링크](https://www.acmicpc.net/problem/12213)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 19, 맞힌 사람: 16, 정답 비율: 50.000%

### 분류

수학, 자료 구조, 그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹, 우선순위 큐

### 문제 설명

<p>Enzo is doing renovation for his new house. The most difficult part is to buy exactly the right number of tiles. He wants <strong>N</strong> tiles of different sizes. Of course they have to be cut from the tiles he bought. All the required tiles are square. The lengths of side of the tiles are <strong>2</strong><strong><sup>S</sup></strong><strong><sub>1</sub></strong>, <strong>2</strong><strong><sup>S</sup></strong><strong><sub>2</sub></strong>, ..., <strong>2</strong><strong><sup>S</sup></strong><strong><sub>N</sub></strong>. He can only buy a lot of tiles sized <strong>M</strong>*<strong>M</strong>, and he decides to only cut tiles parallel to their sides for convenience. How many tiles does he need to buy?</p>

### 입력

<p>The first line of the input gives the number of test cases: <strong>T</strong>. <strong>T</strong> lines follow. Each line start with the number <strong>N</strong> and <strong>M</strong>, indicating the number of required tiles and the size of the big tiles Enzo can buy. <strong>N</strong> numbers follow: <strong>S</strong><strong><sub>1</sub></strong>, <strong>S</strong><strong><sub>2</sub></strong>, ... <strong>S</strong><strong><sub>N</sub></strong>, showing the sizes of the required tiles.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>2</strong><strong><sup>S</sup></strong><strong><sub>k</sub></strong> &le; <strong>M</strong> &le; 2^31-1.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">T</strong><span style="line-height:1.6em"> &le; 1000.</span></li>
	<li>1 &le; <strong>N</strong> &le; 500.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of the big tiles Enzo need to buy.</p>
# [Gold IV] Hypercube - 15936

[문제 링크](https://www.acmicpc.net/problem/15936)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 41, 맞힌 사람: 15, 정답 비율: 50.000%

### 분류

비트마스킹, 조합론, 수학

### 문제 설명

<p>The N-hypercube is an directed acyclical graph with 2<sup>N</sup> nodes tagged with numbers from 0 to 2<sup>N</sup> &ndash; 1 so that there is an arc from node x to node y if and only if x &lt; y and a non-negative integer p exists such that x ^ y = 2<sup>p</sup> (^ operator stands for bitwise xor) .</p>

<p>Given N, M and K, three positive integers, you are to compute:</p>

<ol style="list-style-type:lower-alpha;">
	<li>The maximum label i of a node belonging to the N-hypercube that has an arc from i to M.</li>
	<li>The minimum label j of a node belonging to the N-hypercube that has an arc from M to j.</li>
	<li>The number of paths of length K (having K arcs) found in the N-hypercube. Because this number may be quite large, you are to compute the number modulo 100003.</li>
</ol>

### 입력

<p>The first line of the input contains three numbers N, M and K, each separated by one space.</p>

### 출력

<p>The first line of the output must contain a single number, the answer for task a. The second line must contain a single number, the answer for task b. The third line must contain a single number, the answer for task c.</p>

### 제한

<ul>
	<li>2 &le; K &le; N &le; 100,000</li>
	<li>1 &le; M &le; 100,000,000</li>
	<li>For any given number M, there is at least one arc leaving node M and one arc reaching node M.</li>
	<li>The answer for task c must be computed modulo 100003.</li>
	<li>^ operator stands for bitwise xor.</li>
</ul>
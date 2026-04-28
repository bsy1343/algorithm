# [Gold III] Stupendous Bowties - 14047

[문제 링크](https://www.acmicpc.net/problem/14047)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

자료 구조, 수학

### 문제 설명

<p>There are N (1 &le; N &le; 100 000) distinct points on a 2D plane, with the ith one at integral coordinates (x<sub>i</sub>, y<sub>i</sub>) (&minus;10<sup>9</sup> &le; x<sub>i</sub> &le; 10<sup>9</sup>, &minus;10<sup>9</sup> &le; y<sub>i</sub> &le; 10<sup>9</sup>).</p>

<p>A Fantastic Right Triangle is one which uses 3 of the given points as its vertices, is non-degenerate (i.e., has positive area), and which has both of its legs axis-aligned (one of its two shortest sides is horizontal and the other shortest side is vertical). The vertex at which the two legs of such a triangle meet (which has an interior right angle) is known as the triangle&rsquo;s Spectacular Vertex.</p>

<p>A Stupendous Bowtie consists of an unordered pair of Fantastic Right Triangles which share the same point as their Spectacular Vertex, and which touch only at that point. Count the number of Stupendous Bowties which exist amongst the given points.</p>

### 입력

<p>The first line of the input contains one integer, N. The remaining N lines each contain two integers, x<sub>i</sub> and y<sub>i</sub> for i = 1..N.</p>

### 출력

<p>Output a single integer, the number of Stupendous Bowties which exist amongst the given points.</p>

### 제한

<ul>
	<li>N &le; 100 000</li>
	<li>&minus;10<sup>5</sup> &le; x<sub>i</sub> &le; 10<sup>5</sup></li>
	<li>&minus;10<sup>5</sup> &le; y<sub>i</sub> &le; 10<sup>5</sup></li>
</ul>
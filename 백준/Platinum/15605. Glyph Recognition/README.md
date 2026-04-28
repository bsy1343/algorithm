# [Platinum IV] Glyph Recognition - 15605

[문제 링크](https://www.acmicpc.net/problem/15605)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 40, 맞힌 사람: 38, 정답 비율: 76.000%

### 분류

기하학, 이분 탐색, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>You are an archaeologist working at an excavation site where your team has found hundreds of clay tablets containing glyphs written in some ancient language. Not much is known about the language yet, but you know that there are only six different glyphs, each of them in the shape of a regular polygon with one vertex pointing to the right (see Figure G.1(a) below). Only the boundary of each polygon is carved out of the clay.</p>

<table class="table" style="width: 100%;">
	<tbody>
		<tr>
			<td style="width: 33%; text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15605/1.png" style="width: 114px; height: 185px;" /></td>
			<td style="width: 34%; text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15605/2.png" style="width: 159px; height: 164px;" /></td>
			<td style="width: 33%; text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15605/3.png" style="width: 224px; height: 119px;" /></td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;">(a) The six glyphs.</td>
			<td style="width: 34%; text-align: center;">(b) The first sample input.</td>
			<td style="width: 33%; text-align: center;">(c) Fitting triangles and hexagons to the first sample. The triangles&rsquo; score is higher.</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure G.1</p>

<p>You want to start analysing the language right away, so you need to get the text on the tablets into some machine readable format. Ideally, you would like to use an OCR (optical character recognition) tool for that, but you do not have one installed on your laptop and there is no internet connection at the site.</p>

<p>Because of this you have devised your own scheme to digitise the ancient writings: for every glyph on a tablet you first find a number of sample points that are in the carved out region, i.e. on the boundary of the polygon. Based on those sample points you then calculate a score for each of the six glyphs and mark the one with the highest score as the recognised glyph.</p>

<p>For a given number of corners k (3 &le; k &le; 8), the score is computed as follows. Two regular k-gons are fitted to the sample points, one from the inside and one from the outside, such that the following hold:</p>

<ul>
	<li>Each polygon is centered at the origin, i.e. all vertices have equal distance to (0, 0).</li>
	<li>Each polygon has a vertex on the positive x-axis.</li>
	<li>The inner polygon is the largest such polygon containing none of the sample points.</li>
	<li>The outer polygon is the smallest such polygon containing all of the sample points.</li>
</ul>

<p>An example can be seen in Figure G.1(c). The score for this value of k is A<sub>inner</sub>/A<sub>outer</sub> , where A<sub>inner</sub> and A<sub>outer</sub> are the areas of the inner and outer polygon, respectively.</p>

<p>Given a set of sample points, find the glyph with the highest score.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with one integer n (1 &le; n &le; 1 000), the number of sample points.</li>
	<li>n lines, each with two integers x, y (&minus;10<sup>6</sup> &le; x, y &le; 10<sup>6</sup>), specifying a point at coordinates (x, y).</li>
</ul>

<p>No sample point is at the origin and all points are distinct.</p>

### 출력

<p>Output the optimal number of corners k (3 &le; k &le; 8), followed by the score obtained for that value of k. Your answer will be accepted if the absolute error does not exceed 10<sup>&minus;6</sup>. If several values of k result in a score that is within 10<sup>&minus;6</sup> of the optimal score, any one of them will be accepted.</p>
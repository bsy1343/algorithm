# [Platinum IV] Curvy Little Bottles - 4204

[문제 링크](https://www.acmicpc.net/problem/4204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 44, 맞힌 사람: 36, 정답 비율: 48.000%

### 분류

수학, 이분 탐색, 미적분학

### 문제 설명

<p>aIn her bike rides around Warsaw, Jill happened upon a shop that sold interesting glass bottles. She thought it might make an interesting project to use such bottles for measuring liquids, but this would require placing markings on the bottles to indicate various volumes. Where should those volume marks be placed?</p>

<p>Jill formalized the problem as follows. Assume a bottle is formed by revolving a shape that is the same as the graph of a polynomial P between x = x<sub>low</sub> and x = x<sub>high</sub> around the x-axis. Thus the x-axis is coincident with a vertical line through the center of the bottle. The bottom of the bottle is formed by a solid circular region at x = x<sub>low</sub>, and the top of the bottle, at x = x<sub>high</sub>, is left open.</p>

<p>The ﬁrst sample input represents a bottle formed using the simple polynomial 4 - 0.25x, with x<sub>low</sub> = 0and x<sub>high</sub> = 12. The bottom of this bottle is a circle with a radius of 4, and the opening at the top is a circle with a radius of 1. The height of this bottle is 12. Volume markings are in increments of 25.</p>

<p>Given a polynomial P, x<sub>low</sub>, x<sub>high</sub>, and the volume increment between successive marks on the bottle, compute the distances up from x<sub>low</sub> for the marks at successive volume increments. A mark cannot be made past the top of the bottle, and no more than the ﬁrst 8 increments should be marked. Assume the value of P is greater than zero everywhere between x<sub>low</sub> and x<sub>high</sub>.</p>

### 입력

<p>Each test case consists of three lines of bottle data:</p>

<ul>
	<li>Line 1: n, the degree of the polynomial (an integer satisfying 0 &le; n &le; 10).</li>
	<li>Line 2: a<sub>0</sub>, a<sub>1</sub>, ..., a<sub>n</sub>, the real coefﬁcients of the polynomial P deﬁning the bottle&rsquo;s shape, where a<sub>0</sub> is the constant term, a<sub>1</sub> is the coefﬁcient of x<sub>1</sub>, ..., and an is the coefﬁcient of x<sub>n</sub>. For each i, -100 &le; a<sub>i</sub> &le; 100, and a<sub>n</sub> &ne; 0.</li>
	<li>Line 3:
	<ul>
		<li>x<sub>low</sub> and x<sub>high</sub>, the real valued boundaries of the bottle (-100 &le; x<sub>low</sub> &lt; x<sub>high</sub> &le; 100 and x<sub>high</sub> - x<sub>low</sub> &gt; 0.1).</li>
		<li>inc, an integer which is the volume increment before each successive mark on the bottle (1 &le; inc &le; 500).</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, display the case number and the volume of the full bottle on one line. On a second line, display the increasing sequence of no more than 8 successive distances up from the bottom of the bottle for the volume markings. All volumes and height marks should be accurate to two decimal places. If the bottle does not have a volume that allows at least one mark, display the phrase insufficient volume. No test case will result in a mark within 0.01 from the top of the bottle. The volume of the bottle will not exceed 1 000. All rounded distances for marks on a bottle differ by at least 0.05.</p>
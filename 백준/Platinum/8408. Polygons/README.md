# [Platinum I] Polygons - 8408

[문제 링크](https://www.acmicpc.net/problem/8408)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 105, 정답: 30, 맞힌 사람: 18, 정답 비율: 26.471%

### 분류

정렬, 기하학, 다각형의 넓이, 각도 정렬

### 문제 설명

<p>Yesterday Little John had a test on geometry. The description of the most difficult problem follows. Given two triangles <em>A</em>&nbsp;and <em>B</em>, calculate the area of region <em>A</em> + <em>B</em>, which is defined as follows: <em>A</em> + <em>B</em> = {<em>p</em><sub>1</sub> + <em>p</em><sub>2</sub> : <em>p</em><sub>1</sub> &isin; <em>A</em>, <em>p</em><sub>2</sub> &isin; <em>B</em>}. For example, if <em>A</em>&nbsp;has the vertices (0, 0), (0, 2), (2, 0)&nbsp;and <em>B</em>&nbsp;has the vertices (0, 0), (0, 1), (3, 0), then <em>A</em> + <em>B</em>&nbsp;is a polygon with the vertices (0, 0), (0, 3), (3, 2)&nbsp;and (5, 0), so its area is 9.5.</p>

<p>Afterwards, John started to wonder how to solve a modified problem - &quot;How to calculate area of <em>A</em> + <em>B</em>, if&nbsp;<em>A</em>&nbsp;and <em>B</em>&nbsp;are arbitrary convex polygons&quot;. Little John has a test on biology tomorrow and has no time to solve this problem himself. He asked you for help in solving this task.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads the descriptions of two convex polygons <em>A</em>&nbsp;and <em>B</em>,</li>
	<li>computes the area of <em>A</em> + <em>B</em>,</li>
	<li>writes it doubled to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(3 &le; <em>n</em>, <em>m</em> &le; 100 000) separated with a single space and denoting the numbers of vertices of polygons <em>A</em>&nbsp;and <em>B</em>. In the second line there are <em>n</em>&nbsp;pairs of integers (<em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>)&nbsp;(-100 000 000 &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em> &le; 100 000 000), denoting the coordinates of consecutive vertices of the polygon <em>A</em>&nbsp;(in the clockwise order). In the third line there are <em>m</em>&nbsp;pairs of integers (<em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>)&nbsp;(-100 000 000 &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em> &le; 100 000 000) denoting the coordinates of consecutive vertices of the polygon <em>B</em>&nbsp;(in the clockwise order).</p>

### 출력

<p>The first and only line should contain one integer - doubled area of <em>A</em> + <em>B</em>.</p>
# [Platinum V] Contour Lines - 8413

[문제 링크](https://www.acmicpc.net/problem/8413)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

정렬, 기하학, 선분 교차 판정, 오목 다각형 내부의 점 판정

### 문제 설명

<p>Let us consider a set of polygons with sides parallel to the axes of the coordinate system. Such a set of polygons is called a&nbsp;<i>system of contour lines</i>, if it is possible to order all the polygons of the set, so that the first polygon contains the second polygon in its interior, the second polygon contains the third polygon in its interior etc.</p>

<p>Your task is to check, if a given set of polygons is a system of contour lines.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads descriptions of a few sets of polygons,</li>
	<li>for each set decides, if it is a system of contour lines,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line there is one natural number <em>t</em>&nbsp;(1 &le; <em>t</em> &le; 10), denoting the number of sets to processed. Following, there are <em>t</em>&nbsp;data sets. The first line of each data set contains one integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 250), denoting the number of polygons in this set. Each of the next <em>n</em>&nbsp;lines contains one integer <em>m<sub>i</sub></em> (4 &le; <em>m<sub>i</sub></em> &le; 250, 1 &le; <em>i</em> &le; <em>n</em>), denoting the number of vertices of the <em>i</em>-th polygon, followed by <em>m<sub>i</sub></em>&nbsp;pairs of integers <em>x<sub>ij</sub></em>&nbsp;and&nbsp;<em>y<sub>ij</sub></em>&nbsp;(0 &le; <em>x<sub>ij</sub></em>, <em>y<sub>ij</sub></em> &le; 200 000), separated with a single space. These pairs describe coordinates of consecutive vertices of the polygon. The sides of each polygon are parallel to the axes of the coordinate system. Furthermore, no two adjacent sides of any polygon are collinear. The perimeter of any polygon does not contain self-crossings.</p>

### 출력

<p>The standard output should contain <em>t</em>&nbsp;lines. The <em>k</em>-th line should contain one word&nbsp;<code>TAK</code>&nbsp;(i.e.&nbsp;<i>yes</i>&nbsp;in Polish), if the <em>k</em>-th set of polygons is a system of contour lines,&nbsp;<code>NIE</code>&nbsp;(i.e.&nbsp;<i>no</i>&nbsp;in Polish) otherwise.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c4864e9d-291a-476c-8405-065cdf4a24fa/-/preview/" /></p>
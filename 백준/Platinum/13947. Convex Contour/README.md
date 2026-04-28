# [Platinum IV] Convex Contour - 13947

[문제 링크](https://www.acmicpc.net/problem/13947)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 303, 정답: 141, 맞힌 사람: 92, 정답 비율: 43.192%

### 분류

기하학, 많은 조건 분기, 볼록 껍질

### 문제 설명

<p>A number of geometric shapes are neatly arranged in a rectangular grid. The shapes occupy consecutive cells in a single row with each cell containing exactly one shape. Each shape is either:</p>

<ul>
	<li>a square perfectly aligned with the grid square,</li>
	<li>a circle inscribed in the grid square,</li>
	<li>or an equilateral triangle with a side corresponding to the bottom side of the grid square.</li>
</ul>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13947/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-06%20%EC%98%A4%ED%9B%84%208.54.31.png" style="height:93px; width:370px" /></p>

<p>The shapes from the first example input and their convex contour.</p>

<p>Informally, the convex contour of an arrangement is the shortest line that encloses all the shapes. Formally, we can define it as the circumference of the convex hull of the union of all shapes.</p>

<p>Given an arrangement of shapes, find the length of its contour.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 20) &mdash; the number of shapes. The following line contains a string consisting of n characters that describes the shapes in the arrangement left to right. Each character is an uppercase letter &ldquo;S&rdquo;, &ldquo;C&rdquo; or &ldquo;T&rdquo; denoting a square, circle or a triangle respectively.</p>

### 출력

<p>Output a single floating point number &mdash; the length of the contour. The solution will be accepted if the absolute or the relative difference from the judges solution is less than 10<sup>&minus;6</sup> .</p>
# [Platinum IV] Monochromatic Triangles - 8096

[문제 링크](https://www.acmicpc.net/problem/8096)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 231, 정답: 182, 맞힌 사람: 134, 정답 비율: 89.933%

### 분류

수학, 조합론

### 문제 설명

<p>There are n&nbsp;points given in a space. There are no three points, such that they lie on the same straight line. Each pair of points is connected by a segment coloured red or black. Each triangle, whose sides have the same colour is called a monochromatic triangle. We are given a list of all red segments and we want to find the number of all monochromatic triangles.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input the following data: the number of points, the number of red segments and their list,</li>
	<li>finds the number of monochromatic triangles,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n, 3 &le; n &le; 1,000, which equals the number of points. In the second line there is one integer m, 0 &le; m &le; 250,000, which equals the number of red segments.</p>

<p>In each of the following m&nbsp;lines there are two integers&nbsp;p&nbsp;and k&nbsp;separated by a single space, 1 &le; p &lt; k &le; n. They are numbers of vertices which are ends of a red segment.</p>

### 출력

<p>In the first line of the standard output there should be written one integer &mdash; the number of monochromatic triangles.</p>
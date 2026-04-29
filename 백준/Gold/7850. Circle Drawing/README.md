# [Gold IV] Circle Drawing - 7850

[문제 링크](https://www.acmicpc.net/problem/7850)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

(분류 없음)

### 문제 설명

<p>Graphics libraries usually implement drawing of graphics primitives, like lines, polygons and circles. Your task is to write a program that draws circles.</p>

<p>Graphic canvas is represented as an array of <i>X<sub>size</sub></i> by <i>Y<sub>size</sub></i> pixels. Each pixel have a color ranged from 0 to 9. Initially all pixels have color 0. Pixels are thought of as small sqares with the side of length 1. A circle with center (<i>x<sub>c</sub></i>, <i>y<sub>c</sub></i>) and radius <i>R</i> is a set of pixels (<i>x</i>, <i>y</i>) satisfying the inequality (<i>x</i>&nbsp;-&nbsp;<i>x<sub>c</sub></i>)<sup>2</sup> + (<i>y</i> -&nbsp;<i>y<sub>c</sub></i>)<sup>2</sup> &amp;le; <i>R</i><sup>2</sup></p>

<p>To draw a circle, your program should set the color of all pixels in a set defined above to the color of the circle. After drawing <i>N</i> given circles, the program should output the color of all pixels of the canvas.</p>

### 입력

<p>Input file contains numbers <i>X<sub>size</sub></i> <i>Y<sub>size</sub></i> <i>N</i> followed by <i>N</i> sets of numbers <i>x<sub>i</sub></i> <i>y<sub>i</sub></i> <i>R<sub>i</sub></i> <i>c<sub>i</sub></i>, describing the coordinates of center, radius and color of <i>i</i>-th circle.</p>

### 출력

<p>Output file should contain <i>Y<sub>size</sub></i> lines of <i>X<sub>size</sub></i> characters each, where <i>i</i>-th character of <i>j</i>-th line is a digit corresponding to color of the pixel (<i>i</i>, <i>j</i>).</p>

### 제한

<ul>
	<li>1 ≤ <i>X<sub>size</sub></i>, <i>Y<sub>size</sub></i> ≤ 1000,</li>
	<li>1 ≤ <i>N</i> ≤ 10000,</li>
	<li>0 ≤ <i>x<sub>i</sub></i> &lt; <i>X<sub>size</sub></i>,</li>
	<li>0 ≤ <i>y<sub>i</sub></i> &lt; <i>Y<sub>size</sub></i>,</li>
	<li>1 ≤ <i>R<sub>i</sub></i> ≤ 200,</li>
	<li>0 ≤ <i>c<sub>i</sub></i> ≤ 9.</li>
</ul>
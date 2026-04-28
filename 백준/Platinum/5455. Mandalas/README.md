# [Platinum I] Mandalas - 5455

[문제 링크](https://www.acmicpc.net/problem/5455)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 105, 정답: 19, 맞힌 사람: 10, 정답 비율: 15.385%

### 분류

수학, 기하학, 임의 정밀도 / 큰 수 연산, 오일러 지표 (χ=V-E+F)

### 문제 설명

<p>Shasita is drawing mandalas. First, she draws some circles, and then she colours the obtained regions.</p>

<p>Her younger sister Rice wants to help her drawing the mandalas. They agree Rice will draw the circles and Shasita will colour them. Shasita does not want to colour a very large number of all small regions and therefore she fixes the number of regions Rice should create by drawing the circles. Rice, on her side, is not very good at counting regions and she asks you to help her.</p>

<p>In this task you have to give the number of regions in a given mandala.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>one line with the integer 0 &le; n &le; 500, the number of circles in this test case</li>
	<li>n lines, each with the three integers x<sub>i</sub>, y<sub>i</sub> and r<sub>i</sub>, describing the i<sup>th</sup> circle, which has midpoint&nbsp;(x<sub>i</sub>, y<sub>i</sub>) and radius r<sub>i</sub>, with |x<sub>i</sub>| , |y<sub>i</sub>| &le; 1000 and 0 &lt; r<sub>i</sub> &le; 1000.</li>
</ul>

### 출력

<p>For every test case in the input file, the output should contain a single number, on a single line: the number of regions the circles divide the plane R<sup>2</sup> in.</p>

<p>&nbsp;</p>
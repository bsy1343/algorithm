# [Gold IV] Cylinder - 6512

[문제 링크](https://www.acmicpc.net/problem/6512)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

수학, 기하학

### 문제 설명

<p>Using a sheet of paper and scissors, you can cut out two faces to form a cylinder in the following way:</p>

<ol>
	<li>Cut the paper horizontally (parallel to the shorter side) to get two rectangular parts.</li>
	<li>From the first part, cut out a circle of maximum radius. The circle will form the bottom of the cylinder.</li>
	<li>Roll the second part up in such a way that it has a perimeter of equal length with the circle&#39;s circumference, and attach one end of the roll to the circle. Note that the roll may have some overlapping parts in order to get the required length of the perimeter.</li>
</ol>

<p>Given the dimensions of the sheet of paper, can you calculate the biggest possible volume of a cylinder which can be constructed using the procedure described above?</p>

### 입력

<p>The input consists of several test cases. Each test case consists of two numbers w and h (<em>1 &le; w &le; h &le; 100</em>), which indicate the width and height of the sheet of paper.</p>

<p>The last test case is followed by a line containing two zeros.</p>

### 출력

<p>For each test case, print one line with the biggest possible volume of the cylinder. Round this number to 3 places after the decimal point.</p>
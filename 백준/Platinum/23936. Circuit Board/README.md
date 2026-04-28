# [Platinum IV] Circuit Board - 23936

[문제 링크](https://www.acmicpc.net/problem/23936)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 11, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

자료 구조, 스택, 두 포인터

### 문제 설명

<p>Arsh recently found an old rectangular circuit board that he would like to recycle. The circuit board has&nbsp;<b>R</b>&nbsp;rows and&nbsp;<b>C</b>&nbsp;columns of squares.</p>

<p>Each square of the circuit board has a thickness, measured in millimetres. The square in the r-th row and c-th column has thickness&nbsp;<b>V<sub>r,c</sub></b>. A circuit board is&nbsp;<i>good</i>&nbsp;if in each row, the difference between the thickest square and the least thick square is no greater than&nbsp;<b>K</b>.</p>

<p>Since the original circuit board might not be good, Arsh would like to find a good subcircuit board. A subcircuit board can be obtained by choosing an axis-aligned subrectangle from the original board and taking the squares in that subrectangle. Arsh would like your help in finding the number of squares in the largest good subrectangle of his original board.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with one line containing three integers&nbsp;<b>R</b>,&nbsp;<b>C</b>&nbsp;and&nbsp;<b>K</b>, the number of rows, the number of columns, and the maximum difference in thickness allowed in each row.</p>

<p>Then, there are&nbsp;<b>R</b>&nbsp;more lines containing&nbsp;<b>C</b>&nbsp;integers each. The c-th integer on the r-th line is&nbsp;<b>V<sub>r, c</sub></b>, the thickness of the square in the r-th row and c-th column.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of squares in a good subrectangle.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<b>R</b>&nbsp;&le; 300.</li>
	<li>1 &le;&nbsp;<b>C</b>&nbsp;&le; 300.</li>
	<li>0 &le;&nbsp;<b>V<sub>i, j</sub></b>&nbsp;&le; 10<sup>3</sup>&nbsp;for all i, j.</li>
</ul>
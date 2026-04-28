# [Bronze I] Vestigium - 27797

[문제 링크](https://www.acmicpc.net/problem/27797)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 117, 정답: 104, 맞힌 사람: 90, 정답 비율: 90.000%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Vestigium means &quot;trace&quot; in Latin. In this problem we work with Latin squares and matrix traces.</p>

<p>The <i>trace</i> of a square matrix is the sum of the values on the main diagonal (which runs from the upper left to the lower right).</p>

<p>An <b>N</b>-by-<b>N</b> square matrix is a <i>Latin square</i> if each cell contains one of <b>N</b> different values, and no value is repeated within a row or a column. In this problem, we will deal only with &quot;natural Latin squares&quot; in which the <b>N</b> values are the integers between 1 and <b>N</b>.</p>

<p>Given a matrix that contains only integers between 1 and <b>N</b>, we want to compute its trace and check whether it is a natural Latin square. To give some additional information, instead of simply telling us whether the matrix is a natural Latin square or not, please compute the number of rows and the number of columns that contain repeated values.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each starts with a line containing a single integer <b>N</b>: the size of the matrix to explore. Then, <b>N</b> lines follow. The i-th of these lines contains <b>N</b> integers <b>M<sub>i,1</sub></b>, <b>M<sub>i,2</sub></b> ..., <b>M<sub>i,N</sub></b>. <b>M<sub>i,j</sub></b> is the integer in the i-th row and j-th column of the matrix.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: k r c</code>, where <code>x</code> is the test case number (starting from 1), <code>k</code> is the trace of the matrix, <code>r</code> is the number of rows of the matrix that contain repeated elements, and <code>c</code> is the number of columns of the matrix that contain repeated elements.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>2 &le; <b>N</b> &le; 100.</li>
	<li>1 &le; <b>M<sub>i,j</sub></b> &le; <b>N</b>, for all i, j.</li>
</ul>

### 힌트

<p>In Sample Case #1, the input is a natural Latin square, which means no row or column has repeated elements. All four values in the main diagonal are 1, and so the trace (their sum) is 4.</p>

<p>In Sample Case #2, all rows and columns have repeated elements. Notice that each row or column with repeated elements is counted only once regardless of the number of elements that are repeated or how often they are repeated within the row or column. In addition, notice that some integers in the range 1 through <b>N</b> may be absent from the input.</p>

<p>In Sample Case #3, the leftmost and rightmost columns have repeated elements.</p>
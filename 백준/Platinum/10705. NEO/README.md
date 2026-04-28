# [Platinum II] NEO - 10705

[문제 링크](https://www.acmicpc.net/problem/10705)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 44, 정답: 28, 맞힌 사람: 23, 정답 비율: 58.974%

### 분류

자료 구조, 스택

### 문제 설명

<p>Let us denote A<sub>i,j</sub> as the element from matrix A located in the ith row and jth column. We say that the matrix A is cool if this holds:</p>

<ul>
	<li>r, s &gt; 1</li>
	<li>A<sub>1,1</sub> + A<sub>r,s</sub> &le; A<sub>1,s</sub> + A<sub>r,1</sub></li>
</ul>

<p>where r denotes the number of rows, and s the number of columns of matrix A.</p>

<p>Additionally, we say that a matrix is extremely cool if each of its submatrices with at least two rows and two columns is cool.</p>

<p>It is your task to determine the largest number of elements that are contained in an extremely cool submatrix of the given matrix.</p>

### 입력

<p>The first line of input contains two integers R, S (2 &le; R, S &le; 1 000) which represent the dimensions of the matrix.</p>

<p>Each of the following R lines contains S integers that represent the elements in the matrix. The elements in the matrix will be integers from the interval [&minus;10<sup>6</sup>, 10<sup>6</sup>].</p>

### 출력

<p>The first and only line of output must contain the maximal number of elements that are contained in an extremely cool submatrix of the matrix from the input. If an extremely cool submatrix doesn&rsquo;t exist, output 0.</p>

### 힌트

<p><strong>Clarification of the third example:</strong> The solution is a matrix with an upper left corner in (3,2) and lower right corner in (5,6).</p>
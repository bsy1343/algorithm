# [Silver I] Matrix - 9890

[문제 링크](https://www.acmicpc.net/problem/9890)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Two m&times;n matrices A and B are given. Matrix B is obtained from matrix A by row-addition operations and column-subtraction operations. A row-addition operation adds 1 to each entry of a row. A column-subtraction operation subtracts 1 from each entry of a column.</p>

<p>In this task, you have to find the numbers of row-addition operations r<sub>1</sub>, &middot; &middot; &middot;, r<sub>m</sub> to be applied to row 1, &middot; &middot; &middot;, row m of A respectively such that the following properties hold.</p>

<ul>
	<li>There correspond c<sub>1</sub>, &middot; &middot; &middot;, c<sub>n</sub> column-subtraction operations to be applied to column 1, &middot; &middot; &middot;, column n of A respectively so that these row and column operations transform the given matrix A to the given matrix B.</li>
	<li>The number of any row and column operations is between 0 and 9 inclusively; that is, 0 &le; r<sub>i</sub> &le; 9, i = 1, &middot; &middot; &middot; , m and 0 &le; c<sub>j</sub> &le; 9, j = 1, &middot; &middot; &middot; , n.</li>
	<li>The value r<sub>1</sub> &middot; &middot; &middot; r<sub>m</sub>, considered as an integer, is as small as possible.</li>
</ul>

<p>You should concatenate the values r<sub>1</sub>, &middot; &middot; &middot;, r<sub>m</sub> and output it as a single m-digit integer r<sub>1</sub> &middot; &middot; &middot; r<sub>m</sub> (with possibly leading zeros). If the given matrix B cannot be obtained from the given matrix A with 0 to 9 row-addition operations on each row and 0 to 9 column-subtraction operations on each column, your program should output the value &minus;1.</p>

### 입력

<p>The first line contains two integers m and n separated by a space, 1 &le; m &le; 100, 1 &le; n &le; 100. The matrix A is given by the next m lines for row 1 to row m. Each of these m lines contains n integers, with a space between two adjacent integers. Similarly, the matrix B is given by the next m lines. Each entry of the matrices is an integer between &minus;1000 and 1000 inclusively.</p>

### 출력

<p>The output file contains an m-digit integer.</p>
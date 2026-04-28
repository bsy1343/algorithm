# [Gold II] Matrix Cutting - 24011

[문제 링크](https://www.acmicpc.net/problem/24011)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 14, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Prof Shekhu has a matrix of&nbsp;<b>N</b>&nbsp;rows and&nbsp;<b>M</b>&nbsp;columns where rows are numbered from 0 to&nbsp;<b>N-1</b>&nbsp;from top to bottom, and columns are numbered from 0 to&nbsp;<b>M-1</b>&nbsp;from left to right. Each cell in the matrix contains a positive integer.</p>

<p>He wants to cut this matrix into&nbsp;<b>N * M</b>&nbsp;submatrices (each of size 1 * 1) by making horizontal and vertical cuts. A cut can be made only on the boundary between two rows or two columns.</p>

<p>Prof Shekhu invites his best student Akki for this job and makes an interesting proposition. Every time Akki makes a cut in a submatrix, before he makes the cut, he is awarded a number of coins equal to the minimum value in that submatrix. Note that with every cut, the total number of submatrices increases. Also, cuts in any two different submatrices are independent and likewise, Akki is awarded independently for the cuts in different submatrices.</p>

<p>Now, Akki has various ways in which he can make the cuts. Can you help him by maximizing the total number of coins he can gain?</p>

### 입력

<p>The first line of the input contains an integer&nbsp;<b>T</b>, the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>M</b>, as described above.</p>

<ol>
	<li>Next, there are&nbsp;<b>N</b>&nbsp;lines of&nbsp;<b>M</b>&nbsp;positive integers each; these describe the matrix.</li>
</ol>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum possible number of coins that Akki can be awarded, if he makes the cuts in optimal order.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le; each value in the matrix &le; 10<sup>5</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are two possible ways in which Akki can make the cuts.</p>

<ol>
	<li>Suppose that Akki first cuts the matrix horizontally. He is awarded the minimum value in the matrix: 1. Then he has to make vertical cuts in the two submatrices ([1, 2] and [3, 4]), for which he gets 1 and 3 coins, respectively.</li>
	<li>Suppose that Akki first cuts the matrix vertically. He is awarded the minimum value in the matrix: 1. Then he has to make horizontal cuts in the two submatrices (which have the transposes [1, 3] and [2, 4]), for which he gets 1 and 2 coins, respectively.</li>
</ol>

<p>The first strategy is better, and the answer is 5.</p>

<p>In Sample Case #2, Akki can be awarded at most 7 coins. One of the optimal ways is to first make the only horizontal cut to earn 1 coin. Then, in the upper submatrix [1, 2, 1], Akki can first make the cut immediately to the right of first column and then the cut immediately to the right of second column to earn a total of 2 coins. Similarly, in the lower submatrix [2, 3, 2], Akki can first make the cut immediately to the right of second column and then the cut immediately to the right of first column to earn a total of 4 coins.</p>

<p>In Sample Case #3, there is only one cut to be made.</p>
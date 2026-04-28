# [Platinum I] Monsters - 14876

[문제 링크](https://www.acmicpc.net/problem/14876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 35, 정답: 21, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

자료 구조, 스택, 스위핑

### 문제 설명

<p>Humans finally landed on one of the Centaurus Constellation planets. A big surprise (or not!): the planet is inhabited by monsters! The monsters&rsquo; defense system is composed of battle cells, arranged in the form of a matrix with N rows and M columns.</p>

<p>Our intergalactic army has already attacked some of the cells, but now it is your turn to destroy exactly one cell.</p>

<p>By definition, the strength of the monsters&rsquo; defense system is equal to the number of submatrices (possibly overlapping) that contain only intact cells.A submatrix is a nonempty matrix obtained from the original matrix by eventually removing:</p>

<ul>
	<li>Some consecutive rows, starting from the first one;</li>
	<li>Some consecutive rows, ending at the last one;</li>
	<li>Some consecutive columns, starting from the first one;</li>
	<li>Some consecutive columns, ending at the last one.</li>
</ul>

<p>Select a cell to be destroyed by you in a way that minimizes the strength of the defense system.</p>

<p>Develop a program to calculate the strength of the defense system after your attack.</p>

### 입력

<p>The first line of the standard input contains two space separated integers N and M representing the number of rows, and the number of columns, respectively.</p>

<p>Each of the next N lines contains a binary string of size M, representing the cells of the matrix. A 1 corresponds to an intact cell, while a 0 corresponds to a cell already destroyed by our army.</p>

<p>There is at least one intact cell in the defense system.</p>

### 출력

<p>Write on the single line of the standard output the strength of the defense system after your attack.</p>

### 제한

<ul>
	<li>There is at least one intact cell in the defense system.</li>
</ul>
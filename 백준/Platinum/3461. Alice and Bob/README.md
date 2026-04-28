# [Platinum II] Alice and Bob - 3461

[문제 링크](https://www.acmicpc.net/problem/3461)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 6, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

그래프 이론, 평면 그래프, 쌍대 그래프

### 문제 설명

<p>This is a puzzle for two persons, let&#39;s say Alice and Bob. Alice draws an n-vertex convex polygon and numbers its vertices with integers 1, 2, ..., n in an arbitrary way. Then she draws a number of noncrossing diagonals (the vertices of the polygon are not considered to be crossing points). She informs Bob about the sides and the diagonals of the polygon but not telling him which are which. Each side and diagonal is specified by its ends. Bob has to guess the order of the vertices on the border of the polygon. Help him solve the puzzle.</p>

<p>If n = 4 and (1,3), (4,2), (1,2), (4,1), (2,3) are the ends of four sides and one diagonal then the order of the vertices on the border of this polygon is 1, 3, 2, 4 (with the accuracy to shifting and reversing).</p>

<p>Write a program which for each data set:</p>

<ul>
	<li>reads the description of sides and diagonals given to Bob by Alice,</li>
	<li>computes the order of the vertices on the border of the polygon,</li>
	<li>writes the result.</li>
</ul>

### 입력

<p>The first line of the input contains exactly one positive integer d equal to the number of data sets, 1 &le;&nbsp;d &le; 20. The data sets follow.</p>

<p>&nbsp;Each data set consists of exactly two consecutive lines.</p>

<p>The first of those lines contains exactly two integers n and m separated by a single space, 3 &le; n &le; 10 000, 0 &le; m &le; n - 3. Integer n is the number of vertices of a polygon and integer m is the number of its diagonals, respectively.</p>

<p>The second of those lines contains exactly 2(m + n) integers separated by single spaces. Those are ends of all sides and some diagonals of the polygon. Integers a<sub>j</sub>, b<sub>j</sub> on positions 2j - 1 and 2j, 1 &le; j &le;&nbsp;m + n, 1 &le; a<sub>j</sub> &le; n, 1 &le; b<sub>j</sub>&nbsp;&le;&nbsp;n, a<sub>j</sub> &ne; b<sub>j</sub>, specify ends of a side or a diagonal. The sides and the diagonals can be given in an arbitrary order. There are no duplicates.</p>

<p>Alice does not cheat, i.e. the puzzle always has a solution.</p>

### 출력

<p>The output should consist of exactly d lines, one line for each data set.</p>

<p>Line i, 1 &le; i &le; d, should contain a sequence of n integers separated by single spaces - a permutation of 1, 2, ..., n, i.e. the numbers of subsequent vertices on the border of the polygon from the i-th data set; the sequence should always start from 1 and its second element should be the smaller vertex of the two border neighbours of vertex 1.</p>
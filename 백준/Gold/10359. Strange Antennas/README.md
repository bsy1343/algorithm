# [Gold I] Strange Antennas - 10359

[문제 링크](https://www.acmicpc.net/problem/10359)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

값 / 좌표 압축, 스위핑

### 문제 설명

<p>A President wants to survey its country. The country&#39;s territory is a grid of n x n cells. Every corner of each cell in the grid defines a point (indexed from 0 to n line and column-wise, 0&lt; n &lt;= 30000). At every point of the grid the President can install an antenna.</p>

<p>Such an antenna emits a signal in one of the four directions: South-East (SE), South-West (SW), North-East (NE), North-West (NW). The shape of the signal is an isosceles right triangle. Each of the two equal sides of the triangle represents the antenna&#39;s power (0&lt; p &lt;= 2*n). The triangle defines the coverage of the antenna in the grid.</p>

<p>The President has already installed a number of antennas (we call this number a, 0 &lt;= a &lt;= 100) and is interested in determining the total number of cells that are covered.</p>

<p>But these antennas are strange, because in any cell, if the signals coming from two antennas overlap, they cancel each other. In other words, for any given cell, the cell is going to be covered if and only if there is an odd number of signals overlapping in that cell.</p>

<p>For instance, given the 10 by 10 grid, with points ranging from 0 to 10:</p>

<pre>
x x x x - - - - - -
x o o y y - - - - -
x x y y y - - - - -
x - - y y - - - - -
- - - - y - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
</pre>

<p>In the picture, the antenna X is situated on line 0, column 0, emitting a signal of power 4, towards South-East. Antenna Y is situated on line 1, column 5, emitting of power 4, towards South-West. In the above case, there is a total of 16 cells covered.</p>

### 입력

<p>The input data has the following format: the number of cells n is followed by the number of antennas a, each on a separate line. The next a lines, for each antenna, contain: line_position, column_position, power, orientation, each on a separate line. The orientation is an integer in the range 0-3 (0:SW, 1:SE, 2:NE, 3:NW).</p>

### 출력

<p>The output should be the number of cells covered by the antennas.</p>
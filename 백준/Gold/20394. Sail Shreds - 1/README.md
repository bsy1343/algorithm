# [Gold I] Sail Shreds - 1 - 20394

[문제 링크](https://www.acmicpc.net/problem/20394)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

구현

### 문제 설명

<p>During the recent two-day storm, a group of sailors shipwrecked on a desert island in the Mediterranean sea. Since their radio is broken, they cannot call for help and their only chance of survival is escaping on a raft. However, they need a sail to power the raft. Luckily, they recovered the main sail from the wrecked ship, but it is torn to several shreds. Hence, they have to sew the shreds together to obtain the original sail.</p>

<p>The sailors quickly realized that each of the shreds is a triangle. Because there were stripes on the sail, it was easy to identify the correct orientation of its triangular parts. In fact, they have to respect the orientations of the shreds, since otherwise the sail would be less resistant to wind and might be torn again. They were trying to find the original arrangement for several hours but with no result. They think that a computer can help them and asked you for help.</p>

<p>You are given the description of the triangular shreds (given by the plane coordinates of the vertices of each triangle) and the dimensions of the original sail which was a rectangle (given by two integers X and Y ). Your task is to move the shreds (without rotation) to reconstruct the original sail (see the figure). In particular, the triangles should be moved in such a way that</p>

<ul>
	<li>the whole rectangular area is covered,</li>
	<li>no two triangles intersect, i.e., there is no point which is contained in the interiors of two different triangles, and</li>
	<li>there is no triangle whose part lies outside of the rectangle.</li>
</ul>

<p>You may assume that there exists a solution for each of the input data. In particular, it holds that the sum of the areas of the shreds is equal to the area of the original sail. There can be several shreds of the same shape.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/54d53d87-d2ca-4f32-83cf-c2f0ad08afa4/-/preview/" style="width: 629px; height: 169px;" /></p>

### 입력

<p>Each of the input files describe a single test case and has the following structure. The first line contains three integers N, X, and Y, separated by single spaces. X and Y (1 &le; X, Y &le; 1 000 000) determine the dimensions of the original sail, X being the width and Y being the height, and N, 2 &le; N &le; 1 000, is the number of triangular shreds of the sail.</p>

<p>The next N lines describe the individual triangles: (i + 1)-th line contains six integers A<sub>i,x</sub>, A<sub>i,y</sub>, B<sub>i,x</sub>, B<sub>i,y</sub>, C<sub>i,x</sub> and C<sub>i,y</sub> separated by single spaces. These six numbers describe the three vertices A<sub>i</sub>, B<sub>i</sub>, and C<sub>i</sub> of the i-th triangle: the vertex A<sub>i</sub> has coordinates (A<sub>i,x</sub>, A<sub>i,y</sub>), B<sub>i</sub> has coordinates (B<sub>i,x</sub>, B<sub>i,y</sub>), and C<sub>i</sub> has coordinates (C<sub>i,x</sub>, C<sub>i,y</sub>). You may assume that 0 &le; A<sub>i,x</sub>, A<sub>i,y</sub>, B<sub>i,x</sub>, B<sub>i,y</sub>, C<sub>i,x</sub>, C<sub>i,y</sub> &le; 1 000 000.</p>

<p>Note that the position of a triangle (specified in the input file) is irrelevant. E.g., if the third line of the example input were replaced with <code>6 6 14 5 16 6</code>, the given set of the triangular shreds would be the same.</p>

### 출력

<p>The output&nbsp;should consist of exactly N lines describing the arrangement of the shreds of the sail such that all the three conditions in the task description are met. More specifically, the i-th line should contain two integers, A<sup>*</sup><sub>i,x</sub> and A<sup>*</sup><sub>i,y</sub> separated by a single space&mdash;the coordinates of the point A<sub>i</sub> after moving the i-th shred to the appropriate place. Note that the left bottom corner of the sail has always coordinates (0, 0) and the right top has coordinates (X, Y) as depicted in the figure.</p>
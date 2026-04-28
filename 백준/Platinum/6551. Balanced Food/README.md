# [Platinum II] Balanced Food - 6551

[문제 링크](https://www.acmicpc.net/problem/6551)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 12, 맞힌 사람: 2, 정답 비율: 16.667%

### 분류

수학, 브루트포스 알고리즘, 기하학, 백트래킹, 미적분학, 물리학

### 문제 설명

<p>Computer scientists live on pizza. Now the doctors say this is no good. We ought to eat more balanced. So you put your really large pizza onto your table and eat slice-by-slice carefully watching that the rest of your meal stays where it is - on the table.</p>

<p>Since computer scientists love pizza, their favourite table is shaped like a slice of pizza. However, different people may have different-sized tables. Everyone has his own preference for the number of slices a pizza has to be cut to. However, all agree that the slices must have identical size. Write a program to help the poor pizza lovers!</p>

### 입력

<p>The input file contains several test cases. Each test case starts with the number of slices <em>n</em> the pizza is cut to. Input is terminated by <em>n=0</em>. Otherwise, <em>1&lt;=n&lt;=9</em>. Then follow 9 floating-point numbers <em>p<sub>x</sub>, p<sub>y</sub>, r, t<sub>x</sub>, t<sub>y</sub>, u<sub>x</sub>, u<sub>y</sub>, v<sub>x</sub>, v<sub>y</sub></em> specifying the coordinates of the center <em>p</em> of the pizza, its radius, and the coordinates of three points <em>t, u, v</em>. They define the three corners of the slice-shaped table in counter-clockwise order, with <em>t</em> being the center.</p>

<p>The pizza is a homogeneous two-dimensional circular object. There is always a cut from its center parallel to the x-axis towards increasing x-values. The remaining pizza stays connected during the whole process, no matter what slices are removed. The distances from <em>t</em> to <em>u, v</em> are equal except for very small rounding errors. Tables are never larger than a half-circle.</p>

### 출력

<p>For each test case output on a line some possible ordering of slices, so that during the whole process of eating the pizza it does not fall down the table. Slices are numbered counter-clockwise starting with 1 directly above the positive x-axis.</p>

<p>If no ordering of slices exists, so that the pizza does not fall down, output a line containing the word &quot;impossible&quot; instead.</p>

<p>Remark</p>

<p>A connected, rigid, flat object remains fixed on a convex, flat surface if and only if the object&#39;s center of gravity lies above the surface. The x-coordinate, for example, of the center of gravity of an object <em>s</em> can be calculated by (&int;<sub><em>s</em></sub><em>x</em>d<em>s</em>) / (&int;<sub><em>s</em></sub>d<em>s</em>). Likewise, the y-coordinate can be expressed as (&int;<sub><em>s</em></sub><em>y</em>d<em>s</em>) / (&int;<sub><em>s</em></sub>d<em>s</em>). Note that the denominator of these expressions gives the area of <em>s</em>.</p>
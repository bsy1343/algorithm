# [Platinum IV] Color the Map - 3929

[문제 링크](https://www.acmicpc.net/problem/3929)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>You were lucky enough to get a map just before entering the legendary magical mystery world. The map shows the whole area of your planned exploration, including several countries with complicated borders. The map is clearly drawn, but in sepia ink only; it is hard to recognize at a glance which region belongs to which country, and this might bring you into severe danger. You have decided to color the map before entering the area. &ldquo;A good deal depends on preparation,&rdquo; you talked to yourself.</p>

<p>Each country has one or more territories, each of which has a polygonal shape. Territories belonging to one country may or may not &ldquo;touch&rdquo; each other, i.e. there may be disconnected territories. All the territories belonging to the same country must be assigned the same color. You can assign the same color to more than one country, but, to avoid confusion, two countries &ldquo;adjacent&rdquo; to each other should be assigned different colors. Two countries are considered to be &ldquo;adjacent&rdquo; if any of their territories share a border of non-zero length.</p>

<p>Write a program that finds the least number of colors required to color the map.</p>

### 입력

<p>The input consists of multiple map data. Each map data starts with a line containing the total number of territories n, followed by the data for those territories. n is a positive integer not more than 100. The data for a territory with m vertices has the following format:</p>

<pre>
String
x<sub>1</sub> y<sub>1</sub>
x<sub>2</sub> y<sub>2</sub>
...
x<sub>m</sub> y<sub>m</sub>
&minus;1</pre>

<p>&ldquo;String&rdquo; (a sequence of alphanumerical characters) gives the name of the country it belongs to. A country name has at least one character and never has more than twenty. When a country has multiple territories, its name appears in each of them.</p>

<p>Remaining lines represent the vertices of the territory. A vertex data line has a pair of nonnegative integers which represent the x- and y-coordinates of a vertex. x- and y-coordinates are separated by a single space, and y-coordinate is immediately followed by a newline. Edges of the territory are obtained by connecting vertices given in two adjacent vertex data lines, and by connecting vertices given in the last and the first vertex data lines. None of x- and y-coordinates exceeds 1000. Finally, &minus;1 in a line marks the end of vertex data lines. The number of vertices m does not exceed 100.</p>

<p>You may assume that the contours of polygons are simple, i.e. they do not cross nor touch themselves. No two polygons share a region of non-zero area. The number of countries in a map does not exceed 10.</p>

<p>The last map data is followed by a line containing only a zero, marking the end of the input data.</p>

### 출력

<p>For each map data, output one line containing the least possible number of colors required to color the map satisfying the specified conditions.</p>
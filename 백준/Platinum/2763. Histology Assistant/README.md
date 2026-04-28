# [Platinum II] Histology Assistant - 2763

[문제 링크](https://www.acmicpc.net/problem/2763)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 5, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

구현, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 애드 혹, 깊이 우선 탐색

### 문제 설명

<p>An application to assist in the analysis of tissue samples is to work as follows. A digital microphotograph of a stained tissue sample is scanned to identify stained pixels. For each region of stained pixels, an outline of the region is obtained. The outline is then analyzed for shape indicators of disease and the outlines (color-coded for possible disease) are overlaid on the microphotograph as it is displayed to the pathologist.&nbsp;</p>

<p>This problem is to write a program, which processes a bitmap of stained and unstained pixels, finds regions of stained pixels and, for each region, outputs the outline of the region. Regions with fewer stained pixels than a minimum size are ignored. Only the outer boundary is computed (interior holes are ignored).&nbsp;</p>

<p>A pixel is adjacent to another pixel if the second pixel is directly above, directly below, directly left or directly right of the first pixel. Two stained pixels are connected if there is a sequence of stained pixels starting with one of the pixels and ending with the other for which each pixel in the sequence is adjacent to the next. A region of stained pixels is a set of stained pixels, all of which are connected to a single stained pixel. A stained pixel is a boundary pixel of its region if at least one of the pixels adjacent to it is not stained. (All pixels immediately outside the bitmap are considered unstained so that pixels on the edge of the bitmap are boundary pixels.) In the example below, there are 4 regions (stained pixels are &lsquo;X&rsquo;, unstained are &lsquo;.&rsquo;).&nbsp;</p>

<pre>
........................................ 
.XX..................................... 
..X.................XXX......XXX........ 
.....................XXX....XXX......... 
.......XXX............XXX..XXX.......... 
.....XXXXXXX...........XXXXXX........... 
....XXXXXXXXX...........XXXX............ 
...XXXX...XXXX...........XX............. 
..XXX.......XXX......................... 
..XXX.......XXX........XXXXXXX.......... 
.XXX.........XXX.......XXXXXXX.......... 
.XXX.........XXX.......XXXXXXX.......... 
.XXX.........XXX.......XXXXXXX.......... 
..XXX.......XXX...........X............. 
..XXX.......XXX...........X............. 
...XXXX...XXXX.........XXXXXXX.......... 
....XXXXXXXXX..........XXXXXXX.......... 
.....XXXXXXX...........XXXXXXX.......... 
.......XXX.............XXXXXXX.......... 
........................................ 
</pre>

<p>Outlines are to be specified as the left most point of the top most line of the region, a count of boundary pixels and a sequence of moves from one boundary pixel to the next clockwise using the codes (up = A, up right = B, etc.):&nbsp;</p>

<pre>
H A B 
G   C 
F E D 
</pre>

<p>Rows are numbered from top to bottom beginning with 1. Columns are numbered from left to right beginning with 1. For example the outline of the &lsquo;v&rsquo; shaped region above would be:&nbsp;</p>

<pre>
3 21 22 
CCDDDCBBBCCFFFFFGHHHHH 
</pre>

### 입력

<p>Input is a sequence of problem instances. Each problem instance begins with a line containing 3 decimal numbers: row-count, column-count and minimum-number-of-pixels. This line is followed by row-count lines of column-count characters. Each character is either a period (.) for an unstained pixel or an upper-case X for a stained pixel. The input ends when the row-count is 0. Row-count will be at most 47, column-count will be at most 63 and minimum-number-of-pixels will be at least 2.&nbsp;</p>

### 출력

<p>For each problem instance, the output begins with a line starting with a decimal integer giving the number of components of at least minimum-number-of-pixels stained pixels. This is followed by the description of the boundary of each component. The boundaries are to be listed in the order that a first pixel of the component appears while scanning across lines from left to right with line scanned from top to bottom. For each component, the output begins with a line giving the row number of the start pixel, the column number of the start pixel and the number of pixels in the boundary as decimal integers separated by a single space. This line is followed by lines of direction codes &lsquo;A&rsquo; through &lsquo;H&rsquo;. Each line shall have 40 characters except the last line.&nbsp;</p>
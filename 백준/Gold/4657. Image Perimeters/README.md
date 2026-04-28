# [Gold IV] Image Perimeters - 4657

[문제 링크](https://www.acmicpc.net/problem/4657)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 25, 맞힌 사람: 24, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>Technicians in a pathology lab analyze digitized images of slides. Objects on a slide are selected for analysis by a mouse click on the object. The perimeter of the boundary of an object is one useful measure. Your task is to determine this perimeter for selected objects.</p>

<p>The digitized slides will be represented by a rectangular grid of periods, &#39;.&#39;, indicating empty space, and the capital letter &#39;X&#39;, indicating part of an object. &nbsp;Simple examples are</p>

<pre>
XX   Grid 1          .XXX   Grid 2 
XX                   .XXX 
                     .XXX 
                     ...X 
                     ..X. 
                     X...</pre>

<p>An X in a grid square indicates that the entire grid square, including its boundaries, lies in some object. &nbsp;The X in the center of the grid below is adjacent to the X in any of the 8 positions around it. The grid squares for any two adjacent X&#39;s overlap on an edge or corner, so they are connected.</p>

<pre>
XXX 
XXX    Central X and adjacent X&#39;s 
XXX</pre>

<p>An object consists of the grid squares of all X&#39;s that can be linked to one another through a sequence of adjacent X&#39;s. &nbsp;In Grid 1, the whole grid is filled by one object. &nbsp;In Grid 2 there are two objects. &nbsp;One object contains only the lower left grid square. &nbsp;The remaining X&#39;s belong to the other object.</p>

<p>The technician will always click on an X, selecting the object containing that X. &nbsp;The coordinates of the click are recorded. &nbsp;Rows and columns are numbered starting from 1 in the upper left hand corner. &nbsp;The technician could select the object in Grid 1 by clicking on row 2 and column 2. &nbsp;The larger object in Grid 2 could be selected by clicking on row 2, column 3. The click could not be on row 4, column 3.<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4657.%E2%80%85Image%E2%80%85Perimeters/d377897c.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4657/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:left; height:124px; width:50px" />One useful statistic is the perimeter of the object. &nbsp;Assume each X corresponds to a square one unit on each side. &nbsp;Hence the object in Grid 1 has perimeter 8 (2 on each of four sides). &nbsp;The perimeter for the larger object in Grid 2 is illustrated in the figure at the left. &nbsp;The length is 18.</p>

<p>Objects will not contain any totally enclosed holes, so the leftmost grid patterns shown below could NOT appear. The variations on the right could appear:</p>

<pre>
Impossible   Possible

XXXX         XXXX   XXXX   XXXX 
X..X         XXXX   X...   X... 
XX.X         XXXX   XX.X   XX.X 
XXXX         XXXX   XXXX   XX.X

.....        .....  .....  ..... 
..X..        ..X..  ..X..  ..X.. 
.X.X.        .XXX.  .X...  ..... 
..X..        ..X..  ..X..  ..X.. 
.....        .....  .....  .....
</pre>

### 입력

<p>The input will contain one or more grids. &nbsp;Each grid is preceded by a line containing the number of rows and columns in the grid and the row and column of the mouse click. &nbsp;All numbers are in the range 1-20. &nbsp;The rows of the grid follow, starting on the next line, consisting of &#39;.&#39; and &#39;X&#39; characters.</p>

<p>The end of the input is indicated by a line containing four zeros. &nbsp;The numbers on any one line are separated by blanks. &nbsp;The grid rows contain no blanks.</p>

### 출력

<p>For each grid in the input, the output contains a single line with the perimeter of the specified object.</p>
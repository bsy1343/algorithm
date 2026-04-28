# [Platinum I] Holiday Painting - 6112

[문제 링크](https://www.acmicpc.net/problem/6112)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>To show their spirit for the holidays, the cows would like to paint a picture! Their picture will be represented as an R x C (1 &lt;= R &lt;= 50,000; 1 &lt;= C &lt;= 15) grid of unit squares, each of which is either 0 or 1. The grid rows are conveniently numbered 1..R; the columns are numbered 1..C.</p>

<p>Being pressed for time, the cows have asked their neighbors north of the border for help. Under the very helpful supervision of Canmuu the moose, they constructed a machine to throw paint at the picture in entire buckets! Beginning with all 0&#39;s in the picture grid, the machine splashes a certain paint color (either 0 or 1) over a rectangle in the grid. In particular, Canmuu suggested that they perform Q (1 &lt;= Q &lt;= 10,000) operations; operation i consists of five integers R1_i, R2_i, C1_i, C2_i, and X_i (1 &lt;= R1_i &lt;= R2_i &lt;= R; 1 &lt;= C1_i &lt;= C2_i &lt;= C; 0 &lt;= X_i &lt;= 1), meaning that the cows will paint each unit square with a row index between R1_i and R2_i, inclusive, and a column index between C1_i and C2_i, inclusive, with color X_i.</p>

<p>However, painting a picture like this is quite prone to mistakes. So Canmuu has enlisted you to determine, after each operation, the number of unit squares in the grid which are the correct color.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: R, C, and Q</li>
	<li>Lines 2..R+1: Line i+1 contains C characters, each &#39;0&#39; or &#39;1&#39;, denoting the i-th row of the grid in the obvious way.</li>
	<li>Lines R+2..R+Q+1: Line R+i+1 contains five space-separated integers representing a paint operation: R1_i, R2_i, C1_i, C2_i, and X_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..Q: On line i+1, print a single integer representing the number of matching unit squares after the i-th operation.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>After the first operation, the picture grid looks as follows:</p>

<pre>
000000000000000
000000000000000
000000000000000
000000000000000
011111111111110
011111111111110
011111111111110
011111111111110
000000000000000
000000000000000
000000000000000
000000000000000
000000000000000
000000000000000
000000000000000
000000000000000
000000000000000</pre>

<p>There are 113 unit squares which match the corresponding square in the tree image; they are denoted below by an &#39;x&#39; (the other bits are shown as they appear after the first paint splash):</p>

<pre>
0000000x0000000
000000xxx000000
00000xxxxx00000
0000xxxxxxx0000
0xx111111111xx0
0xxx1111111xxx0
0xx111111111xx0
0x11111111111x0
000xxxxxxxxx000
00xxxxxxxxxxx00
0xxxxxxxxxxxxx0
00xxxxxxxxxxx00
0xxxxxxxxxxxxx0
xxxxxxxxxxxxxxx
000000xxx000000
000000xxx000000
000000xxx000000</pre>
# [Gold IV] Crosswords - 6354

[문제 링크](https://www.acmicpc.net/problem/6354)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

구현, 그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>A crossword can be stored as a matrix m x n of zeros and ones. Zero represents white squares and one represents black squares. Some squares of the crossword are numbered and assigned to these numbers are the descriptions of the words that should be written either &quot;across&quot; or &quot;down&quot; into the crossword. A square is numbered if it is a white square and either (a) the square below it is white and there is no white square immediately above, or (b) there is no white square immediately to its left and the square to its right is white. The squares are numbered from left to right, from the top line to the bottom line.&nbsp;</p>

<p>From the matrix a crossword diagram can be drawn. In the diagram each square is represented by a box 4 x 6 characters. Black square is represented by</p>

<pre>
++++++
++++++
++++++
++++++
</pre>

<p>White squares are represented as follows&nbsp;(numbered and not numbered square):</p>

<pre>
++++++               ++++++
+nnn +               +    +
+    +               +    +
++++++               ++++++
</pre>

<p>where nnn is the number of the square.</p>

<p>The remaining characters of the box are spaces. If black squares are given at the edges, they should be removed from the diagram (see the example). Only use spaces as necessary filling characters. Don&#39;t use any unnecessary spaces at the end of the line.&nbsp;</p>

### 입력

<p>The input consists of several blocks of lines each representing a crossword. Each block starts with the line containing two integers m &lt; 25 and n &lt; 25 separated by one space. In each of the next m lines there are n numbers 0 or 1, separated by one space. The last block will be empty, m = n = 0.</p>

<p>&nbsp;</p>

### 출력

<p>The output contains the corresponding crossword diagram for each except the last block. After each diagram there is two empty lines.</p>
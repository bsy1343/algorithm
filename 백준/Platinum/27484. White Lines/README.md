# [Platinum IV] White Lines - 27484

[문제 링크](https://www.acmicpc.net/problem/27484)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 23, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

구현, 누적 합

### 문제 설명

<p>Gildong has bought a famous painting software <em>cfpaint</em>. The working screen of cfpaint is square-shaped consisting of $n$ rows and $n$ columns of square cells. The rows are numbered from $1$ to $n$, from top to bottom, and the columns are numbered from $1$ to $n$, from left to right. The position of a cell at row $r$ and column $c$ is represented as $(r,c)$. There are only two colors for the cells in cfpaint --- black and white.</p>

<p>There is a tool named <em>eraser</em> in cfpaint. The eraser has an integer size $k$ ($1\le k\le n$). To use the eraser, Gildong needs to click on a cell $(i,j)$ where $1\le i,j\le n-k+1$. When a cell $(i,j)$ is clicked, all of the cells $(i&#39;,j&#39;)$ where $i\le i&#39;\le i+k-1$ and $j\le j&#39;\le j+k-1$ become white. In other words, a square with side equal to $k$ cells and top left corner at $(i,j)$ is colored white.</p>

<p>A <em>white line</em> is a row or a column without any black cells.</p>

<p>Gildong has worked with cfpaint for some time, so some of the cells (possibly zero or all) are currently black. He wants to know the maximum number of <em>white lines</em> after using the eraser <strong>exactly once</strong>. Help Gildong find the answer to his question.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1\le k\le n\le 2000$) --- the number of rows and columns, and the size of the eraser.</p>

<p>The next $n$ lines contain $n$ characters each without spaces. The $j$-th character in the $i$-th line represents the cell at $(i,j)$. Each character is given as either &lsquo;<code>B</code>&rsquo; representing a black cell, or &lsquo;<code>W</code>&rsquo; representing a white cell.</p>

### 출력

<p>Print one integer: the maximum number of white lines after using the eraser exactly once.</p>

### 힌트

<p>In the first example, Gildong can click the cell $(2,2)$, then the working screen becomes:</p>

<pre>
<code>BWWW
WWWW
WWWW
WWWB</code></pre>

<p>Then there are four white lines --- the $2$-nd and $3$-rd row, and the $2$-nd and $3$-rd column.</p>

<p>In the second example, clicking the cell $(2,3)$ makes the $2$-nd row a white line.</p>

<p>In the third example, both the $2$-nd column and $5$-th row become white lines by clicking the cell $(3,2)$.</p>
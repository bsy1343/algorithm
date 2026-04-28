# [Gold IV] The Lazy Cow - 10022

[문제 링크](https://www.acmicpc.net/problem/10022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 325, 정답: 99, 맞힌 사람: 89, 정답 비율: 37.083%

### 분류

누적 합

### 문제 설명

<p>It&#39;s a hot summer day, and Bessie the cow is feeling quite lazy. She wants to locate herself at a position in her field so that she can reach as much delicious grass as possible within only a short distance.</p>

<p>The field Bessie inhabits is described by an N by N grid of square cells (1 &lt;= N &lt;= 400). The cell in row r and column c (1 &lt;= r,c &lt;= N) contains G(r,c) units of grass (0 &lt;= G(r,c) &lt;= 1000). From her initial square in the grid, Bessie is only willing to take up to K steps (0 &lt;= K &lt;= 2*N). Each step she takes moves her to a cell that is directly north, south, east, or west of her current location.</p>

<p>For example, suppose the grid is as follows, where (B) describes Bessie&#39;s initial position (here, in row 3, column 3):</p>

<pre>
50    5     25*   6     17    
14    3*    2*    7*    21    
99*   10*   1*(B) 2*    80*    
8     7*    5*    23*   11   
10    0     78*   1     9        
</pre>

<p>If K=2, then Bessie can only reach the locations marked with *s.</p>

<p>Please help Bessie determine the maximum amount of grass she can reach, if she chooses the best possible initial location in the grid.</p>

### 입력

<ul>
	<li>Line 1: The integers N and K.</li>
	<li>Lines 2..1+N: Line r+1 contains N integers describing row r of the grid.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum amount of grass Bessie can reach, if she chooses the best possible initial location (the location from which she can reach the most grass).</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>In the example above, Bessie can reach 342 total units of grass if she locates herself in the middle of the grid.</p>